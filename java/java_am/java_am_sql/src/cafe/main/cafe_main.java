package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.VO.member;
import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	// 클래스변수는 비권장사항으로서, 대신 세션으로 작업하는 게 맞지만 그냥 진행
	static Scanner sc = new Scanner(System.in);
	public static member user = null;

	public static void main(String[] args) {
		/*
			order o = new order();
			login l = new login(); // 패키지가 다르므로 임포트 해준다.
			event e = new event(); // 패키지가 다르므로 임포트 해준다.
		*/
		
		menu_able[] menu = {new order(), new login(), new event(), new signin(), new exit()};
		
		while(menu[main_menu() -1 ].menu_active());
		/*
			{
				menu[main_menu() -1 ].menu_active();
				
				
					배열의 인덱스로 선택하는 동작을 만들 수 있으므로(== 다형성을 구현해줬으므로) 선택하는 동작을 구현하기 위해 만든 switch문이 필요없어짐
					예
					switch(main_menu()) {
					case 1: 	// 주문
						
						break;
					case 2: 	// 로그인
						
						break;
					case 3: 	// 이벤트
						
						break;
					case 4: 	// 회원가입
						break;
					case 5: 	// 종료
						return;
					}
				
			}
		*/
		
	}
	
	public static int main_menu() { // 클래스 메서드( main_menu() ): 클래스 메서드에서만 사용
		int select = 0;
		
		String[] menu = {"주문", "로그인", "이벤트", "회원가입", "종료"};
		
		try {

			for(int i = 1; i <= menu.length; i++) {
				if( user != null && (i == 2 || i == 4) ) continue;
				System.out.println(i + ". " + menu[i - 1]);
			}
			System.out.print("선택: ");
			select = sc.nextInt();
			
			if(select < 1 || select > 5) 
				throw new InputMismatchException("잘못된 입력.");
			
			System.out.println();
			
		}catch(Exception e) {
			System.out.println( e.getMessage() );
			sc.nextLine();
			select = main_menu();
		}
		return select;
	}
}

