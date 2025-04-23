package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengpingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengpingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengpingfenView;


/**
 * 学生评分
 *
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public interface XueshengpingfenService extends IService<XueshengpingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengpingfenVO> selectListVO(Wrapper<XueshengpingfenEntity> wrapper);
   	
   	XueshengpingfenVO selectVO(@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);
   	
   	List<XueshengpingfenView> selectListView(Wrapper<XueshengpingfenEntity> wrapper);
   	
   	XueshengpingfenView selectView(@Param("ew") Wrapper<XueshengpingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengpingfenEntity> wrapper);
   	

}

