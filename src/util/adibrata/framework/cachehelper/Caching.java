/**
 * 
 */
package util.adibrata.framework.cachehelper;

/**
 * @author Henry
 *
 */
import java.util.ArrayList;










import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.map.LRUMap;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class Caching <K, T>{

	/**
	 * 
	 */
	private long lngtimeToLive;
	private LRUMap LRUCacheMap;


	protected class CacheObjects {
		public long lastAccessed = System.currentTimeMillis();
		public T value;

		protected CacheObjects(T value) {
			this.value = value;
		}
	}

	public Caching(long crunchifyTimeToLive, final long crunchifyTimerInterval, int maxItems) throws Exception{
		try
		{
			this.lngtimeToLive = crunchifyTimeToLive * 1000;

			LRUCacheMap = new LRUMap(maxItems);

			if (lngtimeToLive > 0 && crunchifyTimerInterval > 0) {

				Thread t = new Thread(new Runnable() {
					public void run() {
						while (true) {
							try {
								Thread.sleep(crunchifyTimerInterval * 1000);
							} catch (InterruptedException ex) {
							}
							try {
								cleanup();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});

				t.setDaemon(true);
				t.start();
			}
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
	}

	public Caching() throws Exception{
		try
		{
			long crunchifyTimeToLive = 86400; 
			final long crunchifyTimerInterval = 1;
			int maxItems = 1;
			
			this.lngtimeToLive = crunchifyTimeToLive * 1000;

			LRUCacheMap = new LRUMap(maxItems);

			if (lngtimeToLive > 0 && crunchifyTimerInterval > 0) {

				Thread t = new Thread(new Runnable() {
					public void run() {
						while (true) {
							try {
								Thread.sleep(crunchifyTimerInterval * 1000);
							} catch (InterruptedException ex) {
							}
							try {
								cleanup();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});

				t.setDaemon(true);
				t.start();
			}
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
	}

	public void put(K key, T value) {
		synchronized (LRUCacheMap) {
			LRUCacheMap.put(key, new CacheObjects(value));
		}
	}

	@SuppressWarnings("unchecked")
	public T get(K key) {
		synchronized (LRUCacheMap) {
			CacheObjects c = (CacheObjects) LRUCacheMap.get(key);

			if (c == null)
				return null;
			else {
				c.lastAccessed = System.currentTimeMillis();
				return c.value;
			}
		}
	}

	public void remove(K key) {
		synchronized (LRUCacheMap) {
			LRUCacheMap.remove(key);
		}
	}

	public int size() {
		synchronized (LRUCacheMap) {
			return LRUCacheMap.size();
		}
	}

	@SuppressWarnings("unchecked")
	public void cleanup()throws Exception {
		try
		{
			long now = System.currentTimeMillis();
			ArrayList<K> delKey = null;

			synchronized (LRUCacheMap) {
				MapIterator itr = LRUCacheMap.mapIterator();

				delKey = new ArrayList<K>((LRUCacheMap.size() / 2) + 1);
				K key = null;
				CacheObjects c = null;

				while (itr.hasNext()) {
					key = (K) itr.next();
					c = (CacheObjects) itr.getValue();

					if (c != null && (now > (lngtimeToLive + c.lastAccessed))) {
						delKey.add(key);
					}
				}
			}

			for (K key : delKey) {
				synchronized (LRUCacheMap) {
					LRUCacheMap.remove(key);
				}

				Thread.yield();
			}
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
	}




	/**
	 * @param args
	 */

}
