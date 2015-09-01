
package com.adibrata.smartdealer.model;
// Generated Sep 1, 2015 12:07:43 PM by Hibernate Tools 4.3.1

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
 * PersCustLegalInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PersCustLegalInfo", catalog = "SmartDealer")
public class PersCustLegalInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String legalName;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String fullAddress;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public PersCustLegalInfo()
			{
			}
			
		public PersCustLegalInfo(long id)
			{
				this.id = id;
			}
			
		public PersCustLegalInfo(long id, Customer customer, String legalName, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipcode, String fullAddress, String usrCrt, Date dtmUpd, String usrUpd,
		        Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.legalName = legalName;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipcode = zipcode;
				this.fullAddress = fullAddress;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Column(name = "LegalName", length = 50)
		public String getLegalName()
			{
				return this.legalName;
			}
			
		public void setLegalName(String legalName)
			{
				this.legalName = legalName;
			}
			
		@Column(name = "Address")
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(String address)
			{
				this.address = address;
			}
			
		@Column(name = "RT", length = 4)
		public String getRt()
			{
				return this.rt;
			}
			
		public void setRt(String rt)
			{
				this.rt = rt;
			}
			
		@Column(name = "RW", length = 4)
		public String getRw()
			{
				return this.rw;
			}
			
		public void setRw(String rw)
			{
				this.rw = rw;
			}
			
		@Column(name = "Kelurahan", length = 50)
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		public void setKelurahan(String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		@Column(name = "Kecamatan", length = 50)
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		public void setKecamatan(String kecamatan)
			{
				this.kecamatan = kecamatan;
			}
			
		@Column(name = "City", length = 50)
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(String city)
			{
				this.city = city;
			}
			
		@Column(name = "Zipcode", length = 50)
		public String getZipcode()
			{
				return this.zipcode;
			}
			
		public void setZipcode(String zipcode)
			{
				this.zipcode = zipcode;
			}
			
		@Column(name = "FullAddress", length = 500)
		public String getFullAddress()
			{
				return this.fullAddress;
			}
			
		public void setFullAddress(String fullAddress)
			{
				this.fullAddress = fullAddress;
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
