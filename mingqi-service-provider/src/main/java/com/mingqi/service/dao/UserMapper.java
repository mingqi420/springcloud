package com.mingqi.service.dao;

import com.mingqi.service.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
