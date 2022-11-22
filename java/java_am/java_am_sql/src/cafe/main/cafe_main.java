package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	
	static Scanner sc = new Scanner(System.in);

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
		
		try {

			System.out.println("1. 주문");
			System.out.println("2. 로그인");
			System.out.println("3. 이벤트");
			System.out.println("4. 회원가입");
			System.out.println("5. 종료");
			System.out.print("선택: ");
			select = sc.nextInt();
			
			if(select < 1 || select > 5) 
				throw new InputMismatchException("잘못된 입력.");
		}catch(Exception e) {
			System.out.println( e.getMessage() );
			sc.nextLine();
			select = main_menu();
		}
		return select;
	}
}
