package cafe.BO;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import cafe.DAO.food_DAO;
import cafe.DAO.member_DAO;
import cafe.VO.member;
import cafe.VO.order_list;
import cafe.main.cafe_main;

public class myinfo_service {
	
	private member_DAO mdao = new member_DAO();
	private food_DAO fdao = new food_DAO();
	
	// 내 정보
	public void info() {
		DecimalFormat fmt = new DecimalFormat("###,###");
		member my = cafe_main.user;
		
		System.out.println("아이디: " + my.getId());
		System.out.println("이름: " + my.getName());
		System.out.println("연락처: " + my.getTel());
		System.out.println("이메일: " + my.getEmail());
		System.out.println("알러지: " + my.getAllergy());
		System.out.println("잔액: " + fmt.format(my.getMoney()) + "원");
		System.out.println();
	}
	
	// 내 주문내역
	public void order_list() {
		 List<order_list> list = fdao.order_select(cafe_main.user.getId());
		 Iterator<order_list> it = list.iterator();
		 // Iterator 란? 
		 // 컬렉션에 사용되는 인터페이스, 
		 // 컬렉션에 저장된 값을 순차적으로 조회하기 위한 인터페이스, 
		 // 컬렉션을 위해 만들어진 인터페이스 이다.
		 // 1회성
		 
		 while(it.hasNext()) {	// hasNext - 다음 공간에 데이터가 있는가. (유) rs.next()
			 order_list data = it.next();	// 딱 한번만 할 수 있다.
			 System.out.println("주문음식: " + data.getFood_name());
			 System.out.println("주문자: " + data.getAn_order());
			 System.out.println("주문금액: " + data.getPrice());
			 
			 String state = data.getDelivery_complete() == 0?"배달중":"배달완료";
			 System.out.println("배송상태: " + state);
			 System.out.println("요청사항: " + data.getMemo());
			 
		 }
	}
	
	// 내 지갑
	public void my_wallet() {
		
	}
}
