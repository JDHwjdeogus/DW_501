package cafe.control;

import java.util.Scanner;

import cafe.BO.food_service;
import cafe.main.cafe_main;

public class order implements menu_able {

	@Override
	public boolean menu_active() { // 인터페이스(menu_able)가 가진 추상메소드
		
		food_service food = new food_service();
		
		// 로그인하지 않은 경우 주문을 하는 것도 메뉴를 보는 것도 할 수 없다. 로그인 시 실행
		if(cafe_main.user == null) {
			// cafe_main.user가 로그인된 상태라면 id email tel name을 가진 객체였을 것
			System.out.println("로그인 시 이용 가능한 서비스입니다.");
		} else {
			food.order_food( menu() );
		}
		return true;
	}
	
	// 해당 함수 실행 전 로그인이 된 상태여야만 한다.(menu_active)
	private int menu() {
		String[] mlist = {"거절", "닭볶음탕", "코코볼", "보쌈", "조개찜", "불고기", "건빵후레이크", "김치국", "연어초밥", "열라면", "순두부찌개", "불족발", "당당치킨", "낙곱새", "까르보나라", "마라탕", "부대찌개"};
		int i = 1;
		for(String m : mlist){
			System.out.println(i + ". " + m);
		}
		System.out.print("선택: ");
		return new Scanner(System.in).nextInt();
	}
	
}


// 오버로딩: 클래스 내부에서 이름만 같고 매개변수가 다른 형태로 여러 개의 서로 다 다른 함수를 정의하는 것
// 오버라이딩:  다른 클래스( 상속 관계에서 자식 또는 implements 되어있는 클래스)에 리턴타입 메소드의 이름, 매개변수 등을 모두 똑같이 정의하고 내용만 다르게 만드는 메소드. 
// 			 덮어쓰기와 같다. 기존의 함수를 내용만 변경한다는 뜻이다.
// 오버플로우: 네트워크 보안 이슈
