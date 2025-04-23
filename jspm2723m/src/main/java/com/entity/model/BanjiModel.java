package com.entity.model;

import com.entity.BanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 班级
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-30 15:36:49
 */
public class BanjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 班级人数
	 */
	
	private Integer banjirenshu;
		
	/**
	 * 辅导员
	 */
	
	private String fudaoyuan;
		
	/**
	 * 学生名单
	 */
	
	private String xueshengmingdan;
				
	
	/**
	 * 设置：班级名称
	 */
	 
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(Integer banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public Integer getBanjirenshu() {
		return banjirenshu;
	}
				
	
	/**
	 * 设置：辅导员
	 */
	 
	public void setFudaoyuan(String fudaoyuan) {
		this.fudaoyuan = fudaoyuan;
	}
	
	/**
	 * 获取：辅导员
	 */
	public String getFudaoyuan() {
		return fudaoyuan;
	}
				
	
	/**
	 * 设置：学生名单
	 */
	 
	public void setXueshengmingdan(String xueshengmingdan) {
		this.xueshengmingdan = xueshengmingdan;
	}
	
	/**
	 * 获取：学生名单
	 */
	public String getXueshengmingdan() {
		return xueshengmingdan;
	}
			
}
