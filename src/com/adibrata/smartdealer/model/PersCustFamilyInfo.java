
package com.adibrata.smartdealer.model;
// Generated Jul 23, 2015 12:54:57 PM by Hibernate Tools 4.3.1

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
 * PersCustFamilyInfo generated by hbm2java
 */
@Entity
@Table(name = "PersCustFamilyInfo", catalog = "SmartDealer")
public class PersCustFamilyInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private Short seqNo;
		private String name;
		private String idnumber;
		private Date birthDate;
		private String familyRelationCode;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PersCustFamilyInfo()
			{
			}
			
		public PersCustFamilyInfo(long id)
			{
				this.id = id;
			}
			
		public PersCustFamilyInfo(long id, Customer customer, Short seqNo, String name, String idnumber, Date birthDate, String familyRelationCode, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.customer = customer;
				this.seqNo = seqNo;
				this.name = name;
				this.idnumber = idnumber;
				this.birthDate = birthDate;
				this.familyRelationCode = familyRelationCode;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
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
			
		@Column(name = "Name", length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "IDNumber", length = 40)
		public String getIdnumber()
			{
				return this.idnumber;
			}
			
		public void setIdnumber(String idnumber)
			{
				this.idnumber = idnumber;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BirthDate", length = 23)
		public Date getBirthDate()
			{
				return this.birthDate;
			}
			
		public void setBirthDate(Date birthDate)
			{
				this.birthDate = birthDate;
			}
			
		@Column(name = "FamilyRelationCode", length = 50)
		public String getFamilyRelationCode()
			{
				return this.familyRelationCode;
			}
			
		public void setFamilyRelationCode(String familyRelationCode)
			{
				this.familyRelationCode = familyRelationCode;
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
