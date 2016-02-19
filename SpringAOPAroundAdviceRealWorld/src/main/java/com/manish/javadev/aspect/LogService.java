package com.manish.javadev.aspect;

public class LogService {

	public void logBefore() {
		System.out.println("Log Before method called");
	}

	public void logReturning() {
		System.out.println("Log Returning method called");
	}

	public void logThrowing(Exception exp) {
		System.out.println("Log Throwing method called");
	}
}
