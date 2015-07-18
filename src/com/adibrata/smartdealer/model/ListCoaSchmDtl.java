package com.adibrata.smartdealer.model;

public class ListCoaSchmDtl {

	public ListCoaSchmDtl() {
		// TODO Auto-generated constructor stub
	}

	private long CoamasterId;
	private String CoaCode;
	private String CoaName;
	private String CoaDesc;

	
	/**
	 * @return the coaCode
	 */
	public String getCoaCode() {
		return CoaCode;
	}

	/**
	 * @param coaCode
	 *            the coaCode to set
	 */
	public void setCoaCode(String coaCode) {
		CoaCode = coaCode;
	}

	/**
	 * @return the coaName
	 */
	public String getCoaName() {
		return CoaName;
	}

	/**
	 * @param coaName the coaName to set
	 */
	public void setCoaName(String coaName) {
		CoaName = coaName;
	}

	/**
	 * @return the coaDesc
	 */
	public String getCoaDesc() {
		return CoaDesc;
	}

	/**
	 * @param coaDesc the coaDesc to set
	 */
	public void setCoaDesc(String coaDesc) {
		CoaDesc = coaDesc;
	}

	/**
	 * @return the coamasterId
	 */
	public long getCoamasterId() {
		return CoamasterId;
	}

	/**
	 * @param coamasterId the coamasterId to set
	 */
	public void setCoamasterId(long coamasterId) {
		CoamasterId = coamasterId;
	}

}
