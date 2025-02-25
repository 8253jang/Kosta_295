package ex0218_서경찬;

import java.util.Scanner;

/**
 * 교재 연습문제 9번 - 학생들의 점수 분석 키보드로부터 학생 수와 각 학생들의 점수를 입력받고 
 * while 문과 Scanner의
 * nextLine() 메소드를 이용해서 최고 점수 및 평균 점수를 출력하는 코드 작성
 * 작성자 : 서경찬
 */

public class Question9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	
		int[] scores = null; // 학생수가 입력되면 수만큼 배열생성 
		int count=0;

		while (true) {
			System.out.println("===========================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("===========================================================");
			System.out.print("메뉴 번호 입력>");

			int num = sc.nextInt();

			if (num == 1) {
				// 학생수 입력
				System.out.print("학생 수 입력>");
				scores = new int[ sc.nextInt() ];//배열생성 
				count =  scores.length;
			} else if (num == 2) {
				// 점수 입력 (학생수 입력한 만큼 배열에 점수 입력)
				 
				for (int i = 0; i < count; i++) {
					System.out.print("[" + i + "]의 점수 입력 > ");
					scores[i] = sc.nextInt();
				}
				
			} else if (num == 3) {
				for (int i = 0; i < count; i++) {
					System.out.println("[" + i + "]의 점수 " + scores[i]);
				}
			} else if (num == 4) {
				// 분석 (최고점수, 평균점수 출력)
				int bestScore = 0; //최고점수
				int totalSum = 0;//총점

				for (int i = 0; i < count; i++) {
					totalSum += scores[i];
					if (bestScore < scores[i]) {
						bestScore = scores[i];
					}
				}
				
				double totalAvg = (double) totalSum / count;
				
				System.out.println("최고 점수 : " + bestScore);
				System.out.println("평균 점수 : " + totalAvg);
				
			} else if (num == 5) {
				break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다. 1-5 사이에 입력해주세요.");
			}
		}

	}

}
