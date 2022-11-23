package test1;

public class study3 {

	public static void main(String[] args) {
		// 회원정보 저장: 이름, 연락처, 주소, 생일, 성별, ID
		member m1 = new member(); // m1을 참조변수라 부른다. 참조변수란 메모리 주소를 저장할 수 있는 변수이다.
		System.out.println(m1);   // test1.member@6f2b958e: 자바 가상메모리 주소(실질적인 데이터가 들어있는 공간의 주소)
		 m1.성별 = "남성";
		 m1.ID = "idden";
		 m1.이름 = "정대현";
		 m1.주소 = "대전광역시 동구 판암동";
		 m1.생일 = 970328;
		 m1.연락처 = "010-4632-9405";
		 m1.output();
	}
	
	/*
		static void output(member m) {		
			System.out.println("아이디: " + m.ID + " || 성별: " + m.성별 + " || 이름: " + m.이름 + " || 주소: " + m.주소 + " || 생일: " + m.생일 + " || 연락처: " + m.연락처 );
		}
	*/
}

// member 클래스는 study3 클래스와 같은 패키지 안에 있으므로 import하지 않아도 된다.
// 다른 패키지에 있을 시 import

// 구조체 구성
/*
	struct member{
		// 이하 변수들은 구조체 멤버 변수라고 한다.
		String 이름;
		String 연락처;
		String 주소;
		String 성별;
		String ID;
		String 생일;
	}
	
	member m1;
	m1.name = "정대현";
	m1.tel = "010-4632-9405";
	m1.addr = "대전광역시 동구 판암동";
	m1.gender = "남";
	m1.birth = 970328;
	m1.id = "idden";
	
	// 구조체 없이 5명의 정보를 저장하기: 배열
	member m1 = new member[5];
	String[] name = new String[5];
	String[] tel = new String[5];
	String[] addr = new String[5];
	String[] gender = new String[5];
	String[] birth = new String[5];
	String[] id = new String[5];
	
	member m1;
	getAge(m1.birth);
	void getAge(int birth) {
		int age = 0;
		생년월일 구하는 함수...
		return age;
	}
	
	m1.getAge();
*/
