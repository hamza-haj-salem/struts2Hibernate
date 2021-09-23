package model;
// 2222222222222222222222222222

import javax.persistence.Entity;
import javax.persistence.Id;

// classe to hold info from db

@Entity
public class LoginInfo {
	@Id
	String loginInfoId;
	String userName;
	String password;
	
	

	public LoginInfo(String loginInfoId, String userName, String password) {
		super();
		this.loginInfoId = loginInfoId;
		this.userName = userName;
		this.password = password;
	}
	
	
	
	public LoginInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public LoginInfo() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginInfoId() {
		return loginInfoId;
	}

	public void setLoginInfoId(String loginInfoId) {
		this.loginInfoId = loginInfoId;
	}

	@Override
	public String toString() {
		return "LoginInfo [loginInfoId=" + loginInfoId + ", userName=" + userName + ", password=" + password + "]";
	}

	
	

}
