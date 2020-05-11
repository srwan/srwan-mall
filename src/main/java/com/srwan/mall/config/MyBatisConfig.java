package com.srwan.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @author bzq
 */

@Configuration
@MapperScan({"com.srwan.mall.mbg.mapper","com.srwan.mall.dao"})
public class MyBatisConfig {

}
