package com.xbcraisins.wgr.xgrcommonoauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/3/30 20:44
 */
@Controller
public class LoginController {
    /**
     * 自定义登录页面
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
