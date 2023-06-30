package exam_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {

	public static void main(String[] args) {
		//전체 책정보 조회
		readAllBook();

	}
	private static void readAllBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectDatabase.makeConnection("javauser","JAVA1234");
			
			StringBuffer sb = new StringBuffer();
			sb.append("select book_id,title,publicher,year,price ");
			sb.append(" from books order by book_id");
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			System.out.println("\n******** books 테이블 데이터 출력 ***********");
			System.out.printf("%s\t%-18s\t%6s\t%12s\t%s\n","책번호","책제목","출판사","출판연도","가격");
			
			while(rs.next()) {
				System.out.printf("%d\t",rs.getInt("book_id"));
				System.out.printf("%-24s",rs.getString("title"));
				System.out.printf("%-13s\t",rs.getString("publicher"));
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

}
