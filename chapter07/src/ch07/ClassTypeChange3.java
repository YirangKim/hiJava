package ch07;

public class ClassTypeChange3 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		
		Phone phone1 = androidPhone; // Phone부모 androidPhone자식을 phone1부모에게 
		Phone phone2 = iPhone; // Phone부모 iPhone자식을 phone2부모에게
		
		IPhone iPhone1 = null; //IPhone 초기화
		
		if(phone2 instanceof IPhone) {
			iPhone1 = (IPhone) phone2; // phone2 강제 변환하면 iPhone1
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
