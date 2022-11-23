package 자바1114;
// 자바의 class와 html의 div는 유사한 구조, 유사한 관계
class 월드컵 {
	// 필드변수(클래스 내부 변수)
	String 출전국;
	String 선수;
	String 개최지;
	
	// 클래스 내부 함수
	/*
		String 출전국알아내기() {
			// return "우루과이";
			return this.출전국;
		}
		String 개최지알아내기() {
			return this.개최지;
		}
		String 선수알아내기() {
			return this.선수;
		}
	*/
	
	// 생성자
	// 생성자 이름은 클래스 이름과 동일
	월드컵(String 출전국, String 선수, String 개최지){
		// 파라미터로 받아온 값을 필드변수에 대입
		this.출전국 = 출전국;
		this.선수 = 선수;
		this.개최지 = 개최지;
	}
}
public class 클래스복습 {
	public static void main(String[] args) {
		월드컵 a = new 월드컵("프랑스", "데시앙", "카타르");
		// 생성자의 파라미터 변수를 정의할 경우 오류
		// 생성자는 함수와 동일하나 리턴 타입이 없으며, 메소드 이름은 클래스 이름과 동일해야 함.
		System.out.println(a.개최지);
		System.out.println(a.선수);
		System.out.println(a.출전국);
		
		a.개최지 = "카타르";
		a.선수 = "손흥민";
		a.출전국 = "한국";
		System.out.println("개최지: " + a.개최지);
		System.out.println("선수: " + a.선수);
		System.out.println("출전국: " + a.출전국);
		
		// 출전국가알아내기 메소드 리턴타입: String
		/*
			String 출전국 = a.출전국알아내기(); // 클래스 내부 메소드 호출
			System.out.println("메소드로 가져온 값: " + 출전국);
			
			String 개최지 = a.개최지알아내기();
			System.out.println("메소드로 가져온 값: " + 개최지);
 		*/
	}
}
