//염진
package ex0221.ch06.q131415;

public class MemberService {
	
	public boolean login(String id, String password) {
		if("hong".equals(id) && "12345".equals(password)) {			
			return true;
		}
		return false;
	}
	
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다");
	}
}
