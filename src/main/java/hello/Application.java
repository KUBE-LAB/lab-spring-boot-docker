package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController
public class Application {
    
    private static final Logger logger = LoggerFactory. getLogger(Application.class);

    // @RequestMapping("/")
    // public String home() {
    //     return "Hello Docker World! version 0.1.0";
    // }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.error("error log");
    }

}
