package com.furn.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DruidDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    //配置Druid数据源
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        log.info("数据源=" + druidDataSource.getClass());
        return druidDataSource;
    }
}
