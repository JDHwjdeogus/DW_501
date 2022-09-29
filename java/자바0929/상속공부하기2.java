package 자바0929;

class 관장 {
	public void 운동을하다() {
		System.out.println("운동하기 전엔 운동장 뛰는 게 맞다.");
	}
	public void 주먹을날리다() {
		System.out.println("레프트훅");
		System.out.println("라이트훅");
		System.out.println("어퍼컷");
	}
}

class 제자 extends 관장 {
	@Override
	public void 운동을하다() {
		System.out.println("간단한 운동 후 스트레칭 하는 게 좋다.");
	}
	@Override
	public void 주먹을날리다() {
		System.out.println("상대와 간격 조절");
		System.out.println("레프트쨉");
		System.out.println("라이트훅 * 2");
	}
}

public class 상속공부하기2 {
	// 객체지향언어(자바, 자바스크립트, c++, ...) 내 모든 클래스는 object라는 클래스로부터 상속받는다

	public static void main(String[] args) {
		System.out.println("================================");
		관장 a = new 관장();
		a.운동을하다();
		a.주먹을날리다();
		System.out.println("================================");
		제자 aa = new 제자();
		aa.운동을하다();
		aa.주먹을날리다();
	}

}
