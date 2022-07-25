package boot.day0520.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"mycar.data"}) //패키지인식
@EntityScan("mycar.data") //dto인식
@EnableJpaRepositories("mycar.data")//dao인식
public class SpringbootJpaEx3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaEx3Application.class, args);
	}

}
