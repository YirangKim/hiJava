package ch06;

public class ArrayTest3 {

	public static void main(String[] args) {
		
//		int[] korscore = new int[10];
//		korscore = [68, 65, 86, 91, 65, 78, 96, 76, 82, 75];
		
	    int[] korscore = {68, 65, 86, 91, 65, 78, 96, 76, 82, 75};
        sum(korscore);
	}
	
	public static void sun( int[] arr ) {
		
		int 합계 = 0;
//		float 평균 = 0f;
		for( int i=0; i<10; i++) {
			합계 += arr[i]; // 
		}
		
		System.out.println("국어점수 합계 >>" + 합계);
		System.out.println("국어점수 평균 >>" + 합계/arr.length + "점 입니다.");
	}

}
