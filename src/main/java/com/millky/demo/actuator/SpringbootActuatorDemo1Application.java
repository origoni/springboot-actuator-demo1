package com.millky.demo.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringbootActuatorDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActuatorDemo1Application.class, args);
    }
}
