package generic;

public class 오징어 extends seafood {
	public int among;
	public String origin;
	
	// 오징어 클래스는 변수와 함수의 타입을 정해둠으로서 변수 타입 오류를 방지. 받아들인 데이터에 대한 안정성을 보장.
	// 접근은 자유롭지 못하다.
	public void store(int among, String origin) {
		this.among = among;
		this.origin = origin;
	}
	
	public 오징어 판매() {
		return this;
	}
}
