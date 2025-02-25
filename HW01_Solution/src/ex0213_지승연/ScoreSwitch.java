package ex0213_지승연;

public class ScoreSwitch {

	public static void main(String[] args) {
		
		String name = "지승연";
		int kor = (int)(Math.random() * 56) + 45;
		int eng = (int)(Math.random() * 56) + 45;
		int math = (int)(Math.random() * 56) + 45;

		int total = kor + eng + math;
		int avg = total / 3;
		
		char grade = 'F';
		switch (avg / 10) {
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
		};
		
		System.out.println("<성적표>");
		System.out.println("이름 : " + name);
		System.out.println();
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("-----------------------------");
		System.out.println("총점 : " + total + "점, 평균 : " + avg + "점");
		System.out.println("학점 : " + grade);
	}
}
