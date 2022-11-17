package hello_java;

public class Java0809_02 {
	public static void main(String[] args) {// 중괄호 시작
		// System.out.println("HELLO WORLD");
		int x = 10;
		x += x; // x = x + x;
		++x; // x + 1
		System.out.println(x);

		// if 조건문. 조건이 맞으면 if문 중괄호 안의 코드를 실행
		if (20 < 4) {
			System.out.println("if 실행 \n");
		}
		else {
			System.out.println("거짓 \n");
		}
		// 비교연산자: 조건문에 많이 쓰임.
		int 숫자1 = 100;
		int 숫자2 = 200;
		int 숫자3 = 50;
		if (숫자1 == 숫자2) { //비교 대상이 서로 같다는 뜻.
			System.out.println("숫자1과 숫자2는 같다.");
		}
		if (숫자1 != 숫자2) { //비교 대상이 서로 다르다는 뜻.
			System.out.println("숫자1과 숫자2는 다르다.");
			숫자3 = 100;
		}
		System.out.println("숫자3: " + 숫자3);
		

	}// 중괄호 끝
}
