package com.cloudera.frisch;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;


@SpringBootApplication
public class Application {

	private static List<String> coordinators;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
