package exam_jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BooksSelectTest {

	public static void main(String[] args) throws IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectDatabase.makeConnection("javauser","JAVA1234");
			stmt = conn.createStatement();
			
			StringBuffer sql = new StringBuffer();
			sql.append("select book_id,title,publicher,year,price ");
			sql.append("from books");
			rs =stmt.executeQuery(sql.toString());
			
			System.out.println("******Books 테이블 정보 출력*******");
			while(rs.next()) {
				System.out.print(rs.getInt("book_id") + "\t");
				System.out.print(rs.getString("title") + "\t");
				System.out.print(rs.getString("publicher") + "\t");
				System.out.print(rs.getString("year") + "\t");
				System.out.print(rs.getInt("price") + "\n");
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("책제목을 입력해주세요.");
			String title = br.readLine();
			
			StringBuffer sql2 = new StringBuffer();
			sql2.append("select book_id,title,publicher,year,price ");
			sql2.append("from books");
			sql2.append(" where title = '"+ title +"'");
			rs =stmt.executeQuery(sql2.toString());
			
			System.out.println("******사용자 입력 테이블 정보 출력*******");
			while(rs.next()) {
				System.out.print(rs.getInt("book_id") + "\t");
				System.out.print(rs.getString("title") + "\t");
				System.out.print(rs.getString("publicher") + "\t");
				System.out.print(rs.getString("year") + "\t");
				System.out.print(rs.getInt("price") + "\n");
			}
			
			
		}catch(SQLException s) {
			System.out.println("쿼리문 예러: "+s.getMessage());
		}
		
		
		
		

	}

}
