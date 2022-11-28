package cafe.BO;

import java.util.Map;

import cafe.DAO.food_DAO;
import cafe.VO.food;
import cafe.main.cafe_main;

public class food_service {
	private food_DAO fdao = new food_DAO();
	
	public void order_food(int seq){
		// 음식을 주문하면 실행되는 메소드
		// 주문한 음식을 DB와 비교하여 해당 음식의 테이블 내 정보를 공개
		Map<Integer, food> map = fdao.food_list();
		if(map != null) {
			food my_Order = map.get(seq);
			System.out.println( "주문한 음식: " + my_Order.getFood_name() );
			System.out.println( "조리시간: " + my_Order.getCook_time() );
			System.out.println( "금액: " + my_Order.getCost() );
			System.out.println( "알러지 성분: " + my_Order.getAllergy() );
			
			String[] tmp = cafe_main.user.getAllergy().split(",");
			for(String all : tmp) {
				if(my_Order.getAllergy().contains(all) && !(tmp.equals("없음")) ) {
					System.out.println("주문하신 음식은 알레르기 유발 음식입니다.");
				}
			}
		}
		else {
			System.out.println("관리자에게 문의하세요.");
		}
	}
}
