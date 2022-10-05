package hello_java;

public class Java0808 {

	public static void main(String[] args) {
		// 이것은 주석. 설명을 적는 메모 용도
		// int는 데이터 타입, age는 변수 이름
		int number = 50;
		
		// 문제 1. 데이터 타입이 int이고, 이름이 money인 변수를 만들고 숫자 데이터 500을 대입하시오.
		int money = 500;
		
		System.out.println(money); // 출력
		// 저장(ctrl s) 실행(ctrl f11)
		String 닉네임 = "idden";
		System.out.println("당신의 이름은? " + 닉네임);
		String 사는곳 = "대전";
		System.out.println("당신이 사는 지역은? " + 사는곳);
		
		// 문제 2. 데이터 타입이 String이고, 이름이 취미인 변수를 만들어서 피험자의 취미 데이터를 대입 후 이를 출력하시오.
		String 취미 = "디지털드로잉";
		System.out.println("당신은 쉬는 날에 무얼 해? " + 취미);
		
		int x = 10; // 변수 x를 선언
		System.out.println("x의 값은? " + x);
		x = 20; // 기존에 대입되었던 10은 없어지고 새로 대입된 20만이 남는다.
		System.out.println("이제 x의 값은? " + x);
		
		// 문제 3. 다음 연산으로 예상되는 결과를 메모장에 작성하시오.
		/* x = 50; 
		 * System.out.println("x의 값은? " + x); 
		 * : x의 값은? 50 */
		// 대입읜 기존 데이터를 무시하고 새로운 데이터를 넣을 수 있다.
		
		int a = 5; // 5를 int 타입 변수 a에 대입
		int b = 10; // 10을 int 타입 변수 b에 대입
		int c = a + b; // a와 b를 더한 값을 int 타입 변수 c에 대입
		System.out.println("최종 값은? " + c);
		
		// 문제 4. 10-7을 구현하는 로직을 아래에 작성.
		int d = 10;
		int e = 7;
		int f = d - e;
		System.out.println("최종 값은? " + f);
		
	}

}
