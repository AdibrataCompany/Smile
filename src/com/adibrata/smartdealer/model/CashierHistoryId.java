
package com.adibrata.smartdealer.model;

// Generated Jul 19, 2015 10:57:21 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CashierHistoryId generated by hbm2java
 */
@Embeddable
public class CashierHistoryId implements java.io.Serializable
	{
		
		private Long id;
		private String partnerCode;
		private Long officeId;
		private Long employeeId;
		private Boolean currencyId;
		private Short openSeqNo;
		private Date openingDtm;
		private Double openingAmount;
		private Double balanceAmount;
		private String cashierStatus;
		private Date closingDtm;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CashierHistoryId()
			{
			}
		
		public CashierHistoryId(Long id, String partnerCode, Long officeId, Long employeeId, Boolean currencyId, Short openSeqNo, Date openingDtm, Double openingAmount, Double balanceAmount, String cashierStatus, Date closingDtm, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.employeeId = employeeId;
				this.currencyId = currencyId;
				this.openSeqNo = openSeqNo;
				this.openingDtm = openingDtm;
				this.openingAmount = openingAmount;
				this.balanceAmount = balanceAmount;
				this.cashierStatus = cashierStatus;
				this.closingDtm = closingDtm;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
		
		@Column(name = "Id")
		public Long getId()
			{
				return this.id;
			}
		
		public void setId(Long id)
			{
				this.id = id;
			}
		
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
		
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
		
		@Column(name = "OfficeId")
		public Long getOfficeId()
			{
				return this.officeId;
			}
		
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
			}
		
		@Column(name = "EmployeeId")
		public Long getEmployeeId()
			{
				return this.employeeId;
			}
		
		public void setEmployeeId(Long employeeId)
			{
				this.employeeId = employeeId;
			}
		
		@Column(name = "CurrencyId")
		public Boolean getCurrencyId()
			{
				return this.currencyId;
			}
		
		public void setCurrencyId(Boolean currencyId)
			{
				this.currencyId = currencyId;
			}
		
		@Column(name = "OpenSeqNo")
		public Short getOpenSeqNo()
			{
				return this.openSeqNo;
			}
		
		public void setOpenSeqNo(Short openSeqNo)
			{
				this.openSeqNo = openSeqNo;
			}
		
		@Column(name = "OpeningDtm", length = 23)
		public Date getOpeningDtm()
			{
				return this.openingDtm;
			}
		
		public void setOpeningDtm(Date openingDtm)
			{
				this.openingDtm = openingDtm;
			}
		
		@Column(name = "OpeningAmount", precision = 53, scale = 0)
		public Double getOpeningAmount()
			{
				return this.openingAmount;
			}
		
		public void setOpeningAmount(Double openingAmount)
			{
				this.openingAmount = openingAmount;
			}
		
		@Column(name = "BalanceAmount", precision = 53, scale = 0)
		public Double getBalanceAmount()
			{
				return this.balanceAmount;
			}
		
		public void setBalanceAmount(Double balanceAmount)
			{
				this.balanceAmount = balanceAmount;
			}
		
		@Column(name = "CashierStatus", length = 2)
		public String getCashierStatus()
			{
				return this.cashierStatus;
			}
		
		public void setCashierStatus(String cashierStatus)
			{
				this.cashierStatus = cashierStatus;
			}
		
		@Column(name = "ClosingDtm", length = 23)
		public Date getClosingDtm()
			{
				return this.closingDtm;
			}
		
		public void setClosingDtm(Date closingDtm)
			{
				this.closingDtm = closingDtm;
			}
		
		@Column(name = "DtmUpd", length = 16)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
		
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
		
		@Column(name = "UsrUpd", length = 50)
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
		
		public void setUsrUpd(String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
		
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
		
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
		
		@Column(name = "UsrCrt", length = 50)
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
		
		public void setUsrCrt(String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
		
		public boolean equals(Object other)
			{
				if ((this == other))
					return true;
				if ((other == null))
					return false;
				if (!(other instanceof CashierHistoryId))
					return false;
				CashierHistoryId castOther = (CashierHistoryId) other;
				
				return ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				        && ((this.getPartnerCode() == castOther.getPartnerCode()) || (this.getPartnerCode() != null && castOther.getPartnerCode() != null && this.getPartnerCode().equals(castOther.getPartnerCode())))
				        && ((this.getOfficeId() == castOther.getOfficeId()) || (this.getOfficeId() != null && castOther.getOfficeId() != null && this.getOfficeId().equals(castOther.getOfficeId())))
				        && ((this.getEmployeeId() == castOther.getEmployeeId()) || (this.getEmployeeId() != null && castOther.getEmployeeId() != null && this.getEmployeeId().equals(castOther.getEmployeeId())))
				        && ((this.getCurrencyId() == castOther.getCurrencyId()) || (this.getCurrencyId() != null && castOther.getCurrencyId() != null && this.getCurrencyId().equals(castOther.getCurrencyId())))
				        && ((this.getOpenSeqNo() == castOther.getOpenSeqNo()) || (this.getOpenSeqNo() != null && castOther.getOpenSeqNo() != null && this.getOpenSeqNo().equals(castOther.getOpenSeqNo())))
				        && ((this.getOpeningDtm() == castOther.getOpeningDtm()) || (this.getOpeningDtm() != null && castOther.getOpeningDtm() != null && this.getOpeningDtm().equals(castOther.getOpeningDtm())))
				        && ((this.getOpeningAmount() == castOther.getOpeningAmount()) || (this.getOpeningAmount() != null && castOther.getOpeningAmount() != null && this.getOpeningAmount().equals(castOther.getOpeningAmount())))
				        && ((this.getBalanceAmount() == castOther.getBalanceAmount()) || (this.getBalanceAmount() != null && castOther.getBalanceAmount() != null && this.getBalanceAmount().equals(castOther.getBalanceAmount())))
				        && ((this.getCashierStatus() == castOther.getCashierStatus()) || (this.getCashierStatus() != null && castOther.getCashierStatus() != null && this.getCashierStatus().equals(castOther.getCashierStatus())))
				        && ((this.getClosingDtm() == castOther.getClosingDtm()) || (this.getClosingDtm() != null && castOther.getClosingDtm() != null && this.getClosingDtm().equals(castOther.getClosingDtm())))
				        && ((this.getDtmUpd() == castOther.getDtmUpd()) || (this.getDtmUpd() != null && castOther.getDtmUpd() != null && this.getDtmUpd().equals(castOther.getDtmUpd())))
				        && ((this.getUsrUpd() == castOther.getUsrUpd()) || (this.getUsrUpd() != null && castOther.getUsrUpd() != null && this.getUsrUpd().equals(castOther.getUsrUpd())))
				        && ((this.getDtmCrt() == castOther.getDtmCrt()) || (this.getDtmCrt() != null && castOther.getDtmCrt() != null && this.getDtmCrt().equals(castOther.getDtmCrt())))
				        && ((this.getUsrCrt() == castOther.getUsrCrt()) || (this.getUsrCrt() != null && castOther.getUsrCrt() != null && this.getUsrCrt().equals(castOther.getUsrCrt())));
			}
		
		public int hashCode()
			{
				int result = 17;
				
				result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
				result = 37 * result + (getPartnerCode() == null ? 0 : this.getPartnerCode().hashCode());
				result = 37 * result + (getOfficeId() == null ? 0 : this.getOfficeId().hashCode());
				result = 37 * result + (getEmployeeId() == null ? 0 : this.getEmployeeId().hashCode());
				result = 37 * result + (getCurrencyId() == null ? 0 : this.getCurrencyId().hashCode());
				result = 37 * result + (getOpenSeqNo() == null ? 0 : this.getOpenSeqNo().hashCode());
				result = 37 * result + (getOpeningDtm() == null ? 0 : this.getOpeningDtm().hashCode());
				result = 37 * result + (getOpeningAmount() == null ? 0 : this.getOpeningAmount().hashCode());
				result = 37 * result + (getBalanceAmount() == null ? 0 : this.getBalanceAmount().hashCode());
				result = 37 * result + (getCashierStatus() == null ? 0 : this.getCashierStatus().hashCode());
				result = 37 * result + (getClosingDtm() == null ? 0 : this.getClosingDtm().hashCode());
				result = 37 * result + (getDtmUpd() == null ? 0 : this.getDtmUpd().hashCode());
				result = 37 * result + (getUsrUpd() == null ? 0 : this.getUsrUpd().hashCode());
				result = 37 * result + (getDtmCrt() == null ? 0 : this.getDtmCrt().hashCode());
				result = 37 * result + (getUsrCrt() == null ? 0 : this.getUsrCrt().hashCode());
				return result;
			}
		
	}
