package com.manish.javadev.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.manish.javadev.services.AccountService;
import com.manish.javadev.services.CustomerService;

public class SpringAOPDemo {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Context.xml" });

		CustomerService customerService = (CustomerService) appContext
				.getBean("csProxy");

		// Start Operation of Account Service
		System.out.println("==Customer Operation Start from here==");

		try {
			customerService.getCustomer(1);
		} catch (Exception e) {
			System.out
					.println("Sorry! Your Log created by Advice class method");
		}

		AccountService accountService = (AccountService) appContext
				.getBean("asProxy");

		// Start Operation of Account Service
		System.out.println("==Account Operation Start from here==");

		try {
			accountService.getAccount(2);
		} catch (Exception e) {
			System.out
					.println("Sorry! Your Log created by Advice class method");
		}
	}
}
