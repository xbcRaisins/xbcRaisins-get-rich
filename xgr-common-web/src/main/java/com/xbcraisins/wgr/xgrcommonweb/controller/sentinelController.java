package com.xbcraisins.wgr.xgrcommonweb.controller;

import com.xbcraisins.wgr.xgrcommonspi.dto.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/3/12 22:53
 */
@RestController
@RequestMapping("/sentinel")
public class sentinelController {

    @RequestMapping("/flows")
    public ApiResult<String> sentinelFlows() {
        return new ApiResult<>("data", "message 成功！");
    }
}
