package com.xbcraisins.wgr.xgrcommonservice.service.impl;

import java.util.List;

import com.xbcraisins.wgr.xgrcommonservice.dao.UserDao;
import com.xbcraisins.wgr.xgrcommonservice.service.SysUserService;
import com.xbcraisins.wgr.xgrcommonspi.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysUserServiceImpl  implements SysUserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 查找全部用户信息
	 * @return
	 */
	public List<SysUser> findAll() {
		return userDao.findAll();
	}
	
}
