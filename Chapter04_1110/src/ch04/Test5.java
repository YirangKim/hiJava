package ch04;

public class Test5 {

	public static void main(String[] args) {
		int i = 0, j = 0, k = 0;
		OUTER : for ( i=0; i <10; i++) // i = 0 1 2 3 4 5 6 7 8 9
				MIDDLE : for ( j=0; j < 3; j++) // j = 0 1 2 
					INNER : for ( k=0; k < 4; k++ ) { // k = 0 1 2 3
						if ( i==4 && j ==2 ) break OUTER;
					}
		System.out.println( i ); // i = 4
		System.out.println( j ); // j = 2
		System.out.println( k ); // k = ? 
	}

}
