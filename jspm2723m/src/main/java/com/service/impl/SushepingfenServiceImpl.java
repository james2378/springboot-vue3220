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


import com.dao.SushepingfenDao;
import com.entity.SushepingfenEntity;
import com.service.SushepingfenService;
import com.entity.vo.SushepingfenVO;
import com.entity.view.SushepingfenView;

@Service("sushepingfenService")
public class SushepingfenServiceImpl extends ServiceImpl<SushepingfenDao, SushepingfenEntity> implements SushepingfenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushepingfenEntity> page = this.selectPage(
                new Query<SushepingfenEntity>(params).getPage(),
                new EntityWrapper<SushepingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushepingfenEntity> wrapper) {
		  Page<SushepingfenView> page =new Query<SushepingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushepingfenVO> selectListVO(Wrapper<SushepingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushepingfenVO selectVO(Wrapper<SushepingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushepingfenView> selectListView(Wrapper<SushepingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushepingfenView selectView(Wrapper<SushepingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<SushepingfenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<SushepingfenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<SushepingfenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
