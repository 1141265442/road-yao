package com.xlwang.mapper;

import com.xlwang.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xlwang
 * @since 2020-01-11
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<Map> selectAll();
}
