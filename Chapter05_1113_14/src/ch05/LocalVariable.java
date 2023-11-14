package ch05;

public class LocalVariable {
		
		void method(int num) {
			
			int lv = 10; //화면 출력
			
			if ( num > 10 ) {
				boolean check = true; //화면 출력
			} else {
				boolean check = false; //화면 출력 
			}
			
			
			for ( int i=0; i < 5; i++ ) {
				System.out.println(i); //화면 출력
			}
			
			while ( lv < 0) {
				int lv2 = 0;
				System.out.println(lv2); 
			}
		}

	}


