package ex0217_김한빈;

import java.util.Scanner;
//성적표 만들기 ver 2
//작성자 김한빈

public class 김한빈_0217과제 {

	public static void main(String[] args) {
		Score score = new Score(); //생성된
		score.getScore();
		
	}//main
	
	
}//메인클래스

//////////////////////////////////////////////////////////

class Score{
	//전역필드
	String name ;
	int kor ;
	int eng ;
	int math;
	
	int total ;
	double mean = total / 3.0;
	String grade = "";
	
	
	
	private int setTotal(int kor, int eng, int math) {
		this.total = kor + eng + math;
		return total;
	}//setTotal
	
	private double setMean(int total, int subNum) {
		this.mean = total / (double)subNum;
		return mean;
	}//setMean
	
	private String setGrade(double mean) {
		
		if(mean >= 90) {
			grade = "A";
		}else if(mean >= 80) {
			grade = "B";
		}else if(mean >= 70) {
			grade = "C";
		}else if(mean >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		return grade; 
	}//setGrade
	
	
	public void getScore() {
		this.setTotal(kor, eng, math);
		this.setMean(this.setTotal(kor, eng, math), 3);
		this.setGrade(this.setMean(this.setTotal(kor, eng, math), 3));
		
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		
		while(loop) {
			System.out.println("----------------------------------------");
			System.out.println(" 1. 성적표 구하기");
			System.out.println(" 2. 종료");
			System.out.println("----------------------------------------");
		      System.out.print("선택> ");
			int sel = scan.nextInt();
			scan.nextLine();
			
			switch(sel) {
			
			case 1 :
				
				System.out.println("----------------------------------------");
				System.out.println("성적을 입력합니다.");
				System.out.print("이름: ");
				String inputName = scan.nextLine();
				
				System.out.print("국어: ");
				int inputKor = scan.nextInt();
				System.out.print("영어: ");
				int inputEng = scan.nextInt();
				System.out.print("수학: ");
				int inputMath = scan.nextInt();
			
				total = this.setTotal(inputKor, inputEng, inputMath);
				
				mean = this.setMean(total, 3);
				grade = this.setGrade(mean);
				
				

				System.out.println("----------------------------------------------------");
				System.out.println("성적 입력이 완료되었습니다.");
				System.out.println("----------------------------------------------------");
				System.out.println("이름   | 국어 | 영어 | 수학 |  총점  |  평균  | 등급");
				System.out.println("----------------------------------------------------");
				 System.out.printf("%s |  %d  |  %d  |  %d  |  %d   |  %.1f  | %s\r\n",
									inputName,
									inputKor,
									inputEng,
									inputMath,
									total,
									mean,
									grade);
				 
				System.out.println();
				System.out.println();
				break;
				
			case 2 :
				System.out.println("프로그램 종료");
				loop = false;
				
			}//switch case
			
		}//loop
		
	}//getScore
		
		
	
}//Score 클래스
























