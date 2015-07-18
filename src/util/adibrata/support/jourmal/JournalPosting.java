package util.adibrata.support.jourmal;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.cashbank.CashBankPosting;
import util.adibrata.support.common.GetCoaInfo;
import util.adibrata.support.common.GetOffice;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.model.CashBankHdr;
import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.Coamaster;
import com.adibrata.smartdealer.model.JrnlDtl;
import com.adibrata.smartdealer.model.JrnlHdr;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;
import com.adibrata.smartdealer.model.TrxConfigDtl;
import com.adibrata.smartdealer.model.TrxConfigHdr;

//import model.adibrata.smartfinance.*;

public class JournalPosting {
	// region "Variables"
	/* Session session */
	private Session session;
	private String partnercode = "";
	private String officecode = "";
	private long officeid = 0;

	private Coamaster coamaster;
	private CoaSchmDtl coaSchmDtl;
	private CoaSchmHdr coaSchmHdr;
	private String JournalCode;
	private String configcode;
	private String userupd;

	private JrnlHdrModel hdrModel;
	private JrnlDtlModel dtlModel;
	private List<JrnlDtlModel> lstdtlModel;
	private String JournalNo;
	private String VoucherNo;
	private String coaheader = "";
	private double totalCredit = 0.00;
	private double totalDebit = 0.00;
	private DateFormat monthformat = new SimpleDateFormat("MM");
	private DateFormat yearformat = new SimpleDateFormat("yyyy");
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private Date dtmUpd = Calendar.getInstance().getTime();

	/***
	 * **************************** Start Constructor ***********************
	 * **/
	public JournalPosting(String userupd) {
		session = HibernateHelper.getSessionFactory().openSession();
		this.userupd = userupd;
	}

	public JournalPosting(Session session, String userupd) {
		this.session = session;
		this.userupd = userupd;
	}

	public JournalPosting(Session session, String partnercode,
			String officecode, String userupd) {
		this.session = session;
		this.partnercode = partnercode;
		this.officeid = GetOffice.GetId(officecode);
		this.officecode = officecode;
		this.userupd = userupd;
	}

	/***
	 * **************************** End Constructor ***********************
	 **/

	/**
	 * Method JobPost digunakan untuk mengambil status job post yang masih New
	 * (NE) untuk dilanjutkan ke process get configtransactions **
	 * **/
	@SuppressWarnings("unchecked")
	public void JobPost() throws Exception {
		StringBuilder hqltransjob = new StringBuilder();
		TransJob transjob = new TransJob();
		Office office = new Office();
		Partner partner = new Partner();

		try {
			hqltransjob
					.append("from TransJob a, Office b,  Partner c  "
							+ " Where a.officeId = b.id and "
							+ " a.partner = c.partnerCode and b.partner = c.partnerCode "
							+ " and a.jobStatus = 'NE' order by a.dtmCrt");
			if (this.partnercode != "" && this.officecode == "")
				hqltransjob
						.append(" and c.partnercode = :partnercode and a.officeid = :officeid ");

			Query qrytransjob = session.createQuery(hqltransjob.toString());
			if (this.partnercode != "" && this.officecode == "") {
				qrytransjob.setParameter("partnercode", this.partnercode)
						.setParameter("officeid", this.officeid);
			}

			List<Object[]> lstTransJob = (List<Object[]>) qrytransjob.list();
			for (Object[] aRow : lstTransJob) {
				transjob = (TransJob) aRow[0];
				office = (Office) aRow[1];
				partner = (Partner) aRow[2];
				session.getTransaction().begin();
				try {
					hdrModel = new JrnlHdrModel();
					dtlModel = new JrnlDtlModel();
					lstdtlModel = new ArrayList<JrnlDtlModel>();
					GetConfHdrDtl(session, transjob, office, partner);
					session.getTransaction().commit();

				} catch (Exception exp) {
					session.getTransaction().rollback();

					ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
							.getClassName());
					lEntExp.setMethodName(Thread.currentThread()
							.getStackTrace()[1].getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);

				}
			}

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}

	}

	/**
	 * GetConfigTransactions digunakan untuk mengambil konfigurasi header dan
	 * konfigurasi detail kemudian dimasukan ke dalam model list header dan
	 * detail
	 * 
	 * @param session
	 * @param transjob
	 * @param office
	 * @param partner
	 */
	@SuppressWarnings("unchecked")
	private void GetConfHdrDtl(Session session, TransJob transjob,
			Office office, Partner partner) throws Exception {
		boolean iscreateJournal = false;
		boolean iscreatecashbank = false;
		boolean iscreatepaymenthistory = false;
		JrnlHdr jrnlhdr = new JrnlHdr();
		CashBankHdr cashbankhdr = new CashBankHdr();
		TrxConfigHdr trxconfighdr = new TrxConfigHdr();

		StringBuilder hqlconfig = new StringBuilder();
		try {
			hqlconfig.append("from TrxConfigHdr a, TrxConfigDtl b  "
					+ " Where a.id = b.trxConfigHdr "
					+ " and a.trxConfigCode = :configcode ");

			Query qryconf = session.createQuery(hqlconfig.toString());

			qryconf.setParameter("configcode", transjob.getTrxConfigCode());
			List<Object[]> lstconfig = (List<Object[]>) qryconf.list();
			int i = 1;

			if (lstconfig.size() != 0)
				for (Object[] aRow : lstconfig) {
					if (i == 1) {
						trxconfighdr = (TrxConfigHdr) aRow[0];

						iscreateJournal = (trxconfighdr.getIsCreateJournal() != 0);
						iscreatecashbank = (trxconfighdr
								.getIsCreateCashBankMutation() != 0);
						iscreatepaymenthistory = (trxconfighdr
								.getIsCreatePaymentHistory() != 0);

						this.hdrModel = BuildHeader(session, transjob,
								trxconfighdr);
						if (iscreateJournal) {
							jrnlhdr = SaveJournalHeader(session, transjob,
									office, partner, this.hdrModel);
						}
						if (iscreatecashbank) {
							cashbankhdr = CashBankPosting.CashBankHeaderSave(
									session, transjob, office, partner,
									this.hdrModel, userupd);
							this.VoucherNo = cashbankhdr.getVoucherNo();
						}
						if (iscreatepaymenthistory) {

						}
					}

					TrxConfigDtl trxConfigDtl = new TrxConfigDtl();
					trxConfigDtl = (TrxConfigDtl) aRow[1];

					if (trxConfigDtl.getIsMultipleDtl() == 0) {
						this.dtlModel = BuildStringModelDetailNoMultiple(
								transjob, trxConfigDtl);
						if (iscreateJournal) {
							SaveJournalDetail(session, transjob, office,
									partner, jrnlhdr, this.dtlModel);
						}
						if (iscreatecashbank) {
							CashBankPosting.CashBankDtlSave(session, transjob,
									office, partner, cashbankhdr,
									this.dtlModel, userupd);
						}
						if (iscreatepaymenthistory) {

						}

					} else { // is multiple dtl = 1
						this.lstdtlModel = BuildStringModelDetailMultiple(
								transjob, this.hdrModel, trxConfigDtl);
						for (JrnlDtlModel list : this.lstdtlModel) {
							JrnlDtlModel dtl = new JrnlDtlModel();
							dtl = list;
							if (iscreateJournal) {
								SaveJournalDetail(session, transjob, office,
										partner, jrnlhdr, dtl);
							}
							if (iscreatecashbank) {
								CashBankPosting.CashBankDtlSave(session,
										transjob, office, partner, cashbankhdr,
										this.dtlModel, userupd);
							}
							if (iscreatepaymenthistory) {

							}
						}

					}

					i += 1;
				}
			if (this.totalCredit != this.totalDebit) {
				throw new Exception("Journal Not Balance");

			}
			UpdateJob(session, transjob);

		} catch (Exception exp) {
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	@SuppressWarnings("rawtypes")
	private JrnlHdrModel BuildHeader(Session session, TransJob transjob,
			TrxConfigHdr trxconfighdr) throws Exception {
		JrnlHdrModel jrnlHdrModel = new JrnlHdrModel();
		StringBuilder hqlconfig = new StringBuilder();
		try {

			SQLQuery selectQuery;
			hqlconfig.append("Select ");
			hqlconfig.append(" Id as HeaderId, ");
			/*****************/

			if (trxconfighdr.getTrxNo() != null)
				hqlconfig.append(trxconfighdr.getTrxNo().trim());
			else
				hqlconfig.append(" ''  ");
			hqlconfig.append(" as TrxNo, ");
			/*****************/

			if (trxconfighdr.getOfficeIdX() != null)
				hqlconfig.append(trxconfighdr.getOfficeIdX().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as OfficeIdX, ");
			/*****************/
			/*
			 * hqlconfig.append(trxconfighdr.getJrnlNoCode().trim());
			 * hqlconfig.append (" as JrnlNoCode, ");
			 */

			if (trxconfighdr.getReffNo() != null)
				hqlconfig.append(trxconfighdr.getReffNo().trim());
			else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as ReffNo, ");
			/*****************/

			if (trxconfighdr.getBankAccId() != null)
				hqlconfig.append(trxconfighdr.getBankAccId().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as BankAccId, ");
			/*****************/

			if (trxconfighdr.getCurrId() != null)
				hqlconfig.append(trxconfighdr.getCurrId().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as CurrId, ");
			/*****************/

			if (trxconfighdr.getCurrRate() != null)
				hqlconfig.append(trxconfighdr.getCurrRate().trim());
			else
				hqlconfig.append(" 1 ");
			hqlconfig.append(" as CurrRate, ");
			/*****************/

			if (trxconfighdr.getBankPortion() != null)
				hqlconfig.append(trxconfighdr.getBankPortion().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as BankPortion, ");
			/*****************/

			/*
			 * hqlconfig.append(trxconfighdr.getRcvDisbFlag().trim());
			 * hqlconfig.append (" as RcvDisbFlag, ");
			 */// Setting di trxconfighdr
			if (trxconfighdr.getCashierId() != null)
				hqlconfig.append(trxconfighdr.getCashierId().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as CashierId, ");
			/*****************/

			if (trxconfighdr.getCashierOpen() != null)
				hqlconfig.append(trxconfighdr.getCashierOpen().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as CashierOpen, ");
			/*****************/

			if (trxconfighdr.getAmountTrx() != null)
				hqlconfig.append(trxconfighdr.getAmountTrx().trim());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as Amount, ");
			/*****************/

			if (trxconfighdr.getWop() != null)
				hqlconfig.append(trxconfighdr.getWop().trim());
			else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as Wop, ");
			/*****************/

			if (trxconfighdr.getReceivedFrom() != null) {
				hqlconfig.append(trxconfighdr.getReceivedFrom().trim());
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as ReceivedFrom, ");
			/*****************/

			if (trxconfighdr.getRcvDisbFlag() != null) {
				hqlconfig.append("'");
				hqlconfig.append(trxconfighdr.getRcvDisbFlag().trim());
				hqlconfig.append("'");
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as RcvDisbFlag, ");
			/*****************/

			if (trxconfighdr.getReceiptNo() != null) {
				hqlconfig.append(trxconfighdr.getReceiptNo().trim());
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as ReceiptNo ");
			/*****************/

			hqlconfig.append(" from ");
			hqlconfig.append(trxconfighdr.getTrxTable().trim());
			hqlconfig.append(" where JobId = :transjob");

			selectQuery = session.createSQLQuery(hqlconfig.toString());
			selectQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			selectQuery.setParameter("transjob", transjob.getId());
			selectQuery.addScalar("HeaderId", new LongType())
					.addScalar("TrxNo", new StringType())
					.addScalar("OfficeIdX", new LongType())
					.addScalar("ReffNo", new StringType())
					.addScalar("BankAccId", new LongType())
					.addScalar("CurrId", new LongType())
					.addScalar("CurrRate", new DoubleType())
					.addScalar("BankPortion", new IntegerType())
					.addScalar("CashierId", new LongType())
					.addScalar("CashierOpen", new IntegerType())
					.addScalar("Amount", new DoubleType())
					.addScalar("Wop", new StringType())
					.addScalar("ReceivedFrom", new StringType())
					.addScalar("RcvDisbFlag", new StringType())
					.addScalar("ReceiptNo", new StringType());

			List list = selectQuery.list();
			if (list.size() != 0) {
				for (Object object : list) {
					Map row = (Map) object;

					/*
					 * ListCoaSchmDtl listCoaSchmDtl = new ListCoaSchmDtl();
					 * listCoaSchmDtl.setCoamasterid((long)row.get("Id"));
					 */
					jrnlHdrModel.setHeaderId((long) row.get("HeaderId"));
					jrnlHdrModel.setTrxNo((String) row.get("TrxNo"));

					jrnlHdrModel.setOfficeIdX((long) row.get("OfficeIdX"));

					jrnlHdrModel.setBankAccId((long) row.get("BankAccId"));
					jrnlHdrModel.setReffNo((String) row.get("ReffNo"));
					jrnlHdrModel.setCurrRate((double) row.get("CurrRate"));
					jrnlHdrModel.setBankPortion((int) row.get("BankPortion"));
					jrnlHdrModel.setCashierId((long) row.get("CashierId"));
					jrnlHdrModel.setCashierOpen((int) row.get("CashierOpen"));
					jrnlHdrModel.setAmountTrx((double) row.get("Amount"));
					jrnlHdrModel.setWop((String) row.get("Wop"));
					jrnlHdrModel.setReceivedFrom((String) row
							.get("ReceivedFrom"));
					jrnlHdrModel.setReceiptNo((String) row.get("ReceiptNo"));
					jrnlHdrModel.setJrnlNoCode(trxconfighdr.getJrnlNoCode());
					jrnlHdrModel.setTrxDesc(GetTransNo.GetSequenceDesc(session,
							transjob.getPartner().getPartnerCode(),
							transjob.getOfficeId(),
							trxconfighdr.getJrnlNoCode()));
					// this.hdrModel.setRcvDisbFlag((String)
					// row.get("RcvDisbFlag"));
				}
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return jrnlHdrModel;
	}

	@SuppressWarnings("rawtypes")
	private JrnlDtlModel BuildStringModelDetailNoMultiple(TransJob transjob,
			TrxConfigDtl trxconfigdtl) throws Exception {
		StringBuilder hqlconfig = new StringBuilder();
		String coacode = "";
		JrnlDtlModel dtl = new JrnlDtlModel();
		SQLQuery selectQuery;
		try {
			hqlconfig.append("Select ");
			if (trxconfigdtl.getSequenceNo() != null)
				hqlconfig.append(trxconfigdtl.getSequenceNo().toString());
			else
				hqlconfig.append(" 0  ");
			hqlconfig.append(" as SequenceNo, ");

			if (trxconfigdtl.getCoaName() != null)
				hqlconfig
						.append(" '" + trxconfigdtl.getCoaName().trim() + "' ");
			else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as CoaName, ");
			/*****************/

			if (trxconfigdtl.getCoaName() != null) {
				coacode = CoaRetrieve.CoaCode(session, transjob.getPartner()
						.getPartnerCode(), trxconfigdtl.getCoaSourceTable(),
						trxconfigdtl.getCoaName());
				hqlconfig.append(" '" + coacode + "' ");
				if (trxconfigdtl.getIsCoaHeader() != null) {
					if (trxconfigdtl.getIsCoaHeader().equals("1")) {
						this.coaheader = coacode;
					}
				}
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append("  as CoaCode, ");
			/***********************/

			if (trxconfigdtl.getIsCoaHeader() != null) {
				if (!trxconfigdtl.getIsCoaHeader().equals("1")) {
					hqlconfig.append(" '" + this.coaheader + "' ");
				} else
					hqlconfig.append(" '' ");
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append("  as CoaCode_X, ");

			if (trxconfigdtl.getPost() != null) {
				hqlconfig.append(" '" + trxconfigdtl.getPost().trim() + "' ");
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as Post, ");
			/*****************/

			if (trxconfigdtl.getAmountTrx() != null) {
				hqlconfig.append(trxconfigdtl.getAmountTrx().trim());
			} else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as AmountJrnl, ");
			/**********/

			if (trxconfigdtl.getDepartId() != null)
				hqlconfig.append(trxconfigdtl.getDepartId());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as DepartId ");

			/******************/

			hqlconfig.append(" from ");
			hqlconfig.append(trxconfigdtl.getTblSourceDtl().trim());
			hqlconfig.append(" where JobId = :transjob");
			System.out.println(hqlconfig.toString());
			selectQuery = session.createSQLQuery(hqlconfig.toString());
			selectQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			selectQuery.setParameter("transjob", transjob.getId());
			selectQuery.addScalar("SequenceNo", new IntegerType())
					.addScalar("CoaName", new StringType())
					.addScalar("CoaCode", new StringType())
					.addScalar("CoaCode_X", new StringType())
					.addScalar("Post", new StringType())
					.addScalar("AmountJrnl", new DoubleType())
					.addScalar("DepartId", new LongType());

			List list = selectQuery.list();
			if (list.size() != 0) {
				for (Object object : list) {
					Map row = (Map) object;

					dtl.setSequenceNo((int) row.get("SequenceNo"));
					dtl.setCoaName((String) row.get("CoaName"));
					dtl.setCoacode((String) row.get("CoaCode"));
					dtl.setCoacode_x((String) row.get("CoaCode_X"));
					dtl.setPost((String) row.get("Post"));
					dtl.setAmountjrnl((double) row.get("AmountJrnl"));
					dtl.setDepartId((long) row.get("DepartId"));

				}
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return dtl;
	}

	@SuppressWarnings("rawtypes")
	private List<JrnlDtlModel> BuildStringModelDetailMultiple(
			TransJob transjob, JrnlHdrModel jrnlhdrmodel,
			TrxConfigDtl trxconfigdtl) throws Exception {
		StringBuilder hqlconfig = new StringBuilder();
		String coacode = "";
		SQLQuery selectQuery;
		int sequenceno = 0;
		List<JrnlDtlModel> lstdtlmodel = new ArrayList<JrnlDtlModel>();
		try {
			hqlconfig.append("Select ");
			if (trxconfigdtl.getSequenceNo() != null)
				hqlconfig.append(trxconfigdtl.getSequenceNo().toString());
			else
				hqlconfig.append(" 0  ");
			hqlconfig.append(" as SequenceNo, ");

			hqlconfig.append(" CoaName ");
			hqlconfig.append(" as CoaName, ");

			if (trxconfigdtl.getPost() != null) {
				hqlconfig.append(" '" + trxconfigdtl.getPost().trim() + "' ");
			} else
				hqlconfig.append(" '' ");
			hqlconfig.append(" as Post, ");

			if (trxconfigdtl.getAmountTrx() != null) {
				hqlconfig.append(trxconfigdtl.getAmountTrx().trim());
			} else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as AmountJrnl, ");

			if (trxconfigdtl.getDepartId() != null)
				hqlconfig.append(trxconfigdtl.getDepartId());
			else
				hqlconfig.append(" 0 ");
			hqlconfig.append(" as DepartId ");

			hqlconfig.append(" from ");
			hqlconfig.append(trxconfigdtl.getTblSourceDtl().trim());
			hqlconfig.append(" where ");
			hqlconfig.append(trxconfigdtl.getHeaderId().trim());
			hqlconfig.append(" = :headerid ");

			selectQuery = session.createSQLQuery(hqlconfig.toString());
			selectQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			selectQuery.setParameter("headerid", jrnlhdrmodel.getHeaderId());
			selectQuery.addScalar("SequenceNo", new IntegerType())
					.addScalar("CoaName", new StringType())
					.addScalar("Post", new StringType())
					.addScalar("AmountJrnl", new DoubleType())
					.addScalar("DepartId", new LongType());

			List list = selectQuery.list();

			if (list.size() != 0) {
				for (Object object : list) {
					Map row = (Map) object;

					JrnlDtlModel dtlModel = new JrnlDtlModel();

					dtlModel.setSequenceNo(sequenceno
							+ (int) row.get("SequenceNo"));

					dtlModel.setCoaName((String) row.get("CoaName"));
					coacode = CoaRetrieve.CoaCode(session, transjob
							.getPartner().getPartnerCode(), trxconfigdtl
							.getCoaSourceTable(), (String) row.get("CoaName"));
					dtlModel.setCoacode(coacode);

					if (trxconfigdtl.getIsCoaHeader() != null) {
						if (!trxconfigdtl.getIsCoaHeader().equals("1")) {
							dtlModel.setCoacode_x(coacode);
						} else
							dtlModel.setCoacode_x("");
					} else
						dtlModel.setCoacode_x("");

					dtlModel.setPost((String) row.get("Post"));
					dtlModel.setAmountjrnl((double) row.get("AmountJrnl"));
					dtlModel.setDepartId((long) row.get("DepartId"));

					lstdtlmodel.add(dtlModel);
					sequenceno += 1;
				}
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return lstdtlmodel;
	}

	private JrnlHdr SaveJournalHeader(Session session, TransJob transjob,
			Office office, Partner partner, JrnlHdrModel jrnlHdrModel)
			throws Exception {

		JrnlHdr jrnlhdr = new JrnlHdr();
		try {
			String periodyear = "", periodmonth = "";

			periodmonth = monthformat.format(transjob.getJobPost());
			periodyear = yearformat.format(transjob.getJobPost());

			jrnlhdr.setPartner(partner);
			jrnlhdr.setOfficeId(office.getId());
			this.JournalNo = GetTransNo.GenerateJournalNo(session,
					partner.getPartnerCode(), office.getId(),
					this.hdrModel.getJrnlNoCode(), transjob.getJobPost());

			jrnlhdr.setJrnlNo(this.JournalNo);

			jrnlhdr.setPeriodYear(periodyear);
			jrnlhdr.setPeriodMonth(periodmonth);
			jrnlhdr.setTrxDate(transjob.getJobPost());
			jrnlhdr.setReffDate(transjob.getJobDate());
			jrnlhdr.setReffNo(this.hdrModel.getReffNo());

			jrnlhdr.setTrxDesc(this.hdrModel.getTrxDesc() + " "
					+ this.hdrModel.getReffNo());
			jrnlhdr.setJrnlAmt(this.hdrModel.getAmountTrx());
			jrnlhdr.setStatusTr("OP");
			jrnlhdr.setFlag("M");
			jrnlhdr.setIsActive((short) 1);

			// jrnlhdr.setJrnlTrxCode(trxconfighdr.getJrnlTrxCode());
			jrnlhdr.setCoaSchmCode(transjob.getCoaSchmCode());

			jrnlhdr.setJobId(transjob.getId());
			jrnlhdr.setUsrUpd(userupd);
			jrnlhdr.setUsrCrt(this.userupd);
			jrnlhdr.setDtmUpd(dtmUpd);
			jrnlhdr.setDtmCrt(dtmUpd);

			session.save(jrnlhdr);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return jrnlhdr;
	}

	private void SaveJournalDetail(Session session, TransJob transjob,
			Office office, Partner partner, JrnlHdr jrnlhdr,
			JrnlDtlModel jrnldtlmodel) throws Exception {

		/*
		 * if (jrnldtlmodel.size() != 0) { for (JrnlDtlModel list :
		 * jrnldtlmodel) {
		 */
		JrnlDtl jrnldtl = new JrnlDtl();
		try {
			jrnldtl.setJrnlHdr(jrnlhdr);

			jrnldtl.setCoaCoy(partner.getPartnerCode());
			jrnldtl.setCoaOffice(office.getOfficeCode());

			jrnldtl.setSequenceNo(jrnldtlmodel.getSequenceNo());
			jrnldtl.setCoaName(jrnldtlmodel.getCoaName());
			jrnldtl.setCoaCode(jrnldtlmodel.getCoacode());
			jrnldtl.setPost(jrnldtlmodel.getPost());
			if (jrnldtlmodel.getPost().equals("D")) {
				jrnldtl.setDebtAmt(jrnldtlmodel.getAmountjrnl()
						* this.hdrModel.getCurrRate());
				this.totalDebit += jrnldtlmodel.getAmountjrnl()
						* this.hdrModel.getCurrRate();
				jrnldtl.setCredAmt(0.00);
			} else {
				jrnldtl.setCredAmt(jrnldtlmodel.getAmountjrnl()
						* this.hdrModel.getCurrRate());
				jrnldtl.setDebtAmt(0.00);
				this.totalCredit += jrnldtlmodel.getAmountjrnl()
						* this.hdrModel.getCurrRate();
			}
			jrnldtl.setOriAmt(jrnldtlmodel.getAmountjrnl());

			jrnldtl.setCurrRate(this.hdrModel.getCurrRate());
			jrnldtl.setCurrId(this.hdrModel.getCurrId());
			jrnldtl.setOriAmt(jrnldtlmodel.getAmountjrnl());
			jrnldtl.setTrDesc(GetCoaInfo.GetDescription(partner,
					jrnldtlmodel.getCoaName())
					+ " " + jrnlhdr.getReffNo());

			jrnldtl.setCoaCodeX(this.coaheader);
			jrnldtl.setCoaOfficeX(this.officecode);
			jrnldtl.setDepartCode("");
			jrnldtl.setUsrCrt(this.userupd);
			jrnldtl.setUsrUpd(this.userupd);
			jrnldtl.setDtmUpd(dtmUpd);
			jrnldtl.setDtmCrt(dtmUpd);

			session.save(jrnldtl);
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	private void UpdateJob(Session session, TransJob transjob) throws Exception {
		try {
			transjob.setJobStatus("NE");
			transjob.setJobExecuteDate(dtmUpd);
			transjob.setJournalNo(this.JournalNo);
			transjob.setVoucherNo(this.VoucherNo);
			transjob.setUsrCrt(this.userupd);
			transjob.setDtmUpd(dtmUpd);
			session.update(transjob);

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	public void setVoucherNo(String voucherNo) {
		VoucherNo = voucherNo;
	}

	/**
	 * ********************************Getter Settter**********************
	 */

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

	/**
	 * @return the partnercode
	 */
	public String getPartnercode() {
		return partnercode;
	}

	/**
	 * @param partnercode
	 *            the partnercode to set
	 */
	public void setPartnercode(String partnercode) {
		this.partnercode = partnercode;
	}

	/**
	 * @return the officecode
	 */
	public String getOfficecode() {
		return officecode;
	}

	/**
	 * @param officecode
	 *            the officecode to set
	 */
	public void setOfficecode(String officecode) {
		this.officecode = officecode;
	}

	/**
	 * @return the officeid
	 */
	public long getOfficeid() {
		return officeid;
	}

	/**
	 * @param officeid
	 *            the officeid to set
	 */
	public void setOfficeid(long officeid) {
		this.officeid = officeid;
	}

	/**
	 * @return the coamaster
	 */
	public Coamaster getCoamaster() {
		return coamaster;
	}

	/**
	 * @param coamaster
	 *            the coamaster to set
	 */
	public void setCoamaster(Coamaster coamaster) {
		this.coamaster = coamaster;
	}

	/**
	 * @return the coaSchmDtl
	 */
	public CoaSchmDtl getCoaSchmDtl() {
		return coaSchmDtl;
	}

	/**
	 * @param coaSchmDtl
	 *            the coaSchmDtl to set
	 */
	public void setCoaSchmDtl(CoaSchmDtl coaSchmDtl) {
		this.coaSchmDtl = coaSchmDtl;
	}

	/**
	 * @return the coaSchmHdr
	 */
	public CoaSchmHdr getCoaSchmHdr() {
		return coaSchmHdr;
	}

	/**
	 * @param coaSchmHdr
	 *            the coaSchmHdr to set
	 */
	public void setCoaSchmHdr(CoaSchmHdr coaSchmHdr) {
		this.coaSchmHdr = coaSchmHdr;
	}

	/**
	 * @return the journalCode
	 */
	public String getJournalCode() {
		return JournalCode;
	}

	/**
	 * @param journalCode
	 *            the journalCode to set
	 */
	public void setJournalCode(String journalCode) {
		JournalCode = journalCode;
	}

	/**
	 * @return the configcode
	 */
	public String getConfigcode() {
		return configcode;
	}

	/**
	 * @param configcode
	 *            the configcode to set
	 */
	public void setConfigcode(String configcode) {
		this.configcode = configcode;
	}

	/**
	 * @return the userupd
	 */
	public String getUserupd() {
		return userupd;
	}

	/**
	 * @param userupd
	 *            the userupd to set
	 */
	public void setUserupd(String userupd) {
		this.userupd = userupd;
	}

	/**
	 * @return the hdrModel
	 */
	public JrnlHdrModel getHdrModel() {
		return hdrModel;
	}

	/**
	 * @param hdrModel
	 *            the hdrModel to set
	 */
	public void setHdrModel(JrnlHdrModel hdrModel) {
		this.hdrModel = hdrModel;
	}

	/**
	 * @return the dtlModel
	 */
	public JrnlDtlModel getDtlModel() {
		return dtlModel;
	}

	/**
	 * @param dtlModel
	 *            the dtlModel to set
	 */
	public void setDtlModel(JrnlDtlModel dtlModel) {
		this.dtlModel = dtlModel;
	}

	/**
	 * @return the journalNo
	 */
	public String getJournalNo() {
		return JournalNo;
	}

	/**
	 * @param journalNo
	 *            the journalNo to set
	 */
	public void setJournalNo(String journalNo) {
		JournalNo = journalNo;
	}

	/**
	 * @return the monthformat
	 */
	public DateFormat getMonthformat() {
		return monthformat;
	}

	/**
	 * @param monthformat
	 *            the monthformat to set
	 */
	public void setMonthformat(DateFormat monthformat) {
		this.monthformat = monthformat;
	}

	/**
	 * @return the yearformat
	 */
	public DateFormat getYearformat() {
		return yearformat;
	}

	/**
	 * @param yearformat
	 *            the yearformat to set
	 */
	public void setYearformat(DateFormat yearformat) {
		this.yearformat = yearformat;
	}

	/**
	 * @return the dateFormat
	 */
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	/**
	 * @param dateFormat
	 *            the dateFormat to set
	 */
	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	/**
	 * @return the dtmUpd
	 */
	public Date getDtmUpd() {
		return dtmUpd;
	}

	/**
	 * @param dtmUpd
	 *            the dtmUpd to set
	 */
	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	/**
	 * @return the voucherNo
	 */
	public String getVoucherNo() {
		return VoucherNo;
	}

	/**
	 * @return the coaheader
	 */
	public String getCoaheader() {
		return coaheader;
	}

	/**
	 * @param coaheader
	 *            the coaheader to set
	 */
	public void setCoaheader(String coaheader) {
		this.coaheader = coaheader;
	}

	/**
	 * @return the lstdtlModel
	 */
	public List<JrnlDtlModel> getLstdtlModel() {
		return lstdtlModel;
	}

	/**
	 * @param lstdtlModel
	 *            the lstdtlModel to set
	 */
	public void setLstdtlModel(List<JrnlDtlModel> lstdtlModel) {
		this.lstdtlModel = lstdtlModel;
	}

	/**
	 * @return the totalCredit
	 */
	public double getTotalCredit() {
		return totalCredit;
	}

	/**
	 * @param totalCredit
	 *            the totalCredit to set
	 */
	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}

	/**
	 * @return the totalDebit
	 */
	public double getTotalDebit() {
		return totalDebit;
	}

	/**
	 * @param totalDebit
	 *            the totalDebit to set
	 */
	public void setTotalDebit(double totalDebit) {
		this.totalDebit = totalDebit;
	}

	/**
	 * ********************************Getter Settter**********************
	 */
}
