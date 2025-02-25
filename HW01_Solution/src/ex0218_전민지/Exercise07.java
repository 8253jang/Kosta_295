package ex0218_전민지;
/**
 * 
 * 주제 : 배열에서 최대값 출력
 * 작성자 : 전민지
 * 
 **/

public class Exercise07 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = array[0];
		int len = array.length;
		for (int i = 1; i < len; i++) {
			if(max < array[i]) max = array[i];
		}
		System.out.println("최대값:" + max);

	}

}
