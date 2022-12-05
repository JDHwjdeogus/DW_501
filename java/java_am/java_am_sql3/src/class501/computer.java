package class501;

public class computer implements ban_active {

	@Override
	public String action(String msg) {
		System.out.println("computer class이다.");
		return null;
	}

}

// implement의 사전적 의미: 구현하다, 도구, 수단
// 인터페이스를 클래스에 implements 해주면, 해당 클래스는 인터페이스가 가진 추상메소드를 갖게 된다.
// 추상메소드를 가진 클래스는 추상 클래스가(public abstract class... ) 가 되거나 추상메소드를 구현해야 한다.
// 추상클래스는 객체생성 불가능