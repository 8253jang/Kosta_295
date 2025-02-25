//염진
package ex0221.ch06.q19;

public class Account {
	private int balance;//외부에서 접근 불가
	
	static final int MIN_BALANCE=0; // 상수
	static final int MAX_BALANCE=1000000;//상수
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {//조건
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;//
		}
	}

}
