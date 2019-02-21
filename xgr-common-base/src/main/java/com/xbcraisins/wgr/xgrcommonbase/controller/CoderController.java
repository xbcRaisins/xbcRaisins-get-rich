package com.xbcraisins.wgr.xgrcommonbase.controller;

import com.xbcraisins.wgr.xgrcommonbase.common.entity.Coder;
import com.xbcraisins.wgr.xgrcommonbase.repository.GarphRepository;
import com.xbcraisins.wgr.xgrcommonspi.dto.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/2/20 20:13
 */
@RestController
@RequestMapping("/rest/v1.0.1/database/coder")
public class CoderController {

    Logger logger = LoggerFactory.getLogger(CoderController.class);

    @Autowired
    GarphRepository coderRepo;


    @RequestMapping("/get")
    public Coder getCoderByName(@RequestParam(value = "name") String name) {

        return coderRepo.getCoderByName(name);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ApiResult create(Coder coder) throws Exception {

        logger.info("输入参数对象：{}", coder.toString());

        return new ApiResult<>(coderRepo.save(coder));
    }
}
