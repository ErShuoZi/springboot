package com.springboot;

import com.springboot.bean.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication:表示是SpringBoot应用
//SpringBootApplication可以增加指定要扫描的包
@SpringBootApplication(scanBasePackages = {"com"})
public class MainApp {
    public static void main(String[] args) {
        //启动springboot
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class, args);

        //Spring中传统注解依然可以使用@Controller @Service @Repository ..
        A abean = ioc.getBean(A.class);
        System.out.println("abean--" + abean);

    }
}
