package com.manish.javadev.services.impl;

import com.manish.javadev.services.AccountService;
import com.manish.javadev.services.CustomerService;

@SuppressWarnings("unused")
public class CustomerServiceImpl implements CustomerService {

	public void addCustomer() {
		System.out.println("Add Customer");
		System.out.println("Add Customer Logic Done");
		System.out.println("Add Customer End");
	}

	public void updateCustomer() {
		System.out.println("Update Customer");
		System.out.println("Update Customer Logic Done");
		System.out.println("Update Customer End");
	}

	public void getCustomer(int index) {
		System.out.println("Get Customer Start");
		if (index == 1) {
			System.out.println("Get Customer Going to throw Exception");
			int value = 10 / 0;
		}
		System.out.println("Get Customer Logic Done");
		System.out.println("Get Customer Completed");
	}
}