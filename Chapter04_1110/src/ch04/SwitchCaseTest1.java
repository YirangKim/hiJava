package ch04;

public class SwitchCaseTest1 {

	public static void main(String[] args) {
		
		int score = 3;

		switch (score / 10) { // 결과 9.3
			case 10 : 
				System.out.println("만점");
				break;
			case 9 : 
				System.out.println("A");
				break;
			case 8 : 
				System.out.println("B");
				break;
			case 7 : 
				System.out.println("C");
				break;
			case 6 : 
				System.out.println("D");
				break;
			default : 
				System.out.println("F");
				break;			
			// 비교 데이터가 case값과 일치하지 않고 default가 없는 경우에는 
			// 화면에는 아무것도 출력되지 않는다
		}
	}

}
