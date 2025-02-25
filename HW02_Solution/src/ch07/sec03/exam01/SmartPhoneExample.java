package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone("갤럭시", "은색");
		
		// 이 부분도 필드 읽기
		System.out.println("모델 : " + smartPhone.model);
		System.out.println("갤럭시 : " + smartPhone.color);
	}
}
