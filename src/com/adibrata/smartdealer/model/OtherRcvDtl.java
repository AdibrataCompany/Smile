
package com.adibrata.smartdealer.model;
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
// Generated Aug 19, 2015 4:50:54 PM by Hibernate Tools 4.3.1
=======
// Generated Jul 22, 2015 4:44:54 PM by Hibernate Tools 4.3.1
>>>>>>> 5851c81 new Model

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
 * OtherRcvDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "OtherRcvDtl", catalog = "SmartDealer")
public class OtherRcvDtl implements java.io.Serializable
	{
		
		private long id;
		private OtherRcvHdr otherRcvHdr;
		private String coaName;
		private String coaCode;
		private Double amount;
		private String description;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public OtherRcvDtl()
			{
			}
			
		public OtherRcvDtl(long id)
			{
				this.id = id;
			}
			
		public OtherRcvDtl(long id, OtherRcvHdr otherRcvHdr, String coaName, String coaCode, Double amount, String description, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.otherRcvHdr = otherRcvHdr;
				this.coaName = coaName;
				this.coaCode = coaCode;
				this.amount = amount;
				this.description = description;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id
		
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
		@JoinColumn(name = "OtherRcvHdrId")
		public OtherRcvHdr getOtherRcvHdr()
			{
				return this.otherRcvHdr;
			}
			
		public void setOtherRcvHdr(OtherRcvHdr otherRcvHdr)
			{
				this.otherRcvHdr = otherRcvHdr;
			}
			
		@Column(name = "CoaName", length = 50)
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
			
		@Column(name = "Description", length = 100)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
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
