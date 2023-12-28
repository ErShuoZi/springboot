package com.springboot.config;

import com.springboot.bean.Cat;
import com.springboot.bean.Dog;
import com.springboot.bean.Monster;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


@Configuration
//导入beans.xml - 就可以获取到beans.xml文件中注入的bean
@ImportResource(value = {"classpath:beans.xml"})
//@ImportResource(locations = "classpath:beans.xml")
public class BeanConfig03 {

}
