package com.generate.utils;

public class FiledDto {
	/**
	 * 字段名
	 */
  String fieldName;
  /**
	 * 字段数据类型
	 */
  String fieldType;
  /**
	 * 是否允许为空
	 */
  String nullAble;
  /**
	 * 字段注释
	 */
  String filed_Ch;
public String getFieldName() {
	return fieldName;
}
public void setFieldName(String fieldName) {
	this.fieldName = fieldName;
}
public String getFieldType() {
	if(fieldType.equals("91")||fieldType.equals("93"))
	{
		return "Date";
	}else
	{
		return "String";
	}
	
}
public void setFieldType(String fieldType) {
	this.fieldType = fieldType;
}
public String getNullAble() {
	return nullAble;
}
public void setNullAble(String nullAble) {
	this.nullAble = nullAble;
}
public String getFiled_Ch() {
	return filed_Ch;
}
public void setFiled_Ch(String filed_Ch) {
	this.filed_Ch = filed_Ch;
}
}
