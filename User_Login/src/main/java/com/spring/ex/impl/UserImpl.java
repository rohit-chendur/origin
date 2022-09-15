package com.spring.ex.impl;

import com.spring.ex.intf.UserIntf;

public class UserImpl implements UserIntf{
	@Override
	public boolean validateUser(String uname, String pass) {
		String un = "rohit";
		String ps = "rohit123";
		if (uname.equals(un) && pass.equals(ps)) {
			return true;
		} else {return false;}
	}
}
