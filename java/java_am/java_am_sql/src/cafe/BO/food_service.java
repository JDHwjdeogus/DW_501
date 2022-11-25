package cafe.BO;

import cafe.DAO.food_DAO;

public class food_service {
	private food_DAO fdao = new food_DAO();
	
	public void order_food(int seq){
		// 음식을 주문하면 실행되는 메소드
		// 주문한 음식을 DB와 비교하여 해당 음식의 테이블 내 정보를 공개
		fdao.food_list();
	}
}
