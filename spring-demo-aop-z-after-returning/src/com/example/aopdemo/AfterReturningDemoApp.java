package com.example.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {
	public static void main(String []args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
	
		List<Account> theAccounts = theAccountDAO.findAccounts();
		System.out.println(theAccounts);
		context.close();
	}
}
