package chapter02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		// Scanner 메모리에 저장되어있는 상태
		Scanner sc = new Scanner(System.in);
		
		// 이름 입력받기
		System.out.println("이름을 입력하세요 >>");
		// String 문자열
		// sc.nextLine(); 키보드 입력
		String name;
		
		name = sc.nextLine();
		// System.out.println("안녕하세요. " + name + "님. 반갑습니다.");
		// sc.close();
		
		
		//true, false
		System.out.println("true나 false를 선택하세요");
		Boolean a = sc.nextBoolean();
		
		// 나이 입력 받기
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		// System.out.println("당신의 나이는" + age + "입니다" );
		
		// 몸무게 입력 받기
		System.out.println("몸무게 입력: ");
		double weight = sc.nextDouble();
		// System.out.println("당신의 몸무게는" + weight + "입니다" );
		
		//입력 받은 정보 전부 출력
		System.out.println("안녕하세요 " + name + "님! 당신은" + age + "살 이고, 몸무게는" + weight + "" );
		// Scanner를 닫음
		// 메모리 관리
		sc.close();

	}

}
