package com.xbcraisins.wgr.xgrcommonbase.controller;

import com.xbcraisins.wgr.xgrcommonbase.common.entity.Coder;
import com.xbcraisins.wgr.xgrcommonbase.repository.GarphRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/2/20 20:13
 */
@RestController
@RequestMapping("/rest/v1.0.1/database/coder")
public class CoderController {

    @Autowired
    GarphRepository coderRepo;


    @RequestMapping("/get")
    public Coder getCoderByName(@RequestParam(value="name") String name){

        return coderRepo.getCoderByName(name);
    }
}
