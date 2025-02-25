package ex0214_조재희;

/**
 * chapter04 - 7번 문제
 * while 문과 Scanner의 nextLine() 메소드를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
 */

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		int balance = 0;	// 초기 잔고
		Scanner sc = new Scanner(System.in);
		boolean state=true;
		while(state) {
			System.out.println("-----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			
			//Integer.parseInt(문자열) :  문자열을 int형으로 변환
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				System.out.print("예금액> ");
				//int deposit = Integer.parseInt(sc.nextLine());
				int deposit = sc.nextInt();
				balance += deposit;
				System.out.println("예금이 완료되었습니다.");
				break;
			
			case 2:
				System.out.print("출금액> ");
				int withdraw = Integer.parseInt(sc.nextLine());
				if (withdraw <= balance) {
					balance -= withdraw;
					System.out.println("출금이 완료되었습니다.");
				} else {
					System.out.println("잔고가 부족합니다.");
				}
				break;
				
			case 3:
				System.out.println("현재 잔고: "+balance+"원 입니다."); break;
			
			case 4:
				System.out.println("프로그램을 종료합니다.");
				//System.exit(0);
				state=false;//반복문 빠져나가기 위한 설정
				break; //switch 문 탈출
			default:
				System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
				break;
				
			}//switch문End
		}//while end
		
        System.out.println("다음에 또 이용해 주세요!!");
	}//main end
}
