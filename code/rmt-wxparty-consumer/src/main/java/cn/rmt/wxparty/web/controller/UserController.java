/**
 * cn.rmt.wxparty.web.controller.UserController
 */
package cn.rmt.wxparty.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.rmt.framework.web.controller.BaseCrudController;

import cn.rmt.wxparty.service.IUserService;
import cn.rmt.wxparty.vo.UserVO;
import cn.rmt.wxparty.vo.UserQueryParam;

/**
 * <br>
 * <b>功能：</b>详细的功能描述<br>
 * <b>作者：</b>luyuan@rm-tech.com.cn<br>
 * <b>日期：</b>2018-08-24<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) 2018<br>
 */
@Controller
@RequestMapping("/wxparty/generalBranchCommon")
public class UserController extends BaseCrudController<UserVO,UserQueryParam> {

	@Autowired
	private IUserService userService;

	@Override
	protected String getBaseUrl() {
		return "/wxparty/generalBranchCommon";
	}
	
	@Override
	protected IUserService getBaseService() {
		return  userService;
	}
}
