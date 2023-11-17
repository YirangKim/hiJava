package ch07;

public class Phone {
	
	String phoneNumber;
	//int num; // 데이터 저장하기 위해 사용
	
	public Phone(String phoneNumber) { //클래스랑 이름이 같으면 생성자 
		// 생성자 void X, public 등
		// 생성자 접근제어자 필요없음 
		this.phoneNumber = phoneNumber;
		
		// Todo 변수num에 지역번호 
		// phoneNumber 옛날 번호 222-2222
		//this.num = num;
	}
	
	void call() { //메소드이면서 반환x : void
		System.out.println( phoneNumber + "에서 전화를 걸어 통화를 합니다");
	}
	

}


//String phoneNumber;
//
//void call () { //반환X
//	System.out.println(phoneNumber + "에서 전화를 걸어 통화를 합니다");
//}
