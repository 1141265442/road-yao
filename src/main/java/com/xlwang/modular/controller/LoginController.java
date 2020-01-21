package com.xlwang.modular.controller;

import com.xlwang.core.msg.RoadYaoException;
import com.xlwang.core.msg.SuccessTip;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.xlwang.core.msg.exception.ExceptionEnum.TIME_OUT;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    public Object login(){
        throw new RoadYaoException(TIME_OUT);
        //return new SuccessTip();
    }


}
