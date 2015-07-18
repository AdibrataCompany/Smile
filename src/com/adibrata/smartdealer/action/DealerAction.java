package com.adibrata.smartdealer.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class DealerAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 1L;

	private String kode;
	private String nama;
	private String alamat;
	private String kota;
	private String logo;
	private String mode;



	public DealerAction() {
		// TODO Auto-generated constructor stub
	}

	public String execute(){
		try {
			if(kode!=null&&kode.length()>1){
				if(kode.equals("001")){
					dealerSatu();
					mode = "success";
				}
				else if(kode.equals("002")){
					dealerDua();
					mode = "success";
				}
				else{
					mode = "error";
				}

			}
			else{
				mode = "error";
			}
			return mode;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
	}

	public void dealerSatu(){
		alamat = "Jl. Ir. H. Juanda No. 35 " +
				" Bulak Kapal, Bekasi Timur Telp. (021) 88347777, 88344165 ";
		kota = "Kota Bekasi";
		kode = "001";
		nama = "SUN STAR MOTOR";
		logo = "sunmotor.jpg";
	}

	public void dealerDua(){
		alamat = "Jln Jend Basuki Rahmat No 37 Surabaya Jawa Timur";
		kota = "Kota Surabaya";
		kode = "002";
		nama = "SUMBER JAYA MOTOR";
		logo = "sumberjaya.jpg";
	}


	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	
	/**
	 * @return the kode
	 */
	public String getKode() {
		return kode;
	}

	/**
	 * @param kode the kode to set
	 */
	public void setKode(String kode) {
		this.kode = kode;
	}

	/**
	 * @return the nama
	 */
	public String getNama() {
		return nama;
	}

	/**
	 * @param nama the nama to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

	/**
	 * @return the alamat
	 */
	public String getAlamat() {
		return alamat;
	}

	/**
	 * @param alamat the alamat to set
	 */
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	/**
	 * @return the kota
	 */
	public String getKota() {
		return kota;
	}

	/**
	 * @param kota the kota to set
	 */
	public void setKota(String kota) {
		this.kota = kota;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}




}
