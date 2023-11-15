package ch05.other; //상속하는 클래스와 다른 패키지

import ch05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected{

	public static void main(String[] args) {
		
		//객체 생성
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "손흥민"; //상속제어자가 Protected 이기 때문에 상속 관계에서도 접근 가능
		mpe.age = 28; // default 상속 관계 접근 불가
		// 패키지가 서로 다를 경우에는 접근 거부
		mpe.tell(); // Protected 상속 접근 가능
		
	}

}
