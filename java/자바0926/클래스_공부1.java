package 자바0926;
// class 작성 시, 첫글자는 항상 알파벳 대문자일 것
// class 안에 method가 존재.
// project > package > class > method(최소 단위)

class 붕어빵{
	public static String 붕어빵만들기(String 재료) {
		return 재료 + " 붕어빵을 만들었습니다!";
	}
	
	public static int 붕어빵수량파악(int 수량) {
		return 수량;
	}
}

class Pizza {
	public static void eatPizza() {
		System.out.println("파인애플 피자를 냠냠스...");
	}
	
	public static String orderPizza(String PizzaName, int amount) {
		return "사실 파인애플 피자밖에 팔지 않는다네.";
	}
	
}
public class 클래스_공부1 { 
	// 자바파일(소스파일) 이름으로 정해진 클래스만 접근지정자로 public이 붙는다. 즉, 자바 파일 내에사 유일하게 존재해야만 하는 접근지정자라는 것.  

	public static void main(String[] args) {
		// 메소드: 업무 분담, 클래스: 업무 분담
		
		Pizza p = new Pizza();
		// new Pizza(); => Pizza 클래스를 호출.
		System.out.println(p.orderPizza("쉬림프피자", 2));
		p.eatPizza();
		// Pizza 내 함수에 접근해 메인함수에서 호출.
		
		int x = 100;
		// int: 데이터 타입, x: 변수 이름, =: 대입연산자, 100: 데이터
		Pizza pp = new Pizza();
		// Pizza: 데이터 타입, pp: 클래스 객체 이름, new Pizza(); pp가 Pizza class로 생성된 객체임을 선언.
		
		붕어빵 슈붕 = new 붕어빵();
		System.out.println("\n" + 슈붕.붕어빵만들기("슈크림"));
		int 수량 = 슈붕.붕어빵수량파악(10);
		System.out.println("붕어빵은 " + 수량 +"개 있습니다.");
		
	}

}
