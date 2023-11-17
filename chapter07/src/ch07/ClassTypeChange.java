package ch07;

// 하위 클래스 타입 변수가 상위 클래스 타입으로 변경 
// 자동형변환

public class ClassTypeChange {

	public static void main(String[] args) {
		
		//AndroidPhone 참조형
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		
		Phone phone1 = (Phone) androidPhone; // 형변환 연산자를 이용해서 강제변환했다
		phone1.call();
		
		Phone phone2 = androidPhone; // 형변환 자동 형 변환
		phone2.call();

	}

}
