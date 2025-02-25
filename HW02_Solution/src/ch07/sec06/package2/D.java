package ch07.sec06.package2;

import ch07.sec06.package1.A;

// import 하면 사용 가능
public class D extends A{
	public D() {
		
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() {
		// 다른 패키지에 있으면 직접 객체 생성해서 사용하는 것은 불가!
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
