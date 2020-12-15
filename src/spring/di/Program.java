package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		
		/* 스프링에서 지시ㅏ는 방법으로 코딩
		Exam exam =new NewlecExam();
		ExamConsole console=new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				//new ClassPathXmlApplicationContext("spring/di/setting.xml"); 
		
//		ExamConsole console=(ExamConsole) context.getBean("console");
//		Exam exam=context.getBean(Exam.class);
//		System.out.println(exam.toString());
//		ExamConsole console=context.getBean(ExamConsole.class);
		ExamConsole console=(ExamConsole) context.getBean("console");
		console.print();
	}

}
