package ex0218_서경찬;

/**
 * 교재 연습문제 7번 - 주어진 배열 항목에서 최대값 출력하기 (for문 이용)
 * 작성자 : 서경찬
 */

public class Question7 {

	public static void main(String[] args) {
/**
 * 최대값 저장할 변수*/
		int maxValue = 0;

		int[] array = { 1, 5, 3, 8, 2 };
		
		for (int i = 0; i < array.length; i++) {
			
			if (maxValue < array[i]) {
				maxValue = array[i];
			}
		}
		System.out.println("최대값은 " + maxValue + " 입니다.");
	}

}
