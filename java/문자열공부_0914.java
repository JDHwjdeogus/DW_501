package 자바0913;

public class 문자열공부_0914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name01 = "황정민";
		String name02 = "황정민";
		boolean isCheck = name01.equals(name02);
		System.out.println("name01과 name02를 비교한 결과: " + isCheck);
		// java에선 문자를 비교할 때 == 대신 .equals를 사용.
		// java에서 문자열은 클래스이므로(클래스 변수), == 연산자로 비교하게 된다면 문자와 문자가 아닌 클래스와 클래스로서 비교하게 된다.
		// boolean: true or false만 표현할 수 있음. 참일 때 true, 거짓일 때 false.
		
		// 문자 길이 판별하기
		String 비밀번호 = "12341234";
		int 문자길이 = 비밀번호.length();
		System.out.println(문자길이);
		
		// 문자 자르기
		String 전화번호 = "010-8888-1222";
		String 배열[] = 전화번호.split("-");
		System.out.println(배열[0]);
		System.out.println(배열[1]);
		System.out.println(배열[2]);
		System.out.println(배열);
		
		// 특정 문자만 추출하기
		String 영화제목 = "어벤져스 인피니티 워";
		String 결과 = 영화제목.substring(5); // 두번째 글자 바로 뒤의 글자부터 보이기
		String 결과2 = 영화제목.substring(5, 9);
		System.out.println(결과);
		System.out.println(결과2);
	}

}
