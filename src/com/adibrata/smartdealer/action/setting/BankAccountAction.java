
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.MasterTable;
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
		private List<MasterTable> lstBankMaster;
		
		private int pageNumber;
		private long id;
		private String bankAccountCode;
		private String bankAccountName;
		private String bankAccountType;
		private String bankAccountPurpose;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipCode;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String coacode;
		private String usrUpd;
		private String usrCrt;
		private String searchcriteria;
		private String searchvalue;
		private String bankmaster; // belum ditambahkan ke model
		
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
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
									strMode = this.Paging();
								case "edit" :
								
								case "del" :
									return this.SaveDelete();
								case "add" :
									
									strMode = this.SaveAdd();
								case "saveadd" :
									strMode = this.SaveAdd();
								case "saveedit" :
									strMode = this.SaveEdit();
								case "back" :
								
								default :
									return "failed";
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
			}
			
		private String Paging() throws Exception
			{
				
				String status = "";
				try
					{
						String wherecond = "";
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like " + this.getSearchcriteria();
							}
						else
							{
								wherecond = this.getSearchvalue() + " = " + this.getSearchcriteria();
							}
							
						this.lstBankAccount = this.bankAccountService.Paging(this.getPageNumber(), wherecond, "");
						
						status = "Success";
					}
				catch (final Exception exp)
					{
						status = "Failed";
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
						bankAccount.setBankAccountCode(this.getBankAccountCode());
						bankAccount.setBankAccountName(this.getBankAccountName());
						bankAccount.setCoacode(this.getCoacode());
						bankAccount.setType(this.getBankAccountType());
						bankAccount.setPurpose(this.getBankAccountPurpose());
						bankAccount.setAddress(this.getAddress());
						bankAccount.setRt(this.getRt());
						bankAccount.setRw(this.getRw());
						bankAccount.setKelurahan(this.getKelurahan());
						bankAccount.setCity(this.getCity());
						bankAccount.setZipCode(this.getZipCode());
						bankAccount.setAreaPhone1(this.getAreaPhone1());
						bankAccount.setAreaPhone2(this.getAreaPhone2());
						bankAccount.setPhoneNo1(this.getPhoneNo1());
						bankAccount.setPhoneNo2(this.getPhoneNo2());
						bankAccount.setAreaFax(this.getAreaFax());
						bankAccount.setFaxNo(this.getFaxNo());
						
						this.bankAccountService.SaveAdd(bankAccount);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
						bankAccount.setBankAccountCode(this.getBankAccountCode());
						bankAccount.setBankAccountName(this.getBankAccountName());
						bankAccount.setType(this.getBankAccountType());
						bankAccount.setPurpose(this.getBankAccountPurpose());
						bankAccount.setCoacode(this.getCoacode());
						bankAccount.setAddress(this.getAddress());
						bankAccount.setRt(this.getRt());
						bankAccount.setRw(this.getRw());
						bankAccount.setKelurahan(this.getKelurahan());
						bankAccount.setCity(this.getCity());
						bankAccount.setZipCode(this.getZipCode());
						bankAccount.setAreaPhone1(this.getAreaPhone1());
						bankAccount.setAreaPhone2(this.getAreaPhone2());
						bankAccount.setPhoneNo1(this.getPhoneNo1());
						bankAccount.setPhoneNo2(this.getPhoneNo2());
						bankAccount.setAreaFax(this.getAreaFax());
						bankAccount.setFaxNo(this.getFaxNo());
						this.bankAccountService.SaveEdit(bankAccount);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
						bankAccount.setId(this.getId());
						
						this.bankAccountService.SaveDel(bankAccount);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
		 * @return the lstBankMaster
		 */
		public List<MasterTable> getLstBankMaster()
			{
				return this.lstBankMaster;
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
			
		/**
		 * @param lstBankMaster
		 *            the lstBankMaster to set
		 */
		public void setLstBankMaster(final List<MasterTable> lstBankMaster)
			{
				this.lstBankMaster = lstBankMaster;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
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
		 * @return the coacode
		 */
		public String getCoacode()
			{
				return this.coacode;
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
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
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
		 * @param coacode
		 *            the coacode to set
		 */
		public void setCoacode(final String coacode)
			{
				this.coacode = coacode;
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
			
		/**
		 * @return the bankmaster
		 */
		public String getBankmaster()
			{
				return this.bankmaster;
			}
			
		/**
		 * @param bankmaster
		 *            the bankmaster to set
		 */
		public void setBankmaster(final String bankmaster)
			{
				this.bankmaster = bankmaster;
			}
			
		/**
		 * @return the address
		 */
		public String getAddress()
			{
				return this.address;
			}
			
		/**
		 * @return the rt
		 */
		public String getRt()
			{
				return this.rt;
			}
			
		/**
		 * @return the rw
		 */
		public String getRw()
			{
				return this.rw;
			}
			
		/**
		 * @return the kelurahan
		 */
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		/**
		 * @return the kecamatan
		 */
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		/**
		 * @return the city
		 */
		public String getCity()
			{
				return this.city;
			}
			
		/**
		 * @return the zipCode
		 */
		public String getZipCode()
			{
				return this.zipCode;
			}
			
		/**
		 * @return the areaPhone1
		 */
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}
			
		/**
		 * @return the phoneNo1
		 */
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}
			
		/**
		 * @return the areaPhone2
		 */
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}
			
		/**
		 * @return the phoneNo2
		 */
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}
			
		/**
		 * @return the areaFax
		 */
		public String getAreaFax()
			{
				return this.areaFax;
			}
			
		/**
		 * @return the faxNo
		 */
		public String getFaxNo()
			{
				return this.faxNo;
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
		 * @param rt
		 *            the rt to set
		 */
		public void setRt(final String rt)
			{
				this.rt = rt;
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
		 * @param kelurahan
		 *            the kelurahan to set
		 */
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
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
		 * @param city
		 *            the city to set
		 */
		public void setCity(final String city)
			{
				this.city = city;
			}
			
		/**
		 * @param zipCode
		 *            the zipCode to set
		 */
		public void setZipCode(final String zipCode)
			{
				this.zipCode = zipCode;
			}
			
		/**
		 * @param areaPhone1
		 *            the areaPhone1 to set
		 */
		public void setAreaPhone1(final String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}
			
		/**
		 * @param phoneNo1
		 *            the phoneNo1 to set
		 */
		public void setPhoneNo1(final String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}
			
		/**
		 * @param areaPhone2
		 *            the areaPhone2 to set
		 */
		public void setAreaPhone2(final String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}
			
		/**
		 * @param phoneNo2
		 *            the phoneNo2 to set
		 */
		public void setPhoneNo2(final String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}
			
		/**
		 * @param areaFax
		 *            the areaFax to set
		 */
		public void setAreaFax(final String areaFax)
			{
				this.areaFax = areaFax;
			}
			
		/**
		 * @param faxNo
		 *            the faxNo to set
		 */
		public void setFaxNo(final String faxNo)
			{
				this.faxNo = faxNo;
			}

		/**
		 * @return the bankaccounttype
		 */
		
		/**
		 * @return the bankAccountType
		 */
		public String getBankAccountType()
			{
				return this.bankAccountType;
			}
			
		/**
		 * @param bankAccountType
		 *            the bankAccountType to set
		 */
		public void setBankAccountType(final String bankAccountType)
			{
				this.bankAccountType = bankAccountType;
			}
			
		/**
		 * @return the bankAccountPurpose
		 */
		public String getBankAccountPurpose()
			{
				return this.bankAccountPurpose;
			}
			
		/**
		 * @param bankAccountPurpose
		 *            the bankAccountPurpose to set
		 */
		public void setBankAccountPurpose(final String bankAccountPurpose)
			{
				this.bankAccountPurpose = bankAccountPurpose;
			}
			
	}
