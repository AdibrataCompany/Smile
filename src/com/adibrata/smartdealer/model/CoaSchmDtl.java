
package com.adibrata.smartdealer.model;
// Generated Aug 22, 2015 3:49:51 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CoaSchmDtl generated by hbm2java
 */
@Entity
@Table(name = "CoaSchmDtl", catalog = "SmartDealer")
public class CoaSchmDtl implements java.io.Serializable
	{
		
		private long id;
		private Coamaster coamaster;
		private CoaSchmHdr coaSchmHdr;
		private String coacode;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CoaSchmDtl()
			{
			}
			
		public CoaSchmDtl(long id)
			{
				this.id = id;
			}
			
		public CoaSchmDtl(long id, Coamaster coamaster, CoaSchmHdr coaSchmHdr, String coacode, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.coamaster = coamaster;
				this.coaSchmHdr = coaSchmHdr;
				this.coacode = coacode;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id
		
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
		@JoinColumn(name = "CoaMasterID")
		public Coamaster getCoamaster()
			{
				return this.coamaster;
			}
			
		public void setCoamaster(Coamaster coamaster)
			{
				this.coamaster = coamaster;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CoaSchmHdrID")
		public CoaSchmHdr getCoaSchmHdr()
			{
				return this.coaSchmHdr;
			}
			
		public void setCoaSchmHdr(CoaSchmHdr coaSchmHdr)
			{
				this.coaSchmHdr = coaSchmHdr;
			}
			
		@Column(name = "COACode", length = 50)
		public String getCoacode()
			{
				return this.coacode;
			}
			
		public void setCoacode(String coacode)
			{
				this.coacode = coacode;
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
