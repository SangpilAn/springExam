package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				//new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml"); 
		
		
		Exam exam=(Exam) context.getBean("exam");
		
		System.out.println("total is "+exam.total());
		System.out.println("avg is "+exam.avg());
		
		
		/*
		 * Exam exam=new NewlecExam(1,1,1,1);
		 * 
		 * Exam proxy=(Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
		 * new Class[] {Exam.class}, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * long start=System.currentTimeMillis();
		 * 
		 * Object result=method.invoke(exam, args);
		 * 
		 * try { Thread.sleep(200); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * long end=System.currentTimeMillis();
		 * 
		 * String message=(end-start)+"ms °É·È½À´Ï´Ù."; System.out.println(message);
		 * 
		 * return result; } });
		 */
		
		
	}

}
