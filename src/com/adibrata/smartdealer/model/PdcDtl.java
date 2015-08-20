
package com.adibrata.smartdealer.model;
// Generated Aug 20, 2015 1:54:39 PM by Hibernate Tools 4.3.1

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
 * PdcDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PdcDtl", catalog = "SmartDealer")
public class PdcDtl implements java.io.Serializable
	{
		
		private long id;
		private PdcHdr pdcHdr;
		private String coaName;
		private Double amount;
		private Double amountClear;
		private Long agrmntId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PdcDtl()
			{
			}
			
		public PdcDtl(long id)
			{
				this.id = id;
			}
			
		public PdcDtl(long id, PdcHdr pdcHdr, String coaName, Double amount, Double amountClear, Long agrmntId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.pdcHdr = pdcHdr;
				this.coaName = coaName;
				this.amount = amount;
				this.amountClear = amountClear;
				this.agrmntId = agrmntId;
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
		@JoinColumn(name = "PdcHdrId")
		public PdcHdr getPdcHdr()
			{
				return this.pdcHdr;
			}
			
		public void setPdcHdr(PdcHdr pdcHdr)
			{
				this.pdcHdr = pdcHdr;
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
			
		@Column(name = "Amount", precision = 53, scale = 0)
		public Double getAmount()
			{
				return this.amount;
			}
			
		public void setAmount(Double amount)
			{
				this.amount = amount;
			}
			
		@Column(name = "AmountClear", precision = 53, scale = 0)
		public Double getAmountClear()
			{
				return this.amountClear;
			}
			
		public void setAmountClear(Double amountClear)
			{
				this.amountClear = amountClear;
			}
			
		@Column(name = "AgrmntId")
		public Long getAgrmntId()
			{
				return this.agrmntId;
			}
			
		public void setAgrmntId(Long agrmntId)
			{
				this.agrmntId = agrmntId;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 23)
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
		@Column(name = "DtmCrt", length = 23)
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
