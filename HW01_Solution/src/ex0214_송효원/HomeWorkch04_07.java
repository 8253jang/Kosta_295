package ex0214_송효원;

import java.util.Scanner;

public class HomeWorkch04_07 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in); //ctrl + shift + o  자동 import
		
		int balance =0; //지역변수 . 반드시 초기화 필수 
		while (true) {
			System.out.println("\n");
			System.out.println("----------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 : 4.종료");
			System.out.println("----------------------");
			
			System.out.println("\n");
			System.out.print("선택> ");
			
			int num = scanner.nextInt();
			
			if (num == 1) {
				System.out.print("예금액>");
				int input1 = scanner.nextInt();
				balance += input1;
			
			} else if (num == 2) {
				System.out.print("출금액>");
				int input2 = scanner.nextInt();
				balance -= input2;
			
			} else if (num == 3) {
				System.out.print("잔고>" + balance);
			
			} else if (num == 4) {
				System.out.print("선택>");
				break; //반복문 빠져나라가.
			}//switchend
			
		}//while end
		
		System.out.println("프로그램 종료");
	}

}
