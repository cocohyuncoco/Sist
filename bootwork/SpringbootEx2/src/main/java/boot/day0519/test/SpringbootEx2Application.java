package boot.day0519.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//와일드카드 가능(가급적 와일드카드 쓰기)
@ComponentScan({"boot.*"})
public class SpringbootEx2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx2Application.class, args);
	}

}
