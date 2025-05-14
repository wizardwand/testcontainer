package com.jetbrains.testcontainersdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
//import org.testcontainers.containers.MySQLContainer;

import java.util.*;

import static java.util.stream.Collectors.*;

public class MySQLTestContainerExtension {
/*public class MySQLTestContainerExtension implements BeforeAllCallback {

  private static final MySQLContainer<?> container = new MySQLContainer<>("mysql:8.0.32");

  static {
    container.start();
  }

  @Override
  public void beforeAll(ExtensionContext extensionContext) throws Exception {
    System.setProperty("spring.datasource.url", container.getJdbcUrl());
    System.setProperty("spring.datasource.username", container.getUsername());
    System.setProperty("spring.datasource.password", container.getPassword());
  }
  */
}
