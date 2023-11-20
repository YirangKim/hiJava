package ch07;

public class ClassTypeChange3 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		
		Phone phone1 = androidPhone; //여기서는 자식타입에서 부코타입으로 가는 것은 자동타입변경 가능 
		Phone phone2 = iPhone; // 다형성 //Phone자식을 phone2부모에게
		
		System.out.println(phone1.getClass().getName()); //자료 타입 확인
		System.out.println(phone2.getClass().getName());
		
		IPhone iPhone1 = null; //IPhone 초기화
		
		if(phone2 instanceof IPhone) { // 참
			iPhone1 = (IPhone) phone2; // 변수 phone2의 타입은 Phone(부모) 
									   // iPhone1 변수 타입은 IPhone(자식)
			iPhone1.call(); // 
			
			
		} else {
			System.out.println("자료형1 변환 불가");
		}
		
		IPhone iPhone2 = null; //IPhone 초기화
		
		if(phone1 instanceof IPhone) {
			iPhone2 = (IPhone)phone1; // phone1 강제 변환하면 iPhone2
			iPhone2.call(); 
		} else {
			System.out.println("자료형2 변환 불가");
		}
	}

}
