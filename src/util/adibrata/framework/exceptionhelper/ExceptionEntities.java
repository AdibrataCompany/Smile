/**
 * 
 */
package util.adibrata.framework.exceptionhelper;

/**
 * @author Henry
 *
 */
import java.io.Serializable;

import javax.persistence.Entity;

@SuppressWarnings({ "serial" })
@Entity
public class ExceptionEntities implements Serializable {

	private String JavaClass;
	private String MethodName;

	public String getJavaClass() {
		return this.JavaClass;
	}

	public String getMethodName() {
		return this.MethodName;
	}

	public void setJavaClass(String javaClass) {
		this.JavaClass = javaClass;
	}

	public void setMethodName(String methodName) {
		this.MethodName = methodName;
	}

}
