
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 12:24:25 PM by Hibernate Tools 4.3.1

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
 * AgrmntMnt generated by hbm2java
 */
@Entity
@Table(name = "AgrmntMnt", catalog = "SmartDealer")
public class AgrmntMnt implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private double instAmt;
		private double instPaid;
		private double instWaived;
		private double insAmt;
		private double insPaid;
		private double insWaived;
		private double lcinsWaived;
		private double lcinsAmt;
		private double lcinsPaid;
		private Date lastLccalcInsDate;
		private double lcinstWaived;
		private double lcinstAmt;
		private double lcinstPaid;
		private Date lastLccalcInstDate;
		private double pdcbounceFee;
		private double pdcbounceFeePaid;
		private double pdcbounceFeeWaived;
		private double collectionExpense;
		private double collectionExpensePaid;
		private double collectionExpenseWaived;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntMnt()
			{
			}
			
		public AgrmntMnt(long id, double instAmt, double instPaid, double instWaived, double insAmt, double insPaid, double insWaived, double lcinsWaived, double lcinsAmt, double lcinsPaid, double lcinstWaived, double lcinstAmt, double lcinstPaid,
		        double pdcbounceFee, double pdcbounceFeePaid, double pdcbounceFeeWaived, double collectionExpense, double collectionExpensePaid, double collectionExpenseWaived)
			{
				this.id = id;
				this.instAmt = instAmt;
				this.instPaid = instPaid;
				this.instWaived = instWaived;
				this.insAmt = insAmt;
				this.insPaid = insPaid;
				this.insWaived = insWaived;
				this.lcinsWaived = lcinsWaived;
				this.lcinsAmt = lcinsAmt;
				this.lcinsPaid = lcinsPaid;
				this.lcinstWaived = lcinstWaived;
				this.lcinstAmt = lcinstAmt;
				this.lcinstPaid = lcinstPaid;
				this.pdcbounceFee = pdcbounceFee;
				this.pdcbounceFeePaid = pdcbounceFeePaid;
				this.pdcbounceFeeWaived = pdcbounceFeeWaived;
				this.collectionExpense = collectionExpense;
				this.collectionExpensePaid = collectionExpensePaid;
				this.collectionExpenseWaived = collectionExpenseWaived;
			}
			
		public AgrmntMnt(long id, Agrmnt agrmnt, double instAmt, double instPaid, double instWaived, double insAmt, double insPaid, double insWaived, double lcinsWaived, double lcinsAmt, double lcinsPaid, Date lastLccalcInsDate, double lcinstWaived,
		        double lcinstAmt, double lcinstPaid, Date lastLccalcInstDate, double pdcbounceFee, double pdcbounceFeePaid, double pdcbounceFeeWaived, double collectionExpense, double collectionExpensePaid, double collectionExpenseWaived,
		        String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.instAmt = instAmt;
				this.instPaid = instPaid;
				this.instWaived = instWaived;
				this.insAmt = insAmt;
				this.insPaid = insPaid;
				this.insWaived = insWaived;
				this.lcinsWaived = lcinsWaived;
				this.lcinsAmt = lcinsAmt;
				this.lcinsPaid = lcinsPaid;
				this.lastLccalcInsDate = lastLccalcInsDate;
				this.lcinstWaived = lcinstWaived;
				this.lcinstAmt = lcinstAmt;
				this.lcinstPaid = lcinstPaid;
				this.lastLccalcInstDate = lastLccalcInstDate;
				this.pdcbounceFee = pdcbounceFee;
				this.pdcbounceFeePaid = pdcbounceFeePaid;
				this.pdcbounceFeeWaived = pdcbounceFeeWaived;
				this.collectionExpense = collectionExpense;
				this.collectionExpensePaid = collectionExpensePaid;
				this.collectionExpenseWaived = collectionExpenseWaived;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@Column(name = "InstAmt", nullable = false, precision = 53, scale = 0)
		public double getInstAmt()
			{
				return this.instAmt;
			}
			
		public void setInstAmt(double instAmt)
			{
				this.instAmt = instAmt;
			}
			
		@Column(name = "InstPaid", nullable = false, precision = 53, scale = 0)
		public double getInstPaid()
			{
				return this.instPaid;
			}
			
		public void setInstPaid(double instPaid)
			{
				this.instPaid = instPaid;
			}
			
		@Column(name = "InstWaived", nullable = false, precision = 53, scale = 0)
		public double getInstWaived()
			{
				return this.instWaived;
			}
			
		public void setInstWaived(double instWaived)
			{
				this.instWaived = instWaived;
			}
			
		@Column(name = "InsAmt", nullable = false, precision = 53, scale = 0)
		public double getInsAmt()
			{
				return this.insAmt;
			}
			
		public void setInsAmt(double insAmt)
			{
				this.insAmt = insAmt;
			}
			
		@Column(name = "InsPaid", nullable = false, precision = 53, scale = 0)
		public double getInsPaid()
			{
				return this.insPaid;
			}
			
		public void setInsPaid(double insPaid)
			{
				this.insPaid = insPaid;
			}
			
		@Column(name = "InsWaived", nullable = false, precision = 53, scale = 0)
		public double getInsWaived()
			{
				return this.insWaived;
			}
			
		public void setInsWaived(double insWaived)
			{
				this.insWaived = insWaived;
			}
			
		@Column(name = "LCInsWaived", nullable = false, precision = 53, scale = 0)
		public double getLcinsWaived()
			{
				return this.lcinsWaived;
			}
			
		public void setLcinsWaived(double lcinsWaived)
			{
				this.lcinsWaived = lcinsWaived;
			}
			
		@Column(name = "LCInsAmt", nullable = false, precision = 53, scale = 0)
		public double getLcinsAmt()
			{
				return this.lcinsAmt;
			}
			
		public void setLcinsAmt(double lcinsAmt)
			{
				this.lcinsAmt = lcinsAmt;
			}
			
		@Column(name = "LCInsPaid", nullable = false, precision = 53, scale = 0)
		public double getLcinsPaid()
			{
				return this.lcinsPaid;
			}
			
		public void setLcinsPaid(double lcinsPaid)
			{
				this.lcinsPaid = lcinsPaid;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastLCCalcInsDate", length = 23)
		public Date getLastLccalcInsDate()
			{
				return this.lastLccalcInsDate;
			}
			
		public void setLastLccalcInsDate(Date lastLccalcInsDate)
			{
				this.lastLccalcInsDate = lastLccalcInsDate;
			}
			
		@Column(name = "LCInstWaived", nullable = false, precision = 53, scale = 0)
		public double getLcinstWaived()
			{
				return this.lcinstWaived;
			}
			
		public void setLcinstWaived(double lcinstWaived)
			{
				this.lcinstWaived = lcinstWaived;
			}
			
		@Column(name = "LCInstAmt", nullable = false, precision = 53, scale = 0)
		public double getLcinstAmt()
			{
				return this.lcinstAmt;
			}
			
		public void setLcinstAmt(double lcinstAmt)
			{
				this.lcinstAmt = lcinstAmt;
			}
			
		@Column(name = "LCInstPaid", nullable = false, precision = 53, scale = 0)
		public double getLcinstPaid()
			{
				return this.lcinstPaid;
			}
			
		public void setLcinstPaid(double lcinstPaid)
			{
				this.lcinstPaid = lcinstPaid;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastLCCalcInstDate", length = 23)
		public Date getLastLccalcInstDate()
			{
				return this.lastLccalcInstDate;
			}
			
		public void setLastLccalcInstDate(Date lastLccalcInstDate)
			{
				this.lastLccalcInstDate = lastLccalcInstDate;
			}
			
		@Column(name = "PDCBounceFee", nullable = false, precision = 53, scale = 0)
		public double getPdcbounceFee()
			{
				return this.pdcbounceFee;
			}
			
		public void setPdcbounceFee(double pdcbounceFee)
			{
				this.pdcbounceFee = pdcbounceFee;
			}
			
		@Column(name = "PDCBounceFeePaid", nullable = false, precision = 53, scale = 0)
		public double getPdcbounceFeePaid()
			{
				return this.pdcbounceFeePaid;
			}
			
		public void setPdcbounceFeePaid(double pdcbounceFeePaid)
			{
				this.pdcbounceFeePaid = pdcbounceFeePaid;
			}
			
		@Column(name = "PDCBounceFeeWaived", nullable = false, precision = 53, scale = 0)
		public double getPdcbounceFeeWaived()
			{
				return this.pdcbounceFeeWaived;
			}
			
		public void setPdcbounceFeeWaived(double pdcbounceFeeWaived)
			{
				this.pdcbounceFeeWaived = pdcbounceFeeWaived;
			}
			
		@Column(name = "CollectionExpense", nullable = false, precision = 53, scale = 0)
		public double getCollectionExpense()
			{
				return this.collectionExpense;
			}
			
		public void setCollectionExpense(double collectionExpense)
			{
				this.collectionExpense = collectionExpense;
			}
			
		@Column(name = "CollectionExpensePaid", nullable = false, precision = 53, scale = 0)
		public double getCollectionExpensePaid()
			{
				return this.collectionExpensePaid;
			}
			
		public void setCollectionExpensePaid(double collectionExpensePaid)
			{
				this.collectionExpensePaid = collectionExpensePaid;
			}
			
		@Column(name = "CollectionExpenseWaived", nullable = false, precision = 53, scale = 0)
		public double getCollectionExpenseWaived()
			{
				return this.collectionExpenseWaived;
			}
			
		public void setCollectionExpenseWaived(double collectionExpenseWaived)
			{
				this.collectionExpenseWaived = collectionExpenseWaived;
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
