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
@TableName("com_field")
public class ComField extends Model<ComField> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("field_name")
	private String fieldName;
	@TableField("field_source")
	private String fieldSource;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldSource() {
		return fieldSource;
	}

	public void setFieldSource(String fieldSource) {
		this.fieldSource = fieldSource;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ComField{" +
			", id=" + id +
			", fieldName=" + fieldName +
			", fieldSource=" + fieldSource +
			"}";
	}
}
