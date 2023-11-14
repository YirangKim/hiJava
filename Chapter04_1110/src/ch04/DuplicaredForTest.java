package ch04;

public class DuplicaredForTest {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) { // i= 1 2 3 4 5 6 7 8 9
		
			for(int j =2; j < 10; j++) { // j = 2 3 4 5 6 7 8 9 
				// 10되면 탈출해서 12줄갔다가 7줄
				System.out.print( j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}

	}

}
