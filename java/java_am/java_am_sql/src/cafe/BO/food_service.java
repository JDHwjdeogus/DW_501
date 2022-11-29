package cafe.BO;

import java.util.Map;
import java.util.Scanner;

import cafe.DAO.food_DAO;
import cafe.VO.food;
import cafe.VO.order_list;
import cafe.main.cafe_main;

public class food_service {
	private food_DAO fdao = new food_DAO();
	private Scanner sc = new Scanner(System.in);
	
	public boolean order_food(int seq){
		// 음식을 주문하면 실행되는 메소드
		// 주문한 음식을 DB와 비교하여 해당 음식의 테이블 내 정보를 공개
		Map<Integer, food> map = fdao.food_list();
		if(map != null) {
			food my_Order = map.get(seq);
			System.out.println();
			System.out.println( "주문한 음식: " + my_Order.getFood_name() );
			System.out.println( "조리시간: " + my_Order.getCook_time() );
			System.out.println( "금액: " + my_Order.getCost() );
			System.out.println( "알러지 성분: " + my_Order.getAllergy() );
			
			String[] tmp = cafe_main.user.getAllergy().split(",");
			for(String all : tmp) {		// 알레르기에 대해 묻는 부분 전체
				if(my_Order.getAllergy().contains(all) && !(tmp.equals("없음")) ) {
					System.out.println();
					System.out.println("주문하신 음식은 알레르기 유발 음식입니다.");
					System.out.print("계속 주문하시겠어요? (y/n)");
					if( sc.nextLine().equals("n") ) {
						return true;	// 알레르기 때문에 다른 음식을 주문하는 경우 
					}
					break;
				}
			}	// 이 반복문이 정상적으로 종료되면 주문을 계속 진행
			
			// 주문 내역 DB에 저장하기 위한 코드
			System.out.print("\n주문 요청사항: ");
			String memo = sc.nextLine();
			order_list cont = new order_list( my_Order.getFood_name(), cafe_main.user.getId(), my_Order.getCost(), memo );
			fdao.order_insert(cont);
		}
		else {
			System.out.println("관리자에게 문의하세요.");
			return true;	// 프로그램 코드(DB) 문제로 실행되지 않은 경우
		}
		return false;		// 주문이 정상적으로 처리가 된 경우
	}
}
