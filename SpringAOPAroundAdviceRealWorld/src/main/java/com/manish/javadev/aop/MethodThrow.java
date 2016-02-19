package com.manish.javadev.aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import com.manish.javadev.aspect.LogService;
import com.manish.javadev.aspect.TransactionService;

public class MethodThrow implements ThrowsAdvice {
	@Autowired
	LogService logService;
	@Autowired
	TransactionService txnService;

	public void afterThrowing(Exception exp) {
		txnService.roolback();
		logService.logThrowing(exp);
	}
}