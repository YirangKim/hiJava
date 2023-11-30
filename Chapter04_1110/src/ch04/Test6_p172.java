package ch04;

public class Test6_p172 {

	public static void main(String[] args) {
		for ( int i = 0; i < 5; i++) { // i = 0 1 2 3 4 
			for ( int j=0; j <= i; j++ ) //j <= i
		System.out.print("#");
		System.out.println();
		}

	}
}

	/*
 i가 j보다 클때 참

  j <= i

  0 <= 0
#
  1 <= 0
# 0
# 1
# 2
  3 <= 2
 */

