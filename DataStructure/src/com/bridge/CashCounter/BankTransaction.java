package com.bridge.CashCounter;

public class BankTransaction {
	
	
	
	CashCounTer cash = new CashCounTer();
	public void bankDisplay(String name) {
		System.out.println(name+" Welcom to Bank");
		System.out.println("1. Deposite");
		System.out.println("2. WithDraw");
		System.out.println("3. ViewBalance");
		System.out.print("Press 1|2|3 :");
	}
	public void deposite(int amount, Person per) {
		per.setBalance(amount);
		System.out.println("Money Deposited Sussesfully");
		cash.changeBalance(amount);
	}
	public void withDraw(int amount, Person per) {
		if(amount > per.balance || amount > cash.mainBalance) {
			System.out.println("WithDraw Amount is more than Balance OR Cash Is Not available");
		}else {
			per.setBalance(-amount);;
			cash.changeBalance(-amount);
			System.out.println("Money Withdraw Sussesfully ");
		}
	}
	public void viewBalance(Person per) {
		System.out.println("Your Balance is = "+per.getBalance());
		System.out.println("Bank Balance is = "+cash.mainBalance);
	}
}
