package com.cloudera.frisch.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@Getter
@EnableScheduling
@EnableAsync
@Configuration
public class MainConfig {


    @Value("${app.port}")
    private String port;


}
