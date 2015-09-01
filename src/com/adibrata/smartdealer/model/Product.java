
package com.adibrata.smartdealer.model;
// Generated Sep 1, 2015 12:07:43 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Product", catalog = "SmartDealer")
public class Product implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String code;
		private String name;
		private Date effectiveDate;
		private Date expiredDate;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<ProductOffering> productOfferings = new HashSet<ProductOffering>(0);
		
		public Product()
			{
			}
			
		public Product(long id)
			{
				this.id = id;
			}
			
		public Product(long id, Partner partner, String code, String name, Date effectiveDate, Date expiredDate, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<ProductOffering> productOfferings)
			{
				this.id = id;
				this.partner = partner;
				this.code = code;
				this.name = name;
				this.effectiveDate = effectiveDate;
				this.expiredDate = expiredDate;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.productOfferings = productOfferings;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "Code", length = 50)
		public String getCode()
			{
				return this.code;
			}
			
		public void setCode(String code)
			{
				this.code = code;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EffectiveDate", length = 23)
		public Date getEffectiveDate()
			{
				return this.effectiveDate;
			}
			
		public void setEffectiveDate(Date effectiveDate)
			{
				this.effectiveDate = effectiveDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ExpiredDate", length = 23)
		public Date getExpiredDate()
			{
				return this.expiredDate;
			}
			
		public void setExpiredDate(Date expiredDate)
			{
				this.expiredDate = expiredDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 23)
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
		@Column(name = "DtmCrt", length = 23)
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
		public Set<ProductOffering> getProductOfferings()
			{
				return this.productOfferings;
			}
			
		public void setProductOfferings(Set<ProductOffering> productOfferings)
			{
				this.productOfferings = productOfferings;
			}
			
	}
