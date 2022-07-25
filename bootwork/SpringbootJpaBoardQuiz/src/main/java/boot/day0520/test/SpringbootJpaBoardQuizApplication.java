package boot.day0520.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"board.*"})
@EntityScan("board.data") //dto인식
@EnableJpaRepositories("board.data")//dao인식
public class SpringbootJpaBoardQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaBoardQuizApplication.class, args);
	}

}
