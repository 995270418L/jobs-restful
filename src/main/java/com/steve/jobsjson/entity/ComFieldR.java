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
@TableName("com_field_r")
public class ComFieldR extends Model<ComFieldR> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("com_id")
	private String comId;
	@TableField("field_id")
	private String fieldId;


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

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ComFieldR{" +
			", id=" + id +
			", comId=" + comId +
			", fieldId=" + fieldId +
			"}";
	}
}
