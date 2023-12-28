package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
//方式一
//@Component
//@ConfigurationProperties(prefix="furn01")

//方式二
//把Furn组件自动注册到容器中
//@EnableConfigurationProperties(Furn.class)
@ConfigurationProperties(prefix="furn01")

public class Furn {
    private Integer id;
    private String  name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
