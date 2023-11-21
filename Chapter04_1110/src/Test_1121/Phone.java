package Test_1121;

public class Phone {
	
	// 필드 = 전역변수
	// Todo. 자료형
	String color;
	String model;
	int price;
	
	// 초기화 : 값이 들어갈 공간 
	// main에서 생성자(new) 사용하기 위해
	// 기본생성자 객체 생성자:
	Phone() {};
	
	// String color 매개변수 
	// 매개변수 지정해주면, main에 값을 추가하여 출력할수있음
	Phone(String color){
		// Todo. this.color값
		this.color = color;
		this.model = "갤럭시-S22";
		this.price = 1000000;
	}
	
	Phone(String color, String model){
		this.color = color;
		this.model = model;
		this.price = 2000000;
	}
	
	Phone(String color, String model, int price ){
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	// 입력 받는 메소드
	void setPhone(String color) { //반환값 없음
		this.color = color;
		this.model = "갤럭시-S22";
		this.price = 12300000;
	}
	
	void setPhone(String color, String model){
		this.color = color;
		this.model = model;
		this.price = 23400000;
	}
	
	void setPhone(String color, String model, int price ){
		// Todo. 소괄호에 들어갈 내용
		// this( color, model ); 생성자에서는 되는데 메소드에선 안됨
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	// 출력받는 메소드
	// Todo. 3개의 변수의 데이터를 출력
	void getPhone() {
		System.out.println(color + " " + model + " " +price);
		
	}

	
}
