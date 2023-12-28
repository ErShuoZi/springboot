package com.springboot.config;

import com.springboot.bean.Monster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 1.@Configuration表示是配置类，等价于配置文件
 * 2.可以通过@Bean注解注入bean对象到容器
 * 3.当类被@Configuration标示，该类也会也会注入到容器中
 * 4.proxyBeanMethods = false：保证每个bean方法默认是单例的
 *  @version 1.0
 *  1. proxyBeanMethods:代理 bean 的方法
 *  (1) Full(proxyBeanMethods = true)、【保证每个@Bean 方法被调用多少次返回的组件都是 单实例的, 是代理方式】
 *  (2) Lite(proxyBeanMethods = false)【每个@Bean 方法被调用多少次返回的组件都是新创 建的, 是非代理方式】
 *  (3) 特别说明: proxyBeanMethods 是在 调用@Bean 方法 才生效，因此，需要先获取 BeanConfig 组件，再调用方法
 *  而不是直接通过 SpringBoot 主程序得到的容器来获取 bean, 注意观察直接通过 ioc.getBean() 获取 Bean, proxyBeanMethods 值并没有生效
 *  (4) 如何选择: 组件依赖必须使用 Full 模式默认。如果不需要组件依赖使用 Lite 模 * (5) Lite 模 也称为轻量级模式，因为不检测依赖关系，运行速度快
 *
 */
@Configuration
public class BeanConfig {
    /**
     * 1.@Bean 给容器注入了一个组件，就是 Monster bean
     * 2.monster01方法名就是在容器中的id
     * 3.Monster 注入类型
     * 4.new Monster(200,"牛魔王",500,"疯魔拳") 容器中的bean具体信息
     * 5. @Bean(name="monster_nmw") 在配置、注入bean指定名字，如果不指定，则以方法名作为bean的名字
     */
//    @Bean(name="monster_nmw")
    @Bean
//    @Scope("prototype") //多例
    public Monster monster01() {
        return new Monster(200,"牛魔王",500,"疯魔拳");
    }
}
