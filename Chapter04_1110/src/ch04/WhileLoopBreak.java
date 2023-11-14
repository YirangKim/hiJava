package ch04;

public class WhileLoopBreak {

	public static void main(String[] args) {
		
		int num = 0;
		
		while ( true ) {
		if ( num == 5) {
			break; //반복문 중단 
		}

		System.out.println(num);
		
		num++; //5가 되면 탈출이 되는 증가식 
		
		// for ( int i=0; i < 5; i++) {
		//   System.out.println(i);
		// }

		}
	 }

	}


