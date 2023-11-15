package ch05;

public class Person {
	
	// private 직접 접근 안됨
	// static이 붙으면 정적변수, 객체생성 x : 싱글톤 패턴
	private String name; //필드 구성, 전역번수 (동적변수 )
	private int age;

	
	// public 접근 허용
	public String getName() {
		return name;
	}
	
	public void setName(String name) { // 지역변수(내부o, 외부x)이면서 매개변수
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell() {
		System.out.println("안녕하세요." + age + "살" + name + "입니다.");
		//return 0; 종료해라
	}

}
