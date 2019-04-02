package com.xbcraisins.wgr.xgrcommonservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.xbcraisins.wgr.xgrcommonservice.dao"})
public class XgrCommonServiceApplication {

    /**
     * 启动http 监听 oauth2
     * @date 2019/4/1 9:15
     * @author xbcRaisins
     * @param
     * @return org.springframework.web.context.request.RequestContextListener
     */
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }

    @RestController
    class EchoController {
        @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string;
        }
    }


    public static void main(String[] args) {
        SpringApplication.run(XgrCommonServiceApplication.class, args);
    }

}
