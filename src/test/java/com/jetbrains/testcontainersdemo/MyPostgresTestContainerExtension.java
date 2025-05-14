package com.jetbrains.testcontainersdemo;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.PostgreSQLContainer;

public class MyPostgresTestContainerExtension implements BeforeAllCallback {

  private static final PostgreSQLContainer container = new PostgreSQLContainer<>("postgres:17.5");

//  private static final PostgreSQLContainer<?> container = new PostgreSQLContainer<>("postgres:15")
//    .withReuse(true)
//    .withDatabaseName("testdb")
//    .withUsername("testuser")
//    .withPassword("testpass");

  static {
    container.start();
  }

  @Override
  public void beforeAll(ExtensionContext extensionContext) throws Exception {
    System.out.println("container.getPassword() + container.getUsername() = " + container.getPassword() + container.getUsername());
    System.setProperty("spring.datasource.url", container.getJdbcUrl());
    System.setProperty("spring.datasource.username", container.getUsername());
    System.setProperty("spring.datasource.password", container.getPassword());
  }
}
