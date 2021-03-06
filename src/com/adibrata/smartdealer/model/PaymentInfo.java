
package com.adibrata.smartdealer.model;

import java.util.Date;

public class PaymentInfo
	{
		double osinstallment;
		double osinsurance;
		double oslcinstallment;
		double oslcinsurance;
		double prepaid;
		double osinterestundue;
		double osprincipalundue;
		double osinterest;
		double osprincipal;
		double accruedinterest;
		double valuedate;
		double lcinstallmentcurrent;
		double lcinsurancecurrent;
		double osarother;
		double lastlcinstallmentamount;
		double lastlcinsuranceamount;
		double totallcinstallment;
		double totallcinsurance;
		double totalinstallmentamount;
		double currencyrounded;
		Long currencyid;
		Date nextinstdate;
		Date nextinstduedate;
		short nextinstnumber;
		short nextinstduenumber;
		// total untuk early termination exclude prepayment penalty
		double totalearlytermination;
		
		double totalpayment;
		
		double earlyterminationpenalty;
		
		double totalosar;
		
		double maximuminstallment;
		double maximuminsurance;
		double maximumlcinstall;
		double maximumlcinsurance;
		double installmentallocation;
		double insuranceallocation;
		double lcinsuranceallocation;
		double lcinstallallocation;
		double prepaidallocation;
		
		public double getLastlcinstallmentamount()
			{
				return this.lastlcinstallmentamount;
			}
			
		public void setLastlcinstallmentamount(final double lastlcinstallmentamount)
			{
				this.lastlcinstallmentamount = lastlcinstallmentamount;
			}
			
		public Date getNextinstduedate()
			{
				return this.nextinstduedate;
			}
			
		public void setNextinstduedate(final Date nextinstduedate)
			{
				this.nextinstduedate = nextinstduedate;
			}
			
		public double getOsinstallment()
			{
				return this.osinstallment;
			}
			
		public void setOsinstallment(final double osinstallment)
			{
				this.osinstallment = osinstallment;
			}
			
		public double getOslcinstallment()
			{
				return this.oslcinstallment;
			}
			
		public void setOslcinstallment(final double oslcinstallment)
			{
				this.oslcinstallment = oslcinstallment;
			}
			
		public double getOslcinsurance()
			{
				return this.oslcinsurance;
			}
			
		public void setOslcinsurance(final double oslcinsurance)
			{
				this.oslcinsurance = oslcinsurance;
			}
			
		public double getPrepaid()
			{
				return this.prepaid;
			}
			
		public void setPrepaid(final double prepaid)
			{
				this.prepaid = prepaid;
			}
			
		public double getOsinterestundue()
			{
				return this.osinterestundue;
			}
			
		public void setOsinterestundue(final double osinterestundue)
			{
				this.osinterestundue = osinterestundue;
			}
			
		public double getOsprincipalundue()
			{
				return this.osprincipalundue;
			}
			
		public void setOsprincipalundue(final double osprincipalundue)
			{
				this.osprincipalundue = osprincipalundue;
			}
			
		public double getOsinterest()
			{
				return this.osinterest;
			}
			
		public void setOsinterest(final double osinterest)
			{
				this.osinterest = osinterest;
			}
			
		public double getOsprincipal()
			{
				return this.osprincipal;
			}
			
		public void setOsprincipal(final double osprincipal)
			{
				this.osprincipal = osprincipal;
			}
			
		public double getAccruedinterest()
			{
				return this.accruedinterest;
			}
			
		public void setAccruedinterest(final double accruedinterest)
			{
				this.accruedinterest = accruedinterest;
			}
			
		public double getValuedate()
			{
				return this.valuedate;
			}
			
		public void setValuedate(final double valuedate)
			{
				this.valuedate = valuedate;
			}
			
		public double getLcinstallmentcurrent()
			{
				return this.lcinstallmentcurrent;
			}
			
		public void setLcinstallmentcurrent(final double lcinstallmentcurrent)
			{
				this.lcinstallmentcurrent = lcinstallmentcurrent;
			}
			
		public double getOsarother()
			{
				return this.osarother;
			}
			
		public void setOsarother(final double osarother)
			{
				this.osarother = osarother;
			}
			
		public PaymentInfo()
			{
				// TODO Auto-generated constructor stub
			}
			
		public double getOsinsurance()
			{
				return this.osinsurance;
			}
			
		public void setOsinsurance(final double osinsurance)
			{
				this.osinsurance = osinsurance;
			}
			
		public double getTotallcinstallment()
			{
				return this.totallcinstallment;
			}
			
		public void setTotallcinstallment(final double totallcinstallment)
			{
				this.totallcinstallment = totallcinstallment;
			}
			
		public double getTotallcinsurance()
			{
				return this.totallcinsurance;
			}
			
		public void setTotallcinsurance(final double totallcinsurance)
			{
				this.totallcinsurance = totallcinsurance;
			}
			
		public double getLcinsurancecurrent()
			{
				return this.lcinsurancecurrent;
			}
			
		public void setLcinsurancecurrent(final double lcinsurancecurrent)
			{
				this.lcinsurancecurrent = lcinsurancecurrent;
			}
			
		public double getLastlcinsuranceamount()
			{
				return this.lastlcinsuranceamount;
			}
			
		public void setLastlcinsuranceamount(final double lastlcinsuranceamount)
			{
				this.lastlcinsuranceamount = lastlcinsuranceamount;
			}
			
		public double getTotalinstallmentamount()
			{
				return this.totalinstallmentamount;
			}
			
		public void setTotalinstallmentamount(final double totalinstallmentamount)
			{
				this.totalinstallmentamount = totalinstallmentamount;
			}
			
		public void setNextinstduenumber(final short nextinstduenumber)
			{
				this.nextinstduenumber = nextinstduenumber;
			}
			
		public double getCurrencyrounded()
			{
				return this.currencyrounded;
			}
			
		public void setCurrencyrounded(final double currencyrounded)
			{
				this.currencyrounded = currencyrounded;
			}
			
		public Long getCurrencyid()
			{
				return this.currencyid;
			}
			
		public void setCurrencyid(final Long currencyid)
			{
				this.currencyid = currencyid;
			}
			
		public short getNextinstduenumber()
			{
				return this.nextinstduenumber;
			}
			
		public void setNextinstnumber(final short nextinstnumber)
			{
				this.nextinstnumber = nextinstnumber;
			}
			
		public double getTotalearlytermination()
			{
				return this.totalearlytermination;
			}
			
		public void setTotalearlytermination(final double totalearlytermination)
			{
				this.totalearlytermination = totalearlytermination;
			}
			
		public short getNextinstnumber()
			{
				return this.nextinstnumber;
			}
			
		public double getTotalosar()
			{
				return this.totalosar;
			}
			
		public void setTotalosar(final double totalosar)
			{
				this.totalosar = totalosar;
			}
			
		/**
		 * @return the nextinstdate
		 */
		public Date getNextinstdate()
			{
				return this.nextinstdate;
			}
			
		/**
		 * @param nextinstdate
		 *            the nextinstdate to set
		 */
		public void setNextinstdate(final Date nextinstdate)
			{
				this.nextinstdate = nextinstdate;
			}
			
		/**
		 * @return the totalpayment
		 */
		public double getTotalpayment()
			{
				return this.totalpayment;
			}
			
		/**
		 * @param totalpayment
		 *            the totalpayment to set
		 */
		public void setTotalpayment(final double totalpayment)
			{
				this.totalpayment = totalpayment;
			}
			
		/**
		 * @return the earlyterminationpenalty
		 */
		public double getEarlyterminationpenalty()
			{
				return this.earlyterminationpenalty;
			}
			
		/**
		 * @param earlyterminationpenalty
		 *            the earlyterminationpenalty to set
		 */
		public void setEarlyterminationpenalty(final double earlyterminationpenalty)
			{
				this.earlyterminationpenalty = earlyterminationpenalty;
			}

		/**
		 * @return the maximuminstallment
		 */
		public double getMaximuminstallment()
			{
				return this.maximuminstallment;
			}

		/**
		 * @param maximuminstallment
		 *            the maximuminstallment to set
		 */
		public void setMaximuminstallment(final double maximuminstallment)
			{
				this.maximuminstallment = maximuminstallment;
			}

		/**
		 * @return the maximuminsurance
		 */
		public double getMaximuminsurance()
			{
				return this.maximuminsurance;
			}

		/**
		 * @param maximuminsurance
		 *            the maximuminsurance to set
		 */
		public void setMaximuminsurance(final double maximuminsurance)
			{
				this.maximuminsurance = maximuminsurance;
			}

		/**
		 * @return the maximumlcinstall
		 */
		public double getMaximumlcinstall()
			{
				return this.maximumlcinstall;
			}

		/**
		 * @param maximumlcinstall
		 *            the maximumlcinstall to set
		 */
		public void setMaximumlcinstall(final double maximumlcinstall)
			{
				this.maximumlcinstall = maximumlcinstall;
			}

		/**
		 * @return the maximumlcinsurance
		 */
		public double getMaximumlcinsurance()
			{
				return this.maximumlcinsurance;
			}

		/**
		 * @param maximumlcinsurance
		 *            the maximumlcinsurance to set
		 */
		public void setMaximumlcinsurance(final double maximumlcinsurance)
			{
				this.maximumlcinsurance = maximumlcinsurance;
			}
			
		/**
		 * @return the installmentallocation
		 */
		public double getInstallmentallocation()
			{
				return this.installmentallocation;
			}
			
		/**
		 * @param installmentallocation
		 *            the installmentallocation to set
		 */
		public void setInstallmentallocation(final double installmentallocation)
			{
				this.installmentallocation = installmentallocation;
			}
			
		/**
		 * @return the insuranceallocation
		 */
		public double getInsuranceallocation()
			{
				return this.insuranceallocation;
			}
			
		/**
		 * @param insuranceallocation
		 *            the insuranceallocation to set
		 */
		public void setInsuranceallocation(final double insuranceallocation)
			{
				this.insuranceallocation = insuranceallocation;
			}
			
		/**
		 * @return the lcinsuranceallocation
		 */
		public double getLcinsuranceallocation()
			{
				return this.lcinsuranceallocation;
			}
			
		/**
		 * @param lcinsuranceallocation
		 *            the lcinsuranceallocation to set
		 */
		public void setLcinsuranceallocation(final double lcinsuranceallocation)
			{
				this.lcinsuranceallocation = lcinsuranceallocation;
			}
			
		/**
		 * @return the lcinstallallocation
		 */
		public double getLcinstallallocation()
			{
				return this.lcinstallallocation;
			}
			
		/**
		 * @param lcinstallallocation
		 *            the lcinstallallocation to set
		 */
		public void setLcinstallallocation(final double lcinstallallocation)
			{
				this.lcinstallallocation = lcinstallallocation;
			}
			
		/**
		 * @return the prepaidallocation
		 */
		public double getPrepaidallocation()
			{
				return this.prepaidallocation;
			}
			
		/**
		 * @param prepaidallocation
		 *            the prepaidallocation to set
		 */
		public void setPrepaidallocation(final double prepaidallocation)
			{
				this.prepaidallocation = prepaidallocation;
			}
			
	}
