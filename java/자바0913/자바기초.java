package 자바0913;

public class 자바기초 {

	public static void main(String[] args) {
		// 자바 공부 시 주의할 점
		/* 1. 코딩은 method 수업 전까진 항상 main {} 안에
		 * 2. 코드 실행: ctrl + F11
		 * 3. 
		 * 
		 */
		
		// 자바 변수 선언
		int a = 100; 
		// 데이터가 정수인 숫자라면 변수(a) 선언 시 데이터 타입 타입 int로 선언.
		// int: 데이터타입, a: 변수, 100: 데이터.
		
		int 고기 = 3;
		고기 = 10;
		// 변수에 데이터 재할당 가능
		// int 고기 = 20; 변수의 중복 선언 불가.
		
		int 내지갑 = 50000;
		int 만원몇장 = 0;
		만원몇장 = 내지갑 / 10000;
		System.out.println(만원몇장);
		
		int 국어 = 80;
		int 수학 = 24;
		int 영어 = 62;
		int 평균 = 0;
		평균 = (국어 + 수학 + 영어) / 3;
		System.out.println("평균 점수는: " + 평균);
		
		// 자바 데이터 타입 (일반 데이터 타입 8가지 + 클래스 타입 구성), 마찬가지로, 객체지향언어인 c++도 데이터 타입이 9가지다.
		/* short, byte: 작은 숫자 (소수말고)
		 * int: 숫자(정수) ***
		 * long: 숫자(긴 정수) ***
		 * double: 숫자(소수(0.n))
		 * float: 숫자(긴 소수)
		 * char: 문자
		 * String: 문자 *** >> class type 변수
		 * boolean: true, false ***
		 */
		String 이름 = "홍길동";
		이름 = 이름 + "철수";	// 문자열과 문자열을 더하면 문자열이 이어짐.
		System.out.println(이름);
		
		// 문자를 숫자로 변환
		String num0 = "10";
		int num1 = 0;
		num1 = Integer.parseInt(num0);
		// num1 = "123"; //그냥 넣으면 데이터 타입이 달라 에러
		System.out.println(num1);
		
		
	}

}
