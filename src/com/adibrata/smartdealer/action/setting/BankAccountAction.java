
package com.adibrata.smartdealer.action.setting;

import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankMaster;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class BankAccountAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private BankAccountService bankAccountService;
		private BankAccount bankaccount;
		private Partner partner;
		private Office office;
		private List<BankAccount> lstBankAccount;
		private Map<String, String> lstBankMaster;
		private Long bankaccountid;
		private int pageNumber;
		private Long id;
		private String bankName;
		private String bankAccountCode;
		private String bankAccountName;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String type;
		private String areaphone1;
		private String phoneno1;
		private String areaphone2;
		private String phoneno2;
		private String areafax;
		private String faxno;
		private String usrUpd;
		private String usrCrt;

		private String purpose;
		private String searchcriteria;
		private String searchvalue;
		private String message;

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

		public BankAccountAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final BankAccountService bankAccountService = new BankAccountDao();

				this.bankAccountService = bankAccountService;
				final Partner partner = new Partner();
				final Office office = new Office();
				final BankAccount bankaccount = new BankAccount();

				this.setPartner(partner);
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.setOffice(office);
				this.setBankaccount(bankaccount);
				// this.ListBankMaster();
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}
					
			}

		@Override
		public String execute() throws Exception
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "search" :
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "edit" :
									try
										{
											this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pageNumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pageNumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "last" :
									try
										{
											this.Paging(1);
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						this.pageNumber = 1;
						try
							{
								this.Paging();
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								strMode = ERROR;
								e.printStackTrace();
							}
						strMode = "start";
					}
				return strMode;
			}

		private String WhereCond()
			{
				String wherecond = " partnercode = '" + BaseAction.sesPartnerCode() + "'";
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ";
							}
						else
							{
								wherecond = this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ";
							}
					}
				return wherecond;
			}

		private void Paging() throws Exception
			{
				try
					{
						this.lstBankAccount = this.bankAccountService.Paging(this.getPageNumber(), this.WhereCond(), "");
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		private void Paging(final int islast) throws Exception
			{
				try
					{
						this.lstBankAccount = this.bankAccountService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.bankAccountService.getCurrentpage();
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		public String ViewData() throws Exception
			{
				this.bankaccount = new BankAccount();
				String status = "";
				try
					{
						if (this.getId() != null)
							{
								this.bankaccount = this.bankAccountService.View(this.getId());
								this.partner = this.bankaccount.getPartner();
								this.bankName = this.bankaccount.getBankName();
								this.bankAccountCode = this.bankaccount.getBankAccountCode();
								this.bankAccountName = this.bankaccount.getBankAccountName();
								this.type = this.bankaccount.getType();
								this.purpose = this.bankaccount.getPurpose();
								this.bankAccountName = this.bankaccount.getBankAccountName();
								this.address = this.bankaccount.getAddress();
								this.rt = this.bankaccount.getRt();
								this.rw = this.bankaccount.getRw();
								this.kelurahan = this.bankaccount.getKelurahan();
								this.kecamatan = this.bankaccount.getKecamatan();
								this.city = this.bankaccount.getCity();
								this.zipcode = this.bankaccount.getZipCode();
								this.areaphone1 = this.bankaccount.getAreaPhone1();
								this.areaphone2 = this.bankaccount.getAreaPhone2();
								this.phoneno1 = this.bankaccount.getPhoneNo1();
								this.phoneno2 = this.bankaccount.getPhoneNo2();
								this.areafax = this.bankaccount.getAreaFax();
								this.faxno = this.bankaccount.getFaxNo();
							}
						else
							{
								status = "end";
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{
						final BankAccount bankAccount = new BankAccount();
						bankAccount.setBankName(this.getBankName());
						bankAccount.setBankAccountCode(this.getBankAccountCode());
						bankAccount.setBankAccountName(this.getBankAccountName());
						bankAccount.setPartner(this.getPartner());
						bankAccount.setAddress(this.getAddress());
						bankAccount.setRt(this.getRt());
						bankAccount.setRw(this.getRw());
						bankAccount.setKelurahan(this.getKelurahan());
						bankAccount.setKecamatan(this.getKecamatan());
						bankAccount.setCity(this.getCity());
						bankAccount.setZipCode(this.getZipcode());
						bankAccount.setAreaPhone1(this.getAreaphone1());
						bankAccount.setAreaPhone2(this.getAreaphone1());
						bankAccount.setPhoneNo1(this.getPhoneno2());
						bankAccount.setPhoneNo2(this.getPhoneno2());
						bankAccount.setAreaFax(this.getAreafax());
						bankAccount.setFaxNo(this.getFaxno());
						bankAccount.setType(this.getType());
						bankAccount.setPurpose(this.getPurpose());

						bankAccount.setUsrUpd(this.getUsrUpd());
						this.bankAccountService.SaveAdd(bankAccount);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SaveEdit() throws Exception
			{
				String status = "";
				try
					{
						final BankAccount bankAccount = new BankAccount();
						bankAccount.setId(this.getId());
						bankAccount.setBankName(this.getBankName());
						bankAccount.setBankAccountCode(this.getBankAccountCode());
						bankAccount.setBankAccountName(this.getBankAccountName());
						bankAccount.setPartner(this.getPartner());
						bankAccount.setAddress(this.getAddress());
						bankAccount.setRt(this.getRt());
						bankAccount.setRw(this.getRw());
						bankAccount.setKelurahan(this.getKelurahan());
						bankAccount.setKecamatan(this.getKecamatan());

						bankAccount.setCity(this.getCity());
						bankAccount.setZipCode(this.getZipcode());
						bankAccount.setAreaPhone1(this.getAreaphone1());
						bankAccount.setAreaPhone2(this.getAreaphone1());
						bankAccount.setPhoneNo1(this.getPhoneno2());
						bankAccount.setPhoneNo2(this.getPhoneno2());
						bankAccount.setAreaFax(this.getAreafax());
						bankAccount.setFaxNo(this.getFaxno());
						bankAccount.setType(this.getType());
						bankAccount.setPurpose(this.getPurpose());

						bankAccount.setUsrUpd(this.getUsrUpd());
						this.bankAccountService.SaveEdit(bankAccount);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SaveDelete() throws Exception
			{
				String status = "";
				try
					{
						final BankAccount bankAccount = new BankAccount();
						if (this.getId() != null)
							{
								bankAccount.setId(this.getId());

								this.bankAccountService.SaveDel(bankAccount);
								status = SUCCESS;
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
								status = "end";
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		/**
		 * @return the bankAccountService
		 */
		public BankAccountService getBankAccountService()
			{
				return this.bankAccountService;
			}

		/**
		 * @return the bankaccount
		 */
		public BankAccount getBankaccount()
			{
				return this.bankaccount;
			}

		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}

		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}

		/**
		 * @return the lstBankAccount
		 */
		public List<BankAccount> getLstBankAccount()
			{
				return this.lstBankAccount;
			}

		/**
		 * @param bankAccountService
		 *            the bankAccountService to set
		 */
		public void setBankAccountService(final BankAccountService bankAccountService)
			{
				this.bankAccountService = bankAccountService;
			}

		/**
		 * @param bankaccount
		 *            the bankaccount to set
		 */
		public void setBankaccount(final BankAccount bankaccount)
			{
				this.bankaccount = bankaccount;
			}

		/**
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}

		/**
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
			}

		/**
		 * @param lstBankAccount
		 *            the lstBankAccount to set
		 */
		public void setLstBankAccount(final List<BankAccount> lstBankAccount)
			{
				this.lstBankAccount = lstBankAccount;
			}

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
			}

		/**
		 * @return the bankAccountCode
		 */
		public String getBankAccountCode()
			{
				return this.bankAccountCode;
			}

		/**
		 * @return the bankAccountName
		 */
		public String getBankAccountName()
			{
				return this.bankAccountName;
			}

		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}

		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}

		/**
		 * @param bankAccountCode
		 *            the bankAccountCode to set
		 */
		public void setBankAccountCode(final String bankAccountCode)
			{
				this.bankAccountCode = bankAccountCode;
			}

		/**
		 * @param bankAccountName
		 *            the bankAccountName to set
		 */
		public void setBankAccountName(final String bankAccountName)
			{
				this.bankAccountName = bankAccountName;
			}

		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}

		/**
		 * @param usrCrt
		 *            the usrCrt to set
		 */
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}

		/**
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
			}

		/**
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
			}

		/**
		 * @param searchcriteria
		 *            the searchcriteria to set
		 */
		public void setSearchcriteria(final String searchcriteria)
			{
				this.searchcriteria = searchcriteria;
			}

		/**
		 * @param searchvalue
		 *            the searchvalue to set
		 */
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
			}

		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}

		/**
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}

		public String getBankName()
			{
				return this.bankName;
			}

		public void setBankName(final String bankName)
			{
				this.bankName = bankName;
			}

		public String getMessage()
			{
				return this.message;
			}

		public void setMessage(final String message)
			{
				this.message = message;
			}

		/**
		 * @return the address
		 */
		public String getAddress()
			{
				return this.address;
			}

		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(final String address)
			{
				this.address = address;
			}

		/**
		 * @return the rt
		 */
		public String getRt()
			{
				return this.rt;
			}

		/**
		 * @param rt
		 *            the rt to set
		 */
		public void setRt(final String rt)
			{
				this.rt = rt;
			}

		/**
		 * @return the rw
		 */
		public String getRw()
			{
				return this.rw;
			}

		/**
		 * @param rw
		 *            the rw to set
		 */
		public void setRw(final String rw)
			{
				this.rw = rw;
			}

		/**
		 * @return the kelurahan
		 */
		public String getKelurahan()
			{
				return this.kelurahan;
			}

		/**
		 * @param kelurahan
		 *            the kelurahan to set
		 */
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}

		/**
		 * @return the kecamatan
		 */
		public String getKecamatan()
			{
				return this.kecamatan;
			}

		/**
		 * @param kecamatan
		 *            the kecamatan to set
		 */
		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}

		/**
		 * @return the city
		 */
		public String getCity()
			{
				return this.city;
			}

		/**
		 * @param city
		 *            the city to set
		 */
		public void setCity(final String city)
			{
				this.city = city;
			}

		/**
		 * @return the zipcode
		 */
		public String getZipcode()
			{
				return this.zipcode;
			}

		/**
		 * @param zipcode
		 *            the zipcode to set
		 */
		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}

		/**
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
			}

		/**
		 * @param type
		 *            the type to set
		 */
		public void setType(final String type)
			{
				this.type = type;
			}

		/**
		 * @return the areaphone1
		 */
		public String getAreaphone1()
			{
				return this.areaphone1;
			}

		/**
		 * @param areaphone1
		 *            the areaphone1 to set
		 */
		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}

		/**
		 * @return the phoneno1
		 */
		public String getPhoneno1()
			{
				return this.phoneno1;
			}

		/**
		 * @param phoneno1
		 *            the phoneno1 to set
		 */
		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}

		/**
		 * @return the areaphone2
		 */
		public String getAreaphone2()
			{
				return this.areaphone2;
			}

		/**
		 * @param areaphone2
		 *            the areaphone2 to set
		 */
		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}

		/**
		 * @return the phoneno2
		 */
		public String getPhoneno2()
			{
				return this.phoneno2;
			}

		/**
		 * @param phoneno2
		 *            the phoneno2 to set
		 */
		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}

		/**
		 * @return the areafax
		 */
		public String getAreafax()
			{
				return this.areafax;
			}

		/**
		 * @param areafax
		 *            the areafax to set
		 */
		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}

		/**
		 * @return the faxno
		 */
		public String getFaxno()
			{
				return this.faxno;
			}

		/**
		 * @param faxno
		 *            the faxno to set
		 */
		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}

		/**
		 * @return the purpose
		 */
		public String getPurpose()
			{
				return this.purpose;
			}

		/**
		 * @param purpose
		 *            the purpose to set
		 */
		public void setPurpose(final String purpose)
			{
				this.purpose = purpose;
			}

		/**
		 * @return the id
		 */
		public Long getId()
			{
				return this.id;
			}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
			}

		/**
		 * @return the lstBankMaster
		 */
		public Map<String, String> getLstBankMaster()
			{
				return this.lstBankMaster;
			}

		/**
		 * @param lstBankMaster
		 *            the lstBankMaster to set
		 */
		public void setLstBankMaster(final Map<String, String> lstBankMaster)
			{
				this.lstBankMaster = lstBankMaster;
			}

		/**
		 * @param bankmaster
		 *            the bankmaster to set
		 */
		public void setBankmaster(final BankMaster bankmaster)
			{
			}
			
		/**
		 * @return the bankaccountid
		 */
		public Long getBankaccountid()
			{
				return this.bankaccountid;
			}
			
		/**
		 * @param bankaccountid
		 *            the bankaccountid to set
		 */
		public void setBankaccountid(final Long bankaccountid)
			{
				this.bankaccountid = bankaccountid;
			}

	}
