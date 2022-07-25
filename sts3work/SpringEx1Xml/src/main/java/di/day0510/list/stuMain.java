package di.day0510.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("scoreConfig.xml");
		
		Sungjuk su = con.getBean("sj", Sungjuk.class);
		su.writeSungjuk();
		
	}

}
