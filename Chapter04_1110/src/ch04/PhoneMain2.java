package ch04;

public class PhoneMain2 {

	public static void main(String[] args) {
		
		// Todo 첫번째 자식클래스 인스턴스
		SmartPhone sp = new SmartPhone();
		
		sp = new SmartPhone("Pink Gold");
		sp.getPhone();
		
		sp = new SmartPhone("Cream","Samsung");
		sp.getPhone();
	
		sp = new SmartPhone("그라파이트", "IPhone",2000000);
		sp.getPhone();
	
		// Todo 두번째 자식클래스 인스턴스
		SmartPhone2 sp4 = new SmartPhone2();
		
		sp4.setPhone("바이올렛");
		sp4.getPhone();
	
		// color, model
//		sp4 = new SmartPhone2();
//		sp4.color = "바이올렛";
//		
		// color, model, price
//		sp4.model = "갤럭시 S22"
//		sp4.getPhone();
//		
//		sp4.setPhone("스카이블루","갤럭시 S22 울트라", 3000000);
//		sp4.getPhone();
	}

}
