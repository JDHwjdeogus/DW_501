package house;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class buyer {
	private int money = 10000000;
	private String name = "idden";
	private String special_note = "스위치가 갖고싶음";
	private List<house_item> buy_list = null;
	
	{
		// 인스턴스 초기화 블럭
		special_note = "모여봐요 동물의 숲이 하고싶음";
	}
	
	public buyer() {
		buy_list = new ArrayList<>();
		special_note = "스플래툰도 하고싶음";
	};
	
	public void buy(house_item item) { // 매개변수 다형성
		if(money < item.price) {
			System.out.println("구매 불가: 잔액이 부족합니다.");
			return;
		}
		buy_list.add(item);
		money -= item.price;
		DecimalFormat df = new DecimalFormat("###,###"); // 표시형
		System.out.println("현재 잔액: " + df.format(money) + "원");
	}
	
	public void buylist() {
		for(house_item item : buy_list) {
			System.out.println(item.toString());
		}
	}
	
	// 금액을 3자리씩 끊어서 콤마로 표현할 다른 방법: 정규식
	/*
		Integer.toString(money).replaceAll("\\B(?=(\\d{3})+(?!\\d))",","); // 정수 >> 문자열
		
	*/
	
	
	// 다형성으로 클래스 구헝을 만들지 않는다면
	/*
		public void buy(tv t) {}
		public void buy(aircon air) {}
		public void buy(computer c) {}
	*/
}
