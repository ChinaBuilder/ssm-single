package com.it.mapper;

import com.it.pojo.SysUser;

public interface SysUserMapper {
	int deleteByPrimaryKey(Long sysUserId);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	SysUser selectByPrimaryKey(Long sysUserId);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);
}