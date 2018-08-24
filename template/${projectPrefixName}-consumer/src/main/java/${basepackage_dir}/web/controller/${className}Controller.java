<#include "/custom.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>  
/**
 * ${basepackage}.web.controller.${className}Controller
 */
package ${basepackage}.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.rmt.framework.web.controller.BaseCrudController;

import ${basepackage}.service.I${className}Service;
import ${basepackage}.vo.${className}VO;
import ${basepackage}.vo.${className}QueryParam;

/**
 * <br>
 * <b>功能：</b>详细的功能描述<br>
 * <b>作者：</b>${creator}<br>
 * <b>日期：</b>${.now?string("yyyy-MM-dd")}<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) ${.now?string("yyyy")}<br>
 */
@Controller
@RequestMapping("${baseurl}")
public class ${className}Controller extends BaseCrudController<${className}VO,${className}QueryParam> {

	@Autowired
	private I${className}Service ${classNameLower}Service;

	@Override
	protected String getBaseUrl() {
		return "${baseurl}";
	}
	
	@Override
	protected I${className}Service getBaseService() {
		return  ${classNameLower}Service;
	}
}
