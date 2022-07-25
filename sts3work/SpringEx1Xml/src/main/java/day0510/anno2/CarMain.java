package day0510.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app = new ClassPathXmlApplicationContext("annoContext.xml");
	
		//Tire tire = app.getBean("htire", KumhoTire.class);
		//tire.writeTireName();
		
		MyCar car = app.getBean("myCar", MyCar.class);
		car.WriteTire();
	}
	

}
