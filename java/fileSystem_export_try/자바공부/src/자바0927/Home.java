package 자바0927;

class A{
	int value; // 필드 변수
	// 필드 변수 특징
	/*
	 	1. 전역 변수처럼 활용 가능
	 	2. 초기값을 지정하지 않아도 무방(default값이 존재하기 때문): 보통 변수는 생성 후 데이터를 할당하지 않은 채 사용하면 오류.
	*/
	public void 확인하기1() {
		int x = 99; // 지역 변수
		System.out.println("A 클래스에 있는 메소드 '확인하기1()' 입니다.");
		System.out.println(value);
		System.out.println(x);
	}
	public void 확인하기2() {
		value = 666;
		System.out.println("A 클래스에 있는 메소드 '확인하기2()' 입니다.");
		System.out.println(value);
		// System.out.println(x);
	}
}

class B {
	public void 확인하기() {
		System.out.println("B 클래스에 있는 메소드 '확인하기()' 입니다.");
	}
}

class C {
	String str;
	int value;
	boolean 메소드만들기() {
		return true;
	}
	int 메소드만들기(double x, double y) {
		// value = (int) Math.round(x + y);
		return 0;
	}
	B 메소드만들기(B b) {
		// 클래스(B) 객체(b)를 return
		return b;
	}
}

public class Home {
	// 접근제어자의 지정은 경우에 따라 다르지만 보통은 선택사항이다.
	// static method는 static method 혹은 instance화 된 method만 올 수 있다.
	static void 홍길동호출() {
		System.out.println("홍길동을 호출.");
	}
	
	public static void main(String[] args) {
		// A 클래스 호출
		A a클래스 = new A();
		// A클래스 내에 있는 '확인하기' 메소드(함수) 사용
		a클래스.확인하기1();
		a클래스.확인하기2();
		
		B b클래스 = new B();
		b클래스.확인하기();
		
		홍길동호출();
	}
	
}
