package test1;

public class member {
	public static int count;
	
	public String ID;
	public String 이름;
	public String 성별;
	public int 생일;
	public String 주소;
	public String 연락처;
	
	public member() { // 생성자 메소드
		
	}
	public member(String ID, String 이름, String 성별, int 생일, String 주소, String 연락처 ) {
		this.ID = ID;
		this.이름 = 이름;
		this.성별 = 성별;
		this.생일 = 생일;
		this.주소 = 주소;
		this.연락처 = 연락처;
	}
	
	public void output() {
		// 멤버 변수가 이미 member 클래스 내에 있으므로(즉, output 함수도 member 클래스의 구성요소 중 하나라서) 굳이 매개변수가 필요하지 않음
		// study3의 경우 member의 구성요소가 아니라서 멤버변수가 반드시 필요
		System.out.println("아이디: " + ID + " || 성별: " + 성별 + " || 이름: " + 이름 + " || 주소: " + 주소 + " || 생일: " + 생일 + " || 연락처: " + 연락처 );
	}

}
