/**
 * 
 */
package com.adibrata.smartdealer.model;

import java.util.Date;

import javax.persistence.Entity;

/**
 * @author Henry
 *
 */
@Entity
public class ListCoaSchmDtl implements java.io.Serializable {

	private long coamasterid;
	private long coaSchmHdrid;
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
	public ListCoaSchmDtl() {
		// TODO Auto-generated constructor stub
	}
	public ListCoaSchmDtl(long coamasterid, long coaSchmHdrid, String coacode,String coaname,  String coadesc) {
		
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
	public long getCoamasterid() {
		return coamasterid;
	}
	/**
	 * @return the coaSchmHdrid
	 */
	public long getCoaSchmHdrid() {
		return coaSchmHdrid;
	}
	/**
	 * @return the coacode
	 */
	public String getCoacode() {
		return coacode;
	}
	/**
	 * @return the coaname
	 */
	public String getCoaname() {
		return coaname;
	}
	/**
	 * @return the coadesc
	 */
	public String getCoadesc() {
		return coadesc;
	}
	/**
	 * @return the dtmUpd
	 */
	public Date getDtmUpd() {
		return dtmUpd;
	}
	/**
	 * @return the usrUpd
	 */
	public String getUsrUpd() {
		return usrUpd;
	}
	/**
	 * @return the dtmCrt
	 */
	public Date getDtmCrt() {
		return dtmCrt;
	}
	/**
	 * @return the usrCrt
	 */
	public String getUsrCrt() {
		return usrCrt;
	}
	/**
	 * @param coamasterid the coamasterid to set
	 */
	public void setCoamasterid(long coamasterid) {
		this.coamasterid = coamasterid;
	}
	/**
	 * @param coaSchmHdrid the coaSchmHdrid to set
	 */
	public void setCoaSchmHdrid(long coaSchmHdrid) {
		this.coaSchmHdrid = coaSchmHdrid;
	}
	/**
	 * @param coacode the coacode to set
	 */
	public void setCoacode(String coacode) {
		this.coacode = coacode;
	}
	/**
	 * @param coaname the coaname to set
	 */
	public void setCoaname(String coaname) {
		this.coaname = coaname;
	}
	/**
	 * @param coadesc the coadesc to set
	 */
	public void setCoadesc(String coadesc) {
		this.coadesc = coadesc;
	}
	/**
	 * @param dtmUpd the dtmUpd to set
	 */
	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}
	/**
	 * @param usrUpd the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}
	/**
	 * @param dtmCrt the dtmCrt to set
	 */
	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}
	/**
	 * @param usrCrt the usrCrt to set
	 */
	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}
	
}
