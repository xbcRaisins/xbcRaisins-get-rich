package com.xbcraisins.wgr.xgrcommonservice.dao;

import com.xbcraisins.wgr.xgrcommonspi.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/4/2 14:02
 */
@Repository
public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> findAll();
}
