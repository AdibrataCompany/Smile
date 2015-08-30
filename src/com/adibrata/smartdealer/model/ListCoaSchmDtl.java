/**
 *
 */

package com.adibrata.smartdealer.model;

import java.util.Date;

/**
 * @author Henry
 */

public class ListCoaSchmDtl implements java.io.Serializable
	{

		/**
		* 
		*/
		private static final long serialVersionUID = 1L;
		private Long coamasterid;
		private Long coaSchmHdrid;
		private String coacode;
		private String coaname;
		private String coadesc;

		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;

		/**
		 *
		 */
		public ListCoaSchmDtl()
			{
				// TODO Auto-generated constructor stub
			}

		public ListCoaSchmDtl(final Long coamasterid, final Long coaSchmHdrid, final String coacode, final String coaname, final String coadesc)
			{

				// TODO Auto-generated constructor stub
				this.coamasterid = coamasterid;
				this.coaSchmHdrid = coaSchmHdrid;
				this.coacode = coacode;
				this.coaname = coaname;
				this.coadesc = coadesc;

			}

		/**
		 * @return the coamasterid
		 */
		public Long getCoamasterid()
			{
				return this.coamasterid;
			}

		/**
		 * @return the coaSchmHdrid
		 */
		public Long getCoaSchmHdrid()
			{
				return this.coaSchmHdrid;
			}

		/**
		 * @return the coacode
		 */
		public String getCoacode()
			{
				return this.coacode;
			}

		/**
		 * @return the coaname
		 */
		public String getCoaname()
			{
				return this.coaname;
			}

		/**
		 * @return the coadesc
		 */
		public String getCoadesc()
			{
				return this.coadesc;
			}

		/**
		 * @return the dtmUpd
		 */
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}

		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}

		/**
		 * @return the dtmCrt
		 */
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}

		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}

		/**
		 * @param coamasterid
		 *            the coamasterid to set
		 */
		public void setCoamasterid(final Long coamasterid)
			{
				this.coamasterid = coamasterid;
			}

		/**
		 * @param coaSchmHdrid
		 *            the coaSchmHdrid to set
		 */
		public void setCoaSchmHdrid(final Long coaSchmHdrid)
			{
				this.coaSchmHdrid = coaSchmHdrid;
			}

		/**
		 * @param coacode
		 *            the coacode to set
		 */
		public void setCoacode(final String coacode)
			{
				this.coacode = coacode;
			}

		/**
		 * @param coaname
		 *            the coaname to set
		 */
		public void setCoaname(final String coaname)
			{
				this.coaname = coaname;
			}

		/**
		 * @param coadesc
		 *            the coadesc to set
		 */
		public void setCoadesc(final String coadesc)
			{
				this.coadesc = coadesc;
			}

		/**
		 * @param dtmUpd
		 *            the dtmUpd to set
		 */
		public void setDtmUpd(final Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}

		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}

		/**
		 * @param dtmCrt
		 *            the dtmCrt to set
		 */
		public void setDtmCrt(final Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}

		/**
		 * @param usrCrt
		 *            the usrCrt to set
		 */
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}

	}
