package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Note:
 * Date: 2023/7/6 18:37
 * Author: shihy
 */

@SpringBootApplication
@EnableCaching
//@MapperScan({"com.example.aop"})
public class TransactionApplication {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/shihy/Downloads/demo1/target/classes/com/example/demo");
        SpringApplication.run(TransactionApplication.class, args);
    }

}
