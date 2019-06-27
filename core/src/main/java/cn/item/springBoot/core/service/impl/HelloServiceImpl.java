package cn.item.springBoot.core.service.impl;

import cn.item.springBoot.core.service.HelloService;
import cn.item.springBoot.data.dao.UserRoleMapper;
import cn.item.springBoot.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public String sayHello() {
        return "say hello java";
    }

    public List<UserRole> list(){
        List<UserRole> list = userRoleMapper.list();
        return list;
    }
}
