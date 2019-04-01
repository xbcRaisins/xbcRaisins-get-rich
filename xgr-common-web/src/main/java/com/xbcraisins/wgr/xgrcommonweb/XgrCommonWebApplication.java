package com.xbcraisins.wgr.xgrcommonweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextListener;


@SpringBootApplication
@EnableDiscoveryClient
public class XgrCommonWebApplication extends SpringBootServletInitializer {


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

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RestController
    public class TestController {

        private final RestTemplate restTemplate;

        @Autowired
        public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

        @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
        public String echo(@PathVariable String str) {
            return restTemplate.getForObject("http://xgr-common-service/echo/" + str, String.class);
        }
    }

    public static void main(String[] args) {

        SpringApplication.run(XgrCommonWebApplication.class, args);
    }

}
