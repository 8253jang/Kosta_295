package ch08.practice08;

interface A {
	public void method1();
}
//////////////////////////////////
class B implements A {
	@Override
	public void method1() {
		System.out.println("B - method1()");
	}
}
/////////////////////////////////////
class C implements A {
	@Override
	public void method1() {
		System.out.println("C - method1()");
	}

	public void method2() {
		System.out.println("C - method2()");
	}

}

public class Example {
public static void action(A a) { //B or C
		a.method1();
		
		//a.method2(); // C 하위클래스에 잇는 메소드이므로 안된다!
		
		/*
		(Java12 이상부터 instanceof 우측 연산자 뒤에 
		타입 변수를 붙여서 타입검증에 사용할 수 있다.
		하단 코드에서 바로 변수 c를 사용하고 있으므로 
		Java12문법에 따라 변수 c를 만들어준다.
		Java 12 이전 버전에서는 객체를 생성 후 우측(자식객체) 
		형태로 강제형변환한 뒤 사용해야 한다.)
		*/
		if ( a instanceof C c ) {
		   c.method2();
		}
		
		/*if ( a instanceof C ) {
			   C c = (C)a;
			   c.method2();
		}*/
		
	}
	
///////////////////////////////////////////////
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
}