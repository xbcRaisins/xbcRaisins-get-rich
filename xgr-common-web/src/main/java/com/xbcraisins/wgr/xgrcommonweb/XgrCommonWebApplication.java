package com.xbcraisins.wgr.xgrcommonweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XgrCommonWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XgrCommonWebApplication.class, args);
    }

}
