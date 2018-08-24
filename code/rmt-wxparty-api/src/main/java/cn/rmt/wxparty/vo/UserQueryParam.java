/**
 * cn.rmt.wxparty.vo.UserQueryParam
 */
package cn.rmt.wxparty.vo;

import cn.rmt.wxparty.vo.UserVO;
import cn.rmt.framework.vo.QueryParam;

/**
 * <br>
 * <b>功能：</b>查询参数<br>
 * <b>作者：</b>luyuan@rm-tech.com.cn<br>
 * <b>日期：</b>2018-08-24<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) 2018<br>
 */
public class UserQueryParam extends QueryParam{
	
	private UserVO user;

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		super.setParamBean(user);
		this.user = user;
	}
	
}