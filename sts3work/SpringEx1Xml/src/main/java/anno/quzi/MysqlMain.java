package anno.quzi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MysqlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app = new ClassPathXmlApplicationContext("annoQuizConfig.xml");
		
		MySqlContrikker my = app.getBean("mysql", MySqlContrikker.class);
		my.insert("±Ë»ø∏≤");
		my.delete("2");
		my.select("±Ë¡÷¬˘");
	}
	

}
