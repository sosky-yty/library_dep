package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-03 23:12:24
 */
@TableName("tb_resource")
public class ResourceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private Integer isHide;
	/**
	 * 
	 */
	private Integer level;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 
	 */
	private String sourceKey;
	/**
	 * 
	 */
	private String sourceUrl;
	/**
	 * 
	 */
	private Integer type;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Integer parentId;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：
	 */
	public void setIsHide(Integer isHide) {
		this.isHide = isHide;
	}
	/**
	 * 获取：
	 */
	public Integer getIsHide() {
		return isHide;
	}
	/**
	 * 设置：
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：
	 */
	public void setSourceKey(String sourceKey) {
		this.sourceKey = sourceKey;
	}
	/**
	 * 获取：
	 */
	public String getSourceKey() {
		return sourceKey;
	}
	/**
	 * 设置：
	 */
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	/**
	 * 获取：
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}
	/**
	 * 设置：
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public Integer getParentId() {
		return parentId;
	}
}
