package exam_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String title,publisher,year;
		int book_id,price;
		
		//전체 책정보 조회
		readAllBook();
		
		System.out.println("\n******** book테이블 데이터 입력 *************");

		System.out.println("책제목 입력 : ");
		title = input.nextLine();
		System.out.println("출판사 입력 : ");
		publisher = input.nextLine();
		System.out.println("출판연도 입력 : ");
		year = input.nextLine();
		System.out.println("가격 입력 : ");
		price = input.nextInt();
		
		System.out.println("책번호 : ");
		book_id = input.nextInt();
		
		//데이터 입력
		//addBook(title,publisher,year,price);
		
		
		//데이터 수정
		updateBook(title,publisher,year,price,book_id);
		input.close();
	}
	
	private static void updateBook(String title, String publisher, String year, int price, int book_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
						
			conn = ConnectDatabase.makeConnection("javauser","JAVA1234");
			
			StringBuffer sb = new StringBuffer();
			sb.append("update books set title = ?, publisher = ?, year = ? ");
			sb.append(", price = ? where book_id = ?");
			
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1,title);
			pstmt.setString(2,publisher);
			pstmt.setString(3,year);
			pstmt.setInt(4,price);
			pstmt.setInt(5,book_id);
			
			int updateCount = pstmt.executeUpdate();
			
			if(updateCount == 1) {
				System.out.println("레코드 수정 성공");
			}else {
				System.out.println("레코드 수정 실패");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close();}
				if(conn != null) {conn.close();}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}

	private static void readAllBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectDatabase.makeConnection("javauser","JAVA1234");
			
			StringBuffer sb = new StringBuffer();
			sb.append("select book_id,title,publisher,year,price ");
			sb.append(" from books order by book_id");
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			System.out.println("\n******** books 테이블 데이터 출력 ***********");
			System.out.printf("%s\t%-18s\t%6s\t%12s\t%s\n","책번호","책제목","출판사","출판연도","가격");
			
			while(rs.next()) {
				System.out.printf("%d\t",rs.getInt("book_id"));
				System.out.printf("%-24s",rs.getString("title"));
				System.out.printf("%-13s\t",rs.getString("publisher"));
				System.out.printf("%S\t",rs.getInt("year"));
				System.out.printf("%d\n",rs.getInt("price"));
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception en){
				en.printStackTrace();
			}
		}
	}

	
	@SuppressWarnings("unused")
	private static void addBook(String title, String publisher,String year, int price) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectDatabase.makeConnection("javauser","JAVA1234");
			
			StringBuffer sb = new StringBuffer();
			sb.append("INSERT INTO books(book_id,title,publisher,year,price)");
			sb.append("VALUES(books_seq.nextval,?,?,?,?)");
			
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1,title);
			pstmt.setString(2,publisher);
			pstmt.setString(3,year);
			pstmt.setInt(4,price);
			
			int insertCount = pstmt.executeUpdate();
			
			if(insertCount == 1) {
				System.out.println("레코드 추가 성공");
			}else {
				System.out.println("레코드 추가 실패");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close();}
				if(conn != null) {conn.close();}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	
}
