package cafe.control;

import java.util.Scanner;

import cafe.BO.myinfo_service;
import cafe.main.cafe_main;

public class myinfo implements menu_able {
	
	// myinfo class: 로그인 한 회원의 정보 확인, 주문내역 확인, 지갑 확인
	
	private myinfo_service mysvc = new myinfo_service();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean menu_active() {
		if( cafe_main.user == null ) {
			System.out.printf("로그인 먼저 해주세요%n=============================%n");
			return true;
		}
		System.out.println("1. 내정보 | 2. 주문내역 | 3. 내지갑");
		int select = sc.nextInt();
		switch(select) {					// 위 메뉴를 선택했다면 그에 맞는 동작을 실행
		case 1: mysvc.info(); break;		// 내정보 메뉴 선택 시
		case 2: mysvc.order_list(); break;	// 주문내역 메뉴 선택 시
		case 3: mysvc.my_wallet(); break;	// 내 지갑 메뉴 선택 시
		
		}
		
		return true;
	}

}
