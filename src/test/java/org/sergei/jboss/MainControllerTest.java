package org.sergei.jboss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sergei Visotsky
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:testContext.xml")
public class MainControllerTest {

    @Autowired
    private MainController controller;

    @Test
    void helloTest() {
        HelloPojo hello = controller.hello();
        assertEquals("Hello from JBoss", hello.getHelloStatus());
    }

}
