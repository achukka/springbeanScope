package com.paypal.java.springbean.scope.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class MainApp {
	public static void main(String[] args) {
		MainApp mainApp = new MainApp();
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Output Starts>>>>>>>>>>>>>>>>>");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		mainApp.testSingleTonBean(applicationContext);
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Output Ends>>>>>>>>>>>>>>>>>");

	}

	private void testSingleTonBean(ApplicationContext applicationContext) {
		System.out.println("*********** Prototype Bean ********** Starts");

		BeanFactory beanFactory=applicationContext;
		CheckBeanApiHelper checkBeanApiHelper = (CheckBeanApiHelper) beanFactory
				.getBean("checkBeanApiHelper");

		String message = "singleton";
		String value = "SingletonValue";

		checkBeanApiHelper.setCheckBeanApiMessage(message);
		checkBeanApiHelper.setValue(value);

		System.out.println("1st Time Message is :\t"
				+ checkBeanApiHelper.getCheckBeanApiMessage());

		System.out.println("1st time Value is:\t"
				+ checkBeanApiHelper.getValue());
		CheckBeanApiHelper checkBeanApiHelper2 = (CheckBeanApiHelper) applicationContext
				.getBean("checkBeanApiHelper");
		System.out.println("2nd Time Message is :\t"
				+ checkBeanApiHelper2.getCheckBeanApiMessage());
		System.out.println("2nd time Value is:\t"
				+ checkBeanApiHelper2.getValue());
		System.out.println("*********** Prototype Bean ********** Ends\n");

	}

}
