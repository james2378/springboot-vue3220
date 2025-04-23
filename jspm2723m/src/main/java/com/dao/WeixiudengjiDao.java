package com.dao;

import com.entity.WeixiudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiudengjiVO;
import com.entity.view.WeixiudengjiView;


/**
 * 维修登记
 * 
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public interface WeixiudengjiDao extends BaseMapper<WeixiudengjiEntity> {
	
	List<WeixiudengjiVO> selectListVO(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
	WeixiudengjiVO selectVO(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
	List<WeixiudengjiView> selectListView(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);

	List<WeixiudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
	WeixiudengjiView selectView(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	

}
