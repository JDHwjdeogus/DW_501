package 자바0913;

public class 메소드공부5_0921 {
	// public static: 접근 지정자, int: 리턴 타입, getSum: 메소드 이름, int x & int y: 파라미터 값(혹은 매개변수, 혹은 인수값, ...)
	public static int getSum(int x, int y) {
		return x + y;
	}
	
	// public static: 접근 지정자, boolean: 리턴 타입, isLogin: 메소드 이름, boolean isLogin: 매개변수 
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
	}
	
	// public static: 접근 지정자, String: 리턴 타입, getWord: 메소드 이름, String word: 매개변수
	// java script는 함수의 리턴타입과 매개변수 타입을 지정하지 않는다.
	public static String getWord(String word) {
		return word;
	}
	
	public static void main(String[] args) {
		int result = getSum(10, 10);
		System.out.println(result);
		
		boolean isResult = isLogin(true);
		System.out.println(isResult);
		
		String word = getWord("토마토 스파게티");
		System.out.println(word);
	}

}
