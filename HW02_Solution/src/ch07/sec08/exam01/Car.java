package ch07.sec08.exam01;

public class Car {
	public Tire tire;//null
	
	public void run() {
		/*if(tire instanceof HanKookTire) {
			HanKookTire h = (HanKookTire)tire;
			h.roll();
		}*/
		
		tire.roll();//재정의된 메소드이므로 자식부분의 재정의된 메소드가 적절하게 호출된다.
	}
}
