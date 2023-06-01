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
        System.out.println("hot-fix第一次修复");
        System.out.println("master 分支测试");
        System.out.println("hot-fix第二次修复");
        System.out.println("日常练习");
         System.out.println("git 服务端进行了修改");

        SpringApplication.run(Euceka1Application.class, args);
    }

}
