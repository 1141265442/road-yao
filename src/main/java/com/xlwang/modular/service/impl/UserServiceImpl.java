package com.xlwang.modular.service.impl;

import com.xlwang.modular.entity.User;
import com.xlwang.modular.mapper.UserMapper;
import com.xlwang.modular.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author xlwang
 * @since 2020-01-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
