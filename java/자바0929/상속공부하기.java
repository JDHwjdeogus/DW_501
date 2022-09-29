package 자바0929;

class 부모 {
	public void 아들아공부해야지() {
		 System.out.println("아들아 공부해야지");
	}
	public void 아들아밥먹자() {
		System.out.println("아들아 밥먹자");
	}
}

// 부모 클래스를 상속받는 자식 클래스
class 자식 extends 부모 {
	// @Override: 상속받은 메소드의 재정의
	@Override
	public void 아들아공부해야지() {
		System.out.println("아 이 판만 하고...!");
	}
	
	@Override
	public void 아들아밥먹자() {
		System.out.println("응애... 5분만 더 잘래...");
	}
}

public class 상속공부하기 {

	public static void main(String[] args) {
		new 부모().아들아밥먹자();
		new 자식().아들아밥먹자();
	}

}
