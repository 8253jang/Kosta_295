package ch07.sec05.exam02;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// Car 메서드에 final 이 있는 것들은 오버라이딩 불가!!!!
	// public void stop()
}
