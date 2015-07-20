/**
 *
 */

package util.adibrata.framework.exceptionhelper;

/**
 * @author Henry
 */

public class ExceptionEntities
	{

	private String JavaClass;
	private String MethodName;

	public String getJavaClass()
		{
			return this.JavaClass;
		}

	public String getMethodName()
		{
			return this.MethodName;
		}

	public void setJavaClass(final String javaClass)
		{
			this.JavaClass = javaClass;
		}

	public void setMethodName(final String methodName)
		{
			this.MethodName = methodName;
		}

}
