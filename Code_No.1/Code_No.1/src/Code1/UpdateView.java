package Code1;

import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateView {
	
	void changeData() {
		
	codeDriver cd = new codeDriver();
	Scanner change = new Scanner(System.in);
	    
	  try {
	   String viewStr1 = "SELECT * FROM codeno1";
	   ResultSet result1 = cd.stmt.executeQuery(viewStr1);
	   System.out.println("========================================================================================================================================================================================================");
	      while (result1.next()) {
	          System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 출판사 : "+result1.getString("Publisher")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날자 : "+result1.getString("대여날짜")+"\t | 반납날자 : "+result1.getString("반납날짜")+"\n"); }
	       System.out.println("========================================================================================================================================================================================================");
	  }catch (Exception e) {
	      System.out.println(e.toString());
	  }
	  
	   System.out.println("====== 도서 정보 수정 ======");
	   System.out.print("수정할 도서의 번호를 입력하세요> ");
	   int bookID = change.nextInt();
	   change.nextLine();
	   
	   System.out.println("==== 부분 수정할 있는 번호들 ====");
	   System.out.println("1번 [도서명] ");
	   System.out.println("2번 [저자] ");
	   System.out.println("3번 [카테고리] ");
	   System.out.println("4번 [출판사] ");
	   System.out.println("5번 [발행년] ");
	   System.out.println("6번 [가격] ");
	   System.out.print("수정하고 싶은 번호를 고르세요 : ");
	   int num = change.nextInt();
	         
	      try { 
           switch(num) {
           		
              case 1:
                       try {
                           System.out.print("수정할 도서의 제목을 입력하세요 : ");
                           change.nextLine(); 
                           String bname = change.nextLine(); // 수정 내용 입력
                           
                           // 수정 내용 업데이트
                           // 회고 : 수정하고, 수정내용 맞냐, 서버 업데이트
                           // 정답 : 수정하고, 서버 업데이트, 내용이 맞냐
                           String changeStr = "UPDATE codeno1 SET Bname= '" + bname + "' WHERE Bookid=" + bookID;
                           cd.stmt.executeUpdate(changeStr);
                           
                           //출력
                           // try(while)-catch 
                           try {
                    	       String viewStr1 = "SELECT * FROM codeno1 WHERE Bookid= " + bookID + " ";
                    	       ResultSet result1 = cd.stmt.executeQuery(viewStr1);
                    	       System.out.println("==============================================================================================================================================================");
                    			 while (result1.next()) { // 조건 에 맞는 테이블 데이터를 한행만 나오려면 bookID
                    				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날자 : "+result1.getString("대여날짜")+"\t | 반납날자 : "+result1.getString("반납날짜")+"\n"); }
                    			 System.out.println("==============================================================================================================================================================");
                    	      }catch (Exception e) {
                                  System.out.println(e.toString());
                              }
                           
                           // 내용확인
                           System.out.println("정보가 정상적으로 입력되었습니다.");
                           
                          
                       } catch (Exception e) {
                           System.out.println(e.toString());
                       }
                       break;

                   case 2:
                       try {
                           System.out.print("수정할 저자명을 입력하세요 : ");
                           change.nextLine(); 
                           String author = change.nextLine();

                           String changeStr = "UPDATE codeno1 SET Author= '" + author + "' WHERE Bookid=" + bookID;
                           cd.stmt.executeUpdate(changeStr);
                           
                           try {
                    	       String viewStr1 = "SELECT * FROM codeno1 WHERE Bookid= " + bookID + " ";
                    	       ResultSet result1 = cd.stmt.executeQuery(viewStr1);
                    	       System.out.println("==============================================================================================================================================================");
                    			 if (result1.next()) { // 결과가 있다면 한 행만 출력
                    				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날자 : "+result1.getString("대여날짜")+"\t | 반납날자 : "+result1.getString("반납날짜")+"\n"); }
                    			 System.out.println("==============================================================================================================================================================");
                    	      }catch (Exception e) {
                                  System.out.println(e.toString());
                              }
                           
                           System.out.println("데이터 변경 성공!");
                       } catch (Exception e) {
                           System.out.println(e.toString());
                       }
                       break;

                   case 3:
                       try {
                           System.out.print("수정할 카테고리를 입력하세요 : ");
                           change.nextLine(); 
                           String category = change.nextLine();

                           String changeStr = "UPDATE codeno1 SET Category = '" + category + "' WHERE Bookid="
                                   + bookID;
                           cd.stmt.executeUpdate(changeStr);
                           
                           try {
                    	       String viewStr1 = "SELECT * FROM codeno1 WHERE Bookid= " + bookID + " ";
                    	       ResultSet result1 = cd.stmt.executeQuery(viewStr1);
                    	       System.out.println("==============================================================================================================================================================");
                    			 while (result1.next()) { // 한행만 나오려면 bookID
                    				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날짜 : "+result1.getString("대여날짜")+"\t | 반납날짜 : "+result1.getString("반납날짜")+"\n"); }
                    			 System.out.println("==============================================================================================================================================================");
                    	      }catch (Exception e) {
                                  System.out.println(e.toString());
                              }
                           
                           
                           System.out.println("데이터 변경 성공!");
                       } catch (Exception e) {
                           System.out.println(e.toString());
                       }
                       break;

                   case 4:
                       try {
                           System.out.print("수정할 출판사명 입력하세요 :");
                           change.nextLine(); 
                           String publisher = change.nextLine();

                           String changeStr = "UPDATE codeno1 SET Publisher= '" + publisher + "' WHERE Bookid="
                                   + bookID;
                           cd.stmt.executeUpdate(changeStr);
                           
                           try {
                    	       String viewStr1 = "SELECT * FROM codeno1 WHERE Bookid= " + bookID + " ";
                    	       ResultSet result1 = cd.stmt.executeQuery(viewStr1);
                    	       System.out.println("==============================================================================================================================================================");
                    			 while (result1.next()) { // 한행만 나오려면 bookID
                    				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날짜 : "+result1.getString("대여날짜")+"\t | 반납날짜 : "+result1.getString("반납날짜")+"\n"); }
                    			 System.out.println("==============================================================================================================================================================");
                    	      }catch (Exception e) {
                                  System.out.println(e.toString());
                              }
                           
                           System.out.println("데이터 변경 성공!");
                       } catch (Exception e) {
                           System.out.println(e.toString());
                       }
                       break;

                   case 5:
                       try {
                           System.out.print("수정할 발행년을 입력하세요:");
                           change.nextLine();
                           String dates = change.nextLine();

                           String changeStr = "UPDATE codeno1 SET Dates = '"+dates + "' WHERE Bookid=" + bookID;
                           cd.stmt.executeUpdate(changeStr);
                           
                           try {
                    	       String viewStr1 = "SELECT * FROM codeno1 WHERE Bookid= " + bookID + " ";
                    	       ResultSet result1 = cd.stmt.executeQuery(viewStr1);
                    	       System.out.println("==============================================================================================================================================================");
                    			 while (result1.next()) { // 한행만 나오려면 bookID
                    				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날짜 : "+result1.getString("대여날짜")+"\t | 반납날짜 : "+result1.getString("반납날짜")+"\n"); }
                    			 System.out.println("==============================================================================================================================================================");
                    	      }catch (Exception e) {
                                  System.out.println(e.toString());
                              }
                           
                           System.out.println("데이터 변경 성공!");
                       } catch (Exception e) {
                           System.out.println(e.toString());
                       }
                       break;
  
                   case 6:
                       try {
                           System.out.print("수정할 가격을 입력하세요:"); 
                           
                           change.nextLine();
                           int price = change.nextInt();
                           
                           String changeStr = "UPDATE codeno1 SET Price  = " + price + " WHERE Bookid=" + bookID;
                           cd.stmt.executeUpdate(changeStr);
                           
                           try {
                    	       String viewStr1 = "SELECT * FROM codeno1 WHERE Bookid= " + bookID + " ";
                    	       ResultSet result1 = cd.stmt.executeQuery(viewStr1);
                    	       System.out.println("==============================================================================================================================================================");
                    			 while (result1.next()) { // 한행만 나오려면 bookID
                    				 System.out.print("| 번호 : " + result1.getString("Bookid") + "\t| " + "제목 : " + result1.getString("Bname")+"\t | 저자 : "+result1.getString("Author")+"\t | 카테고리 : "+result1.getString("Category")+"\t | 발행일 : " +result1.getString("dates") + "\t | 가격 : "+result1.getString("Price") +"\t | 대여날짜 : "+result1.getString("대여날짜")+"\t | 반납날짜 : "+result1.getString("반납날짜")+"\n"); }
                    			 System.out.println("==============================================================================================================================================================");
                    	      }catch (Exception e) {
                                  System.out.println(e.toString());
                              }
                           
                           System.out.println("데이터 변경 성공!");
                       } catch (Exception e) {
                           System.out.println(e.toString());
                       }
                       break;


           }
              
	      
	         } catch (Exception e) {
	                   System.out.println(e.toString());
	               }
	   }

}
