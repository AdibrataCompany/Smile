
package com.adibrata.smartdealer.model;
// Generated Aug 19, 2015 12:14:16 PM by Hibernate Tools 4.3.1

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
 * PdcHistory generated by hbm2java
 */
@Entity
@Table(name = "PdcHistory", catalog = "SmartDealer")
public class PdcHistory implements java.io.Serializable
	{
		
		private long id;
		private PdcHdr pdcHdr;
		private String pdcStatus;
		private String fisikStatus;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PdcHistory()
			{
			}
			
		public PdcHistory(long id)
			{
				this.id = id;
			}
			
		public PdcHistory(long id, PdcHdr pdcHdr, String pdcStatus, String fisikStatus, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.pdcHdr = pdcHdr;
				this.pdcStatus = pdcStatus;
				this.fisikStatus = fisikStatus;
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
		@JoinColumn(name = "PdcHdrId")
		public PdcHdr getPdcHdr()
			{
				return this.pdcHdr;
			}
			
		public void setPdcHdr(PdcHdr pdcHdr)
			{
				this.pdcHdr = pdcHdr;
			}
			
		@Column(name = "PdcStatus", length = 5)
		public String getPdcStatus()
			{
				return this.pdcStatus;
			}
			
		public void setPdcStatus(String pdcStatus)
			{
				this.pdcStatus = pdcStatus;
			}
			
		@Column(name = "FisikStatus", length = 5)
		public String getFisikStatus()
			{
				return this.fisikStatus;
			}
			
		public void setFisikStatus(String fisikStatus)
			{
				this.fisikStatus = fisikStatus;
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
