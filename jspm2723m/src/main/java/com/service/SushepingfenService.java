package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushepingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushepingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushepingfenView;


/**
 * 宿舍评分
 *
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public interface SushepingfenService extends IService<SushepingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushepingfenVO> selectListVO(Wrapper<SushepingfenEntity> wrapper);
   	
   	SushepingfenVO selectVO(@Param("ew") Wrapper<SushepingfenEntity> wrapper);
   	
   	List<SushepingfenView> selectListView(Wrapper<SushepingfenEntity> wrapper);
   	
   	SushepingfenView selectView(@Param("ew") Wrapper<SushepingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushepingfenEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<SushepingfenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<SushepingfenEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<SushepingfenEntity> wrapper);
}

