package ex0214_송효원;

// 교제 5번 문제 4x+5y=60

public class HomeWorkch04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if ((4 * i) + (5 * j) == 60){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
	}

}
