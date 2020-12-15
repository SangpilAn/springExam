package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start=System.currentTimeMillis();
		
		Object result=invocation.proceed();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end=System.currentTimeMillis();
		
		String message=(end-start)+"ms °É·È½À´Ï´Ù.";
		System.out.println(message);
		
		return result;
	}

}
