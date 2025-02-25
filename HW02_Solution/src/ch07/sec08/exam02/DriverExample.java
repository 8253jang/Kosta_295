package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		// 매개값으로 Bus 객체 제공하고 driver()메서드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		// 매개값으로 Taxi 객체 제공하고 driver()메서드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}
}
