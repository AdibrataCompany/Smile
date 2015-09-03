
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 3:54:52 PM by Hibernate Tools 4.3.1

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
 * DeliveryOrder generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "DeliveryOrder", catalog = "SmartDealer")
public class DeliveryOrder implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Date bastDate;
		private Date valueDate;
		private Date postingDate;
		private String chasisNo;
		private String machineNo;
		private String colour;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public DeliveryOrder()
			{
			}
			
		public DeliveryOrder(long id)
			{
				this.id = id;
			}
			
		public DeliveryOrder(long id, Agrmnt agrmnt, Date bastDate, Date valueDate, Date postingDate, String chasisNo, String machineNo, String colour, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.bastDate = bastDate;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.chasisNo = chasisNo;
				this.machineNo = machineNo;
				this.colour = colour;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BastDate", length = 23)
		public Date getBastDate()
			{
				return this.bastDate;
			}
			
		public void setBastDate(Date bastDate)
			{
				this.bastDate = bastDate;
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
			
		@Column(name = "ChasisNo", length = 50)
		public String getChasisNo()
			{
				return this.chasisNo;
			}
			
		public void setChasisNo(String chasisNo)
			{
				this.chasisNo = chasisNo;
			}
			
		@Column(name = "MachineNo", length = 50)
		public String getMachineNo()
			{
				return this.machineNo;
			}
			
		public void setMachineNo(String machineNo)
			{
				this.machineNo = machineNo;
			}
			
		@Column(name = "Colour", length = 50)
		public String getColour()
			{
				return this.colour;
			}
			
		public void setColour(String colour)
			{
				this.colour = colour;
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
