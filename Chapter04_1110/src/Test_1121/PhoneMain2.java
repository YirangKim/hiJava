package Test_1121;

public class PhoneMain2 {

	public static void main(String[] args) {
		
		// Todo 자식클래스 기본 생성자 이용하여 객체 생성
		// SmartPhone 자식클래스
		SmartPhone sp = new SmartPhone();
		
		// Todo 첫 번째 자식클래스를 이용하여 인스턴스 생성
		sp = new SmartPhone("PinkGold");
		sp.getPhone();
		
		// Todo 매개 변수 2개에 데이터를 입력
		sp = new SmartPhone("Cream","Samsung");
		sp.getPhone();
	
		// Todo 매개 변수 3개에 데이터를 입력
		sp = new SmartPhone("그라파이트", "IPhone",2000000);
		sp.getPhone();
	
		// Todo 두 번째 자식클래스를 이용하여 인스턴스 생성
		SmartPhone2 sp4 = new SmartPhone2();
		
		// Todo 색상 저장
		sp4.setPhone("바이올렛");
		// Todo 입력한 데이터가 출력
		sp4.getPhone();
	
		
		// Todo 메소드를 이용하여 2개에 데이터를 입력한다
		sp4.setPhone("바이올렛", "Samsung");
		// Todo 입력한 데이터가 출력
		sp4.getPhone();
		
		
		// Todo 메소드를 이용하여 3개에 데이터를 입력한다
		sp4.setPhone("바이올렛", "Samsung", 99999999);
		// Todo 입력한 데이터가 출력
		sp4.getPhone();
		

	}

}
