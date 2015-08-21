
package com.adibrata.smartdealer.action.setting.bankaccount;

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
		private BankAccountService bankaccountservice;
		private BankAccount bankaccount;
		private Partner partner;
		private Office office;
		private List<BankAccount> lstbankaccount;
		private Map<String, String> lstbankmaster;
		
		private int pagenumber;
		private Long id;
		private String bankname;
		private String bankaccountcode;
		private String bankaccountname;
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
				this.bankaccountservice = new BankAccountDao();
				this.bankaccount = new BankAccount();
				
				this.partner = new Partner();
				this.office = new Office();
				this.setPartner(this.partner);
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
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
											e.printStackTrace();
										}
									break;
								case "edit" :
									try
										{
											strMode = this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
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
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pagenumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pagenumber -= 1;
									if (this.pagenumber <= 1)
										{
											this.pagenumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pagenumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
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
											e.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						this.pagenumber = 1;
						try
							{
								this.Paging();
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "start";
					}
				return strMode;
			}
			
		public String save()
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						try
							{
								strMode = "input";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
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
						this.lstbankaccount = this.bankaccountservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstbankaccount = this.bankaccountservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.bankaccountservice.getCurrentpage();
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
								this.bankaccount = this.bankaccountservice.View(this.getId());
								
								this.bankname = this.bankaccount.getBankName();
								this.bankaccountcode = this.bankaccount.getBankAccountCode();
								this.bankaccountname = this.bankaccount.getBankAccountName();
								this.type = this.bankaccount.getType();
								this.purpose = this.bankaccount.getPurpose();
								this.bankaccountname = this.bankaccount.getBankAccountName();
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
								this.Paging();
								status = "start";
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
				try
					{
						this.bankaccount = new BankAccount();
						this.bankaccount.setBankName(this.getBankname());
						this.bankaccount.setPartner(this.getPartner());
						this.bankaccount.setOffice(this.getOffice());
						
						this.bankaccount.setBankAccountCode(this.getBankaccountcode());
						this.bankaccount.setBankAccountName(this.getBankaccountname());

						this.bankaccount.setAddress(this.getAddress());
						this.bankaccount.setRt(this.getRt());
						this.bankaccount.setRw(this.getRw());
						this.bankaccount.setKelurahan(this.getKelurahan());
						this.bankaccount.setKecamatan(this.getKecamatan());
						this.bankaccount.setCity(this.getCity());
						this.bankaccount.setZipCode(this.getZipcode());
						this.bankaccount.setAreaPhone1(this.getAreaphone1());
						this.bankaccount.setAreaPhone2(this.getAreaphone1());
						this.bankaccount.setPhoneNo1(this.getPhoneno2());
						this.bankaccount.setPhoneNo2(this.getPhoneno2());
						this.bankaccount.setAreaFax(this.getAreafax());
						this.bankaccount.setFaxNo(this.getFaxno());
						this.bankaccount.setType(this.getType());
						this.bankaccount.setPurpose(this.getPurpose());
						
						this.bankaccount.setUsrUpd(BaseAction.sesLoginName());
						this.bankaccountservice.SaveAdd(this.bankaccount);
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}
			
		private String SaveEdit() throws Exception
			{
				try
					{
						this.bankaccount = new BankAccount();
						this.bankaccount.setId(this.getId());
						this.bankaccount.setBankName(this.getBankname());
						this.bankaccount.setBankAccountCode(this.getBankaccountcode());
						this.bankaccount.setBankAccountName(this.getBankaccountname());
						this.bankaccount.setPartner(this.getPartner());
						this.bankaccount.setOffice(this.office);
						this.bankaccount.setAddress(this.getAddress());
						this.bankaccount.setRt(this.getRt());
						this.bankaccount.setRw(this.getRw());
						this.bankaccount.setKelurahan(this.getKelurahan());
						this.bankaccount.setKecamatan(this.getKecamatan());
						
						this.bankaccount.setCity(this.getCity());
						this.bankaccount.setZipCode(this.getZipcode());
						this.bankaccount.setAreaPhone1(this.getAreaphone1());
						this.bankaccount.setAreaPhone2(this.getAreaphone1());
						this.bankaccount.setPhoneNo1(this.getPhoneno2());
						this.bankaccount.setPhoneNo2(this.getPhoneno2());
						this.bankaccount.setAreaFax(this.getAreafax());
						this.bankaccount.setFaxNo(this.getFaxno());
						this.bankaccount.setType(this.getType());
						this.bankaccount.setPurpose(this.getPurpose());
						
						this.bankaccount.setUsrUpd(BaseAction.sesLoginName());
						this.bankaccountservice.SaveEdit(this.bankaccount);
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
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
								
								this.bankaccountservice.SaveDel(bankAccount);
								status = SUCCESS;
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
								status = "start";
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
			
		public String getMode()
			{
				return this.mode;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
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
		 * @param bankmaster
		 *            the bankmaster to set
		 */
		public void setBankmaster(final BankMaster bankmaster)
			{
			}
			
		public String getBankname()
			{
				return this.bankname;
			}
			
		public void setBankname(final String bankname)
			{
				this.bankname = bankname;
			}
			
		public String getBankaccountcode()
			{
				return this.bankaccountcode;
			}
			
		public void setBankaccountcode(final String bankaccountcode)
			{
				this.bankaccountcode = bankaccountcode;
			}
			
		public String getBankaccountname()
			{
				return this.bankaccountname;
			}
			
		public void setBankaccountname(final String bankaccountname)
			{
				this.bankaccountname = bankaccountname;
			}
			
		public BankAccountService getBankaccountservice()
			{
				return this.bankaccountservice;
			}
			
		public void setBankaccountservice(final BankAccountService bankaccountservice)
			{
				this.bankaccountservice = bankaccountservice;
			}
			
		public List<BankAccount> getLstbankaccount()
			{
				return this.lstbankaccount;
			}
			
		public void setLstbankaccount(final List<BankAccount> lstbankaccount)
			{
				this.lstbankaccount = lstbankaccount;
			}
			
		public Map<String, String> getLstbankmaster()
			{
				return this.lstbankmaster;
			}
			
		public void setLstbankmaster(final Map<String, String> lstbankmaster)
			{
				this.lstbankmaster = lstbankmaster;
			}
			
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}
			
	}
