package com.manish.javadev.aspect;

public class TransactionService {

	public void begin() {
		System.out.println("TXN - Begin");
	}

	public void commite() {
		System.out.println("TXN - commite");
	}

	public void roolback() {
		System.out.println("TXN - roolback");
	}
}
