package com.xbcraisins.wgr.xgrcommoncore.commons.config;

import com.xbcraisins.wgr.xgrcommoncore.commons.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/11 15:40
 */
@Configuration
public class RedisAutoConfigure {

    public RedisUtil redisUtil(){
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.init();
        return redisUtil;
    }
}
