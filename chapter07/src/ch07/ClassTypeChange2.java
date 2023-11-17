package ch07;

//상위 클래스 타입 변수가 하위 클래스 타입으로 변경 
//강제형변환

public class ClassTypeChange2 {

	public static void main(String[] args) {
		
		// AndroidPhone 참조형
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		
		Phone phone1 = androidPhone; 
		Phone phone2 = iPhone; // iPhone이 자동 형변환하여  Phone로 변환하다
		
		// IPhone iPhone1 = phone2; //phone2는 부모 클래스:Phone이기 때문에 자식 클래스 형식으로 자동 변환이 안된다
		IPhone iPhone1 = (IPhone) phone2; // 형 변환

		IPhone iPhone2 = (IPhone) phone1; //오류
		// 강제 변환 통해서 참조 타입이 변화된다
	}

}
