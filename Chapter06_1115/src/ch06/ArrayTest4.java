package ch06;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		// {} : 메소드, 생성자, ? 
		 
		int[][] arr = new int[2][2]; /// 인스턴스 생성 : 주소
		
		int[] arr1 = {1, 2, 3, 4, 5}; // 초기화
//		System.out.println(arr1);
		
//		byte[][] arr = new byte[2][2];
//		System.out.println(arr);
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
	}

}
