package chapter02;

// 자동 출력 하는 방법 
// windows -> preference -> save actions 검색 후 -> 체크박스 체크
import java.util.Scanner;

public class VariableBooleanType {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean bool1= true; //노랑색이 있는 이유 : 변수를 선언하고 사용하지 않아서
		boolean bool2= false;
		
		String name = in.nextLine();
		
		System.out.println(bool1);
		// 문자열로 인식
		System.out.printf("%s\n", bool2);
		
	}

}
