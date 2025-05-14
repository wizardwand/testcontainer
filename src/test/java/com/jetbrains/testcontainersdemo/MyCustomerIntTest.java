package com.jetbrains.testcontainersdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import static java.util.stream.Collectors.*;
import static org.assertj.core.api.Assertions.assertThat;

//@EnableMySQLTestContainer
@EnablePostgresTestContainer
public class MyCustomerIntTest {
  @Autowired
  private CustomerDao customerDao;

  @Test
  public void t() {
    List<Customer> customers = customerDao.findAll();
    assertThat(customers).hasSize(2);
  }
}
