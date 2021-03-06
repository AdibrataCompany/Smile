
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgrmntFund generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntFund", catalog = "SmartDealer")
public class AgrmntFund implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private String fundingBankId;
		private String fundingCoyId;
		private String fundingContractId;
		private String fundingBatchId;
		private Date fundingBatchDate;
		private String fundingBuyBackReffNo;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntFund()
			{
			}
			
		public AgrmntFund(long id)
			{
				this.id = id;
			}
			
		public AgrmntFund(long id, Agrmnt agrmnt, String fundingBankId, String fundingCoyId, String fundingContractId, String fundingBatchId, Date fundingBatchDate, String fundingBuyBackReffNo, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.fundingBankId = fundingBankId;
				this.fundingCoyId = fundingCoyId;
				this.fundingContractId = fundingContractId;
				this.fundingBatchId = fundingBatchId;
				this.fundingBatchDate = fundingBatchDate;
				this.fundingBuyBackReffNo = fundingBuyBackReffNo;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name = "Id", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(long id)
			{
				this.id = id;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@Column(name = "FundingBankID", length = 5)
		public String getFundingBankId()
			{
				return this.fundingBankId;
			}
			
		public void setFundingBankId(String fundingBankId)
			{
				this.fundingBankId = fundingBankId;
			}
			
		@Column(name = "FundingCoyID", length = 20)
		public String getFundingCoyId()
			{
				return this.fundingCoyId;
			}
			
		public void setFundingCoyId(String fundingCoyId)
			{
				this.fundingCoyId = fundingCoyId;
			}
			
		@Column(name = "FundingContractID", length = 20)
		public String getFundingContractId()
			{
				return this.fundingContractId;
			}
			
		public void setFundingContractId(String fundingContractId)
			{
				this.fundingContractId = fundingContractId;
			}
			
		@Column(name = "FundingBatchID", length = 20)
		public String getFundingBatchId()
			{
				return this.fundingBatchId;
			}
			
		public void setFundingBatchId(String fundingBatchId)
			{
				this.fundingBatchId = fundingBatchId;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "FundingBatchDate", length = 23)
		public Date getFundingBatchDate()
			{
				return this.fundingBatchDate;
			}
			
		public void setFundingBatchDate(Date fundingBatchDate)
			{
				this.fundingBatchDate = fundingBatchDate;
			}
			
		@Column(name = "FundingBuyBackReffNO", length = 20)
		public String getFundingBuyBackReffNo()
			{
				return this.fundingBuyBackReffNo;
			}
			
		public void setFundingBuyBackReffNo(String fundingBuyBackReffNo)
			{
				this.fundingBuyBackReffNo = fundingBuyBackReffNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
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
			
		@Temporal(TemporalType.TIMESTAMP)
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
			
	}
