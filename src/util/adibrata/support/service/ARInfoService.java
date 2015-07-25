
package util.adibrata.support.service;

import java.util.Date;
import java.util.List;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.InstSchedule;
import com.adibrata.smartdealer.model.PaymentInfo;

public interface ARInfoService
	{
		public PaymentInfo GetDetail(final long agrmntid, final Date valuedate) throws Exception;

		public PaymentInfo PaymentAllocation(final Agrmnt agrmnt, final Date valuedate, Double amountreceive) throws Exception;

		public double AccruedInfo(final Agrmnt agrmnt, final Date valuedate) throws Exception;

		public double TotalOsInstallment(final long agrmntid, final Date valuedate) throws Exception;

		public double TotalInstallment(final long agrmntid, final Date valuedate) throws Exception;

		public PaymentInfo GetOsPrincipalandInterest(final long agrmntid, final Date valuedate, final PaymentInfo paymentinfo) throws Exception;

		public List<InstSchedule> LstInstSchedule(final long agrmntid) throws Exception;

		public int AgrmntDaysOverdue(final long agrmntid, final Date valuedate) throws Exception;
		
	}
