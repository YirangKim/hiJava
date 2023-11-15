package ch06;

import java.util.Scanner;

public class ArrayTest2B {

	public static void main(String[] args) {
		
		String[] 과목리스트 = { "국어", "영어", "수학", "과학", "기술" };
		
		과목리스트[2] = "음악";
		
		Scanner in = new Scanner(System.in);

		System.out.println("과목을 입력하세요>>");
		String 과목 = in.nextLine();
		

	}

}
