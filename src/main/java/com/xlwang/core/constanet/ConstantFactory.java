package com.xlwang.core.constanet;

import com.xlwang.core.util.SpringContextHolder;
import com.xlwang.modular.mapper.SysUserMapper;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@DependsOn("springContextHolder")
public class ConstantFactory {
    private SysUserMapper userMapper = SpringContextHolder.getBean(SysUserMapper.class);

    public static ConstantFactory me() {
        return SpringContextHolder.getBean("constantFactory");
    }

    public List<Map> selectAllUser(){
        return userMapper.selectAll();
    }
}
