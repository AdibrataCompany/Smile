
package com.adibrata.smartdealer.model;
// Generated Jul 21, 2015 4:42:42 PM by Hibernate Tools 4.3.1

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
 * AgrmntAssetSpbkbinfo generated by hbm2java
 */
@Entity
@Table(name = "AgrmntAssetSPBKBInfo", catalog = "SmartDealer")
public class AgrmntAssetSpbkbinfo implements java.io.Serializable
	{
		
		private long id;
		private AgrmntAsset agrmntAsset;
		private String spbpkbno;
		private Date spbpkbdate;
		private String spbpkbreasonId;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntAssetSpbkbinfo()
			{
			}
			
		public AgrmntAssetSpbkbinfo(long id)
			{
				this.id = id;
			}
			
		public AgrmntAssetSpbkbinfo(long id, AgrmntAsset agrmntAsset, String spbpkbno, Date spbpkbdate, String spbpkbreasonId, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmntAsset = agrmntAsset;
				this.spbpkbno = spbpkbno;
				this.spbpkbdate = spbpkbdate;
				this.spbpkbreasonId = spbpkbreasonId;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "AgrmntAssetId")
		public AgrmntAsset getAgrmntAsset()
			{
				return this.agrmntAsset;
			}
			
		public void setAgrmntAsset(AgrmntAsset agrmntAsset)
			{
				this.agrmntAsset = agrmntAsset;
			}
			
		@Column(name = "SPBPKBNo", length = 50)
		public String getSpbpkbno()
			{
				return this.spbpkbno;
			}
			
		public void setSpbpkbno(String spbpkbno)
			{
				this.spbpkbno = spbpkbno;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "SPBPKBDate", length = 23)
		public Date getSpbpkbdate()
			{
				return this.spbpkbdate;
			}
			
		public void setSpbpkbdate(Date spbpkbdate)
			{
				this.spbpkbdate = spbpkbdate;
			}
			
		@Column(name = "SPBPKBReasonID", length = 12)
		public String getSpbpkbreasonId()
			{
				return this.spbpkbreasonId;
			}
			
		public void setSpbpkbreasonId(String spbpkbreasonId)
			{
				this.spbpkbreasonId = spbpkbreasonId;
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
			
	}