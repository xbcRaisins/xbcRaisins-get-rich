package com.xbcraisins.wgr.xgrcommonservice.service;

import com.xbcraisins.wgr.xgrcommonspi.entity.SysUser;

import java.util.List;


/**
 * 用户管理
 * @author Louis
 * @date Oct 31, 2018
 */
public interface SysUserService {

	/**
	 * 查找全部用户信息
	 * @return
	 */
	List<SysUser> findAll();
}
