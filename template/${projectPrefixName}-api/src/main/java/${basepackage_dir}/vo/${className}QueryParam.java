<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
/**
 * ${basepackage}.vo.${className}QueryParam
 */
package ${basepackage}.vo;

import ${basepackage}.vo.${className}VO;
import cn.rmt.framework.vo.QueryParam;

/**
 * <br>
 * <b>功能：</b>${table.remarks}查询参数<br>
 * <b>作者：</b>${creator}<br>
 * <b>日期：</b>${.now?string("yyyy-MM-dd")}<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) ${.now?string("yyyy")}<br>
 */
public class ${className}QueryParam extends QueryParam{
	
	private ${className}VO ${classNameLower};

	public ${className}VO get${className}() {
		return ${classNameLower};
	}

	public void set${className}(${className}VO ${classNameLower}) {
		super.setParamBean(${classNameLower});
		this.${classNameLower} = ${classNameLower};
	}
	
}