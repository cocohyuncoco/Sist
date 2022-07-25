package boot.day0523.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"data.*"})
@MapperScan("data.*")
public class SpringbootMybatisEx4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisEx4Application.class, args);
	}

}
