package ch07;

public class ClassTypeChang4 {

	public static void main(String[] args) {
		
		// 참조형은 주소 저장
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000"); // 힙 영역
		IPhone iPhone = new IPhone("010-9999-9999");
		
		// int a = 1; // 스택영역
		
		System.out.println(iPhone.toString()); //toString 자동 호출
		System.out.println(androidPhone);
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
		
		// 참조형의 변수 androidPhone
		callByPhone( androidPhone );
		callByPhone( iPhone ); //메소드의 매개값이 타입이 동일하므로 사용할 수 있다.
		
	}
	
	// iPhone phone == iPhone;
	// AndroidPhone androidPhone == androidPhone;
	
	// Phone phone = new IPhone("010-0000-0000");
	// Phone = androidPhone;
	
	//callByPhone 메소드
//	public static void callByPhone( Phone phone) { //매개 변수의  타입이 자식클래스 
//		phone.call();
//	}
//	
//	public static void callByPhone( AndroidPhone androidPhone) {
//		phone.call();
//	}
	
	// 다른 타입 변수를 
	public static void callByPhone( Phone phone ) {
		phone.call();
	}
}
