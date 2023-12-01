package Code1;

import java.sql.ResultSet;
import java.util.Scanner;

public class BookRent {
	codeDriver cd = new codeDriver();
	void dates() {
		try {
			Scanner s = new Scanner(System.in);
			String viewStr2 = "SELECT * FROM codeno1 where 반납날짜 is null";
		    ResultSet result2 = cd.stmt.executeQuery(viewStr2);
		    System.out.println("========================================================================대출 가능 도서 목록==========================================================");
		    while (result2.next()) {
		    		System.out.print("| 번호 : " + result2.getString("Bookid") + "\t| " + "제목 : " + result2.getString("Bname")+"\t | 저자 : "+result2.getString("Author")+"\t | 카테고리 : "+result2.getString("Category")+"\t | 발행일 : " +result2.getString("dates") + "\t | 가격 : "+result2.getString("Price") +"\t | 대여날자 : "+result2.getString("대여날짜")+"\t | 반납날자 : "+result2.getString("반납날짜")+"\n");
		    }System.out.println("===============================================================================================================================================");
		    System.out.println();
		    
		            System.out.print("빌리고 싶은 책번호를 입력하세요! ");
		            int a = s.nextInt();
		            System.out.println("도서 대출이 완료되었습니다.");
		    			String changeStr = "UPDATE codeno1 SET 반납날짜 = DATE_ADD(now(), INTERVAL 1 WEEK) WHERE Bookid ="+ a;
		            	cd.stmt.executeUpdate(changeStr);
		            	String changeStr1 = "UPDATE codeno1 SET 대여날짜 =now() WHERE Bookid ="+ a;
		            	cd.stmt.executeUpdate(changeStr1);
		            	
		         
		    
		
	} catch (Exception e) {
	    System.out.println("데이터 조회 실패 이유 : " + e.toString());
		
		}

	}
}