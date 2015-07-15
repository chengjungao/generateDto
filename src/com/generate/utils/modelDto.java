package com.generate.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class modelDto {
  private String packagename;//包名
  private String moduleCh;//中文注释
  private String moduleName;//类名
  private String author;//作者
  private String date;//时间
  private List<FiledDto> list;//
public String getPackagename() {
	return packagename;
}
public void setPackagename(String packagename) {
	this.packagename = packagename;
}
public String getModuleCh() {
	return moduleCh;
}
public void setModuleCh(String moduleCh) {
	this.moduleCh = moduleCh;
}
public String getModuleName() {
	return moduleName;
}
public void setModuleName(String moduleName) {
	this.moduleName = moduleName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getDate() {
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	return df.format(new Date());
}
public void setDate(String date) {
	
	this.date = date;
}
public List<FiledDto> getList() {
	return list;
}
public void setList(List<FiledDto> list) {
	this.list = list;
}
}
