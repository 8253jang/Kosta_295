package ex0217_정정화;

import java.util.Scanner;

/**
 * 주제 : 학점 계산기 Ver2
 * 작성자 : 정정화
 */

public class GradeProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GradeCal gc = new GradeCal();
		
		while(true) {
			System.out.println("------------------------");
			System.out.println(" 1. 성적표  |  2. 종료 ");
			System.out.println("------------------------");
			System.out.print("번호를 선택해주세요 : ");
			
			int no = sc.nextInt();
			switch(no) {
			case 1 : 
				sc.nextLine();
				System.out.print("이름: ");
				String name = sc.nextLine();
				
				System.out.print("국어 점수: ");
				int korScore = sc.nextInt();
				
				System.out.print("영어 점수: ");
				int engScore = sc.nextInt();
				
				System.out.print("수학 점수: ");
				int mathScore = sc.nextInt();
				gc.result(korScore, engScore, mathScore, name);// 출력 전용메소ㅓ드
				break;
				
			case 2 : 
				System.out.println("프로그램 종료");
				System.exit(0);
				
			default : 
				System.out.println("번호는 1 ~ 2번만 입력해주세요.");
			}
			
		}

	}

}
////////////////////////////////////////////////////////////////////////////////
class GradeCal {
	/**
	 * 총점 구하기 
	 * */
	private int totalScore(int korScore, int engScore, int mathScore) {
		return korScore + engScore + mathScore;
	}
	
	
	/**
	 * 평균구하기
	 * */
	private double totalAvg(int totalScore, int sub) {
		
		return totalScore / (double)sub; //  
	}
	
	
	/**
	 * 등급구하기 
	 * */
	private String grade(double avg) {
		
		if(avg >= 90) {
			return "A";
		} else if(avg >= 80) {
			return "B";
		} else if(avg >= 70) {
			return "C";
		} else if(avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	/**
	 * 출력 
	 * */
	public void result(int korScore, int engScore, int mathScore , String name) {
		//총점호출
		int totalScore = this.totalScore(korScore, engScore, mathScore);
		
		//총점 인수로 전달해서 평균구한다.
		double avg = totalAvg(totalScore, 3);
		
		//평균을 인수로 전달해서 등급구하기 
		String grade = this.grade(avg);
		
		System.out.println("************* 성적표 *************");
		System.out.println("성함 : " + name);

		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println("*************************");

	}
	
}
