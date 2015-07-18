package com.adibrata.smartdealer.model;
// Generated Jul 16, 2015 1:10:05 AM by Hibernate Tools 4.3.1

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
 * AgrmntInsurance generated by hbm2java
 */
@Entity
@Table(name = "AgrmntInsurance", schema = "dbo", catalog = "SmartDealer")
public class AgrmntInsurance implements java.io.Serializable {

	private long id;
	private Agrmnt agrmnt;
	private Long appId;
	private String usrCrt;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;

	public AgrmntInsurance() {
	}

	public AgrmntInsurance(long id) {
		this.id = id;
	}
	public AgrmntInsurance(long id, Agrmnt agrmnt, Long appId, String usrCrt,
			Date dtmUpd, String usrUpd, Date dtmCrt) {
		this.id = id;
		this.agrmnt = agrmnt;
		this.appId = appId;
		this.usrCrt = usrCrt;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AgrmntId")
	public Agrmnt getAgrmnt() {
		return this.agrmnt;
	}

	public void setAgrmnt(Agrmnt agrmnt) {
		this.agrmnt = agrmnt;
	}

	@Column(name = "AppId")
	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 16)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@Column(name = "UsrUpd", length = 50)
	public String getUsrUpd() {
		return this.usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmCrt", length = 16)
	public Date getDtmCrt() {
		return this.dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

}