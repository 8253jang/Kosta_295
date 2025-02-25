
package ex0221.ch06.q131415;

public class MemberTest {

	public static void main(String[] args) {
		
		MemberService memberservice = new MemberService();
		
		boolean result = memberservice.login("hong2", "12345");
		if(result){
			System.out.println("로그인 되었습니다");
			memberservice.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
		
	}

}
