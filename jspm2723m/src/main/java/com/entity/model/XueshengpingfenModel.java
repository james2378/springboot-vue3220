package com.entity.model;

import com.entity.XueshengpingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生评分
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public class XueshengpingfenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 清洁卫生
	 */
	
	private Integer qingjieweisheng;
		
	/**
	 * 文明举止
	 */
	
	private Integer wenmingjuzhi;
		
	/**
	 * 总得分
	 */
	
	private Integer zongdefen;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 评分时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenshijian;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
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
	 * 设置：清洁卫生
	 */
	 
	public void setQingjieweisheng(Integer qingjieweisheng) {
		this.qingjieweisheng = qingjieweisheng;
	}
	
	/**
	 * 获取：清洁卫生
	 */
	public Integer getQingjieweisheng() {
		return qingjieweisheng;
	}
				
	
	/**
	 * 设置：文明举止
	 */
	 
	public void setWenmingjuzhi(Integer wenmingjuzhi) {
		this.wenmingjuzhi = wenmingjuzhi;
	}
	
	/**
	 * 获取：文明举止
	 */
	public Integer getWenmingjuzhi() {
		return wenmingjuzhi;
	}
				
	
	/**
	 * 设置：总得分
	 */
	 
	public void setZongdefen(Integer zongdefen) {
		this.zongdefen = zongdefen;
	}
	
	/**
	 * 获取：总得分
	 */
	public Integer getZongdefen() {
		return zongdefen;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：评分时间
	 */
	 
	public void setPingfenshijian(Date pingfenshijian) {
		this.pingfenshijian = pingfenshijian;
	}
	
	/**
	 * 获取：评分时间
	 */
	public Date getPingfenshijian() {
		return pingfenshijian;
	}
			
}
