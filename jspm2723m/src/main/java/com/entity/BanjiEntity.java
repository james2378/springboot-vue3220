package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 班级
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-30 15:36:49
 */
@TableName("banji")
public class BanjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanjiEntity() {
		
	}
	
	public BanjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 班级号
	 */
					
	private String banjihao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：班级号
	 */
	public void setBanjihao(String banjihao) {
		this.banjihao = banjihao;
	}
	/**
	 * 获取：班级号
	 */
	public String getBanjihao() {
		return banjihao;
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
