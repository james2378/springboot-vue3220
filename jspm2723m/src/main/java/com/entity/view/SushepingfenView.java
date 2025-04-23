package com.entity.view;

import com.entity.SushepingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
@TableName("sushepingfen")
public class SushepingfenView  extends SushepingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushepingfenView(){
	}
 
 	public SushepingfenView(SushepingfenEntity sushepingfenEntity){
 	try {
			BeanUtils.copyProperties(this, sushepingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
