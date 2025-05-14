package com.jetbrains.testcontainersdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;
//import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.output.OutputFrame;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
//@Testcontainers
public class CustomerIntegrationTests extends AbstractTest{
    @Autowired
    private CustomerDao customerDao;

//    @Container
//    private static GenericContainer genericContainer = new GenericContainer<>(
//      "myCompImage:myTag"
//    ).withExposedPorts(9000);




    @Test
    void when_using_a_clean_db_this_should_be_empty() throws IOException, InterruptedException {

//        container.withClasspathResourceMapping(
//          "application.properties",
//          "/tmp/application.properties", BindMode.READ_ONLY);
//        container.withFileSystemBind("C:\\dev\\some.txt","/tmp/bla.txt",BindMode.READ_ONLY);
//        container.execInContainer("ls", "-la");
//        container.getLogs(OutputFrame.OutputType.STDOUT);
//        container.withLogConsumer(new Slf4jLogConsumer(()))
//        Integer portOnMyMachine = container.getMappedPort(3306);
//        System.out.println("mysql port: 3306 , portOnMyMachine = " + portOnMyMachine);

        List<Customer> customers = customerDao.findAll();
        assertThat(customers).hasSize(2);
    }

}
