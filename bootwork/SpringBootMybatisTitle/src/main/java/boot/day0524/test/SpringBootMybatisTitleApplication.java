package boot.day0524.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"data.*","boot.day0524.test"})
@MapperScan("data.*")
public class SpringBootMybatisTitleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisTitleApplication.class, args);
	}

}
