package ch04;

public class WhileLoopContinue {

	public static void main(String[] args) {
		
		int num = 0;
		
		while (++num < 10) {
			
			if ( num %2 == 1) { // n = 1 2 3 4 5 6 7 8 9
			// num %2 == 1 참이 되면 continue
		    // 건너뜀 16줄 출력을 안함
				continue;
			} 
			System.out.println(num);
		}
	}

}
