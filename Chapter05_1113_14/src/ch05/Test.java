package ch05;

public class Test {

	int a;
	int b;
	
	//Test( ) { }
	
	Test( int a, int b) { //생성자 생성
		this.a = a; // 매개 변수에 전달 받은 데이터를 저장한다 // a같은거 쓰려면 this
		this.b = b; // 
	}

	
	// get 불러오다
	// set 저장하다
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	};
	
	}

