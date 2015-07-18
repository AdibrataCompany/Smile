package util.adibrata.framework.exceptionhelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class TestException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//				ExceptionEntities _entExp = new ExceptionEntities();
		//				_entExp.setJavaClass("TestException");
		//				_entExp.setMethodName("main");
		//				_entExp.setExceptionType("warning");
		//				_entExp.setMessageError("error Nih");
		//				ExceptionHelper.WriteException(_entExp, null);
		try {
			
			saya();
		
		} catch (Exception lExp) {
			// TODO: handle exception
			/*Class c = this.getClass(); */
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExp);
						
			System.out.println("method should be main "+Thread.currentThread().getStackTrace()[1].getMethodName());			 

		}

	}

	private static void saya() throws Exception {
		try
		{
			int i =0;
			@SuppressWarnings("unused")
			int k= i/i;
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
			
		}
	}
}
