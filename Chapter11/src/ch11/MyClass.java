package ch11;

public class MyClass <T> {
	
	T val; //인스턴스변수
	T getVal() { //메소드
		return val;
	}
	void setVal(T val) { //변수에 데이터를 저장하는 용도
		this.val = val;
	}

	public static void main(String[] args) { // static = 생성자해야함
		
		MyClass<String> myclass = new MyClass<String>();
		myclass.setVal("KING");
		System.out.println(myclass.getVal());
		
	}

}
