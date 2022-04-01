package com.lec.ex4_newexception;
public class Account {
	private String accountNo;
	private String ownerName;
	private int    balance;
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	} // 예금 : 예금전 계좌정보출력 -> 예금 -> 예금후 계좌정보 출력
	public void deposit(int amount) { // Account a = new Account("1-1","홍",100)
		                              // System.out.pritln("예금전 : " + a)
									  // a.deposit(100) -> deposit함수 내에서는 this가 a
		System.out.println("예금전 : " + this);
		balance += amount; // balance = balance + amount; 예금
		System.out.println(amount + "원 예금후 : " + this);
	} // 출금 : 출금전 계좌정보 출력 -> 출금 -> 출금후 계좌정보 출력
	public void withdraw(int amount) {
		
	}
	@Override
	public String toString() {
		return "계좌번호:"+accountNo +"\t예금주:"+ownerName +"\t잔액:"+balance;
	}
}
