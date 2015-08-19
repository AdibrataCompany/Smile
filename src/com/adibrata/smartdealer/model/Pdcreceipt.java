
package com.adibrata.smartdealer.model;
// Generated Aug 19, 2015 12:14:16 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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

/**
 * Pdcreceipt generated by hbm2java
 */
@Entity
@Table(name = "PDCReceipt", catalog = "SmartDealer")
public class Pdcreceipt implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String pdccode;
		private Date valueDate;
		private Date postingDate;
		private String receiveFrom;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PdcHdr> pdcHdrs = new HashSet<PdcHdr>(0);
		
		public Pdcreceipt()
			{
			}
			
		public Pdcreceipt(long id)
			{
				this.id = id;
			}
			
		public Pdcreceipt(long id, Office office, Partner partner, String pdccode, Date valueDate, Date postingDate, String receiveFrom, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<PdcHdr> pdcHdrs)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.pdccode = pdccode;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.receiveFrom = receiveFrom;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.pdcHdrs = pdcHdrs;
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
		@JoinColumn(name = "OfficeId")
		public Office getOffice()
			{
				return this.office;
			}
			
		public void setOffice(Office office)
			{
				this.office = office;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "PDCCode", length = 20)
		public String getPdccode()
			{
				return this.pdccode;
			}
			
		public void setPdccode(String pdccode)
			{
				this.pdccode = pdccode;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ValueDate", length = 23)
		public Date getValueDate()
			{
				return this.valueDate;
			}
			
		public void setValueDate(Date valueDate)
			{
				this.valueDate = valueDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDate", length = 23)
		public Date getPostingDate()
			{
				return this.postingDate;
			}
			
		public void setPostingDate(Date postingDate)
			{
				this.postingDate = postingDate;
			}
			
		@Column(name = "ReceiveFrom", length = 50)
		public String getReceiveFrom()
			{
				return this.receiveFrom;
			}
			
		public void setReceiveFrom(String receiveFrom)
			{
				this.receiveFrom = receiveFrom;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdcreceipt")
		public Set<PdcHdr> getPdcHdrs()
			{
				return this.pdcHdrs;
			}
			
		public void setPdcHdrs(Set<PdcHdr> pdcHdrs)
			{
				this.pdcHdrs = pdcHdrs;
			}
			
	}
