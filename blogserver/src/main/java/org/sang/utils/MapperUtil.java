package org.sang.utils;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper的通用接口
 * @param <T>
 */
public interface MapperUtil<T> extends Mapper<T>, MySqlMapper<T>, ConditionMapper<T>, IdsMapper<T> {

}
