package com.cloudera.frisch.controller;


import com.cloudera.frisch.service.SimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/app")
public class SimpleController {

  Logger logger = LoggerFactory.getLogger("com.cloudera.frisch.SimpleController");

  @Autowired
  private SimpleService simpleService;

  @PostMapping(value = "/hello")
  public String updateCoordinator(@RequestParam String yourName) {
    logger.info("Received a request from " + yourName);
    String result = simpleService.sayhello(yourName);
    logger.info("Finished to treat request");
    return result;
  }


}
