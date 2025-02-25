package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("갤럭시", "은색");
		
		// 이 부분도 필드 읽기
		System.out.println("모델 : " + smartPhone.model);
		System.out.println("갤럭시 : " + smartPhone.color);
		
		// boolean 값의 기본 값은 false -> 이 부분은 필드 읽기
		System.out.println("와이파이 상태 : " + smartPhone.wifi);
		
		// SmartPhone이 현재 Phone 클래스를 상속하기 때문에 그냥 smartPhone에서 bell 메서드 호출
		smartPhone.bell();
		
		smartPhone.sendVoice("여보세요.");
		
		smartPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		
		smartPhone.sendVoice("아~네, 반갑습니다.");
		
		smartPhone.hangUp();
		
		smartPhone.setWifi(true);
		
		smartPhone.internet();
	}

}
