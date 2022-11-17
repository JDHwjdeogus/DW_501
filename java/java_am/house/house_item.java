package house;

public abstract class house_item {
	// public boolean onoff;
	
	public String brand;
	public int price;
	
	// 생성자 함수는 리턴값이 없으므로 리턴 타입도 정하지 않음
	public house_item() { 
		// 생성자 메소드, 메소드의 실행은 반드시 메소드 명으로 실행이 되어야 한다.
		// 상속 관계에선 이 기본 형태의 생성자 함수가 기본적으로 들어있으나 파라미터가 존재하는 형태로 오버로딩된 생성자 함수가 있다면 기본 형태도 명시를 해준다.
		// 다만 자식 클래스의 기본 생성자 함수는 딱히 this 나 super를 쓸 필요가 없다. 여기서는 공통적으로 적용할 기능(onoff = false)을 명시했다.
		// onoff = false;
		
		
	}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price; 
		// this는 현재 생성되는 객체.
	}
	
	@Override
	public String toString() {
		return "브랜드: " + brand + ", 금액: " + price;
	}
	
	public abstract void buy();
	// 클래스 내부에 추상 함수가 하나라도 존재할 경우 클래스도 추상클래스임을 선언해줘야 함: class 앞에 abstract 붙이라는 뜻
	// 추상클래스는 객체 생성을 할 수 없다. 객체를 생성하려면 반드시 자식 클래스가 필요하다.
	// 객체가 존재하기 위해선 컴퓨터가 'a'라는 이름의 10이라는 데이터가 들어감을 알려줘야 컴퓨터가 해당 변수 만큼의 메모리를 할당해주는 과정이 필요하다.
	// 그러나 추상 클래스는 인스턴스 메소드이면서 내용이(데이터가) 없으므로 컴퓨터가 공간을 할당해줄 수 없다.
	
	/*
		추상클래스는 추상함수(추상메소드)를 가질 수 있다.
		추상클래스는 객체 생성 불가능.
		
		추상화의 이유: 클래스의 중복성 제거, 가독성 증가, 에러율 감소, 유지보수 시간 단축 
	*/
	
	
//	public void buy() { // 불필요해져도 상속 관계의 메소드라면 남겨둬야 한다. (다형성)
//		System.out.println("구매 완료.");
//	}
	
	
//	public void power() {
//		onoff = !onoff;
//		if(onoff) System.out.println("전원 on");
//		else System.out.println("전원 off");
//	}
	
	
}
