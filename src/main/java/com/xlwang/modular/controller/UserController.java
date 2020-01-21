package com.xlwang.modular.controller;


import com.xlwang.core.annotion.BussinessLog;
import com.xlwang.core.constant.ConstantFactory;
import com.xlwang.modular.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author xlwang
 * @since 2020-01-20
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping
    public Object getList(){
        log.info("查询用户");
        //return userMapper.selectList(null);
        return ConstantFactory.me().selectAllUser();
    }

    @BussinessLog(value = "查询用户",key = "123")
    @RequestMapping("/add")
    public boolean inser(){
        User user = new User();
        user.setName("name"+new Random(100));
        return user.insert();
    }

}
