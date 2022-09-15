package com.spring.ex.impl;

import com.spring.ex.intf.LoginIntf;
import com.spring.ex.intf.UserIntf;

public class LoginImpl implements LoginIntf{
	private UserIntf valUser;

	@Override
	public boolean getValUser(String uname, String pass) {
		return valUser.validateUser(uname, pass);
	}

	public void setValUser(UserIntf valUser) {
		this.valUser = valUser;
	}
	
	
}
