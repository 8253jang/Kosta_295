package ex0213_이채은;


/**
 * 주제 :
 * 작성자 : 
 * 
 * */
public class HW1 {
	public static void main(String[] args) {
		String name = "이채은";
		
		int korean = (int)(Math.random()*56)+45; 
		int math = (int)(Math.random()*56)+45; 
		int english = (int)(Math.random()*56)+45;
		
		int total = korean + math + english; 
		
		double mean = total/3.0; //평균
		
		
		//char score;
		
		// 조건문
		/*if (mean >= 90  ) {
			score = 'A';
		}
		else if ( mean < 90 ) {
			score = 'B';
		}
		else if (70 <= mean) {
			score = 'C';
		}
		else if (60 <= mean) {
			score = 'D';
		}
		else {
			score = 'F';
		}*/
		
		//switch문
		char score = switch((int)mean/10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
		
		
		
		System.out.println("이름: "+name);
		System.out.println("국어점수: "+korean);
		System.out.println("영어점수: "+english);
		System.out.println("수학점수: "+math);
		System.out.println("총점(전): "+total);
		
		System.out.println("평균(전): "+mean);
		//총점 소수점 2자리까지
		mean = (int)(mean*100) / 100.0;
		System.out.println("평균(후): "+mean);
		
		System.out.println("학점: "+score);

	}

}




