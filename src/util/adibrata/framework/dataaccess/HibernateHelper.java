
package util.adibrata.framework.dataaccess;

/**
 *
 */
/*


 *//**
 * @author Henry
 */
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import util.adibrata.framework.cachehelper.Caching;

public class HibernateHelper
	{
		
		private static String ConnectionString;
		private static int pagesize = 5;
		private static String Password;
		private static SessionFactory sessionFactory = buildSessionFactory();
		private static String UserName;
		
		private static SessionFactory buildSessionFactory()
			{
				sessionFactory = null;
				Caching<String, SessionFactory> cache = null;
				try
					{
						cache = new Caching<String, SessionFactory>();
					}
				catch (final Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Caching<String, Configuration> configurationcache = null;
				try
					{
						configurationcache = new Caching<String, Configuration>();
					}
				catch (final Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Configuration configuration;
				try
					{
						if (configurationcache.get("configurationcache") == null)
							{
								configuration = new Configuration().configure(HibernateHelper.class.getResource("/hibernate.cfg.xml"));
								configurationcache.put("configurationcache", configuration);
							}
						else
							{
								configuration = configurationcache.get("configurationcache");
							}
						if (sessionFactory == null)
							{
								if (cache.get("sessionFactory") == null)
									{
										
										final StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
										serviceRegistryBuilder.applySettings(configuration.getProperties());
										final ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
										sessionFactory = configuration.buildSessionFactory(serviceRegistry);
										
										cache.put("sessionFactory", sessionFactory);
										Password = configuration.getProperty("hibernate.connection.password");
										UserName = configuration.getProperty("hibernate.connection.username");
										ConnectionString = configuration.getProperty("hibernate.connection.url");
									}
								else
									{
										
										sessionFactory = cache.get("sessionFactory");
										Password = configuration.getProperty("hibernate.connection.password");
										UserName = configuration.getProperty("hibernate.connection.username");
										ConnectionString = configuration.getProperty("hibernate.connection.url");
									}
								
							}
						return sessionFactory;
					}
				catch (final Throwable ex)
					{
						System.err.println("Initial SessionFactory creation failed." + ex);
						
						throw new ExceptionInInitializerError(ex);
					}
			}
		
		@SuppressWarnings("unused")
		private static SessionFactory buildSessionFactory(boolean isStateless)
			{
				sessionFactory = null;
				Caching<String, SessionFactory> cache = null;
				try
					{
						cache = new Caching<String, SessionFactory>();
					}
				catch (final Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Caching<String, Configuration> configurationcache = null;
				try
					{
						configurationcache = new Caching<String, Configuration>();
					}
				catch (final Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Configuration configuration;
				try
					{
						if (configurationcache.get("configurationcache") == null)
							{
								configuration = new Configuration().configure(HibernateHelper.class.getResource("/hibernate.cfg.xml"));
								configurationcache.put("configurationcache", configuration);
							}
						else
							{
								configuration = configurationcache.get("configurationcache");
							}
						if (sessionFactory == null)
							{
								if (cache.get("sessionFactory") == null)
									{
										
										final StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
										serviceRegistryBuilder.applySettings(configuration.getProperties());
										final ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
										sessionFactory = configuration.buildSessionFactory(serviceRegistry);
										
										cache.put("sessionFactory", sessionFactory);
										Password = configuration.getProperty("hibernate.connection.password");
										UserName = configuration.getProperty("hibernate.connection.username");
										ConnectionString = configuration.getProperty("hibernate.connection.url");
									}
								else
									{
										
										sessionFactory = cache.get("sessionFactory");
										Password = configuration.getProperty("hibernate.connection.password");
										UserName = configuration.getProperty("hibernate.connection.username");
										ConnectionString = configuration.getProperty("hibernate.connection.url");
									}
								
							}
						return sessionFactory;
					}
				catch (final Throwable ex)
					{
						System.err.println("Initial SessionFactory creation failed." + ex);
						
						throw new ExceptionInInitializerError(ex);
					}
			}
		/**
		 * @return the connectionString
		 */
		public static String getConnectionString()
			{
				return ConnectionString;
			}
		
		public static int getPagesize()
			{
				return pagesize;
			}
		
		/**
		 * @return the password
		 */
		public static String getPassword()
			{
				return Password;
			}
		
		public static SessionFactory getSessionFactory()
			{
				return sessionFactory;
			}
		
		/**
		 * @return the userName
		 */
		public static String getUserName()
			{
				return UserName;
			}
		
		public static void setPagesize(final int pagesize)
			{
				HibernateHelper.pagesize = pagesize;
			}
		
		public static void shutdown()
			{
				// Close caches and connection pools
				getSessionFactory().close();
			}
		
		/*
		 * private static SessionFactory buildSessionFactory() { sessionFactory =
		 * null; Caching<String, SessionFactory> cache = new Caching<String,
		 * SessionFactory>(); Caching<String, Configuration> configurationcache =
		 * new Caching<String, Configuration>(); Configuration configuration; try {
		 * if (configurationcache.get("configurationcache") == null) { configuration
		 * = new Configuration() .configure(HibernateHelper.class
		 * .getResource("/hibernate.cfg.xml"));
		 * configurationcache.put("configurationcache", configuration); } else {
		 * configuration = configurationcache .get("configurationcache"); }
		 * if (sessionFactory == null) {
		 * StandardServiceRegistryBuilder serviceRegistryBuilder = new
		 * StandardServiceRegistryBuilder();
		 * serviceRegistryBuilder.applySettings(configuration .getProperties());
		 * ServiceRegistry serviceRegistry = serviceRegistryBuilder .build();
		 * sessionFactory = configuration .buildSessionFactory(serviceRegistry);
		 * Password = configuration .getProperty("hibernate.connection.password");
		 * UserName = configuration .getProperty("hibernate.connection.username");
		 * ConnectionString = configuration
		 * .getProperty("hibernate.connection.url"); } return sessionFactory; }
		 * catch (Throwable ex) {
		 * System.err.println("Initial SessionFactory creation failed." + ex); throw
		 * new ExceptionInInitializerError(ex); } }
		 */
		
		/**
		 * @param connectionString
		 *            the connectionString to set
		 */
		public void setConnectionString(final String connectionString)
			{
				ConnectionString = connectionString;
			}
		
		/**
		 * @param password
		 *            the password to set
		 */
		public void setPassword(final String password)
			{
				Password = password;
			}
		
		/**
		 * @param userName
		 *            the userName to set
		 */
		public void setUserName(final String userName)
			{
				UserName = userName;
			}
		
	}
