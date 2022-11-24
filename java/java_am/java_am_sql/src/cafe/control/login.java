package cafe.control;

import java.util.Scanner;

import cafe.BO.member_service;

public class login implements menu_able  {

	@Override
	public boolean menu_active() {
		Scanner sc = new Scanner(System.in);
		String id = null, pw = null;
		member_service ms = new member_service();
		
		boolean chk = true;
		
		do {
			System.out.print("아이디: ");
			 id = sc.nextLine();
			System.out.print("비밀번호(연락처): ");
			 pw = sc.nextLine();
			chk = ms.login(id, pw);	// 로그인 시도: true > 성공, false > 실패
			
			if(chk) { // 로그인 실패 시
				System.out.println("회원가입을 진행하시겠습니까? (y/n)");
				// 스캐너를 선언한 순간 그 자체가 객체이므로 굳이 입력받을 변수의 선언을 할 필요가 없다.
				if( sc.nextLine().equals("y") ) {
					new signin().menu_active();		// 이 자체가 객체이므로 저장할 변수를 선언하지 않아도 된다.
				}
			}
		}while(chk);
		// 로그인 성공 시 종료.
		
		return true;
	}
	
}
