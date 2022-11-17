package house;
// buy()함수를 구현하지 않으면 main_house에서 추상메소드를 사용하는 것이 되어버리는데, 이럴 경우 tv를 추상클래스로 지정해줘야 하고 그렇게 되면 tv는 더이상 객체를 만들 수 없다.
// 따라서 추상클래스의 자식은 부모인 추상 클래스 안에 선언된 추상 함수의 구체적인 내용을 작성해줘야 한다.

public class tv extends house_item {
	// public boolean onoff;
	// public String brand;
	// public int price;
	
	// public int ch = 2;
	// public int ch;
	// public int inch;
	// public int sound;

	
	public int inch;
	
	static { // 클래스 초기화 블럭 - 클래스 변수만 초기화. 생성자 함수와는 다르다.
		
	}
	/*
		{		// 인스턴스 초기화 블럭 - 세가 <씨발뭐여
			ch = 10;
			sound = 8;
		}
	*/
	
	public tv() { 
		// 상속 관계에선 이 기본 형태의 생성자 함수가 기본적으로 들어있으나 파라미터가 존재하는 형태로 오버로딩된 생성자 함수가 있다면 명시를 해준다.
	}
	public tv(String brand, int price, int inch) {
		// this.brand = brand;
		// this.price = price;

		// 자식 클래스 쪽 생성자 메소드 작성 시 주의점: super()(: 부모클래스 생성자 호출 구문) 함수가 가장 위에 있어야 한다.(먼저 실행되어야 한다.)
		// 이유: 객체 생성 시 객체의 초기화 순서는 1. 부모 2. 자식 순이기 때문.
		super(brand, price);
		this.inch = inch;
	}
	
	public void buy() {
		System.out.println("tv 구매 완료.");
	}
	
//	public tv(int p) {
//		
//	}
}


