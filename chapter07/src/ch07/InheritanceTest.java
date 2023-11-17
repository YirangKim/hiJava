package ch07;

public class InheritanceTest {

	
	public static void main(String[] args) { // static
		
		Smartphone smartPhone = new Smartphone(); //객체 생성(인스턴스), 메모리 저장
			 
		smartPhone.phoneNumber = "010-0000-0000"; // 멤버 호출해서 데이터 저장
		
		smartPhone.model = "Google";
		
		smartPhone.call();
		
		smartPhone.game();
	}

}
