/**
 * cn.rmt.wxparty.dao.IUserDAO
 */
package cn.rmt.wxparty.dao;

import org.springframework.stereotype.Repository;

import cn.rmt.wxparty.model.User;
import cn.rmt.framework.dao.IBaseEntityDAO;
import cn.rmt.wxparty.vo.UserVO;

/**
 * <br>
 * <b>功能：</b>DAO接口<br>
 * <b>作者：</b>luyuan@rm-tech.com.cn<br>
 * <b>日期：</b>2018-08-24<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) 2018<br>
 */
@Repository
public interface IUserDAO extends IBaseEntityDAO<User,UserVO> {

}
