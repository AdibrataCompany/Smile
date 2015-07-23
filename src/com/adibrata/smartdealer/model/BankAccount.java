
package com.adibrata.smartdealer.model;
// Generated Jul 23, 2015 9:44:44 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * BankAccount generated by hbm2java
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "BankAccount", catalog = "SmartDealer")
public class BankAccount implements java.io.Serializable
	{

		private long id;
		private static final long serialVersionUID = 1L;
		private Partner partner;
		private Long officeId;
		private String bankName;
		private String bankAccountCode;
		private String bankAccountName;
		private String type;
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
		private String fullAddress;
		private Double endingBalance;
		private String coacode;
		private Long seqNo;
		private String resetFlag;
		private String formatSeqNo;
		private Short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AdvanceCash> advanceCashes = new HashSet<AdvanceCash>(0);
		private Set<CashBankHdr> cashBankHdrs = new HashSet<CashBankHdr>(0);
		private Set<PayReqHdr> payReqHdrs = new HashSet<PayReqHdr>(0);

		public BankAccount()
			{
			}

		public BankAccount(final long id)
			{
				this.id = id;
			}

		public BankAccount(final long id, final Partner partner, final Long officeId, final String bankName, final String bankAccountCode, final String bankAccountName, final String type, final String address, final String rt, final String rw,
		        final String kelurahan, final String kecamatan, final String city, final String zipCode, final String areaPhone1, final String phoneNo1, final String areaPhone2, final String phoneNo2, final String areaFax, final String faxNo,
		        final String fullAddress, final Double endingBalance, final String coacode, final Long seqNo, final String resetFlag, final String formatSeqNo, final Short isActive, final Date dtmUpd, final String usrUpd, final Date dtmCrt,
		        final String usrCrt, final Set<AdvanceCash> advanceCashes, final Set<CashBankHdr> cashBankHdrs, final Set<PayReqHdr> payReqHdrs)
			{
				this.id = id;
				this.partner = partner;
				this.officeId = officeId;
				this.bankName = bankName;
				this.bankAccountCode = bankAccountCode;
				this.bankAccountName = bankAccountName;
				this.type = type;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipCode = zipCode;
				this.areaPhone1 = areaPhone1;
				this.phoneNo1 = phoneNo1;
				this.areaPhone2 = areaPhone2;
				this.phoneNo2 = phoneNo2;
				this.areaFax = areaFax;
				this.faxNo = faxNo;
				this.fullAddress = fullAddress;
				this.endingBalance = endingBalance;
				this.coacode = coacode;
				this.seqNo = seqNo;
				this.resetFlag = resetFlag;
				this.formatSeqNo = formatSeqNo;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.advanceCashes = advanceCashes;
				this.cashBankHdrs = cashBankHdrs;
				this.payReqHdrs = payReqHdrs;
			}

		@Id

		@Column(name = "ID", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}

		public void setId(final long id)
			{
				this.id = id;
			}

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}

		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}

		@Column(name = "OfficeID")
		public Long getOfficeId()
			{
				return this.officeId;
			}

		public void setOfficeId(final Long officeId)
			{
				this.officeId = officeId;
			}

		@Column(name = "BankName", length = 50)
		public String getBankName()
			{
				return this.bankName;
			}

		public void setBankName(final String bankName)
			{
				this.bankName = bankName;
			}

		@Column(name = "BankAccountCode", length = 20)
		public String getBankAccountCode()
			{
				return this.bankAccountCode;
			}

		public void setBankAccountCode(final String bankAccountCode)
			{
				this.bankAccountCode = bankAccountCode;
			}

		@Column(name = "BankAccountName", length = 50)
		public String getBankAccountName()
			{
				return this.bankAccountName;
			}

		public void setBankAccountName(final String bankAccountName)
			{
				this.bankAccountName = bankAccountName;
			}

		@Column(name = "Type", length = 2)
		public String getType()
			{
				return this.type;
			}

		public void setType(final String type)
			{
				this.type = type;
			}

		@Column(name = "Address", length = 50)
		public String getAddress()
			{
				return this.address;
			}

		public void setAddress(final String address)
			{
				this.address = address;
			}

		@Column(name = "Rt", length = 3)
		public String getRt()
			{
				return this.rt;
			}

		public void setRt(final String rt)
			{
				this.rt = rt;
			}

		@Column(name = "Rw", length = 3)
		public String getRw()
			{
				return this.rw;
			}

		public void setRw(final String rw)
			{
				this.rw = rw;
			}

		@Column(name = "Kelurahan", length = 20)
		public String getKelurahan()
			{
				return this.kelurahan;
			}

		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}

		@Column(name = "Kecamatan", length = 20)
		public String getKecamatan()
			{
				return this.kecamatan;
			}

		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}

		@Column(name = "City", length = 20)
		public String getCity()
			{
				return this.city;
			}

		public void setCity(final String city)
			{
				this.city = city;
			}

		@Column(name = "ZipCode", length = 12)
		public String getZipCode()
			{
				return this.zipCode;
			}

		public void setZipCode(final String zipCode)
			{
				this.zipCode = zipCode;
			}

		@Column(name = "AreaPhone1", length = 4)
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}

		public void setAreaPhone1(final String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}

		@Column(name = "PhoneNo1", length = 20)
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}

		public void setPhoneNo1(final String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}

		@Column(name = "AreaPhone2", length = 4)
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}

		public void setAreaPhone2(final String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}

		@Column(name = "PhoneNo2", length = 20)
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}

		public void setPhoneNo2(final String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}

		@Column(name = "AreaFax", length = 4)
		public String getAreaFax()
			{
				return this.areaFax;
			}

		public void setAreaFax(final String areaFax)
			{
				this.areaFax = areaFax;
			}

		@Column(name = "FaxNo", length = 20)
		public String getFaxNo()
			{
				return this.faxNo;
			}

		public void setFaxNo(final String faxNo)
			{
				this.faxNo = faxNo;
			}

		@Column(name = "FullAddress", length = 500)
		public String getFullAddress()
			{
				return this.fullAddress;
			}

		public void setFullAddress(final String fullAddress)
			{
				this.fullAddress = fullAddress;
			}

		@Column(name = "EndingBalance", precision = 53, scale = 0)
		public Double getEndingBalance()
			{
				return this.endingBalance;
			}

		public void setEndingBalance(final Double endingBalance)
			{
				this.endingBalance = endingBalance;
			}

		@Column(name = "COACode", length = 50)
		public String getCoacode()
			{
				return this.coacode;
			}

		public void setCoacode(final String coacode)
			{
				this.coacode = coacode;
			}

		@Column(name = "SeqNo")
		public Long getSeqNo()
			{
				return this.seqNo;
			}

		public void setSeqNo(final Long seqNo)
			{
				this.seqNo = seqNo;
			}

		@Column(name = "ResetFlag", length = 50)
		public String getResetFlag()
			{
				return this.resetFlag;
			}

		public void setResetFlag(final String resetFlag)
			{
				this.resetFlag = resetFlag;
			}

		@Column(name = "FormatSeqNo", length = 200)
		public String getFormatSeqNo()
			{
				return this.formatSeqNo;
			}

		public void setFormatSeqNo(final String formatSeqNo)
			{
				this.formatSeqNo = formatSeqNo;
			}

		@Column(name = "IsActive")
		public Short getIsActive()
			{
				return this.isActive;
			}

		public void setIsActive(final Short isActive)
			{
				this.isActive = isActive;
			}

		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 16)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}

		public void setDtmUpd(final Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}

		@Column(name = "UsrUpd", length = 50)
		public String getUsrUpd()
			{
				return this.usrUpd;
			}

		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}

		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}

		public void setDtmCrt(final Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}

		@Column(name = "UsrCrt", length = 50)
		public String getUsrCrt()
			{
				return this.usrCrt;
			}

		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankAccount")
		public Set<AdvanceCash> getAdvanceCashes()
			{
				return this.advanceCashes;
			}

		public void setAdvanceCashes(final Set<AdvanceCash> advanceCashes)
			{
				this.advanceCashes = advanceCashes;
			}

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankAccount")
		public Set<CashBankHdr> getCashBankHdrs()
			{
				return this.cashBankHdrs;
			}

		public void setCashBankHdrs(final Set<CashBankHdr> cashBankHdrs)
			{
				this.cashBankHdrs = cashBankHdrs;
			}

		@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankAccount")
		public Set<PayReqHdr> getPayReqHdrs()
			{
				return this.payReqHdrs;
			}

		public void setPayReqHdrs(final Set<PayReqHdr> payReqHdrs)
			{
				this.payReqHdrs = payReqHdrs;
			}

	}
