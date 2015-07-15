package com.generate.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class writecode {
	public void generate(Map data,String templedir,String temfile,String dtoname){
		  Template t = null;
		  Configuration configuration =null;
		  configuration = new Configuration();
		  configuration.setDefaultEncoding("UTF-8");//设置默认编码方式
		  configuration.setClassForTemplateLoading(this.getClass(),templedir);
		  try {
			  t=configuration.getTemplate(temfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  String temDir=System.getProperty("user.dir");
		  File output = new File(temDir+"/"+dtoname+"Dto.java");
		  Writer   writer  =null; 
	      try {
	    	  writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output),"UTF-8"));
	    	  t.process(data, writer);
			  writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
