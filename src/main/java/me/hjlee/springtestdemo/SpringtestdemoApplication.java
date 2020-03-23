package me.hjlee.springtestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtestdemoApplication {

	public static void main(String[] args) {
		//기본적인 스프링 어플리케이션 시작방법
		SpringApplication.run(SpringtestdemoApplication.class, args);

		//스프링 어플리케이션을 커스터마이징 할 수 있게 인스턴스화.
		//SpringApplication app = new SpringApplication(SpringtestdemoApplication.class);
		//app.run(args);
	}
}
