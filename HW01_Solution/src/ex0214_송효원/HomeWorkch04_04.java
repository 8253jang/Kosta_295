package ex0214_송효원;
// 주제 : 4단원 4번 눈의 합 5이면 멈춘다.

public class HomeWorkch04_04 {
	
	
	public static void main(String[] args) {
		while (true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			if (num1 + num2 == 5) {        
				System.out.println("정답이 나왔으니 실행을 멈춰요.");
				break;
			}
		} 
	}
}
