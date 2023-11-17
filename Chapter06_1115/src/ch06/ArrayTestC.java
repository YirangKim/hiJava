package ch06;

public class ArrayTestC {

	public static void main(String[] args) {
		
		//123을 while문으로 출력
		
		int num[] = new int[10];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		num[7] = 8;
		num[8] = 9;
		num[9] = 10;
		
		
		int i=0;
		
		while( i < num.length) {
			System.out.println(num[i]);
			i++;
	 
		}
		
		}
}


