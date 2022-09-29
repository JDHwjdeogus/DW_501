package 자바0929;

class A {
	/*
	 A(){
	 	숨겨진 디폴트 함수. 클래스 생성 시 자동으로 생성된다. 사람들은 이걸 생성자라고 부르기로 약속했다.
	 	마찬가지로 메인 함수에서 클래스가 호출될 때 자동적으로 호출된다.
	 	또한 리턴타입이 없다.
	 	오버로딩도 가능하다. (파라미터나 리턴타입을 다르게 선언할 때 같은 이름의 메소드를 선언할 수 있는 규칙)
	 }
	*/
	public void A클래스메소드() {
		System.out.println("HELLO WORLD");
	}
	
	public int 메소드생성(int x) {
		return x;
	}
}

class B {
	B(int x, int y){
		System.out.println("hello world");
		// return x + y;
	}
	B(){
		
	}
}

class C {
	private String 이름;
	private int 나이;
	
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get이름() {
		return 이름;
	}
	
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	public int get나이() {
		return 나이;
	}
	
	C(){
		System.out.println("이름과 나이");
	}
	C(String 이름, int 나이){
		System.out.println(이름 + ": " + 나이 + "세");
	}
}

public class 클래스복습 {

	public static void main(String[] args) {
		A a = new A(); // 클래스 A의 객체인 a 생성 (혹은 인스턴스화 하다)
		a.A클래스메소드();
		System.out.println(a.메소드생성(4)); 
		
		new A().A클래스메소드(); // 변수 생성하고 클래스 호출 후 바로 메소드 호출
		System.out.println(new A().메소드생성(666));
		
		B b = new B(50, 100);
		
		System.out.println("\n");
		new C();
		new C("이든", 26);
		
	}

}
