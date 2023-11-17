package ch07;

// 문제2

public class Test2 {
	
	public static void main(String[] agrs) {
	
     int sum = 0; // 초기화, sun에 0을 넣음 
     
	 int num[] = {10, 20, 30, 40, 50};
	 
	 int i;
	 
	 for(i=0; i < num.length; i++) {
		 System.out.println(num[i]); // i = 10, 20, 30, 40, 50
		 sum += num[i]; 
		// sum = sum + num[i]
		// 10  =   0 + 10 
		// 30  =  10 + 20
		// 60  =  30 + 30
		// 100 =  60 + 40
		// 150 =  100 + 50   
	 }
	 System.out.println(sum);
	}
}