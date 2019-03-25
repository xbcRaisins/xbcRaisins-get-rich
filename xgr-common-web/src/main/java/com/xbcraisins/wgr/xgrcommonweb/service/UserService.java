package com.xbcraisins.wgr.xgrcommonweb.service;

import com.xbcraisins.wgr.xgrcommonspi.entity.SysUser;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/3/25 21:38
 */
public interface UserService {

    SysUser getUserByName(String username);
}
