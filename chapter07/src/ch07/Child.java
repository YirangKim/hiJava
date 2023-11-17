package ch07;

public class Child extends Parent { //자식 클래스에서 extends 부모클래스 반드시
	
	int num = 100;
	String name = "이승만";
	
	
	void call() { // static 메모리저장, 내부에서만 활용 //void 반환값이 없다.
		super.call();
		System.out.println(name + "은 우리나라 초대 대통령입니다");
	}
	
    
	void showData() {
		
		// supper를 사용하면 부모클래스의 멤버를 호출한다
		System.out.println("조상 클래스의 변수 num=" + super.num); 
		
		// this를 사용하면 자신의 클래스에서 호출
		System.out.println("조상 클래스의 변수 num=" + this.num);
		
	}

}
