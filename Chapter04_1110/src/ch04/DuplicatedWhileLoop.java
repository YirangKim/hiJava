package ch04;

public class DuplicatedWhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		
		while (i<10) { // i = 1 2 3 4 5 6 7 8 9
			
			int j=2;
			while(j<10) { // j = 2 3 4 5 6 7 8 9 //10되면 나가고 i++ 
				System.out.print(j + "x" + i + "= " + j*i + "\t");
				j++;
			}
			//2x1=2	3x1=3	4x1=4	5x1=5	6x1=6	7x1=7	8x1=8	9x1=9	
			System.out.println();
			i++;
			
		}

	}

}
