package 자바0913;

public class 메소드공부_0919 {
	// 메소드: 뭔가를 수행하는 기능 (javascript의 function)
	// () 파라미터(매개변수)
	// public static int 더하기 의 int: 리턴타입, 더하기: method 이름
	// 리턴 타입: int, double, float, boolean, ...... 데이터타입 + String(클래스 타입)
	public static int 더하기 (int x, int y) {
		return x + y;
	}
	public static int 빼기 (int x, int y) {
		return x - y;
	}
	public static int 나누기 (int x, int y) {
		return x / y;
	}
	public static int 곱하기 (int x, int y) {
		return x * y;
	}
	public static void main(String[] args) {
		int 결과 = 더하기(20, 10);
		System.out.println(결과);
		결과 = 빼기(30, 5);
		System.out.println(결과);
		결과 = 나누기(20, 5);
		System.out.println(결과);
		결과 = 곱하기(9, 9);
		System.out.println(결과);
	}

}
