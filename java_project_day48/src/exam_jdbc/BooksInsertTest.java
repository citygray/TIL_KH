package exam_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BooksInsertTest {

	public static void main(String[] args) {
		addBook("java정석","도우출판","2020",32000);

	}
	
	private static void addBook(String title,String publicher,String year,int price) {
		Connection con = ConnectDatabase.makeConnection("javauser","JAVA1234");
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			
			StringBuffer sb = new StringBuffer();
			sb.append("Insert into books(book_id,title,publicher,year,price)");
			sb.append(" VALUES (books_seq.nextval, ");
			sb.append("'"+title+"','"+publicher+"','");
			sb.append(year+"',"+price+")");
			
			System.out.println("쿼리문 확인: "+ sb);
			
			int insertCount = stmt.executeUpdate(sb.toString());
			
			if(insertCount == 1) {
				System.out.println("레코드 추가 성공");
			}else {
				System.out.println("레코드 추가 실패");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(Exception en){
				en.printStackTrace();
			}
		}
		
	}

}
