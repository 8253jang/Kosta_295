//염진
package ex0221.ch06.q20;

import java.util.Scanner;

public class BankApplication {
	Account[] acc = new Account[100];// null로 초기화 
	int count = 0;// 배열에 저장된 객체의 개수를 체크!!
	
	Scanner sc = new Scanner(System.in);
	
	public BankApplication() {
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성  |  2.계좌목록  |  3.예금  |  4.출금  |  5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("--------");
				System.out.println("계좌생성");
				
				System.out.println("--------");
				System.out.print("계좌번호: ");
				String accountNumber = sc.nextLine();
				
				System.out.print("계좌주: ");
				String accountOwner = sc.nextLine();
				
				System.out.print("초기입금액: ");
				int initBalance = Integer.parseInt(sc.nextLine());
				
				acc[count++] = new Account(accountNumber, accountOwner, initBalance);
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			case 2:
				System.out.println("--------");
				System.out.println("계좌목록");
				System.out.println("--------");
				for (int i = 0; i < count; i++) {
					System.out.print(acc[i].accountNumber + "\t" + 
				            acc[i].accountOwner + "\t" + acc[i].balance + "\n");
				}
				break;
			case 3:
				System.out.println("--------");
				System.out.println("예금");
				System.out.println("--------");
				System.out.print("계좌번호: ");
				accountNumber = sc.nextLine();
				
				System.out.print("예금액: ");
				int money = Integer.parseInt(sc.nextLine());
				  
				Account searchedAcc = this.findByAccountNumber(accountNumber);
				if(searchedAcc==null)
					System.out.println("계좌정보오류로 예금할수 없어요.");
				else
					searchedAcc.balance += money;
				
				break;
			case 4:
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				System.out.print("계좌번호: ");
				accountNumber = sc.nextLine();
				System.out.print("출금액: ");
				money = Integer.parseInt(sc.nextLine());
				
				searchedAcc = this.findByAccountNumber(accountNumber);
				if(searchedAcc==null)
					System.out.println("계좌정보오류로 출금할 수 없어요.");
				else
					searchedAcc.balance -= money;
				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
	    new BankApplication();// 필드초기화 -> 생성자호출
		
	}//메인끝
	
	/***
	 * 계좌번호에 해당하는 Account정보 찾기
	 * @return : 찾으면 Account, 못찾으면 null
	 * @param : accountNumber
	 * */
	public Account findByAccountNumber(String accountNumber) {
		for (int i = 0; i < count; i++) {
			if(acc[i].accountNumber.equals(accountNumber)) {
			   return acc[i];
			}
		}
		return null;
	}
	
	
}//클래스끝






