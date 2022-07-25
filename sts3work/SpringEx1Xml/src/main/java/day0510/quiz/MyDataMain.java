package day0510.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("myConfig.xml");
		
		MyData data = con.getBean("data", MyData.class);
		data.writeData();
	}

}
