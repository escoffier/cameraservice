package com.ac.base.dao;

import com.ac.util.ExtLimit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * DAO基础接口
 * 
 *
 */
public interface BaseMapper<T> {
	
	/**
	 * 插入
	 */
	Integer insert(T t);
	
	/**
	 * 根据ID号修改单个实体
	 */
	Integer updateById(T t);
	
	/**
	 * 根据ID号删除单个实体
	 * @param id
	 */
	void deleteById(long id);
	
	/**
	 * 根据ID号查询单个实体
	 */
	T selectById(long id);
	
	/**
	 * 根据实体对象查询
	 * @return
	 */
	List<T> selectByEntity(T t);
	
	/**
	 * 由分页信息查询分页记录
	 * @return
	 */
	List<T> selectByLimit(@Param("ety") T t, @Param("limit") ExtLimit limit);
	
	
	/**
	 * 为分页查询出记录总数
	 * @return
	 */
	long selectLimitCount(@Param("ety") T t);
}
