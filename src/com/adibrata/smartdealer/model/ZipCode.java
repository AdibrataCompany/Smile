
package com.adibrata.smartdealer.model;
// Generated Jul 22, 2015 7:29:03 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Cacheable;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * ZipCode generated by hbm2java
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "ZipCode", catalog = "SmartDealer")
public class ZipCode implements java.io.Serializable
	{
		
		private long id;
		private static final long serialVersionUID = 1L;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipCode;
		private String isActive;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public ZipCode()
			{
			}
			
		public ZipCode(final long id)
			{
				this.id = id;
			}
			
		public ZipCode(final long id, final String kelurahan, final String kecamatan, final String city, final String zipCode, final String isActive, final String usrCrt, final Date dtmUpd, final String usrUpd, final Date dtmCrt)
			{
				this.id = id;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipCode = zipCode;
				this.isActive = isActive;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
			}
			
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		@Column(name = "Id", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(final long id)
			{
				this.id = id;
			}
			
		@Column(name = "Kelurahan", length = 50)
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		@Column(name = "Kecamatan", length = 50)
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}
			
		@Column(name = "City", length = 50)
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(final String city)
			{
				this.city = city;
			}
			
		@Column(name = "ZipCode", length = 50)
		public String getZipCode()
			{
				return this.zipCode;
			}
			
		public void setZipCode(final String zipCode)
			{
				this.zipCode = zipCode;
			}
			
		@Column(name = "IsActive", length = 1)
		public String getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(final String isActive)
			{
				this.isActive = isActive;
			}
			
		@Column(name = "UsrCrt", length = 50)
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 16)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(final Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
			
		@Column(name = "UsrUpd", length = 50)
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(final Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
			
	}
