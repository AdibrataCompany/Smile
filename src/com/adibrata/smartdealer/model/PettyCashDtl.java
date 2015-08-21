
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:33:53 PM by Hibernate Tools 4.3.1

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
 * PettyCashDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PettyCashDtl", catalog = "SmartDealer")
public class PettyCashDtl implements java.io.Serializable
	{
		
		private long id;
		private PettyCashHdr pettyCashHdr;
		private Integer seqNo;
		private String coaName;
		private String coaCode;
		private Double amount;
		private String description;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PettyCashDtl()
			{
			}
			
		public PettyCashDtl(long id)
			{
				this.id = id;
			}
			
		public PettyCashDtl(long id, PettyCashHdr pettyCashHdr, Integer seqNo, String coaName, String coaCode, Double amount, String description, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.pettyCashHdr = pettyCashHdr;
				this.seqNo = seqNo;
				this.coaName = coaName;
				this.coaCode = coaCode;
				this.amount = amount;
				this.description = description;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name = "ID", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(long id)
			{
				this.id = id;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PettyCashHdrId")
		public PettyCashHdr getPettyCashHdr()
			{
				return this.pettyCashHdr;
			}
			
		public void setPettyCashHdr(PettyCashHdr pettyCashHdr)
			{
				this.pettyCashHdr = pettyCashHdr;
			}
			
		@Column(name = "SeqNo")
		public Integer getSeqNo()
			{
				return this.seqNo;
			}
			
		public void setSeqNo(Integer seqNo)
			{
				this.seqNo = seqNo;
			}
			
		@Column(name = "CoaName", length = 20)
		public String getCoaName()
			{
				return this.coaName;
			}
			
		public void setCoaName(String coaName)
			{
				this.coaName = coaName;
			}
			
		@Column(name = "CoaCode", length = 50)
		public String getCoaCode()
			{
				return this.coaCode;
			}
			
		public void setCoaCode(String coaCode)
			{
				this.coaCode = coaCode;
			}
			
		@Column(name = "Amount", precision = 53, scale = 0)
		public Double getAmount()
			{
				return this.amount;
			}
			
		public void setAmount(Double amount)
			{
				this.amount = amount;
			}
			
		@Column(name = "Description", length = 50)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
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
