package com.paypal.java.springbean.scope.impl;

import com.paypal.java.springbean.scope.api.CheckBeanApi;

public class CheckBeanApiImpl implements CheckBeanApi {

	private String message;
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
