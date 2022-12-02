package generic;

import java.util.ArrayList;

public class main_method {
	public static void main(String[] args) {
		/*
		 * 
			ArrayList list = new ArrayList<>();
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(3.28);
			list.add("idden");
			System.out.println(list);
		// 해당 배열 리스트는 어떤 타입의 데이터든 넣을 수 있지만, 문자열 비교 함수인 equals를 사용해 문자열을 찾으려면 오류가 난다.
		
			ArrayList<Integer> i_list = new ArrayList<>();
			i_list.add(100);
			i_list.add(200);
			i_list.add(300);
			// i_list.add(3.28);
			// i_list.add("idden");
			System.out.println(list);
		// 해당 리스트는 int 타입 데이터만 저장할 수 있다.
		 * 
		*/
		
		/*
		 * 
		// 두가지의 장점을 모두 통합한 게 제너릭
			seafood<String> sea = new seafood<String>();
			sea.store("파이");
			System.out.println(sea.판매());
			// sea.store(1200); 	// seafood<String> sea 라고 선언했기에 int타입 변수는 못넣음.
			
			seafood_box<오징어> 오징어박스 = new seafood_box();	//seafood_box 객체인데 오징어 타입인 seafood_box 객체.
			오징어박스.setBox(new 오징어()); 	// 오징어 타입 객체를 오징어박스(seafood_box) 안에 넣기.
			오징어박스.sellBox();
			
			seafood_box<새우> 새우박스 = new seafood_box();
			새우박스.setBox(new 새우());
			새우박스.sellBox();
			
			// 오징어박스.setBox(new 참치());	// 제네릭이 오징어로 선언된 객체에 참치 타입의 객체를 넣으려고 하면 오류가 난다.
		 * 
		 */
		
		seafood_box<seafood> 해산물박스 = new seafood_box<>();
		해산물박스.setBox(new seafood());
		해산물박스.setBox(new 오징어());
		해산물박스.setBox(new 참치());
		해산물박스.setBox(new 새우());
		// 해산물박스.setBox(new 소고기());
		
		// 제너릭에 상속을 이용하면 제한을 걸어둘 수 있음: public class seafood_box<T extends seafood>{...}
		//										이렇게 선언하면 이제 seafood 혹은 seafood를 상속받는 클래스만 seafood_box에 들어갈 수 있다.
		// seafood_box<소고기> 소고기박스 = new seafood_box<>();		
		// 소고기박스.setBox(new 소고기());
		
		seafood_box<새우> 새우박스 = new seafood_box<>();
		새우박스.setBox(new 새우());
		
		seafood_box<오징어> 오징어박스 = new seafood_box<>();
		오징어박스.setBox(new 오징어());
		
		// 부모 클래스여도 제네릭 타입이 다르면 오류난다.
		//해산물 박스 = new seafood_box<새우>();
		
		구매 구매자 = new 구매();
		구매자.buy(오징어박스);
		구매자.buy(새우박스);
		
		
	}
}
