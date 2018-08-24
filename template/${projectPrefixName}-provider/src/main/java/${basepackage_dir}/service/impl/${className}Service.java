<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign classVOName = table.className + 'VO'>   
/**
 * ${basepackage}.service.impl.${className}Service
 */
package ${basepackage}.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.rmt.framework.service.BaseBusService;
import ${basepackage}.dao.I${className}DAO;
import ${basepackage}.model.${className};
import ${basepackage}.service.I${className}Service;
import ${basepackage}.vo.${className}VO;

/**
 * <br>
 * <b>功能：</b>${table.remarks}Service<br>
 * <b>作者：</b>${creator}<br>
 * <b>日期：</b>${.now?string("yyyy-MM-dd")}<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) ${.now?string("yyyy")}<br>
 */
@Service("${classNameLower}Service")
@Transactional
public class ${className}Service extends BaseBusService<${className},${classVOName}> implements I${className}Service {

	@Autowired
	private I${className}DAO dao;
	
	@Override
	protected I${className}DAO getDao() {
		return dao;
	}

}
