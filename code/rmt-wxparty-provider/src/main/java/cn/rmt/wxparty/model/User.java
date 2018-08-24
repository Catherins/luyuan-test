/**
 * cn.rmt.wxparty.dao.IUserDAO
 */
package cn.rmt.wxparty.model;

import cn.rmt.framework.model.BaseEntity;

/**
 * <br>
 * <b>功能：</b>实体类<br>
 * <b>作者：</b>luyuan@rm-tech.com.cn<br>
 * <b>日期：</b>2018-08-24<br>
 * <b>版权所有：<b>前海融脉科技有限公司版权所有(C) 2018<br>
 */
@SuppressWarnings("serial")
public class User extends BaseEntity{
	
    /**
     * id db_column: id 
     */	
	private java.lang.Integer id;
    /**
     * username db_column: username 
     */	
	private java.lang.String username;
    /**
     * password db_column: password 
     */	
	private java.lang.String password;
    /**
     * role db_column: role 
     */	
	private java.lang.String role;

	public User(){
	}

	public User( java.lang.Integer id ){		
		this.id = id;
	}

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String username) {
		this.username = username;
	}
	public java.lang.String getPassword() {
		return this.password;
	}
	
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	public java.lang.String getRole() {
		return this.role;
	}
	
	public void setRole(java.lang.String role) {
		this.role = role;
	}
	
}

