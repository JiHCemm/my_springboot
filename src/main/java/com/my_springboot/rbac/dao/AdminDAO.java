package com.my_springboot.rbac.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my_springboot.rbac.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my_springboot.user.pojo.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author JiHC
 * @since 2020-08-22
 */
public interface AdminDAO extends BaseMapper<Admin> {

    List<Admin> listByCondition(Page<Admin> page, @Param("admin") Admin admin);

}