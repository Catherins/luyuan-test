<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
<#assign classVOName = table.className + 'VO'>     
/**
 * ${basepackage}.dao.I${className}DAO
 */
package ${basepackage}.dao;

import org.springframework.stereotype.Repository;

import ${basepackage}.model.${className};
import cn.rmt.framework.dao.IBaseEntityDAO;
import ${basepackage}.vo.${classVOName};

/**
 * <br>
 * <b>功能：</b>${table.remarks}DAO接口<br>
 * <b>作者：</b>${creator}<br>
 * <b>日期：</b>${.now?string("yyyy-MM-dd")}<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) ${.now?string("yyyy")}<br>
 */
@Repository
public interface I${className}DAO extends IBaseEntityDAO<${className},${classVOName}> {

}
