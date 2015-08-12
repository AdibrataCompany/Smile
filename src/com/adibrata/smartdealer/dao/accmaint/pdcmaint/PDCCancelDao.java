
package com.adibrata.smartdealer.dao.accmaint.pdcmaint;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PDCCancelDao extends DaoBase
	{

		public PDCCancelDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
					
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
	}
