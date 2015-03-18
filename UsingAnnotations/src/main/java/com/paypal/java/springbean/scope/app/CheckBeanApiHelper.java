package com.paypal.java.springbean.scope.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.paypal.java.springbean.scope.api.CheckBeanApi;

@Service
@Scope("prototype")
public class CheckBeanApiHelper {
	
	public @Autowired 
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
