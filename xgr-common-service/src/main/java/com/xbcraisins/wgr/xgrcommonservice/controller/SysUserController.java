package com.xbcraisins.wgr.xgrcommonservice.controller;

import com.xbcraisins.wgr.xgrcommonservice.service.SysUserService;
import com.xbcraisins.wgr.xgrcommonspi.dto.ApiResult;
import com.xbcraisins.wgr.xgrcommonspi.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 *
 * @author Louis
 * @date Oct 31, 2018
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/all")
    public List<SysUser> findAll() {

        return sysUserService.findAll();
    }

    public Object findAll2() {
        return sysUserService.findAll();
    }

}
