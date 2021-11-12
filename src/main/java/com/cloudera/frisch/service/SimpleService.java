package com.cloudera.frisch.service;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SimpleService {

  Logger logger = LoggerFactory.getLogger("com.cloudera.frisch.SimpleService");

  public String sayhello(String name) {
    return "Hello " + name;
  }
}
