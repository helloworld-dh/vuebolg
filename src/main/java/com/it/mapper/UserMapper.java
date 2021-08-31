package com.it.mapper;

import com.it.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author anonymous
 * @since 2021-08-31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
