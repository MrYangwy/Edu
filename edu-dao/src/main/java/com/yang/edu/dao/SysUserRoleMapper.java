package com.yang.edu.dao;

import com.yang.edu.entity.SysUserRole;

import java.util.List;

/**
 * @Author : MrYang
 * @Description :
 * @Date : 2019-11-21
 **/
public interface SysUserRoleMapper {
    List<SysUserRole> getRoleIdByUserId(String userId);
}
