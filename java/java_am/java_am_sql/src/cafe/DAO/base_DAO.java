// member food 객체의 db접속 방법은 동일하므로 부모 클래스로 하나 빼줌
package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class base_DAO {
	protected Connection conn = null; 	 // db 연결 정보를 저장
	protected Statement st = null; 		 // sql 질의문을 db에 전달
	protected PreparedStatement pt = null; // sql 질의문을 db에 전달 - Statement는 보안적으로 취약해서 정부에서는 PreparedStatement를 권장함
	protected ResultSet rs = null;		 // sql 질의문 조회 결과를 저장
	
	public base_DAO() {
		DriverLoad();
		Connect();
	}
	
	private void Connect() {
		// db 주소 -> jdbc:mysql://데이터베이스서버주소:mysql-port/DB명
		String url = "jdbc:mysql://localhost:3306/dw_501";
		String user = "root";	// mysql 유저명
		String pass = "1234";	// mysql 비밀번호
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속 실패");
		} 
		
	}
	
	
	private void DriverLoad() {
		try {
			// 자바엔 이름이 Class인 클래스가 존재
			// com.mysql.cj.jdbc.Driver 가 안될 경우: com.mysql.jdbc.Driver 로 주소를 변경
			Class.forName("com.mysql.cj.jdbc.Driver"); // 문자열을 클래스화
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패.");
		} 
		
		/*
			예시:  Class.forName("cafe.control.order");
			-> 드라이버 로드라는 작업은 해당 db와 연결해주는 클래스를 컴퓨터 메모리에 로드(적재) 해주는 작업.
		*/
	}
	
	
}
