/**
 *
 */

package util.adibrata.support.cashbank;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.CoaInfo;
import util.adibrata.support.jourmal.JrnlDtlModel;
import util.adibrata.support.jourmal.JrnlHdrModel;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.model.CashBankDtl;
import com.adibrata.smartdealer.model.CashBankHdr;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;

// import model.adibrata.smartfinance.*;

public class CashBankPosting
{
	private static Date dtmUpd = Calendar.getInstance().getTime();
	private static String voucherNo;

	public static void CashBankDtlSave(final Session session, final TransJob transjob, final Office office, final Partner partner, final CashBankHdr bankHdr, final JrnlDtlModel jrnldtlmodel, final String usrupd) throws Exception
		{

			final CashBankDtl bankDtl = new CashBankDtl();
			try
				{

					bankDtl.setCashBankHdr(bankHdr);
					bankDtl.setSequenceNo(0);
					bankDtl.setCoaName(jrnldtlmodel.getCoaName());
					bankDtl.setCoaCode(jrnldtlmodel.getCoacode());

					bankDtl.setDescription(CoaInfo.GetDescription(partner, jrnldtlmodel.getCoaName()));
					bankDtl.setDebitAmt(0.00);
					bankDtl.setCreditAmt(0.00);
					bankDtl.setDepartId(jrnldtlmodel.getDepartId());

					bankDtl.setUsrUpd(usrupd);
					bankDtl.setUsrCrt(usrupd);
					bankDtl.setDtmUpd(dtmUpd);
					bankDtl.setDtmCrt(dtmUpd);

					session.save(bankDtl);
					session.flush();
					session.clear();
				}
			catch (final Exception exp)
				{

					final ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
					lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);
				}
			// return bankDtl;
		}

	public static CashBankHdr CashBankHeaderSave(final Session session, final TransJob transjob, final Office office, final Partner partner, final JrnlHdrModel jrnlHdrModel, final String usrupd) throws Exception
		{

			final CashBankHdr bankHdr = new CashBankHdr();
			try
				{
					bankHdr.setPartner(partner);
					bankHdr.setOffice(office);
					voucherNo = GetTransNo.GenerateVoucherNo(session, jrnlHdrModel.getBankAccId(), transjob.getJobPost());

					bankHdr.setVoucherNo(voucherNo);

					bankHdr.setPostingDt(transjob.getJobPost());
					bankHdr.setValueDt(transjob.getJobDate());

					bankHdr.setDescription(jrnlHdrModel.getTrxDesc());
					bankHdr.setRcvDsbFlag(jrnlHdrModel.getRcvDisbFlag());
					bankHdr.setWop(jrnlHdrModel.getWop());

					bankHdr.setAmount(jrnlHdrModel.getAmountTrx());
					bankHdr.setRcvFrom(jrnlHdrModel.getReceivedFrom());

					bankHdr.setReffNo(jrnlHdrModel.getReffNo());
					bankHdr.setReceiptNo(jrnlHdrModel.getReceiptNo());

					bankHdr.setUsrUpd(usrupd);
					bankHdr.setUsrCrt(usrupd);
					bankHdr.setDtmUpd(dtmUpd);
					bankHdr.setDtmCrt(dtmUpd);

					session.save(bankHdr);
					session.flush();
					session.clear();
				}
			catch (final Exception exp)
				{

					final ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
					lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);
				}
			return bankHdr;
		}

	/**
	 * @return the voucherNo
	 */
	public static String getVoucherNo()
		{
			return voucherNo;
		}

	/**
	 * @param voucherNo
	 *            the voucherNo to set
	 */
	public static void setVoucherNo(final String voucherNo)
		{
			CashBankPosting.voucherNo = voucherNo;
		}

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	Session session;

	/**
	 *
	 */
	public CashBankPosting()
		{

			// TODO Auto-generated constructor stub
		}

	public CashBankPosting(final Session session)
		{
			this.session = session;
			// TODO Auto-generated constructor stub
		}
}
