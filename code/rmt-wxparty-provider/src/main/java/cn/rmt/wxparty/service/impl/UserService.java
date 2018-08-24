/**
 * cn.rmt.wxparty.service.impl.UserService
 */
package cn.rmt.wxparty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.rmt.framework.service.BaseBusService;
import cn.rmt.wxparty.dao.IUserDAO;
import cn.rmt.wxparty.model.User;
import cn.rmt.wxparty.service.IUserService;
import cn.rmt.wxparty.vo.UserVO;

/**
 * <br>
 * <b>功能：</b>Service<br>
 * <b>作者：</b>luyuan@rm-tech.com.cn<br>
 * <b>日期：</b>2018-08-24<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) 2018<br>
 */
@Service("userService")
@Transactional
public class UserService extends BaseBusService<User,UserVO> implements IUserService {

	@Autowired
	private IUserDAO dao;
	
	@Override
	protected IUserDAO getDao() {
		return dao;
	}

}
