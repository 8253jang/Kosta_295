package ex0218_전민지;

import java.util.Scanner;

/**
 * 
 * 주제 : 학생들 점수 분석 프로그램 작성자 : 전민지
 * 
 **/

public class Exercise09 {
	Scanner sc = new Scanner(System.in);
	int[] scores; //
	int len;
	
	
	/**
	 * 입력받은 학생수 길이의 배열 만들기
	 * 
	 */
	public void getArray() {
		System.out.print("학생수>");
		int num = Integer.parseInt(sc.nextLine());//문자열을 int형 변화
		scores = new int[num];//배열생성
	}
	
	/**
	 * 배열에 점수입력하기
	 **/
	public void putScore() {
		len = scores.length;
		for (int i = 0; i < len; i++) {
			System.out.print("scores[" + i + "]>");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
	}

	/**
	 * 
	 * 점수리스트 출력하기
	 */
	public void printList() {
		len = scores.length;
		for (int i = 0; i < len; i++) {
			System.out.println("scores[" + i + "]>" + scores[i]);
		}
	}

	/**
	 * 
	 * 최고점수, 평균점수 출력하기
	 */
	public void analyze() {
		System.out.println("최고 점수: " + maxScore());
		System.out.println("평균 점수: " + avgScore());
	}

	/**
	 * 
	 * 최고점수 구하기
	 * @param arr
	 * @return
	 */
	public int maxScore() {
		int max = scores[0];
		for (int i = 0; i < len; i++) {
			if (max < scores[i])
				max = scores[i];
		}
		return max;
	}

	/**
	 * 평균 구하기
	 * @param arr
	 * @return
	 */
	public double avgScore() {
		int sum = 0;
		int num = scores.length;
		for (int i = 0; i < num; i++) {
			sum += scores[i];
		}
		return (double) sum / num;

	}

	public static void main(String[] args) {
		Exercise09 ex = new Exercise09();
		while (true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("메뉴선택>");
			String menu = ex.sc.nextLine();
			switch (menu) {
			case "1":
				ex.getArray();
				break;
			case "2":
				ex.putScore();
				break;
			case "3":
				ex.printList();
				break;
			case "4":
				ex.analyze();
				break;
			case "5":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("1~5번까지 입력해주세요.");

			}
		}

	}

}
