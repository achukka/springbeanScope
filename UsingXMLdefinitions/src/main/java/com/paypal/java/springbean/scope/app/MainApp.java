package com.paypal.java.springbean.scope.app;

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
		mainApp.testPrototypeBeanSingleTonDependency(applicationContext);
		mainApp.testPrototypeBeanPrototypeDependency(applicationContext);
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Output Ends>>>>>>>>>>>>>>>>>");

	}

	private void testSingleTonBean(ApplicationContext applicationContext) {
		System.out.println("*********** Single Ton Bean ********** Starts");

		CheckBeanApiHelper checkBeanApiHelper = (CheckBeanApiHelper) applicationContext
				.getBean("CheckBeanApiHelper");

		String message = "singleton";
		String value = "SingletonValue";

		checkBeanApiHelper.setCheckBeanApiMessage(message);
		checkBeanApiHelper.setValue(value);

		System.out.println("1st Time Message is :\t"
				+ checkBeanApiHelper.getCheckBeanApiMessage());

		System.out.println("1st time Value is:\t"
				+ checkBeanApiHelper.getValue());
		CheckBeanApiHelper checkBeanApiHelper2 = (CheckBeanApiHelper) applicationContext
				.getBean("CheckBeanApiHelper");
		System.out.println("2nd Time Message is :\t"
				+ checkBeanApiHelper2.getCheckBeanApiMessage());
		System.out.println("2nd time Value is:\t"
				+ checkBeanApiHelper2.getValue());
		System.out.println("*********** Single Ton Bean ********** Ends\n");

	}

	private void testPrototypeBeanSingleTonDependency(
			ApplicationContext applicationContext) {
		System.out
				.println("*********** Prototype base Bean SingleTon dependency Bean ********** Starts");

		CheckBeanApiHelper checkBeanApiHelper = (CheckBeanApiHelper) applicationContext
				.getBean("CheckBeanApiHelperProtoSingle");

		String message = "PrototypeBaseSingleTonDependency";
		String value = "PrototypeBasePrototypeDependencyValue";

		checkBeanApiHelper.setCheckBeanApiMessage(message);
		checkBeanApiHelper.setValue(value);
		System.out.println("1st Time Message is :\t"
				+ checkBeanApiHelper.getCheckBeanApiMessage());

		System.out.println("1st time Value is:\t"
				+ checkBeanApiHelper.getValue());
		CheckBeanApiHelper checkBeanApiHelper2 = (CheckBeanApiHelper) applicationContext
				.getBean("CheckBeanApiHelperProtoSingle");
		System.out.println("2nd Time Message is :\t"
				+ checkBeanApiHelper2.getCheckBeanApiMessage());
		System.out.println("2nd time Value is:\t"
				+ checkBeanApiHelper2.getValue());
		System.out
				.println("*********** Prototype base Bean SingleTon dependency Bean ********** Ends\n");
	}

	private void testPrototypeBeanPrototypeDependency(
			ApplicationContext applicationContext) {
		System.out
				.println("*********** Prototype base Bean Prototype dependency Bean ********** Starts");

		CheckBeanApiHelper checkBeanApiHelper = (CheckBeanApiHelper) applicationContext
				.getBean("CheckBeanApiHelperProtoProto");

		String message = "PrototypeBasePrototypeDependency";
		String value = "PrototypeBasePrototypeDependencyValue";

		checkBeanApiHelper.setCheckBeanApiMessage(message);
		checkBeanApiHelper.setValue(value);
		System.out.println("1st Time Message is :\t"
				+ checkBeanApiHelper.getCheckBeanApiMessage());

		System.out.println("1st time Value is:\t"
				+ checkBeanApiHelper.getValue());
		CheckBeanApiHelper checkBeanApiHelper2 = (CheckBeanApiHelper) applicationContext
				.getBean("CheckBeanApiHelperProtoProto");
		System.out.println("2nd Time Message is :\t"
				+ checkBeanApiHelper2.getCheckBeanApiMessage());
		System.out.println("2nd time Value is:\t"
				+ checkBeanApiHelper2.getValue());
		System.out
				.println("*********** Prototype base Bean Prototype dependency Bean ********** Ends\n");
	}
}
