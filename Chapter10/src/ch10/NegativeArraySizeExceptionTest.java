package ch10;

import java.util.Scanner;

public class NegativeArraySizeExceptionTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = null;

        try {
            System.out.println("배열의 사이즈 값을 입력하세요");
            int size = sc.nextInt();
            numbers = new int[size];

            System.out.println();
        } catch (NegativeArraySizeException e) {
            System.out.println("배열 생성 시에 배열의 사이즈를 음수로 지정할 수 없습니다");
            e.printStackTrace();
        }

    }
}