package com.xlwang.core.constant;

import com.xlwang.core.util.SpringContextHolder;
import com.xlwang.modular.entity.User;
import com.xlwang.modular.mapper.UserMapper;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@DependsOn("springContextHolder")
public class ConstantFactory {
    private UserMapper userMapper = SpringContextHolder.getBean(UserMapper.class);

    public static ConstantFactory me() {
        return SpringContextHolder.getBean("constantFactory");
    }

    public List<User> selectAllUser(){
        return userMapper.selectList(null);
    }
}
