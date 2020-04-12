package com.zdw.helloworld;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zdb
 * @date 2020-04-12 21:18
 */
@EnableServiceComb
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
