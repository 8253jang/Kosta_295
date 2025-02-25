package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();
		
		// 자동 타입 변환
		Parent parent = child;
		
		// 메소드 호출 -> 부모 타입으로 자동 변환된 이후에는 부모 클래스에 선언되 필드, 메서드만 접근 가능
		parent.method1();
		parent.method2();
		
		// 자식 타입에 선언된 메서드 호출 불가
		// parent.method3();
		
		// 캐스팅하면 사용가능
		// 자식타입 변수 = (자식타입) 부모타입 객체
		// Child child = (Child) parent;
	}
}
