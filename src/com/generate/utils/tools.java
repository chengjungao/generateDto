package com.generate.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class tools {
  public static void  initialise(String dbtype,String url,String tablename,modelDto dto){
	  ResultSet rs=null;
	  DatabaseMetaData dbmd=null;
	  Connection conn=null;
	  try {
		 conn=ConnectDB.getConnection(dbtype, url, "root", "admin");
	     dbmd=conn.getMetaData();
		 rs = dbmd.getColumns(null, "%", tablename, "%");
		
		List<FiledDto> list=new ArrayList<FiledDto>();
		 while(rs.next()){
           // System.out.println(rs.getString("COLUMN_NAME")+"----"+rs.getString("REMARKS")+"   "+rs.getString("DATA_TYPE")+"    "+rs.getShort("NULLABLE"));
		   FiledDto fdto=new FiledDto();
		   fdto.setFiled_Ch(rs.getString("REMARKS"));
		   fdto.setFieldName(rs.getString("COLUMN_NAME"));
		   fdto.setFieldType(rs.getString("DATA_TYPE"));
		   fdto.setNullAble(rs.getString("NULLABLE"));
		   list.add(fdto);
		 }
		dto.setList(list);	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	finally{
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectDB.closeConn(conn);
	}
  }
  public static void main(String [] arg){
	  initialise("mysql","127.0.0.1:3306/zqgg","stock",new modelDto());
  }
}
