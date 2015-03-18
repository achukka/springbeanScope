package com.paypal.java.springbean.scope.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.paypal.java.springbean.scope.api.CheckBeanApi;

@Service
@Scope("prototype")
public class CheckBeanApiImpl implements CheckBeanApi {

	private String message;
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
