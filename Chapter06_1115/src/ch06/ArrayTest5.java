package ch06;

public class ArrayTest5 {

	public static void main(String[] args) {
		int[][] arr = {
						{100,90,80}, //1행
						{98,76,90}, //2행
						{85,84,77},	//3행
						{89,100,69}	//4행 : 0~3
					  }; //1열,2열,3열 : 0~2 (세로)
		
		//System.out.println(arr.length); // 4 행 중괄호 개수 
		//System.out.println(arr[0].length); // 3 열 중괄호 안에있는 데이터수
		
		int i;
		int j;

		for (i=0; i <arr.length; i++) // 행 개수
		for(j=0; j < arr[0].length; j++ ){ // 열 개수
//		System.out.println("arr[i][j] =>" + arr[i][j]);
		System.out.print("arr[" +i+ "][" +j+ "] =>" + arr[i][j] + ", \t");
		}
			System.out.println();
//		System.out.println("arr[0][0] =>" + arr[0][0]); 
//		System.out.println("arr[1][1] =>" + arr[1][1]);
//		System.out.println("arr[2][2] =>" + arr[2][2]);
//		System.out.println("arr[3][2] =>" + arr[3][2]);
	}

}
