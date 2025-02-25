
package ex0221.ch06.q18;
/**
 *  싱글톤 클래스 작성
 *  1) private 생성자
 *  2) static(정정)맴버필드를 선언해서 자기자신 생성
 *  3) static 메소드에서 정적필드 리턴
 * */
public class ShopService {
	static ShopService instance = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getInstance() {
		return instance;
	}
	
	
	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1==obj2) {//주소값이 동일하니?
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
	}

}
