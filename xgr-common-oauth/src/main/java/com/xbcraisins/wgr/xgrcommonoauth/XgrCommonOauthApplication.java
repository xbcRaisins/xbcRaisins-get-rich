package com.xbcraisins.wgr.xgrcommonoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
public class XgrCommonOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XgrCommonOauthApplication.class, args);
    }

}
