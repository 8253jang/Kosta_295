package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		
		// 일반 부모클래스 메서드 호출
		sa.fly();
		
		// 오버라이딩 된 메서드 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		// 오버라이딩 된 메서드 호출
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
