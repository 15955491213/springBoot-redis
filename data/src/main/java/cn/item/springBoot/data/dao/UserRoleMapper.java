package cn.item.springBoot.data.dao;

import cn.item.springBoot.domain.entity.UserRole;

import java.util.List;

public interface UserRoleMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<UserRole> list();

}
