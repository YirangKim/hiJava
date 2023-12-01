package Code1;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DelectView {
	   void removeData() {
		   
		     codeDriver cd = new codeDriver();
	         Scanner sc = new Scanner(System.in);
	         System.out.println("=== 메뉴를 선택하세요=== ");
	         System.out.println("1.   테이블 행    전체 삭제"); // case 1
	         System.out.println("2.   테이블 행    일부 삭제"); // case 2
	         System.out.println("3.   도서명검색    전체 삭제"); // case 3
	         System.out.println("4.   저자검색     전체 삭제"); // case 4
	         System.out.println("5.   카테고리검색   전체 삭제"); // case 5
	         System.out.println("6.   출판사검색    전체 삭제"); // case 6
	         System.out.println("7.   출판일검색    전체 삭제"); // case 7
	         System.out.println("8.   가격검색      전체 삭제"); // case 8
	         int menu = sc.nextInt();
	         
	         switch(menu) {
	         case 1:
	         try {
	               Scanner delete = new Scanner(System.in);
	               
	               System.out.print("전체 행 삭제 테이블 이름을 입력하세요 :" );
	                 String tableName = delete.nextLine();
	               
	               String removeStr = "DELETE TABLE"  + tableName +  "";
	                 cd.stmt.executeUpdate(removeStr);
	               System.out.println("전체 행 삭제 성공!");
	          } catch(Exception e) {
	               System.out.println("전체 행 삭제 실패 이유  "+ e.toString());
	          }
	         break;
	         
	         case 2:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("일부 행 삭제할 테이블 이름을 입력하세요 : ");
	                  String tableName = delete.nextLine();

	                  // 이미 존재하는 bookid 목록을 가져오기
	                  String existingBookidsQuery = "SELECT bookid FROM " + tableName;
	                  ResultSet existingBookidsResult = cd.stmt.executeQuery(existingBookidsQuery);

	                  // 이미 존재하는 bookid를 저장할 Set
	                  Set<Integer> existingBookids = new HashSet<>();
	                  while (existingBookidsResult.next()) {
	                      existingBookids.add(existingBookidsResult.getInt("bookid"));
	                  }

	                  // 삭제 가능한 bookid 목록을 출력
	                  System.out.println("===삭제 가능한 BOOKID 번호===");
	                  int count = 0;
	                  for (int existingBookId : existingBookids) {
	                      System.out.print(existingBookId + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.println();  // 마지막 줄바꿈

	                  System.out.print("삭제할 BOOKID 번호를 입력하세요 : ");
	                  int targetBookid = delete.nextInt();
	                  delete.nextLine();

	                  if (existingBookids.contains(targetBookid)) {
	                      String removeStr = "DELETE FROM " + tableName + " WHERE bookid=" + targetBookid;
	                      cd.stmt.executeUpdate(removeStr);
	                      System.out.println("일부 행 삭제 성공!");
	                      System.out.println("============================");
	                  } else {
	                      System.out.println("입력한 BOOKID 가 삭제 가능한 목록에 없습니다.");
	                  }
	              } catch (Exception e) {
	                  System.out.println("삭제 가능한 BOOKID 확인 및 삭제 중 에러 발생 : " + e.toString());
	                  System.out.println("일부 행 삭제 실패 이유   " + e.toString());
	              }
	              break;
	         
	         case 3:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("삭제할 테이블 이름을 입력하세요");
	                  String tableName = delete.nextLine();
	               // 이미 존재하는 도서명 목록을 가져오기
	                  String existingBooknamesQuery = "SELECT DISTINCT Bname FROM " + tableName;
	                  ResultSet existingBooknamesResult = cd.stmt.executeQuery(existingBooknamesQuery);

	                  // 이미 존재하는 도서명을 저장할 Set
	                  Set<String> existingBooknames = new HashSet<>();
	                  while (existingBooknamesResult.next()) {
	                      existingBooknames.add(existingBooknamesResult.getString("Bname"));
	                  }

	                  // 삭제 가능한 도서명 목록을 출력
	                  System.out.println("===삭제 가능한 도서명 목록===");
	                  int count = 0;
	                  for (String existingBookname : existingBooknames) {
	                      System.out.print(existingBookname + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.print("삭제할 도서명을 입력하세요 :");
	                  String Bname = delete.nextLine();
	                  
	                  String removeStr = "DELETE FROM " + tableName + " WHERE Bname='" + Bname + "'";
	                  cd.stmt.executeUpdate(removeStr);
	                  
	                  System.out.println("도서명검색 전체 삭제 성공!");
	                  System.out.println("============================");
	              } catch (Exception e) {
	                 System.out.println("삭제 가능한 도서명 목록 확인 중 에러 발생: " + e.toString());
	                  System.out.println("도서명검색 전체 삭제 실패 이유   " + e.toString());
	                 
	              }
	              break;
	              
	         case 4:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("삭제할 테이블 이름을 입력하세요 :");
	                  String tableName = delete.nextLine();
	                  // 이미 존재하는 저자 목록을 가져오기
	                  String existingAuthorsQuery = "SELECT DISTINCT Author FROM " + tableName;
	                  ResultSet existingAuthorsResult = cd.stmt.executeQuery(existingAuthorsQuery);

	                  // 이미 존재하는 저자를 저장할 Set
	                  Set<String> existingAuthors = new HashSet<>();
	                  while (existingAuthorsResult.next()) {
	                      existingAuthors.add(existingAuthorsResult.getString("Author"));
	                  }

	                  // 삭제 가능한 저자 목록을 출력
	                  System.out.println("===삭제 가능한 저자 목록===");
	                  int count = 0;
	                  for (String existingAuthor : existingAuthors) {
	                      System.out.print(existingAuthor + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.print("삭제할 저자를 입력하세요 :");
	                  String Author = delete.nextLine();

	                  String removeStr = "DELETE FROM " + tableName + " WHERE Author='" + Author + "'";
	                  cd.stmt.executeUpdate(removeStr);

	                  System.out.println("저자검색 전체 삭제 성공!");
	                  System.out.println("============================");
	              } catch (Exception e) {
	                 System.out.println("삭제 가능한 저자 목록 확인 중 에러 발생: " + e.toString());
	                  System.out.println("저자검색 전체 삭제 실패 이유   " + e.toString());
	              }
	              break;
	              
	         case 5:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("삭제할 테이블 이름을 입력하세요 :");
	                  String tableName = delete.nextLine();
	               // 이미 존재하는 카테고리 목록을 가져오기
	                  String existingCategoriesQuery = "SELECT DISTINCT Category FROM " + tableName;
	                  ResultSet existingCategoriesResult = cd.stmt.executeQuery(existingCategoriesQuery);

	                  // 이미 존재하는 카테고리를 저장할 Set
	                  Set<String> existingCategories = new HashSet<>();
	                  while (existingCategoriesResult.next()) {
	                      existingCategories.add(existingCategoriesResult.getString("Category"));
	                  }

	                  // 삭제 가능한 카테고리 목록을 출력
	                  System.out.println("===삭제 가능한 카테고리 목록===");
	                  int count = 0;
	                  for (String existingCategory : existingCategories) {
	                      System.out.print(existingCategory + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.print("삭제할 카테고리를 입력하세요 :");
	                  String Category = delete.nextLine();

	                  String removeStr = "DELETE FROM " + tableName + " WHERE Category='" + Category + "'";
	                  cd.stmt.executeUpdate(removeStr);

	                  System.out.println("카테고리검색 전체 삭제 성공!");
	                  System.out.println("============================");
	              } catch (Exception e) {
	                 System.out.println("삭제 가능한 카테고리 목록 확인 중 에러 발생: " + e.toString());
	                  System.out.println("카테고리검색 전체 삭제 실패 이유   " + e.toString());
	              }
	              break;
	              
	         case 6:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("삭제할 테이블 이름을 입력하세요 :");
	                  String tableName = delete.nextLine();

	               // 이미 존재하는 출판사 목록을 가져오기
	                  String existingPublishersQuery = "SELECT DISTINCT Publisher FROM " + tableName;
	                  ResultSet existingPublishersResult = cd.stmt.executeQuery(existingPublishersQuery);

	                  // 이미 존재하는 출판사를 저장할 Set
	                  Set<String> existingPublishers = new HashSet<>();
	                  while (existingPublishersResult.next()) {
	                      existingPublishers.add(existingPublishersResult.getString("Publisher"));
	                  }

	                  // 삭제 가능한 출판사 목록을 출력
	                  System.out.println("===삭제 가능한 출판사 목록===");
	                  int count = 0;
	                  for (String existingPublisher : existingPublishers) {
	                      System.out.print(existingPublisher + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.print("삭제할 출판사를 입력하세요 :");
	                  String Publisher = delete.nextLine();

	                  String removeStr = "DELETE FROM " + tableName + " WHERE Publisher='" + Publisher + "'";
	                  cd.stmt.executeUpdate(removeStr);

	                  System.out.println("출판사검색 전체 삭제 성공!");
	                  System.out.println("============================");
	              } catch (Exception e) {
	                 System.out.println("삭제 가능한 출판사 목록 확인 중 에러 발생: " + e.toString());
	                 System.out.println("출판사검색 전체 삭제 실패 이유   " + e.toString());
	                  
	              }
	              break;
	              
	         case 7:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("삭제할 테이블 이름을 입력하세요 :");
	                  String tableName = delete.nextLine();

	               // 이미 존재하는 출판일 목록을 가져오기
	                  String existingDatesQuery = "SELECT DISTINCT Dates FROM " + tableName;
	                  ResultSet existingDatesResult = cd.stmt.executeQuery(existingDatesQuery);

	                  // 이미 존재하는 출판일을 저장할 Set
	                  Set<Integer> existingDates = new HashSet<>();
	                  while (existingDatesResult.next()) {
	                      existingDates.add(existingDatesResult.getInt("Dates"));
	                  }

	                  // 삭제 가능한 출판일 목록을 출력
	                  System.out.println("삭제 가능한 출판일 목록:");
	                  int count = 0;
	                  for (int existingDate : existingDates) {
	                      System.out.print(existingDate + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.print("삭제할 출판일을 입력하세요 :");
	                  String Dates = delete.nextLine();
	                  delete.nextLine();  // 버퍼 비우기

	                  String removeStr = "DELETE FROM " + tableName + " WHERE Dates=" + Dates;
	                  cd.stmt.executeUpdate(removeStr);

	                  System.out.println("출판일검색 전체 삭제 성공!");
	                  System.out.println("============================");
	              } catch (Exception e) {
	                 System.out.println("삭제 가능한 출판일 목록 확인 중 에러 발생: " + e.toString());
	                 System.out.println("출판일검색 전체 삭제 실패 이유   " + e.toString());
	               
	              }
	              break;
	              
	         case 8:
	              try {
	                  Scanner delete = new Scanner(System.in);

	                  System.out.print("삭제할 테이블 이름을 입력하세요 :");
	                  String tableName = delete.nextLine();

	               // 이미 존재하는 가격 목록을 가져오기
	                  String existingPricesQuery = "SELECT DISTINCT Price FROM " + tableName;
	                  ResultSet existingPricesResult = cd.stmt.executeQuery(existingPricesQuery);

	                  // 이미 존재하는 가격을 저장할 Set
	                  Set<Integer> existingPrices = new HashSet<>();
	                  while (existingPricesResult.next()) {
	                      existingPrices.add(existingPricesResult.getInt("Price"));
	                  }

	                  // 삭제 가능한 가격 목록을 출력
	                  System.out.println("===삭제 가능한 가격 목록===");
	                  int count = 0;
	                  for (int existingPrice : existingPrices) {
	                      System.out.print(existingPrice + " ");
	                      count++;

	                      // 한 행에 10개 출력 후 개행
	                      if (count % 10 == 0) {
	                          System.out.println();
	                      }
	                  }
	                  System.out.println();
	                  System.out.print("삭제할 가격을 입력하세요 :");
	                  int Price = delete.nextInt();
	                  delete.nextLine();  // 버퍼 비우기

	                  String removeStr = "DELETE FROM " + tableName + " WHERE Price=" + Price;
	                  cd.stmt.executeUpdate(removeStr);

	                  System.out.println("가격검색 전체 삭제 성공!");
	                  System.out.println("============================");
	              } catch (Exception e) {
	                 System.out.println("삭제 가능한 가격 목록 확인 중 에러 발생: " + e.toString());
	                  System.out.println("가격검색 전체 삭제 실패 이유   " + e.toString());
	              }
	              break;
	         }
	           }

}
