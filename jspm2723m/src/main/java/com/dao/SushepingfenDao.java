package com.dao;

import com.entity.SushepingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushepingfenVO;
import com.entity.view.SushepingfenView;


/**
 * 宿舍评分
 * 
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public interface SushepingfenDao extends BaseMapper<SushepingfenEntity> {
	
	List<SushepingfenVO> selectListVO(@Param("ew") Wrapper<SushepingfenEntity> wrapper);
	
	SushepingfenVO selectVO(@Param("ew") Wrapper<SushepingfenEntity> wrapper);
	
	List<SushepingfenView> selectListView(@Param("ew") Wrapper<SushepingfenEntity> wrapper);

	List<SushepingfenView> selectListView(Pagination page,@Param("ew") Wrapper<SushepingfenEntity> wrapper);
	
	SushepingfenView selectView(@Param("ew") Wrapper<SushepingfenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<SushepingfenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<SushepingfenEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<SushepingfenEntity> wrapper);
}
