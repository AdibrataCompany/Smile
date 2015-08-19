
package com.adibrata.smartdealer.action.usermanagement.dealer;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class DealerAction extends ActionSupport implements Preparable
	{
		
		private static final long serialVersionUID = 1L;
		
		private String kode;
		private String nama;
		private String alamat;
		private String kota;
		private String logo;
		private String mode;
		
		public DealerAction()
			{
				// TODO Auto-generated constructor stub
			}
			
		@Override
		public String execute()
			{
				try
					{
						if ((this.kode != null) && (this.kode.length() > 1))
							{
								if (this.kode.equals("001"))
									{
										this.dealerSatu();
										this.mode = "success";
									}
								else if (this.kode.equals("002"))
									{
										this.dealerDua();
										this.mode = "success";
									}
								else
									{
										this.mode = "ERROR";
									}
									
							}
						else
							{
								this.mode = "ERROR";
							}
						return this.mode;
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						return ERROR;
					}
			}
			
		public void dealerSatu()
			{
				this.alamat = "Jl. Ir. H. Juanda No. 35 " + " Bulak Kapal, Bekasi Timur Telp. (021) 88347777, 88344165 ";
				this.kota = "Kota Bekasi";
				this.kode = "001";
				this.nama = "SUN STAR MOTOR";
				this.logo = "sunmotor.jpg";
			}
			
		public void dealerDua()
			{
				this.alamat = "Jln Jend Basuki Rahmat No 37 Surabaya Jawa Timur";
				this.kota = "Kota Surabaya";
				this.kode = "002";
				this.nama = "SUMBER JAYA MOTOR";
				this.logo = "sumberjaya.jpg";
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				try
					{
					
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			
		/**
		 * /**
		 * 
		 * @return the kode
		 */
		public String getKode()
			{
				return this.kode;
			}
			
		/**
		 * @param kode
		 *            the kode to set
		 */
		public void setKode(final String kode)
			{
				this.kode = kode;
			}
			
		/**
		 * @return the nama
		 */
		public String getNama()
			{
				return this.nama;
			}
			
		/**
		 * @param nama
		 *            the nama to set
		 */
		public void setNama(final String nama)
			{
				this.nama = nama;
			}
			
		/**
		 * @return the alamat
		 */
		public String getAlamat()
			{
				return this.alamat;
			}
			
		/**
		 * @param alamat
		 *            the alamat to set
		 */
		public void setAlamat(final String alamat)
			{
				this.alamat = alamat;
			}
			
		/**
		 * @return the kota
		 */
		public String getKota()
			{
				return this.kota;
			}
			
		/**
		 * @param kota
		 *            the kota to set
		 */
		public void setKota(final String kota)
			{
				this.kota = kota;
			}
			
		/**
		 * @return the logo
		 */
		public String getLogo()
			{
				return this.logo;
			}
			
		/**
		 * @param logo
		 *            the logo to set
		 */
		public void setLogo(final String logo)
			{
				this.logo = logo;
			}
			
		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @param mode
		 *            the mode to set
		 */
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
	}
