package com.paypal.java.springbean.scope.app;

import com.paypal.java.springbean.scope.api.CheckBeanApi;

public class CheckBeanApiHelper {
	CheckBeanApi checkBeanApi;
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setCheckBeanApi(CheckBeanApi checkBeanApi) {
		this.checkBeanApi = checkBeanApi;
	}

	public void setCheckBeanApiMessage(String message) {
		checkBeanApi.setMessage(message);
	}

	public String getCheckBeanApiMessage() {
		return checkBeanApi.getMessage();
	}
}
