package com.dao;

import com.entity.XueshengpingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengpingfenVO;
import com.entity.view.XueshengpingfenView;


/**
 * 学生评分
 * 
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public interface XueshengpingfenDao extends BaseMapper<XueshengpingfenEntity> {
	
	List<XueshengpingfenVO> selectListVO(@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);
	
	XueshengpingfenVO selectVO(@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);
	
	List<XueshengpingfenView> selectListView(@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);

	List<XueshengpingfenView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);
	
	XueshengpingfenView selectView(@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);
	

}
