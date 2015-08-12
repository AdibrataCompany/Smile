/**
 *
 */

package com.adibrata.smartdealer.dao.usermanagement;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.MsMenu;
import com.adibrata.smartdealer.service.usermanagement.MenuService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class MenuDao extends DaoBase implements MenuService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		final StringBuilder menu = new StringBuilder();
		
		public MenuDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from MsMenu ";
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.MenuService#SaveAdd(com
		 * .adibrata.smartdealer.model.MsMenu)
		 */
		@Override
		public void SaveAdd(final MsMenu msMenu) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						msMenu.setDtmCrt(this.dtmupd.getTime());
						msMenu.setDtmUpd(this.dtmupd.getTime());
						this.session.save(msMenu);
						
						this.session.getTransaction().commit();
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.MenuService#SaveEdit(
		 * com.adibrata.smartdealer.model.MsMenu)
		 */
		@Override
		public void SaveEdit(final MsMenu msMenu) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						msMenu.setDtmCrt(this.dtmupd.getTime());
						msMenu.setDtmUpd(this.dtmupd.getTime());
						this.session.update(msMenu);
						
						this.session.getTransaction().commit();
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.MenuService#SaveDel(com
		 * .adibrata.smartdealer.model.MsMenu)
		 */
		@Override
		public void SaveDel(final MsMenu msMenu) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						this.session.delete(msMenu);
						
						this.session.getTransaction().commit();
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.MenuService#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		
		// function getMenus($parent, &$menu, $conn){
		// //I'm using the reference to get the menu, otherwise maybe you can use the global static variable in JAVA..
		// // &$menu << reference variable
		// $query = "SELECT * FROM menu WHERE id_parent_menu = '".$parent."'";
		// $result = $conn->query($query);
		//
		// if ($result->num_rows > 0) {
		//
		// //loop and set the menu
		// while($row = $result->fetch_object()){
		//
		// $menu .= '<li '.($parent != -1 ? 'class="dropdown"' : '').'><a href="#" '.($parent != -1 ? 'class="dropdown-toggle" data-toogle="dropdown"' : '').'>'.$row->menu_name.'</a>';
		//
		// /* check the menu's children */
		// $query_children = "SELECT * FROM menu WHERE id_parent_menu = '".$row->id_menu."'";
		// $result_children = $conn->query($query_children);
		// if ($result_children->num_rows > 0) {
		//
		// $menu .= '<ul class="dropdown-menu">';
		// // call the function again, because there's a children inside of this menu
		// getMenus($row->id_menu, $menu, $conn);
		// $menu .= '</ul>';
		// }
		//
		// $menu .= '</li>';
		// }
		// }
		// }
		//
		// $conn->close();
		
		@Override
		public List<MsMenu> Paging(final int CurrentPage, final String WhereCond, final String SortBy)
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		public List<MsMenu> ListMenu(final Long parentid)
			{
				final Query qry;
				
				final StringBuilder hql = new StringBuilder();
				hql.append("from MsMenu where parentMenuId = :parentid");
				qry = this.session.createQuery(hql.toString());
				qry.setParameter("parentid", parentid);
				qry.setCacheable(true);
				qry.setCacheRegion("MenuRender");
				final List<MsMenu> lst = qry.list();
				return lst;
			}
			
		@Override
		public String MenuRender(final Long parentid, final Long menuid, final Long roleid)
			{
				
				// <ul class="nav navbar-nav">
				// <li><a href="/Smile/home.action">Depan</a></li>
				// <li class="dropdown"><a href="" class="dropdown-toggle"
				// data-toggle="dropdown" role="button" aria-haspopup="true"
				// aria-expanded="false">Pembelian </a>
				// <ul class="dropdown-menu">
				// <li><a href="/Smile/purchaseorder.action">Pembelian</a></li>
				// <li><a href="/Smile/purchaseretur.action">Retur </a></li>
				// <li><a href="/Smile/purchaseinvoice.action">Tagihan </a></li>
				// <li role="separator" class="divider"></li>
				// <li class="dropdown-header">Laporan</li>
				// <li><a href="/Smile/Demo/Report/Purchase/Order/report.jsp">Laporan
				// Pembelian</a></li>
				// <li><a href="/Smile/Demo/Report/Purchase/Titip/report.jsp">Laporan
				// Konsinyasi</a></li>
				// <li><a href="/Smile/Demo/Report/Purchase/Retur/report.jsp">Laporan
				// Retur Pembelian</a></li>
				// </ul></li>
				// </ul>
				// TODO Auto-generated method stub
				
				final List<MsMenu> lst = this.ListMenu(parentid);
				if (lst.size() > 0)
					{
						
						for (final MsMenu arow : lst)
							{
								if (arow.getParentMenuId() == 0)
									{
										this.menu.append("<li class=\"dropdown\"> \n <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">");
										this.menu.append(arow.getMenuCode());
										this.menu.append("</a> \n");
										this.menu.append(" <ul class=\"dropdown-menu\">\n");
										this.MenuRender(arow.getId(), (long) 0, (long) 0);
										this.menu.append(" </ul>\n ");
										this.menu.append("</li>\n ");
									}
								else
									{
										// this.menu.append(" <ul class=\"dropdown-menu\">\n");
										this.menu.append("	<li><a href=\"");
										this.menu.append(arow.getUrlString());
										this.menu.append("\">");
										this.menu.append(arow.getMenuCode());
										this.menu.append("</a></li>\n");
										// this.menu.append(" </ul>\n ");
										
										// this.MenuRender(arow.getId(), (long) 0, (long) 0);
										
									}
							}
					}
					
				return this.menu.toString();
			}
			
	}
