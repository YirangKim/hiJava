package ch05;

import java.util.Date;

public class ImportDate {

	// main 객체생성 static
	// main 반환값 없음 : Void
	public static void main(String[] args) {
		
		java.util.Date now1 = new java.util.Date();
		Date now2 = new Date();
		
		System.out.println(now1);
		System.out.println(now2);

	}

}
