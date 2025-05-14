package com.jetbrains.testcontainersdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.MySQLContainer;

import java.util.*;

import static java.util.stream.Collectors.*;

public class AbstractTest {

/*

  // docker run -e MYSQL_USERNAME=... -e MYSQL_PASSWORD=... mysql:latest

  //    @Container
  private static MySQLContainer container = new MySQLContainer<>("mysql:8.0.32")
    // reduce the startup time
    .withReuse(true)
    ;
//      .withDatabaseName("somedatabase")
//      .withUsername("root")
//      .withPassword("letsgomarco");


  @BeforeAll
  public static void setup(){
    container.start();
  }

  // Start up time down

  @DynamicPropertySource
  public static void overrideProps(DynamicPropertyRegistry registry) {
    registry.add("spring.datasource.url", container::getJdbcUrl);
    registry.add("spring.datasource.username", container::getUsername);
    registry.add("spring.datasource.password", container::getPassword);
  }
*/

}
