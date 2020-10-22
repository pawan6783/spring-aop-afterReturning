package com.example.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.aopdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getServiceCode() {
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}


	public void addAccount(Account theAccount,boolean flag) {
		System.out.println(getClass()+" doing my DB work");
	}
	
	public List<Account> findAccounts(){
		List<Account> myAccounts = new ArrayList<Account>();
		Account temp1 = new Account("john","100");
		Account temp2 = new Account("max","200");
		Account temp3 = new Account("henry","300");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		return myAccounts;
	}
}
