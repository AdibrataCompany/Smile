
package com.adibrata.smartdealer.action.credit.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.AgrmntCrossDefault;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AppCrossDefaultAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private String message;
		private String mode;
		private String usrUpd;
		private String usrCrt;

		private List<AgrmntCrossDefault> lstcross;

		private Map<String, Object> dtl;

		private Long id;
		private int seqno;

		public AppCrossDefaultAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.lstcross = new ArrayList<AgrmntCrossDefault>();
			}

		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				this.dtl = ActionContext.getContext().getSession();
				if (this.dtl.get("dtl") != null)
					{
						this.lstcross = (List<AgrmntCrossDefault>) this.dtl.get("dtl");
						this.seqno = 1;
					}
			}

		@Override
		public String execute()
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{

								case "adddetail" :
									try
										{
											this.AddDetail();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "deldetail" :
									try
										{
											this.DelDetail();

										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "save" :
									try
										{
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;

								default :
									break;
							}
					}
				else
					{
						try
							{
								strMode = "start";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}

		private void AddDetail() throws Exception
			{
				try
					{
						// AgrmntCrossDefault crossdefault = new AgrmntCrossDefault();
						this.dtl.put("dtl", this.lstcross);
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		@SuppressWarnings("unchecked")
		private void DelDetail() throws Exception
			{
				try
					{
						this.lstcross = (List<AgrmntCrossDefault>) this.dtl.get("dtl");
						this.seqno = this.seqno - 1;
						this.lstcross.remove(this.seqno);

						this.dtl.put("dtl", this.lstcross);
						this.lstcross = (List<AgrmntCrossDefault>) this.dtl.get("dtl");
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		public String Save() throws Exception
			{
				try
					{
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)

					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

				return this.mode;
			}

		public String getMessage()
			{
				return this.message;
			}

		public void setMessage(final String message)
			{
				this.message = message;
			}

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
			}

		public String getUsrUpd()
			{
				return this.usrUpd;
			}

		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}

		public String getUsrCrt()
			{
				return this.usrCrt;
			}

		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}

		public List<AgrmntCrossDefault> getLstcross()
			{
				return this.lstcross;
			}

		public void setLstcross(final List<AgrmntCrossDefault> lstcross)
			{
				this.lstcross = lstcross;
			}

		public Map<String, Object> getDtl()
			{
				return this.dtl;
			}

		public void setDtl(final Map<String, Object> dtl)
			{
				this.dtl = dtl;
			}

		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		public Long getId()
			{
				return this.id;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

		public int getSeqno()
			{
				return this.seqno;
			}

		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}

	}
