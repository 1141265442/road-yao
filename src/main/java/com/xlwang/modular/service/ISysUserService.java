package com.xlwang.modular.service;

import com.xlwang.modular.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xlwang
 * @since 2020-01-11
 */
public interface ISysUserService extends IService<SysUser> {
     List<Map> selectAll();
}
