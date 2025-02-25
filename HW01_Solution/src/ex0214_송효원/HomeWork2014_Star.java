package ex0214_송효원;

// 주제 : 별 찍기

public class HomeWork2014_Star {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (int i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		// 별찍기 3번 문제 (공백을 만들기)
		for (int i = 1; i <= 5; i++) {
            // 공백 출력
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
			
            // 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
		}
		
		// 별찍기 4번 문제 (reverse 공백을 만들기)
		
		System.out.println("\n");
		
		// 별찍기 3번 문제 (공백을 만들기)
		for (int i = 5; i > 0; i--) {
            // 공백 출력
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
			
            // 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
		}
	
	
	}

}
