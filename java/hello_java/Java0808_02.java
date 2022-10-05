package hello_java;

public class Java0808_02 {

	public static void main(String[] args) {
		int a = 5; // 5를 대입
		
		int b = a;
		System.out.println("1번. " + b);
		
		a = 2; // 5를 다시 대입(== a=5)
		a = a * a; // a * a 의 결과를  a에 대입
		System.out.println("2번. " + a); 
		// 문제 5. 위에서 a = a를 a = 2로 바꾸면 무엇이 나오는지? 4
		// 문제 6. 이 시점에서 b의 최종 값: 5
		
		b = a;
		// 문제 7. 이 시점에서 b의 최종 값: 4
		System.out.println("3번. " + b);
		
		int c = 10 / 2; // 나누기의 몫
		System.out.println("4번. " + c);
		int d = 10 % 2; // 나누기의 나머지
		System.out.println("5번. " + d);
		int f = 5 * 5; // 곱하기
		System.out.println("6번. " + f);

	}

}
