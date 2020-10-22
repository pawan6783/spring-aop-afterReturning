package com.example.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.aopdemo.Account;

@Component
@Aspect
@Order(2)
public class MyDemoLoggingAspect {
	
	@AfterReturning(pointcut = "execution(* com.example.aopdemo.dao.AccountDAO.findAccounts(..))",
					returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint,
													List<Account> result) {
		System.out.println("executing @AfterReturning method");
		String method = theJoinPoint.getSignature().toString();
		System.out.println(method);
		System.out.println(result);
	}
	
	@Before("com.example.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
	public void performLogging() {
		System.out.println("Logging is performed @before");
	}
}
