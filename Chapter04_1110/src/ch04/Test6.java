package ch04;

public class Test6 {

	public static void main(String[] args) {
		for ( int i = 0; i < 5; i++) { // i = 0 1 2 3 4 
			for ( int j=0; j <= i; j++ )
		System.out.println("#");
		System.out.println();
		}
	}

}

int i = 0, j=0;

while ( i<5 ) { // i = 0 1 2 3 4
	while( j <= i ) {
		System.out.println("#");
		j++
	}
	System.out.println();
	i++
}