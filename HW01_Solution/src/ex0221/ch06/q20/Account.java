
package ex0221.ch06.q20;

public class Account {
	String accountNumber; //계좌번호
	String accountOwner;//계좌주
	int balance;//잔액
	
	public Account(){}
	public Account(String accountNumber, String accountOwner, int initBalance){
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = initBalance;
	}
}
