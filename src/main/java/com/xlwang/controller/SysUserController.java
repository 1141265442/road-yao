package com.xlwang.controller;


import com.xlwang.entity.SysUser;
import com.xlwang.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xlwang
 * @since 2020-01-11
 */
@Slf4j
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

    @RequestMapping
    public Object getList(){
        log.info("查询用户");
        return iSysUserService.selectAll();
    }

    @RequestMapping("/add")
    public boolean inser(){
        SysUser sysUser = new SysUser();
        sysUser.setName("name"+new Random(100));
        return sysUser.insert();
    }

}
