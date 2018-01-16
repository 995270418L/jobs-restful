package com.steve.jobsjson.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author steve
 * @since 2017-12-31
 */
@TableName("com_tag_r")
public class ComTagR extends Model<ComTagR> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("com_id")
	private String comId;
	@TableField("tag_id")
	private String tagId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ComTagR{" +
			", id=" + id +
			", comId=" + comId +
			", tagId=" + tagId +
			"}";
	}
}
