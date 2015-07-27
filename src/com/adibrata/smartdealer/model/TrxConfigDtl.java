
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 2:07:03 PM by Hibernate Tools 4.3.1

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
 * TrxConfigDtl generated by hbm2java
 */
@Entity
@Table(name = "TrxConfigDtl", catalog = "SmartDealer")
public class TrxConfigDtl implements java.io.Serializable
	{
		
		private long id;
		private TrxConfigHdr trxConfigHdr;
		private Long sequenceNo;
		private String coaSourceTable;
		private String coaName;
		private String isCoaHeader;
		private String post;
		private Short isMultipleDtl;
		private String tblSourceDtl;
		private String headerId;
		private String amountTrx;
		private Long departId;
		private Short isCreatePaymentHistoryDetail;
		private Short isCreateCashBankMutationDetail;
		private Short isCreateJournalDetail;
		private String usrCrt;
		private Date dtmCrt;
		private String usrUpd;
		private Date dtmUpd;
		
		public TrxConfigDtl()
			{
			}
			
		public TrxConfigDtl(long id)
			{
				this.id = id;
			}
			
		public TrxConfigDtl(long id, TrxConfigHdr trxConfigHdr, Long sequenceNo, String coaSourceTable, String coaName, String isCoaHeader, String post, Short isMultipleDtl, String tblSourceDtl, String headerId, String amountTrx, Long departId,
		        Short isCreatePaymentHistoryDetail, Short isCreateCashBankMutationDetail, Short isCreateJournalDetail, String usrCrt, Date dtmCrt, String usrUpd, Date dtmUpd)
			{
				this.id = id;
				this.trxConfigHdr = trxConfigHdr;
				this.sequenceNo = sequenceNo;
				this.coaSourceTable = coaSourceTable;
				this.coaName = coaName;
				this.isCoaHeader = isCoaHeader;
				this.post = post;
				this.isMultipleDtl = isMultipleDtl;
				this.tblSourceDtl = tblSourceDtl;
				this.headerId = headerId;
				this.amountTrx = amountTrx;
				this.departId = departId;
				this.isCreatePaymentHistoryDetail = isCreatePaymentHistoryDetail;
				this.isCreateCashBankMutationDetail = isCreateCashBankMutationDetail;
				this.isCreateJournalDetail = isCreateJournalDetail;
				this.usrCrt = usrCrt;
				this.dtmCrt = dtmCrt;
				this.usrUpd = usrUpd;
				this.dtmUpd = dtmUpd;
			}
			
		@Id
		
		@Column(name = "ID", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(long id)
			{
				this.id = id;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "TrxConfigHdrID")
		public TrxConfigHdr getTrxConfigHdr()
			{
				return this.trxConfigHdr;
			}
			
		public void setTrxConfigHdr(TrxConfigHdr trxConfigHdr)
			{
				this.trxConfigHdr = trxConfigHdr;
			}
			
		@Column(name = "SequenceNo")
		public Long getSequenceNo()
			{
				return this.sequenceNo;
			}
			
		public void setSequenceNo(Long sequenceNo)
			{
				this.sequenceNo = sequenceNo;
			}
			
		@Column(name = "CoaSourceTable", length = 50)
		public String getCoaSourceTable()
			{
				return this.coaSourceTable;
			}
			
		public void setCoaSourceTable(String coaSourceTable)
			{
				this.coaSourceTable = coaSourceTable;
			}
			
		@Column(name = "CoaName", length = 50)
		public String getCoaName()
			{
				return this.coaName;
			}
			
		public void setCoaName(String coaName)
			{
				this.coaName = coaName;
			}
			
		@Column(name = "IsCoaHeader", length = 50)
		public String getIsCoaHeader()
			{
				return this.isCoaHeader;
			}
			
		public void setIsCoaHeader(String isCoaHeader)
			{
				this.isCoaHeader = isCoaHeader;
			}
			
		@Column(name = "Post", length = 50)
		public String getPost()
			{
				return this.post;
			}
			
		public void setPost(String post)
			{
				this.post = post;
			}
			
		@Column(name = "IsMultipleDtl")
		public Short getIsMultipleDtl()
			{
				return this.isMultipleDtl;
			}
			
		public void setIsMultipleDtl(Short isMultipleDtl)
			{
				this.isMultipleDtl = isMultipleDtl;
			}
			
		@Column(name = "TblSourceDtl", length = 50)
		public String getTblSourceDtl()
			{
				return this.tblSourceDtl;
			}
			
		public void setTblSourceDtl(String tblSourceDtl)
			{
				this.tblSourceDtl = tblSourceDtl;
			}
			
		@Column(name = "HeaderID", length = 50)
		public String getHeaderId()
			{
				return this.headerId;
			}
			
		public void setHeaderId(String headerId)
			{
				this.headerId = headerId;
			}
			
		@Column(name = "AmountTrx", length = 50)
		public String getAmountTrx()
			{
				return this.amountTrx;
			}
			
		public void setAmountTrx(String amountTrx)
			{
				this.amountTrx = amountTrx;
			}
			
		@Column(name = "DepartID")
		public Long getDepartId()
			{
				return this.departId;
			}
			
		public void setDepartId(Long departId)
			{
				this.departId = departId;
			}
			
		@Column(name = "IsCreatePaymentHistoryDetail")
		public Short getIsCreatePaymentHistoryDetail()
			{
				return this.isCreatePaymentHistoryDetail;
			}
			
		public void setIsCreatePaymentHistoryDetail(Short isCreatePaymentHistoryDetail)
			{
				this.isCreatePaymentHistoryDetail = isCreatePaymentHistoryDetail;
			}
			
		@Column(name = "IsCreateCashBankMutationDetail")
		public Short getIsCreateCashBankMutationDetail()
			{
				return this.isCreateCashBankMutationDetail;
			}
			
		public void setIsCreateCashBankMutationDetail(Short isCreateCashBankMutationDetail)
			{
				this.isCreateCashBankMutationDetail = isCreateCashBankMutationDetail;
			}
			
		@Column(name = "IsCreateJournalDetail")
		public Short getIsCreateJournalDetail()
			{
				return this.isCreateJournalDetail;
			}
			
		public void setIsCreateJournalDetail(Short isCreateJournalDetail)
			{
				this.isCreateJournalDetail = isCreateJournalDetail;
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
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
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
		@Column(name = "DtmUpd", length = 16)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
			
	}
