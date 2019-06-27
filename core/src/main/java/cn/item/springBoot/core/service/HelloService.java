package cn.item.springBoot.core.service;

import cn.item.springBoot.domain.entity.UserRole;

import java.util.List;

public interface HelloService {
    String sayHello();

    List<UserRole> list();
}
