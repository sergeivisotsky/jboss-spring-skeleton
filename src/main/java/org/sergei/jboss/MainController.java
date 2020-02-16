package org.sergei.jboss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergei Visotsky
 */
@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public HelloPojo hello() {
        log.info("Hello from Spring MVC application on JBoss");
        return new HelloPojo("Hello from JBoss");
    }

}

class HelloPojo {
    private String helloStatus;

    public HelloPojo(String helloStatus) {
        this.helloStatus = helloStatus;
    }

    public String getHelloStatus() {
        return helloStatus;
    }
}
