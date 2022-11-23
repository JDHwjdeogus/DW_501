package cafe.control;

@FunctionalInterface 
public interface menu_able {

	public boolean menu_active();
	
	// int num; // 인스턴스 변수: 못만듦
	// void sum() {} // 인스턴스 메소드: 못만듦
	
	// 제어자를 통한 변수 생성
	
	/*
		static int day = 10;  // 클래스 변수 가능. (앞에 제어자가 오는 변수를 클래스 변수라고 한다.)
		final int count = 20; // 상수 가능.
		
		static void add() {  // 클래스 메소드
			
		}
		
		public abstract void sum(); // 추상 메소드
	*/
	
}


// 인터페이스: 추상클래스 중 하나.
// 추상클래스: 추상메소드를 갖고 있는 클래스.
// 추상클래스는 객체 생성이 제한된다. 고로 인터페이스 역시 추상메소드를 가지며 객체 생성이 제한된다.
// 인터페이스에서 정의하는 메소드는 기본적으로 추상메소드인 것으로 정의된다.
// 인터페이스에서는 인스턴스 변수 및 인스턴스 메소드를 정의할 수 없다.
// 인터페이스에서의 추상메소드 정의는 abstract 생략이 가능하다.
// 인터페이스에 추상메소드가 하나만 있다면 해당 인터페이스는 함수형 인터페이스 라고 한다.
// 함수형 인터페이스는 람다 생성 시 사용할 수 있는 인터페이스.