package ex0214_송효원;

// 교제 3번 문제 : 1 ~ 100 3의 배수 총합

public class HomeWorkch04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=0; i<100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
	}
}
