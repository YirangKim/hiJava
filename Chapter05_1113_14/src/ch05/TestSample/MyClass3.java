package ch05.TestSample;

public class MyClass3 {
	
	protected String name;
	
	public MyClass3 {
		System.out.println("생성자 실행");
		this.name = "이름없음"; //this("이름없음");
	}
	
	public MyClass3 (String name){
		this.name = name;
	}

	public static void main(String[] args) {
		
		MyClass3 my = new MyClass3();

	}

}
