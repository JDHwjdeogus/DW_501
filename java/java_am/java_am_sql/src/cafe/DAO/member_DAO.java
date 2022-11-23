package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class member_DAO {
	
	private Connection conn = null; 	 // db 연결 정보를 저장
	private Statement st = null; 		 // sql 질의문을 db에 전달
	private PreparedStatement pt = null; // sql 질의문을 db에 전달 - Statement는 보안적으로 취약해서 정부에서는 PreparedStatement를 권장함
	private ResultSet rs = null;		 // sql 질의문 조회 결과를 저장
	
	public member_DAO() {  // 기본 생성자 메소드
		DriverLoad();
		connect();
		table_check();
	}
	
	public boolean member_insert(String id, String name, String tel, String email) {
		String sql = "insert into member(id,name,tel,email) values(?,?,?,?) ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.executeUpdate();
			
			// query: select. 조회하는 경우 사용 || update: 변경, 추가, 삭제
			
			System.out.println("insert 문제 있음");
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("insert 문제 있음");
		}
		return false;
	}
	
	private void table_make() {
		String sql = "create table member( member_seq int auto_increment primary key , id varchar(50) not null, name varchar(20) not null, tel varchar(20) not null, email varchar(255) not null)";
		
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("member table 생성");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void table_check() {
		String sql = "select COUNT(*) as cnt from information_schema.tables where table_schema='dw_501' and table_name='member'"; 
		// mysql 기준 sql문. 만들어준 table명: informatiom_schema. 
		// member라는 table에 dw_501이 있느냐
		
		try {
			st = conn.createStatement(); // 접속 정보로 질의문을 저장할 수 있는 객체 생성
			// db에 sql 전달하는 변수 st에 sql 질의문 (sql)을 넣고 연결정보 (conn)에 전달
			rs = st.executeQuery(sql);	 // 만들어둔 질의문을 저장해여 연결된 db에 전달하고 결과를 받음
			// select가 아닐 경우 executeQuery 사용하지 않음
			
			if(rs.next()) {	
				// rs.next() -> rs에 결과값이 있는가 없는가 확인 후 rs에서 값을 가져와야 한다.
				/*
					ResultSet(rs) 구조:
					[정보(rs)]
					[결과		]	<< rs.next()
					[		]
					[		]
					[		]
				*/
				
				int cnt = rs.getInt("cnt");
				if(cnt == 0) table_make();
				
			}
			rs.close();
			st.close();
			// conn.close();
			
			/*
			 	rs, st, conn 닫아주는 이유
			 	db에 한번 접속 할 때마다 접속 스레드가 발생하는데, 자바에서 이걸 이용해 결과를 받아오는 것.
			 	이 스레드를 아예 닫아주지 않을 경우 접속 스레드가 누적되어 사용하지도 않는 스레드들이 쌓이면 컴퓨터의 속도를 저하시키는 원인이 된다.
			 	그렇다고 무조건 전부 닫아버리면 클라이언트 쪽에서 접속하는 과정이 느려진다.
			 	
			 	따라서 스레드를 열고 닫는데 적당한 조정이 필요하다.
			 	이를 해결하기 위해 등장한 것이 커넥션 풀: 커넥션 관리 범위를 정해둔다 (ex. 최소 스레드 50 최대 스레드 1000으로 제한을 둔다던가...)
			 	
			 	일단 해당 실습에서는 클라이언트가 나말고 없으므로 무조건 닫아두도록 한다.
			*/
			
		} catch(SQLException e) {
			e.printStackTrace(); 	// 오류에 대한 정보 출력
		}
	}
	
	private void connect() {
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

/*
	자바 - db 연결
	1. 연결할 db의 드라이버 로드: 많이 사용되는 db 드라이버는 내장되어있다. >> 경로만 알고 있으면 된다. 드라이버가 없다면 해당 db의 웹사이트에서 얻을 수 있다.
	2. 드라이버 로드를 하면 db와 자바 프로그램 간 연결이 이루어진다.
	3. db와 연결을 하였다면 db에 로그인을 시도한다.
	4. db 계정을 갖고 로그인을 해야 한다: db의 주소, 계정명, 비밀번호가 필요하다.
	
	
*/