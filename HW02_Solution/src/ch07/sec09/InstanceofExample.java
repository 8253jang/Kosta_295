package ch07.sec09;

public class InstanceofExample {

	// 메인 메서드에서 바로 호출하기 위해 정적 메서드
	public static void personInfo(Person person) {
		// TODO Auto-generated method stub
		System.out.println("name:" + person.name);
		person.walk();

	
	// student 변수에 대입(타입 변환 발생)
	if (person instanceof Student student) {
		System.out.println("studentNo:" + student.studentNo);
		student.study();
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		Person p2 = new Student("김길동",10);
		personInfo(p2);
	}

}
