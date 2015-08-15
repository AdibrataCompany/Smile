/**
 * PaymentHistoryList.java
 */

package com.adibrata.smartdealer.model;

import java.util.Date;

/**
 * @author Henry
 */
public class PaymentHistoryList
	{
		
		/**
		 *
		 */
		Long id;
		Long AgrmntId;
		Long PayHistHdrId;
		Long OfficeId;
		String partnercode;
		Date ValueDate;
		Date PostingDate;
		String OfficeName;
		String AgrmntCode;
		String CustomerName;
		int HistorySequenceNo;
		String bankaccountname;
		String bankaccountid;
		
		public PaymentHistoryList()
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
		 * @return the payHistHdrId
		 */
		public Long getPayHistHdrId()
			{
				return this.PayHistHdrId;
			}

		/**
		 * @param payHistHdrId
		 *            the payHistHdrId to set
		 */
		public void setPayHistHdrId(final Long payHistHdrId)
			{
				this.PayHistHdrId = payHistHdrId;
			}

		/**
		 * @return the officeId
		 */
		public Long getOfficeId()
			{
				return this.OfficeId;
			}

		/**
		 * @param officeId
		 *            the officeId to set
		 */
		public void setOfficeId(final Long officeId)
			{
				this.OfficeId = officeId;
			}

		/**
		 * @return the partnercode
		 */
		public String getPartnercode()
			{
				return this.partnercode;
			}

		/**
		 * @param partnercode
		 *            the partnercode to set
		 */
		public void setPartnercode(final String partnercode)
			{
				this.partnercode = partnercode;
			}

		/**
		 * @return the valueDate
		 */
		public Date getValueDate()
			{
				return this.ValueDate;
			}

		/**
		 * @param valueDate
		 *            the valueDate to set
		 */
		public void setValueDate(final Date valueDate)
			{
				this.ValueDate = valueDate;
			}

		/**
		 * @return the postingDate
		 */
		public Date getPostingDate()
			{
				return this.PostingDate;
			}

		/**
		 * @param postingDate
		 *            the postingDate to set
		 */
		public void setPostingDate(final Date postingDate)
			{
				this.PostingDate = postingDate;
			}

		/**
		 * @return the officeName
		 */
		public String getOfficeName()
			{
				return this.OfficeName;
			}

		/**
		 * @param officeName
		 *            the officeName to set
		 */
		public void setOfficeName(final String officeName)
			{
				this.OfficeName = officeName;
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
		 * @return the customerName
		 */
		public String getCustomerName()
			{
				return this.CustomerName;
			}

		/**
		 * @param customerName
		 *            the customerName to set
		 */
		public void setCustomerName(final String customerName)
			{
				this.CustomerName = customerName;
			}

		/**
		 * @return the historySequenceNo
		 */
		public int getHistorySequenceNo()
			{
				return this.HistorySequenceNo;
			}

		/**
		 * @param historySequenceNo
		 *            the historySequenceNo to set
		 */
		public void setHistorySequenceNo(final int historySequenceNo)
			{
				this.HistorySequenceNo = historySequenceNo;
			}
			
		/**
		 * @return the bankaccountname
		 */
		public String getBankaccountname()
			{
				return this.bankaccountname;
			}
			
		/**
		 * @param bankaccountname
		 *            the bankaccountname to set
		 */
		public void setBankaccountname(final String bankaccountname)
			{
				this.bankaccountname = bankaccountname;
			}
			
		/**
		 * @return the bankaccountid
		 */
		public String getBankaccountid()
			{
				return this.bankaccountid;
			}
			
		/**
		 * @param bankaccountid
		 *            the bankaccountid to set
		 */
		public void setBankaccountid(final String bankaccountid)
			{
				this.bankaccountid = bankaccountid;
			}
			
	}
