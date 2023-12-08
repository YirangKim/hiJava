package ch10;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		try {
			System.out.println("참조 하고자 하는 배열의 index값을 입력하세요");
			int index = sc.nextInt();
			System.out.println("numbers["+index+"]="+ numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index의 범위를 벗어납니다");
			e.printStackTrace();
		}

	}

}
