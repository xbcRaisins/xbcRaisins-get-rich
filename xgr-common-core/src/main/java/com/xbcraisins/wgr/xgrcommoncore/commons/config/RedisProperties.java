package com.xbcraisins.wgr.xgrcommoncore.commons.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/11 15:41
 */
@Component
@ConfigurationProperties(prefix = "xbc.cache.redis")
public class RedisProperties {

    /**
     * 缓存key 统一前缀
     */
    private String prefix;

    /**
     * 缓存服务IP
     */
    private String ip;
    /**
     * 端口
     */
    private Integer port;

    /**
     * 密码
     */
    private String password;

    /**
     * 最大空闲连接数
     */
    private int maxIdle;

    /**
     * 最大连接数
     */
    private int maxTotal;

    /**
     * 最大等待毫秒数
     */
    private int maxWaitMillis;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(int maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }
}
