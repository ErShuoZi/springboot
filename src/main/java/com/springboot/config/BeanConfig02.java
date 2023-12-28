package com.springboot.config;

import com.springboot.bean.Monster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 第二个配置类
 */
@Configuration
public class BeanConfig02 {
    @Bean
    public Monster monster02() {
        return new Monster(500,"蚂蚁",80,"哈哈");
    }
}
