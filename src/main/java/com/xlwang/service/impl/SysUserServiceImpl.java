package com.xlwang.service.impl;

import com.xlwang.entity.SysUser;
import com.xlwang.mapper.SysUserMapper;
import com.xlwang.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xlwang
 * @since 2020-01-11
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<Map> selectAll(){
        return sysUserMapper.selectAll();
    };
}
