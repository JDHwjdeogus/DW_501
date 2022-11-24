package cafe.BO;

import cafe.DAO.member_DAO;

public class member_service {
	private member_DAO mdao = new member_DAO();
	
	
	public boolean sign_member(String id, String name, String tel, String email) {
		boolean check = mdao.id_check(id, email);
		
		// 중복일 경우
		if(check) {
			System.out.println("아이디 혹은 이메일이 중복되었습니다. \n");
			return false; 
		}
		else {
			mdao.member_insert(id, name, tel, email);
		}
		
		System.out.println("회원가입이 완료되었습니다. \n");
		// 중복 아닐 경우
		return true;
	}
	
	
	public boolean login(String id, String pw) {
		boolean chk = mdao.login(id, pw);
		
		if(chk) {			
			System.out.println("로그인 실패");
			return true;
		}
		else {		
			System.out.println("로그인 성공");
			return false;
		}
		
	}
}
