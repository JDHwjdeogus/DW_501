package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cafe.VO.member;
import cafe.main.cafe_main;

public class member_DAO extends base_DAO {
	/*
		private Connection conn = null; 	 // db 연결 정보를 저장
		private Statement st = null; 		 // sql 질의문을 db에 전달
		private PreparedStatement pt = null; // sql 질의문을 db에 전달 - Statement는 보안적으로 취약해서 정부에서는 PreparedStatement를 권장함
		private ResultSet rs = null;		 // sql 질의문 조회 결과를 저장
	*/
	
	// 기본 생성자 메소드
	public member_DAO() {  
		table_check();
	}
	
	
	// 로그인
	public boolean login(String id, String pw) {
		// member 테이블에서 id와 tel이 일치하는지 확인
		String sql = "select * from member where id=? and tel=? ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs = pt.executeQuery();
			
			if(rs.next()) { 
				// 로그인 성공
				cafe_main.user = new member( rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5) );
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 로그인 실패
		return true;
	}
	
	// 아이디 이메일 중복 확인
	public boolean id_check(String id, String email) {
		//  member 테이블에서 입력받은 id 또는 email 이 있는지 확인
		String sql = "select * from member where id=? or email=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, email);
			rs = pt.executeQuery();
			if(rs.next()) {	
				// id 혹은 email이 있는 경우: rs.next()에 값이 있음. 중복이라는 의미.
				return true;
			}
			System.out.println("id_check 문제 없음");
			
		} catch(SQLException e) {
			e.printStackTrace(); 
			System.out.println("id_check 문제 있음");
		}
		
		// rs에 값이 없다면 id 혹은 email이 없는 경우
		return false;
	}
	
	
	public boolean member_insert(String id, String name, String tel, String email) {
		String sql = "insert into member(id,name,tel,email) values(?,?,?,?) ";
		// member table에 입력받은 id 또는 email 이 있는지?
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.executeUpdate();
			
			// query: select. 조회하는 경우 사용 || update: 변경, 추가, 삭제
			
			System.out.println("member_insert 문제 없음");
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("member_insert 문제 있음");
		}
		return false;
	}
	
	
	private void table_make() {
		String sql = "create table member( member_seq int auto_increment primary key , id varchar(50) not null, name varchar(20) not null, tel varchar(20) not null, email varchar(255) not null)";
		
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("table_make 문제 없음");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("table_make 문제 있음");
		}
	}
	
	
	private void table_check() {
		String sql = "select COUNT(*) as cnt from information_schema.tables where table_schema='dw_501' and table_name='member'"; 
		// mysql 기준 sql문. 만들어준 table명: informatiom_schema. 
		// member라는 table이 dw_501에 있느냐
		
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
	
	
	
	
	
}

/*
	자바 - db 연결
	1. 연결할 db의 드라이버 로드: 많이 사용되는 db 드라이버는 내장되어있다. >> 경로만 알고 있으면 된다. 드라이버가 없다면 해당 db의 웹사이트에서 얻을 수 있다.
	2. 드라이버 로드를 하면 db와 자바 프로그램 간 연결이 이루어진다.
	3. db와 연결을 하였다면 db에 로그인을 시도한다.
	4. db 계정을 갖고 로그인을 해야 한다: db의 주소, 계정명, 비밀번호가 필요하다.
	
	
*/