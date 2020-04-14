package com.lh.xymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-Plus
 *      1)、导入依赖
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *          </dependency>
 *      2）、配置
 *          1、配置数据源；
 *              1）、导入数据库的驱动
 *              2）、在application.yml配置数据源相关信息
 *          2、配置Mybatis-Plus
 *              1)、使用@MapperScan
 *              2)、告诉Mybatis-Plus，sql文件映射位置
 */
@MapperScan("com.lh.xymall.product.dao")
@SpringBootApplication
public class XymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XymallProductApplication.class, args);
    }

}
