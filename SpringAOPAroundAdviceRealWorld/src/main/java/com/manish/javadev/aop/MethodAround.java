package com.manish.javadev.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import com.manish.javadev.aspect.LogService;
import com.manish.javadev.aspect.SecurityService;
import com.manish.javadev.aspect.TransactionService;

public class MethodAround implements MethodInterceptor {

	@Autowired
	LogService logService;
	@Autowired
	SecurityService securityService;
	@Autowired
	TransactionService txnService;

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Object result = null;

		/* Method before operation */
		securityService.verifyUser();
		logService.logBefore();
		txnService.begin();

		result = methodInvocation.proceed();

		/* Method after Operation */
		txnService.commite();
		logService.logReturning();

		return result;
	}

}