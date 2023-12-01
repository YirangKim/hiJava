package Code1;

import java.sql.ResultSet;
import java.util.Scanner;

public class ViewData {
	codeDriver cd = new codeDriver();
	
	void viewData() { 									//조회
    	Scanner insert = new Scanner(System.in);
    	System.out.println("1번 [전체 검색] | 2번 [이름으로 검색] | 3번 [카테고리별 검색]");
    	System.out.print("번호를 골라주세요! : ");
		int num = insert.nextInt();
		switch(num) {
		case 1 : 
		try {

			Scanner s = new Scanner(System.in);
			System.out.println("==================================================================== codeno1 도서목록 조회 ============================================================");
			System.out.println("===================================================================================================================================================");
			String viewStr1 = "SELECT * FROM codeno1";
			ResultSet result1 = cd.stmt.executeQuery(viewStr1);
			 while (result1.next()) {
				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t| 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날자 : "+result1.getString("대여날짜")+"\t | 반납날자 : "+result1.getString("반납날짜")+"\n"); }
			 System.out.println("===================================================================================================================================================");
		            System.out.println();
			System.out.println("");
			System.out.println("도서 목록을 불러왔습니다!");
		} catch(Exception e) {	
			System.out.println("데이터 조회 실패 이유 : " + e.toString());
				}
		break;
	

		case 2: 
		try {
			
			Scanner s = new Scanner(System.in);
			System.out.println("예) \"과\" 입력시 \"과\"와 관련된 책을 찾아줍니다. ");
		    System.out.print("찾고싶은 책 이름을 적어주세요 : ");
		    String keyword = s.nextLine();
		    System.out.println("==================================================================== codeno1 도서목록 조회 =================================================================");
			System.out.println("========================================================================================================================================================");
		    String viewStr1 = "SELECT * FROM codeno1 WHERE Bname LIKE '%" + keyword + "%'";
		    ResultSet result1 = cd.stmt.executeQuery(viewStr1);
		    while (result1.next()) {
		    	System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날자 : "+result1.getString("대여날짜")+"\t | 반납날자 : "+result1.getString("반납날짜")+"\n");
			}
			System.out.println("========================================================================================================================================================");
		    System.out.println();

		    System.out.println("'"+keyword+"'" +" (과)와 관련된 도서 목록을 불러왔습니다!");
		} catch (Exception e) {
		    System.out.println("데이터 조회 실패 이유 : " + e.toString());
		}
		break;
		case 3:
			try {
				
				Scanner s = new Scanner(System.in);
			    System.out.print("검색하고 싶은 카테고리를 고르세요.");
			    System.out.println();
			    System.out.println("1번 : 인문학 2번 : 소설 ");
			    int ka = s.nextInt();
				System.out.println("==================================================== codeno1 도서목록 조회 ===============================================================================");
				System.out.println("======================================================================================================================================================");
			    switch(ka) {
			    case 1 : String viewStr1 = "SELECT * FROM codeno1 WHERE Category = '인문학'";
			    ResultSet result1 = cd.stmt.executeQuery(viewStr1);
			    while (result1.next()) {
			    	System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날자 : "+result1.getString("대여날짜")+"\t | 반납날자 : "+result1.getString("반납날짜")+"\n"); 
				System.out.println("======================================================================================================================================================");
			    System.out.println();

			    }
			    case 2 : String viewStr2 = "SELECT * FROM codeno1 WHERE Category = '소설'";
			    ResultSet result2 = cd.stmt.executeQuery(viewStr2);
			    while (result2.next()) {
			    	System.out.print("| 번호 : " + result2.getString("Bookid") + "\t| " + "제목 : " + result2.getString("Bname")+"\t | 저자 : "+result2.getString("Author")+"\t | 카테고리 : "+result2.getString("Category")+"\t | 발행일 : " +result2.getString("dates") + "\t | 가격 : "+result2.getString("Price") +"\n");
				System.out.println("======================================================================================================================================================");
			    System.out.println();
			    }
			  }
			    System.out.println();
			    System.out.println("도서 목록을 불러왔습니다!");
			
		}
	
				catch (Exception e) {
			    System.out.println("데이터 조회 실패 이유 : " + e.toString());
			
	 
}		break;
		}
	}
}
