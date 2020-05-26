package com.test.emailbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients("com.test.emailbatch")
public class EmailBatchApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EmailBatchApplication.class, args);
	}

}
