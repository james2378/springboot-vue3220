package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengpingfenDao;
import com.entity.XueshengpingfenEntity;
import com.service.XueshengpingfenService;
import com.entity.vo.XueshengpingfenVO;
import com.entity.view.XueshengpingfenView;

@Service("xueshengpingfenService")
public class XueshengpingfenServiceImpl extends ServiceImpl<XueshengpingfenDao, XueshengpingfenEntity> implements XueshengpingfenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengpingfenEntity> page = this.selectPage(
                new Query<XueshengpingfenEntity>(params).getPage(),
                new EntityWrapper<XueshengpingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengpingfenEntity> wrapper) {
		  Page<XueshengpingfenView> page =new Query<XueshengpingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengpingfenVO> selectListVO(Wrapper<XueshengpingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengpingfenVO selectVO(Wrapper<XueshengpingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengpingfenView> selectListView(Wrapper<XueshengpingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengpingfenView selectView(Wrapper<XueshengpingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
