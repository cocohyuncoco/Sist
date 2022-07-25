package day0510.anno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class LogicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app1 = new ClassPathXmlApplicationContext("annoContext.xml");
		
		LogicController logic = (LogicController)app1.getBean("logic");
		logic.insert("Happy");
		logic.delete("1");
	
	}

}
