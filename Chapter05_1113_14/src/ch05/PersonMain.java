package ch05;

public class PersonMain {

	public static void main(String[] args) {
		
		// 1 객체 생성 '클래스명'
		Person p = new Person();
		
		// p.name = "손흥민"
		// private 직접 접근 안됨 // private String name; 
		// public로 접근 : setName
		p.setName("손흥민");
		p.setAge(28);
		p.tell();
	}
}
