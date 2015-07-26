
package com.adibrata.smartdealer.model;
// Generated Jul 26, 2015 5:46:46 PM by Hibernate Tools 4.3.1

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
 * SupplierAccInfo generated by hbm2java
 */
@Entity
@Table(name = "SupplierAccInfo", catalog = "SmartDealer")
public class SupplierAccInfo implements java.io.Serializable
	{
		
		private long id;
		private Supplier supplier;
		private Short seqNo;
		private String bankCode;
		private String bankBranch;
		private String bankName;
		private String accountNo;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<AgrmntAsset> agrmntAssets = new HashSet<AgrmntAsset>(0);
		
		public SupplierAccInfo()
			{
			}
			
		public SupplierAccInfo(long id)
			{
				this.id = id;
			}
			
		public SupplierAccInfo(long id, Supplier supplier, Short seqNo, String bankCode, String bankBranch, String bankName, String accountNo, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<AgrmntAsset> agrmntAssets)
			{
				this.id = id;
				this.supplier = supplier;
				this.seqNo = seqNo;
				this.bankCode = bankCode;
				this.bankBranch = bankBranch;
				this.bankName = bankName;
				this.accountNo = accountNo;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.agrmntAssets = agrmntAssets;
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
			
		@Column(name = "BankCode", length = 50)
		public String getBankCode()
			{
				return this.bankCode;
			}
			
		public void setBankCode(String bankCode)
			{
				this.bankCode = bankCode;
			}
			
		@Column(name = "BankBranch", length = 50)
		public String getBankBranch()
			{
				return this.bankBranch;
			}
			
		public void setBankBranch(String bankBranch)
			{
				this.bankBranch = bankBranch;
			}
			
		@Column(name = "BankName", length = 50)
		public String getBankName()
			{
				return this.bankName;
			}
			
		public void setBankName(String bankName)
			{
				this.bankName = bankName;
			}
			
		@Column(name = "AccountNo", length = 50)
		public String getAccountNo()
			{
				return this.accountNo;
			}
			
		public void setAccountNo(String accountNo)
			{
				this.accountNo = accountNo;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplierAccInfo")
		public Set<AgrmntAsset> getAgrmntAssets()
			{
				return this.agrmntAssets;
			}
			
		public void setAgrmntAssets(Set<AgrmntAsset> agrmntAssets)
			{
				this.agrmntAssets = agrmntAssets;
			}
			
	}
