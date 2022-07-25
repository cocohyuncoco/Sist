package boot.day0519.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"boot.test","*.boot"}) //패키지 등록하는곳
public class SpringbootEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx1Application.class, args);
	}
	
	
}
