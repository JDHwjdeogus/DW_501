package house;

public class main_house {

	public static void main(String[] args) {
		// 클래스의 객체(인스턴스) 생성 방법
		// 클래스명 참조변수명 = new 클래스명(); -> 클래스명() 은 클래스생성자 메소드 호출
		
		/*
			tv t = new tv();
		
			aircon air = new aircon();
			computer com = new computer();
			air.brand = "하우젠";
			air.price = 1200000;
			System.out.println(air.brand + ", " + air.price);
			
			t.power();
			air.power();
		*/
		
		// tv t1 = new tv("삼성", 1230000);
		// tv t2 = new tv("엘지", 985000);
		// aircon air1 = new aircon("휘센", 940000);
		// aircon air2 = new aircon("위니아", 570000);
		// computer com1 = new computer("아서스", 780000);
		// aircon air3 = new aircon(); 
		// > 현재 매개변수가 있는 생성자밖에 없으므로 이건 오류. 따라서 생성자 함수 오버로딩 시 기본 형태의 메소드도 작성해주는 것이 좋다.
		
		
		
		// 다형성 - 다양한 여러 가지 형태의 성질을 가지는 것.
		// 자바 다형성 - 하나의 클래스로 여러 클래스를 표현할 수 있는 방식.
		house_item[] t = new tv[] {new tv("삼성", 1230000, 50), new tv("엘지", 985000, 45), new tv("삼성", 530000, 30), new tv("엘지", 375000, 32), new tv("삼성", 730000, 42)};
		house_item[] air = new aircon[] {new aircon("삼성", 1230000, 30), new aircon("엘지", 1985000, 55), new aircon("휘센", 1530000, 30), new aircon("하우젠", 1375000, 42), new aircon("위니아", 1730000, 22)};
		
		t[0].buy();
		air[1].buy();
		
		tv t1 = new tv();
		t1.brand = "";
		t1.price = 12;
		t1.inch = 20;
		
		// tv t4 = new house_item();
		
		
		// System.out.println(t1.toString()); 
		// 메소드는 반드시 실행하려는 메소드의 이름으로 실행된다.

		
		house_item t2 = new tv();
		t2.brand = "";
		t2.price = 22;
		// t2.inch = 22;
		
		tv t3 = (tv)t2;
		t3.inch = 22;
		
		
		int a = (int)3.14;
		float f = 3.14f;
		
		// 클래스 구별 연산자
		if( t3 instanceof aircon ) System.out.println("에어컨 객체 t3.");
		if( t3 instanceof tv ) System.out.println("티비 객체 t3.");
		
	}

} // main_house 클래스 끝


// 클래스 관계 - 상속, 포함
/*
	상속 - 부모자식 관계
	부모클래스 - 자식1 클래스
			- 자식2 클래스
			- 자식3 클래스
	<div style="width: 300px;"> <!-- 그러나 이 div의 font-size는 15px이 아님 -->
		<div style="font-size:15px"> <!-- 이 div의 최대 width: 300px -->
			<img>
			<input>
		<div>
	<div>
	
	상속관계의 존재 의의: 하위 객체에 대한 관리 용이 및 재활용성. - 자바의 상속이란 기존 클래스를 재사용해 새로운 클래스를 작성하는 것
	
				  : 코드의 중복성 제거
				  : 프로그램 생산성과 유지보수 효율성 증가
	
	포함관계: 코드를 재사용하는 방법. 상속과는 다름.
	상속과의 차이점: 포함은 다른 클래스를 자신의 변수로 사용하는 방법.
	- 상속: a는 b이다. 			> 에어컨은 가전제품이다.(논리적으로 성립) || 자동차는 타이어이다.(논리적 오류)
	- 포함: a는 b를 갖고 있다. 	> 자동차는 타이어를 갖고 있다.(논리 성립) || 에어컨은 가전제품을 갖고 있다.(논리적 오류)
	
	class a {
		int aa;
	}
	class b {
		a temp = new a();
	}
	
	extends: 확장
	tv 객체 + house_item 객체(super) >> tv 객체 기능
	
	
	변수의 초기화
	1. 생성자 함수를 통한 초기화: 생성자 함수 객체 생성 시 실행
	2. 초기화 블럭을 통한 초기화: 초기화 블럭은 프로그램이 로드된 뒤에 딱 한번만 실행
	3. 명시적 초기화: public int ch = 2;
	
	변수 초기화 순서
	인스턴스 변수 초기화 순서
		명시적 초기화 > 초기화 블럭 > 생성자 함수
	클래스 변수 초기화 순서
		명시적 초기화 > 초기화 블럭
	
	
*/
