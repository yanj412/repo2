package com.yanj.edu.config;


import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.yanj.edu.mapper")
public class MyBatisPlusConfig{

/**
 * 逻辑删除插件
 * 逻辑删除不是真正的删除，只是将装=状态 设置
 */
    @Bean
    public ISqlInjector sqlInjector() {

        return new LogicSqlInjector();
    }


}
