package gx.web.euceka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Euceka1Application {

    public static void main(String[] args) {
        System.out.println("你好呀");
        System.out.println("你好呀第二次提交");
        SpringApplication.run(Euceka1Application.class, args);
    }

}
