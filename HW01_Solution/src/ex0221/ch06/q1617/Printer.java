//염진
package ex0221.ch06.q1617;

public class Printer {
	
	/////////16번 문제 ////////////////////////
	public  void println(int value) {
		System.out.println(value);
	}
	public  void println(boolean value) {
		System.out.println(value);
	}
	public  void println(double value) {
		System.out.println(value);
	}
	public  void println(String value) {
		System.out.println(value);
	}
	
	////////17번문제////////////////////////////////////
	/*public static void println(int value) {
		System.out.println(value);
	}
	public static void println(boolean value) {
		System.out.println(value);
	}
	public static void println(double value) {
		System.out.println(value);
	}
	public static void println(String value) {
		System.out.println(value);
	}*/
	
	public static void main(String[] args) {
		
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		
		
		/*Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");*/
		
	}

}
