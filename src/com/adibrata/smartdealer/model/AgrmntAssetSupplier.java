
package com.adibrata.smartdealer.model;
// Generated Sep 10, 2015 12:03:09 PM by Hibernate Tools 4.3.1

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
 * AgrmntAssetSupplier generated by hbm2java
 */
@Entity
@Table(name = "AgrmntAssetSupplier", catalog = "SmartDealer")
public class AgrmntAssetSupplier implements java.io.Serializable
	{
		
		private long id;
		private AgrmntAsset agrmntAsset;
		private Supplier supplier;
		private Short seqNo;
		private Double otrAmount;
		private Double dpAmount;
		private Double notes;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntAssetSupplier()
			{
			}
			
		public AgrmntAssetSupplier(long id)
			{
				this.id = id;
			}
			
		public AgrmntAssetSupplier(long id, AgrmntAsset agrmntAsset, Supplier supplier, Short seqNo, Double otrAmount, Double dpAmount, Double notes, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmntAsset = agrmntAsset;
				this.supplier = supplier;
				this.seqNo = seqNo;
				this.otrAmount = otrAmount;
				this.dpAmount = dpAmount;
				this.notes = notes;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "AgrmntAssetId")
		public AgrmntAsset getAgrmntAsset()
			{
				return this.agrmntAsset;
			}
			
		public void setAgrmntAsset(AgrmntAsset agrmntAsset)
			{
				this.agrmntAsset = agrmntAsset;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "SupplierId")
		public Supplier getSupplier()
			{
				return this.supplier;
			}
			
		public void setSupplier(Supplier supplier)
			{
				this.supplier = supplier;
			}
			
		@Column(name = "SeqNo")
		public Short getSeqNo()
			{
				return this.seqNo;
			}
			
		public void setSeqNo(Short seqNo)
			{
				this.seqNo = seqNo;
			}
			
		@Column(name = "OtrAmount", precision = 53, scale = 0)
		public Double getOtrAmount()
			{
				return this.otrAmount;
			}
			
		public void setOtrAmount(Double otrAmount)
			{
				this.otrAmount = otrAmount;
			}
			
		@Column(name = "DpAmount", precision = 53, scale = 0)
		public Double getDpAmount()
			{
				return this.dpAmount;
			}
			
		public void setDpAmount(Double dpAmount)
			{
				this.dpAmount = dpAmount;
			}
			
		@Column(name = "Notes", precision = 53, scale = 0)
		public Double getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(Double notes)
			{
				this.notes = notes;
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
