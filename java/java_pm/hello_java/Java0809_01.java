package hello_java;

public class Java0809_01 {

	public static void main(String[] args) {
		int x = 10;
		x = x * 2;
		// 문제 1. x의 최종 값은? 20
		x = 30;
		// 이제 x의 최종 값은? 30. 대입 연산자는 기존의 값을 무시함.

		// 문제 2. 만원으로 거스름한 값 거스름돈 변수에 대입하기. 변수 거스름돈의 최종 결과가 5여야 한다.
		int money = 50000;
		int 거스름돈 = 0;
		거스름돈 = money / 10000;
		System.out.println(거스름돈 + "원\n");

		// 문제 3. y의 최종 값은? 80
		int y = 20;
		y = y * 2;
		y = y + y;
		System.out.println(y + "\n");

		// 문제 4. 남은 돈은 얼마인가. 5000
		int money_2 = 55000;
		int 거스름돈_2 = money_2 / 10000;
		int 남은돈 = money_2 % 10000;
		System.out.println(남은돈 + "원\n");

		// 문제 5. 점수의 평균을 구하시오. 56
		int 국어 = 100;
		int 수학 = 20;
		int 영어 = 50;
		int 평균 = (국어 + 수학 + 영어) / 3;
		System.out.println(평균 + "\n");

		// 문제 6. 감자와 옥수수의 총 재배량. 150
		int 옥수수 = 100;
		int 감자 = 50;
		int 총합 = 옥수수 + 감자;
		System.out.println(총합 + "톤\n");

		// 문제 7. 전체 사과에서 하자를 골라내고 난 출하 가능 작물.
		int 전체사과 = 10;
		int 하자품 = 7;
		int 출하품 = 전체사과 - 하자품;
		System.out.println(출하품 + "개\n");

		// 문제 8. 거스름돈 구하기
		int 통장잔액 = 175000;
		int 신사임당 = 50000;
		int 세종대왕 = 10000;
		int 율곡이이 = 5000;
		/*
		 * 
		 * int 금빛지폐 = 통장잔액 / 신사임당; 
		 * int 녹빛지폐 = (통장잔액 - (금빛지폐 * 신사임당)) / 세종대왕; 
		 * int 동빛지폐 = (통장잔액 - (금빛지폐 * 신사임당) - (녹빛지폐 * 세종대왕)) / 율곡이이;
		 * System.out.println("환전 결과, 오만원권은 전부 " + 금빛지폐 + "장, 만원권은 전부 " + 녹빛지폐 + "장, 오천원권은 전부 " + 동빛지폐 + "장");
		 * 
		 */
		int 오만원권 = 통장잔액 / 신사임당;
		통장잔액 = 통장잔액 % 신사임당;
		System.out.println("오만원권 " + 오만원권 + "장, 잔액" + 통장잔액 + "원");
		int 만원권 = 통장잔액 / 세종대왕;
		통장잔액 = 통장잔액 % 세종대왕;
		System.out.println("만원권 " + 만원권 + "장, 잔액" + 통장잔액 + "원");
		int 오천원권 = 통장잔액 / 율곡이이;
		통장잔액 = 통장잔액 % 율곡이이;
		System.out.println("오천원권 " + 오천원권 + "장, 잔액" + 통장잔액 + "원");

	}

}
