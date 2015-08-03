
package com.adibrata.smartdealer.model;
// Generated Aug 3, 2015 11:53:04 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BucketAgingReport generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "BucketAgingReport", catalog = "SmartDealer")
public class BucketAgingReport implements java.io.Serializable
	{
		
		private long id;
		private String partnerCode;
		private String reportCode;
		private String bucketName;
		private int bucket1From;
		private int bucket1To;
		private String bucket1Text;
		private int bucket2From;
		private int bucket2To;
		private String bucket2Text;
		private int bucket3From;
		private int bucket3To;
		private String bucket3Text;
		private int bucket4From;
		private int bucket4To;
		private String bucket4Text;
		private int bucket5From;
		private int bucket5To;
		private String bucket5Text;
		private int bucket6From;
		private int bucket6To;
		private String bucket6Text;
		private int bucket7From;
		private int bucket7To;
		private String bucket7Text;
		private int bucket8From;
		private int bucket8To;
		private String bucket8Text;
		private int bucket9From;
		private int bucket9To;
		private String bucket9Text;
		private int bucket10From;
		private int bucket10To;
		private String bucket10Text;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public BucketAgingReport()
			{
			}
			
		public BucketAgingReport(long id, String bucketName, int bucket1From, int bucket1To, String bucket1Text, int bucket2From, int bucket2To, String bucket2Text, int bucket3From, int bucket3To, String bucket3Text, int bucket4From, int bucket4To,
		        String bucket4Text, int bucket5From, int bucket5To, String bucket5Text, int bucket6From, int bucket6To, String bucket6Text, int bucket7From, int bucket7To, String bucket7Text, int bucket8From, int bucket8To, String bucket8Text,
		        int bucket9From, int bucket9To, String bucket9Text, int bucket10From, int bucket10To, String bucket10Text)
			{
				this.id = id;
				this.bucketName = bucketName;
				this.bucket1From = bucket1From;
				this.bucket1To = bucket1To;
				this.bucket1Text = bucket1Text;
				this.bucket2From = bucket2From;
				this.bucket2To = bucket2To;
				this.bucket2Text = bucket2Text;
				this.bucket3From = bucket3From;
				this.bucket3To = bucket3To;
				this.bucket3Text = bucket3Text;
				this.bucket4From = bucket4From;
				this.bucket4To = bucket4To;
				this.bucket4Text = bucket4Text;
				this.bucket5From = bucket5From;
				this.bucket5To = bucket5To;
				this.bucket5Text = bucket5Text;
				this.bucket6From = bucket6From;
				this.bucket6To = bucket6To;
				this.bucket6Text = bucket6Text;
				this.bucket7From = bucket7From;
				this.bucket7To = bucket7To;
				this.bucket7Text = bucket7Text;
				this.bucket8From = bucket8From;
				this.bucket8To = bucket8To;
				this.bucket8Text = bucket8Text;
				this.bucket9From = bucket9From;
				this.bucket9To = bucket9To;
				this.bucket9Text = bucket9Text;
				this.bucket10From = bucket10From;
				this.bucket10To = bucket10To;
				this.bucket10Text = bucket10Text;
			}
			
		public BucketAgingReport(long id, String partnerCode, String reportCode, String bucketName, int bucket1From, int bucket1To, String bucket1Text, int bucket2From, int bucket2To, String bucket2Text, int bucket3From, int bucket3To,
		        String bucket3Text, int bucket4From, int bucket4To, String bucket4Text, int bucket5From, int bucket5To, String bucket5Text, int bucket6From, int bucket6To, String bucket6Text, int bucket7From, int bucket7To, String bucket7Text,
		        int bucket8From, int bucket8To, String bucket8Text, int bucket9From, int bucket9To, String bucket9Text, int bucket10From, int bucket10To, String bucket10Text, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.reportCode = reportCode;
				this.bucketName = bucketName;
				this.bucket1From = bucket1From;
				this.bucket1To = bucket1To;
				this.bucket1Text = bucket1Text;
				this.bucket2From = bucket2From;
				this.bucket2To = bucket2To;
				this.bucket2Text = bucket2Text;
				this.bucket3From = bucket3From;
				this.bucket3To = bucket3To;
				this.bucket3Text = bucket3Text;
				this.bucket4From = bucket4From;
				this.bucket4To = bucket4To;
				this.bucket4Text = bucket4Text;
				this.bucket5From = bucket5From;
				this.bucket5To = bucket5To;
				this.bucket5Text = bucket5Text;
				this.bucket6From = bucket6From;
				this.bucket6To = bucket6To;
				this.bucket6Text = bucket6Text;
				this.bucket7From = bucket7From;
				this.bucket7To = bucket7To;
				this.bucket7Text = bucket7Text;
				this.bucket8From = bucket8From;
				this.bucket8To = bucket8To;
				this.bucket8Text = bucket8Text;
				this.bucket9From = bucket9From;
				this.bucket9To = bucket9To;
				this.bucket9Text = bucket9Text;
				this.bucket10From = bucket10From;
				this.bucket10To = bucket10To;
				this.bucket10Text = bucket10Text;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
			
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		@Column(name = "ReportCode", length = 20)
		public String getReportCode()
			{
				return this.reportCode;
			}
			
		public void setReportCode(String reportCode)
			{
				this.reportCode = reportCode;
			}
			
		@Column(name = "BucketName", nullable = false, length = 50)
		public String getBucketName()
			{
				return this.bucketName;
			}
			
		public void setBucketName(String bucketName)
			{
				this.bucketName = bucketName;
			}
			
		@Column(name = "Bucket1_from", nullable = false)
		public int getBucket1From()
			{
				return this.bucket1From;
			}
			
		public void setBucket1From(int bucket1From)
			{
				this.bucket1From = bucket1From;
			}
			
		@Column(name = "Bucket1_to", nullable = false)
		public int getBucket1To()
			{
				return this.bucket1To;
			}
			
		public void setBucket1To(int bucket1To)
			{
				this.bucket1To = bucket1To;
			}
			
		@Column(name = "Bucket1_text", nullable = false, length = 50)
		public String getBucket1Text()
			{
				return this.bucket1Text;
			}
			
		public void setBucket1Text(String bucket1Text)
			{
				this.bucket1Text = bucket1Text;
			}
			
		@Column(name = "Bucket2_from", nullable = false)
		public int getBucket2From()
			{
				return this.bucket2From;
			}
			
		public void setBucket2From(int bucket2From)
			{
				this.bucket2From = bucket2From;
			}
			
		@Column(name = "Bucket2_to", nullable = false)
		public int getBucket2To()
			{
				return this.bucket2To;
			}
			
		public void setBucket2To(int bucket2To)
			{
				this.bucket2To = bucket2To;
			}
			
		@Column(name = "Bucket2_text", nullable = false, length = 50)
		public String getBucket2Text()
			{
				return this.bucket2Text;
			}
			
		public void setBucket2Text(String bucket2Text)
			{
				this.bucket2Text = bucket2Text;
			}
			
		@Column(name = "Bucket3_from", nullable = false)
		public int getBucket3From()
			{
				return this.bucket3From;
			}
			
		public void setBucket3From(int bucket3From)
			{
				this.bucket3From = bucket3From;
			}
			
		@Column(name = "Bucket3_to", nullable = false)
		public int getBucket3To()
			{
				return this.bucket3To;
			}
			
		public void setBucket3To(int bucket3To)
			{
				this.bucket3To = bucket3To;
			}
			
		@Column(name = "Bucket3_text", nullable = false, length = 50)
		public String getBucket3Text()
			{
				return this.bucket3Text;
			}
			
		public void setBucket3Text(String bucket3Text)
			{
				this.bucket3Text = bucket3Text;
			}
			
		@Column(name = "Bucket4_from", nullable = false)
		public int getBucket4From()
			{
				return this.bucket4From;
			}
			
		public void setBucket4From(int bucket4From)
			{
				this.bucket4From = bucket4From;
			}
			
		@Column(name = "Bucket4_to", nullable = false)
		public int getBucket4To()
			{
				return this.bucket4To;
			}
			
		public void setBucket4To(int bucket4To)
			{
				this.bucket4To = bucket4To;
			}
			
		@Column(name = "Bucket4_text", nullable = false, length = 50)
		public String getBucket4Text()
			{
				return this.bucket4Text;
			}
			
		public void setBucket4Text(String bucket4Text)
			{
				this.bucket4Text = bucket4Text;
			}
			
		@Column(name = "Bucket5_from", nullable = false)
		public int getBucket5From()
			{
				return this.bucket5From;
			}
			
		public void setBucket5From(int bucket5From)
			{
				this.bucket5From = bucket5From;
			}
			
		@Column(name = "Bucket5_to", nullable = false)
		public int getBucket5To()
			{
				return this.bucket5To;
			}
			
		public void setBucket5To(int bucket5To)
			{
				this.bucket5To = bucket5To;
			}
			
		@Column(name = "Bucket5_text", nullable = false, length = 50)
		public String getBucket5Text()
			{
				return this.bucket5Text;
			}
			
		public void setBucket5Text(String bucket5Text)
			{
				this.bucket5Text = bucket5Text;
			}
			
		@Column(name = "Bucket6_from", nullable = false)
		public int getBucket6From()
			{
				return this.bucket6From;
			}
			
		public void setBucket6From(int bucket6From)
			{
				this.bucket6From = bucket6From;
			}
			
		@Column(name = "Bucket6_to", nullable = false)
		public int getBucket6To()
			{
				return this.bucket6To;
			}
			
		public void setBucket6To(int bucket6To)
			{
				this.bucket6To = bucket6To;
			}
			
		@Column(name = "Bucket6_text", nullable = false, length = 50)
		public String getBucket6Text()
			{
				return this.bucket6Text;
			}
			
		public void setBucket6Text(String bucket6Text)
			{
				this.bucket6Text = bucket6Text;
			}
			
		@Column(name = "Bucket7_from", nullable = false)
		public int getBucket7From()
			{
				return this.bucket7From;
			}
			
		public void setBucket7From(int bucket7From)
			{
				this.bucket7From = bucket7From;
			}
			
		@Column(name = "Bucket7_to", nullable = false)
		public int getBucket7To()
			{
				return this.bucket7To;
			}
			
		public void setBucket7To(int bucket7To)
			{
				this.bucket7To = bucket7To;
			}
			
		@Column(name = "Bucket7_text", nullable = false, length = 50)
		public String getBucket7Text()
			{
				return this.bucket7Text;
			}
			
		public void setBucket7Text(String bucket7Text)
			{
				this.bucket7Text = bucket7Text;
			}
			
		@Column(name = "Bucket8_from", nullable = false)
		public int getBucket8From()
			{
				return this.bucket8From;
			}
			
		public void setBucket8From(int bucket8From)
			{
				this.bucket8From = bucket8From;
			}
			
		@Column(name = "Bucket8_to", nullable = false)
		public int getBucket8To()
			{
				return this.bucket8To;
			}
			
		public void setBucket8To(int bucket8To)
			{
				this.bucket8To = bucket8To;
			}
			
		@Column(name = "Bucket8_text", nullable = false, length = 50)
		public String getBucket8Text()
			{
				return this.bucket8Text;
			}
			
		public void setBucket8Text(String bucket8Text)
			{
				this.bucket8Text = bucket8Text;
			}
			
		@Column(name = "Bucket9_from", nullable = false)
		public int getBucket9From()
			{
				return this.bucket9From;
			}
			
		public void setBucket9From(int bucket9From)
			{
				this.bucket9From = bucket9From;
			}
			
		@Column(name = "Bucket9_to", nullable = false)
		public int getBucket9To()
			{
				return this.bucket9To;
			}
			
		public void setBucket9To(int bucket9To)
			{
				this.bucket9To = bucket9To;
			}
			
		@Column(name = "Bucket9_text", nullable = false, length = 50)
		public String getBucket9Text()
			{
				return this.bucket9Text;
			}
			
		public void setBucket9Text(String bucket9Text)
			{
				this.bucket9Text = bucket9Text;
			}
			
		@Column(name = "Bucket10_from", nullable = false)
		public int getBucket10From()
			{
				return this.bucket10From;
			}
			
		public void setBucket10From(int bucket10From)
			{
				this.bucket10From = bucket10From;
			}
			
		@Column(name = "Bucket10_to", nullable = false)
		public int getBucket10To()
			{
				return this.bucket10To;
			}
			
		public void setBucket10To(int bucket10To)
			{
				this.bucket10To = bucket10To;
			}
			
		@Column(name = "Bucket10_text", nullable = false, length = 50)
		public String getBucket10Text()
			{
				return this.bucket10Text;
			}
			
		public void setBucket10Text(String bucket10Text)
			{
				this.bucket10Text = bucket10Text;
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
