package com.xbcraisins.wgr.xgrcommonweb.service.impl;

import com.xbcraisins.wgr.xgrcommonspi.entity.SysUser;
import com.xbcraisins.wgr.xgrcommonweb.repository.UserDao;
import com.xbcraisins.wgr.xgrcommonweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/3/25 21:39
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Cacheable(cacheNames = "authority", key = "#username")
    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
