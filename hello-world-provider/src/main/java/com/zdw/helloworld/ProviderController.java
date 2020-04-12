package com.zdw.helloworld;

import com.zdw.helloworld.api.HelloWorldInterfaces;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zdb
 * @date 2020-04-12 21:21
 */
@RestController
@RestSchema(schemaId = "providerController")
public class ProviderController implements HelloWorldInterfaces {

    @GetMapping("hello")
    @Override
    public String sayHello(String name) {
        System.out.println("名称是："+name);
        return "请求成功，返回名称："+name;
    }

}
