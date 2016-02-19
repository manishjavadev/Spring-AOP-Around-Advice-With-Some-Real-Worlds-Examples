package com.manish.javadev.services.impl;

import com.manish.javadev.services.AccountService;

@SuppressWarnings("unused")
public class AccountServiceImpl implements AccountService {

	public void addAccount() {
		System.out.println("Add Account Start");
		System.out.println("Add Account Logic Done");
		System.out.println("Add Account End");
	}

	public void updateAccount() {
		System.out.println("Update Account Start");
		System.out.println("Update Account Logic Done");
		System.out.println("Update Account End");
	}

	public void getAccount(int byId) {
		System.out.println("Get Account Start");
		if (byId == 1) {
			System.out.println("Get Account Going to throw Exception");
			int value = 10 / 0;
		}
		System.out.println("Get Account Logic Done");
		System.out.println("Get Account Completed");
	}
}
