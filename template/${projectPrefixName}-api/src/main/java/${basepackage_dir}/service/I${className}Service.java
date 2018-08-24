<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign classVOName = table.className + 'VO'>   
/**
 * ${basepackage}.service.I${className}Service
 */
package ${basepackage}.service;

import cn.rmt.framework.service.IBaseBusService;
import ${basepackage}.vo.${classVOName};

/**
 * <br>
 * <b>功能：</b>${table.remarks}Service<br>
 * <b>作者：</b>${creator}<br>
 * <b>日期：</b>${.now?string("yyyy-MM-dd")}<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) ${.now?string("yyyy")}<br>
 */
public interface I${className}Service extends IBaseBusService<${classVOName}> {

}
