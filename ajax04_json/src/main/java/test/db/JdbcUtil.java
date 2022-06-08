package test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil { 
	public static Connection getCon() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {	
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url,"C##scott","tiger");
			return con;
					
		}catch(ClassNotFoundException ce) {
			System.out.println("����̹� �ε�����"+ce.getMessage());
		}catch(SQLException se) {
			System.out.println("db���ӽ���"+se.getMessage());
		}
		return null;
}
	
public static void close(Connection con) {
	try {
		if(con!=null) con.close();
		
	}catch(SQLException se) {
		System.out.println(se.getMessage());
	}
}

public static void close(PreparedStatement pstmt) {
	try {
		if(pstmt!=null) pstmt.close();
		
	}catch(SQLException se) {
		System.out.println(se.getMessage());
	}
}

public static void close(ResultSet rs) {
	try {
		if(rs!=null) rs.close();
		
	}catch(SQLException se) {
		System.out.println(se.getMessage());
	}
}
	
public static void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
	try {
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(con!=null) con.close();
		
	}catch(SQLException se) {
		System.out.println(se.getMessage());
	}
	
}	
	
}
