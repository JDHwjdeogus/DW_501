package 자바0913;

public class 메소드공부6_0922 {
	// public static: 접근 제어자, int: 리턴 타입, getSum: 메소드 타입, int x & int y: 매개변수
	public static int getSum(int x, int y) {
		return x + y;
	}
	// void: 리턴값이 없는 메소드(리턴 못함)
	public static void print(String word) {
		System.out.println(word);
	}
	public static void main(String[] args) {
		int result = getSum(70, 30);
//		String x = print("도시락"); 
//		리턴 타입이 void인 메소드는 리턴하는 것이 없으므로 변수에 메소드의 실행 결과를 대입할 수 없다.
//		실무에서 쓰이긴 하나 빈도가 많진 않다.
		print("creazy noisy bizzare town");
	}

}
