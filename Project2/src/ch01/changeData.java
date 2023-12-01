package ch01;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;
import java.util.*;
import java.sql.Connection;

public class changeData {
    
	void changeData() {
	    Scanner change = new Scanner(System.in);

	    System.out.println("==== 도서 정보 수정 ====");
	    System.out.println("1. 전체 수정 "); // case 1
	    System.out.println("2. 부분 수정"); // case 2

	    int num = change.nextInt();

	    switch (num) {
	        case 1:
	            try {
	                System.out.println("수정할 도서의 Bookid 입력: ");
	                int bookID = change.nextInt();
	                change.nextLine();

	                System.out.print("도서명 :");
	                String bname = change.nextLine();

	                System.out.print("작가 :");
	                String author = change.nextLine();

	                System.out.print("카테고리 :");
	                String category = change.nextLine();

	                System.out.print("출판사 :");
	                String publisher = change.nextLine();

	                System.out.print("출판일 :");
	                String dates = change.nextLine();

	                System.out.print("가격 :");
	                int price = change.nextInt();

	                String changeStr = "UPDATE codeno1 SET Bname= '" + bname + "', Author= '" + author + "', Category='"
	                        + category + "', Publisher='" + publisher + "', Dates='" + dates + "', Price=" + price
	                        + " WHERE Bookid=" + bookID;

	                stmt.executeUpdate(changeStr);
	                System.out.println("데이터 변경 성공!");
	            } catch (Exception e) {
	                System.out.println("등록 실패 : " + e.toString());
	            }
	            break;

	        case 2:
	            System.out.println("==== 부분 수정할 정보 번호를 입력 하세요 ====");
	            System.out.println("1. 도서명 ");
	            System.out.println("2. 저자 ");
	            System.out.println("3. 출판사 ");
	            System.out.println("4. 가격 ");

	            int num2 = change.nextInt();

	            try {
	                switch (num2) {

	                    case 1:
	                        try {
	                            System.out.println("수정할 도서의 Bookid 입력: ");
	                            int bookID = change.nextInt();
	                            change.nextLine();

	                            System.out.print("도서명 :");
	                            String bname = change.nextLine();

	                            String changeStr = "UPDATE codeno1 SET Bname= '" + bname + "' WHERE Bookid=" + bookID;

	                            stmt.executeUpdate(changeStr);
	                            System.out.println("데이터 변경 성공!");
	                        } catch (Exception e) {
	                            System.out.println(e.toString());
	                        }
	                        break;

	                    case 2:
	                        try {
	                            System.out.println("수정할 도서의 Bookid 입력: ");
	                            int bookID = change.nextInt();
	                            change.nextLine();

	                            System.out.print("저자 :");
	                            String author = change.nextLine();

	                            String changeStr = "UPDATE codeno1 SET Author= '" + author + "' WHERE Bookid=" + bookID;

	                            stmt.executeUpdate(changeStr);
	                            System.out.println("데이터 변경 성공!");
	                        } catch (Exception e) {
	                            System.out.println(e.toString());
	                        }
	                        break;

	                    case 3:
	                        try {
	                            System.out.println("수정할 도서의 Bookid 입력: ");
	                            int bookID = change.nextInt();
	                            change.nextLine();

	                            System.out.print("출판사 :");
	                            String publisher = change.nextLine();

	                            String changeStr = "UPDATE codeno1 SET Publisher= '" + publisher + "' WHERE Bookid="
	                                    + bookID;

	                            stmt.executeUpdate(changeStr);
	                            System.out.println("데이터 변경 성공!");
	                        } catch (Exception e) {
	                            System.out.println(e.toString());
	                        }
	                        break;

	                    case 4:
	                        try {
	                            System.out.println("수정할 도서의 Bookid 입력: ");
	                            int bookID = change.nextInt();
	                            change.nextLine();

	                            System.out.print("가격 :");
	                            int price = change.nextInt();

	                            String changeStr = "UPDATE codeno1 SET Price = " + price + " WHERE Bookid=" + bookID;

	                            stmt.executeUpdate(changeStr);
	                            System.out.println("데이터 변경 성공!");
	                        } catch (Exception e) {
	                            System.out.println(e.toString());
	                        }
	                        break;

	                    default:
	                        System.out.println("유효하지 않은 선택입니다.");
	                }
	            } catch (Exception e) {
	                System.out.println(e.toString());
	            }
	            break;

	        default:
	            System.out.println("유효하지 않은 선택입니다.");
	    }
	}
}
