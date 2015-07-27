
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 12:24:25 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CoyCustFinancialInfo generated by hbm2java
 */
@Entity
@Table(name = "CoyCustFinancialInfo", catalog = "SmartDealer")
public class CoyCustFinancialInfo implements java.io.Serializable
	{
		
		private CoyCustFinancialInfoId id;
		
		public CoyCustFinancialInfo()
			{
			}
			
		public CoyCustFinancialInfo(CoyCustFinancialInfoId id)
			{
				this.id = id;
			}
			
		@EmbeddedId
		
		@AttributeOverrides(
			{
			        @AttributeOverride(name = "id", column = @Column(name = "Id") ), @AttributeOverride(name = "customerId", column = @Column(name = "CustomerId") ),
			        @AttributeOverride(name = "rentFinishDate", column = @Column(name = "RentFinishDate", length = 23) ), @AttributeOverride(name = "currentRatio", column = @Column(name = "CurrentRatio", precision = 53, scale = 0) ),
			        @AttributeOverride(name = "roi", column = @Column(name = "ROI", precision = 53, scale = 0) ), @AttributeOverride(name = "der", column = @Column(name = "DER", precision = 53, scale = 0) ),
			        @AttributeOverride(name = "modalDasar", column = @Column(name = "ModalDasar", nullable = false, precision = 53, scale = 0) ),
			        @AttributeOverride(name = "modalDisetor", column = @Column(name = "ModalDisetor", nullable = false, precision = 53, scale = 0) ),
			        @AttributeOverride(name = "netProfitMargin", column = @Column(name = "NetProfitMargin", nullable = false, precision = 53, scale = 0) ),
			        @AttributeOverride(name = "bankAccountType", column = @Column(name = "BankAccountType", length = 10) ),
			        @AttributeOverride(name = "allowanceAvailable", column = @Column(name = "AllowanceAvailable", nullable = false, precision = 53, scale = 0) ),
			        @AttributeOverride(name = "averageDebitTransaction", column = @Column(name = "AverageDebitTransaction", precision = 53, scale = 0) ),
			        @AttributeOverride(name = "averageCreditTransaction", column = @Column(name = "AverageCreditTransaction", precision = 53, scale = 0) ),
			        @AttributeOverride(name = "averageBalance", column = @Column(name = "AverageBalance", precision = 53, scale = 0) ), @AttributeOverride(name = "deposito", column = @Column(name = "Deposito", precision = 53, scale = 0) ),
			        @AttributeOverride(name = "additionalCollateralType", column = @Column(name = "AdditionalCollateralType", length = 50) ),
			        @AttributeOverride(name = "additionalCollateralAmount", column = @Column(name = "AdditionalCollateralAmount", precision = 53, scale = 0) ),
			        @AttributeOverride(name = "companyStatus", column = @Column(name = "CompanyStatus", length = 10) ), @AttributeOverride(name = "companyStatusSinceYear", column = @Column(name = "CompanyStatusSinceYear") ),
			        @AttributeOverride(name = "usrCrt", column = @Column(name = "UsrCrt", length = 50) ), @AttributeOverride(name = "dtmUpd", column = @Column(name = "DtmUpd", length = 16) ),
			        @AttributeOverride(name = "usrUpd", column = @Column(name = "UsrUpd", length = 50) ), @AttributeOverride(name = "dtmCrt", column = @Column(name = "DtmCrt", length = 16) )
			})
		public CoyCustFinancialInfoId getId()
			{
				return this.id;
			}
			
		public void setId(CoyCustFinancialInfoId id)
			{
				this.id = id;
			}
			
	}
