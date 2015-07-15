package com.generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.generate.utils.ConfigurationHelper;
import com.generate.utils.modelDto;
import com.generate.utils.tools;
import com.generate.utils.writecode;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
/**
 * 
 * @author Administrator
 *  功能描述：程序入口
 */
public class codegenerate {
  public static void main(String [] asgs){
	 final String dbtype="mysql";
	 final String Dburl="127.0.0.1:3306/test";
	 final String Tablename="shixin_result";
	 final String Dto_name="shixin_result";
	 final String package_name="com.dinfo.dto";
	 final String author="程军高";
	 final String templedir="/com/generate/temple";
	 final String temfile="Dto.java.ftl";
	 modelDto  dto=new modelDto();
	 dto.setAuthor(author);
	 dto.setModuleName(Dto_name);
	 dto.setPackagename(package_name);
	 dto.setModuleCh("");
	 tools.initialise(dbtype, Dburl, Tablename, dto);
	 Map<String, Object> data = new HashMap<String, Object>();
	 data.put("model", dto);
	 writecode w=new writecode();
	 w.generate(data,templedir,temfile,Dto_name);
  }
  
}
