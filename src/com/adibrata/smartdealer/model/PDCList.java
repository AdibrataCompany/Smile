
package com.adibrata.smartdealer.model;

import java.util.Date;

public class PDCList
	{
		Long id;
		Long AgrmntId;
		String AgrmntCode;
		String BankPdc;
		Date PDCDue;
		String PDCNo;
		Double PDCAmount;
		String PdcStatus;
		Short InkasoFlag;
		Short CummulativeFlag;
		Long BankAccountId;

		public PDCList()
			{
				// TODO Auto-generated constructor stub
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
		 * @return the agrmntId
		 */
		public Long getAgrmntId()
			{
				return this.AgrmntId;
			}
			
		/**
		 * @param agrmntId
		 *            the agrmntId to set
		 */
		public void setAgrmntId(final Long agrmntId)
			{
				this.AgrmntId = agrmntId;
			}
			
		/**
		 * @return the agrmntCode
		 */
		public String getAgrmntCode()
			{
				return this.AgrmntCode;
			}
			
		/**
		 * @param agrmntCode
		 *            the agrmntCode to set
		 */
		public void setAgrmntCode(final String agrmntCode)
			{
				this.AgrmntCode = agrmntCode;
			}
			
		/**
		 * @return the bankPdc
		 */
		public String getBankPdc()
			{
				return this.BankPdc;
			}
			
		/**
		 * @param bankPdc
		 *            the bankPdc to set
		 */
		public void setBankPdc(final String bankPdc)
			{
				this.BankPdc = bankPdc;
			}
			
		/**
		 * @return the pDCDue
		 */
		public Date getPDCDue()
			{
				return this.PDCDue;
			}
			
		/**
		 * @param pDCDue
		 *            the pDCDue to set
		 */
		public void setPDCDue(final Date pDCDue)
			{
				this.PDCDue = pDCDue;
			}
			
		/**
		 * @return the pDCNo
		 */
		public String getPDCNo()
			{
				return this.PDCNo;
			}
			
		/**
		 * @param pDCNo
		 *            the pDCNo to set
		 */
		public void setPDCNo(final String pDCNo)
			{
				this.PDCNo = pDCNo;
			}
			
		/**
		 * @return the pDCAmount
		 */
		public Double getPDCAmount()
			{
				return this.PDCAmount;
			}
			
		/**
		 * @param pDCAmount
		 *            the pDCAmount to set
		 */
		public void setPDCAmount(final Double pDCAmount)
			{
				this.PDCAmount = pDCAmount;
			}
			
		/**
		 * @return the pdcStatus
		 */
		public String getPdcStatus()
			{
				return this.PdcStatus;
			}
			
		/**
		 * @param pdcStatus
		 *            the pdcStatus to set
		 */
		public void setPdcStatus(final String pdcStatus)
			{
				this.PdcStatus = pdcStatus;
			}
			
		/**
		 * @return the inkasoFlag
		 */
		public Short getInkasoFlag()
			{
				return this.InkasoFlag;
			}
			
		/**
		 * @param inkasoFlag
		 *            the inkasoFlag to set
		 */
		public void setInkasoFlag(final Short inkasoFlag)
			{
				this.InkasoFlag = inkasoFlag;
			}
			
		/**
		 * @return the cummulativeFlag
		 */
		public Short getCummulativeFlag()
			{
				return this.CummulativeFlag;
			}
			
		/**
		 * @param cummulativeFlag
		 *            the cummulativeFlag to set
		 */
		public void setCummulativeFlag(final Short cummulativeFlag)
			{
				this.CummulativeFlag = cummulativeFlag;
			}
			
		/**
		 * @return the bankAccountId
		 */
		public Long getBankAccountId()
			{
				return this.BankAccountId;
			}
			
		/**
		 * @param bankAccountId
		 *            the bankAccountId to set
		 */
		public void setBankAccountId(final Long bankAccountId)
			{
				this.BankAccountId = bankAccountId;
			}

	}
