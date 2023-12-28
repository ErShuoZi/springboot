package com.springboot;

import com.springboot.bean.A;
import com.springboot.bean.Monster;
import com.springboot.config.BeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication:表示是SpringBoot应用
//SpringBootApplication可以增加指定要扫描的包
@SpringBootApplication(scanBasePackages = {"com"})
public class MainApp {
    public static void main(String[] args) {
        //启动springboot
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class, args);

        //Spring中传统注解依然可以使用@Controller @Service @Repository ..
//        A abean = ioc.getBean(A.class);
//        System.out.println("abean--" + abean);

//        srpingboot中依然可以使用spring的配置bean，注入bean，获取bean的方式(传统方式)
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        Monster monster03 = ac.getBean("monster03", Monster.class);
//        System.out.println(monster03);


//        获取通过注解注入的bean
//        Monster monster01 = ioc.getBean("monster01", Monster.class);
//        Monster monster02 = ioc.getBean("monster01", Monster.class);
//        System.out.println("monster01--" + monster01 + " " + monster01.hashCode() );
//        System.out.println("monster02--" + monster02+ " " + monster02.hashCode()  );
//
//        BeanConfig bean = ioc.getBean(BeanConfig.class);
//        System.out.println("bean--" + bean);


//        先得到beanConfig
//        BeanConfig beanConfig = ioc.getBean(BeanConfig.class);
//        Monster monster_01 = beanConfig.monster01();
//        Monster monster_02 = beanConfig.monster01();
//        System.out.println("monster_01--" + monster_01 + " " + monster_01.hashCode() );
//        System.out.println("monster_02--" + monster_02+ " " + monster_02.hashCode());

//特别说明: proxyBeanMethods 是在 调用@Bean 方法 才生效，因此，需要先获取 BeanConfig 组件，再调用方法
// 而不是直接通过 SpringBoot 主程序得到的容器来获取 bean, 注意观察直接通过 ioc.getBean() 获取 Bean, proxyBeanMethods 值并没有生效
//        Monster monster01 = ioc.getBean("monster01", Monster.class);
//        Monster monster02 = ioc.getBean("monster01", Monster.class);
//        System.out.println("monster_01--" + monster01 + " " + monster01.hashCode() );
//        System.out.println("monster_02--" + monster02+ " " + monster02.hashCode());

//        测试可以有多个配置类
        Monster monster02 = ioc.getBean("monster02", Monster.class);
        System.out.println("monster02 =" + monster02 );

    }
}
