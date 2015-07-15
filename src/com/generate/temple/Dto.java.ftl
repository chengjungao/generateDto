
package ${model.packagename};
import java.sql.Date;


/**
 * 功能描述：${model.moduleCh}dto
 * 
 * @author: ${model.author}
 * @date: ${model.date} 
 */
public class ${model.moduleName}Dto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 功能描述：有参构造函数,用于将其它dto的属性值赋给该dto的相关属性值
	 * @param obj 赋值dto(source)
	 */
	public ${model.moduleName}Dto(Object obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
	<#list model.list as list>
	/** ${list.filed_Ch} */
	private ${list.fieldType} ${list.fieldName};
	</#list>
	
	<#list model.list as list>
	/**
	 * @return the ${list.fieldName}
	 */
	
	public ${list.fieldType} get${list.fieldName?cap_first}() {
		return ${list.fieldName};
	}
	/**
	 * @param ${list.fieldName} the ${list.fieldName} to set
	 */
	public void set${list.fieldName?cap_first}(${list.fieldType} ${list.fieldName}) {
		this.${list.fieldName} = ${list.fieldName};
	}
	</#list>
	
	

	

	
}
