package 자바0927;

 public class 영화관 {
	// pirvate으로 필드 변수를 생성하면 다른 클래스에서 영화관 클래스 내 필드변수를 사용할 수 없게 된다.
	private int 직원수;
	private String 영화관위치;
	private String 영화관이름;
	private String[] 개봉영화종류;
	
	// 파라미터로 받아온 값을 필드 변수에 대입하는 메소드: setter 메소드
	public void 직원수_세터(int 직원수) {
		this.직원수 = 직원수;
	}
	public void 영화관위치_세터(String 영화관위치) {
		this.영화관위치 = 영화관위치;
	}
	public void 영화관이름_세터(String 영화관이름) {
		this.영화관이름 = 영화관이름;
	}
	public void 개봉영화종류_세터(String[] 개봉영화종류) {
		this.개봉영화종류 = 개봉영화종류;
	}
	// this는 자기 자신(클래스)을 의미
	// this를 사용해 필드 변수를 사용
	
	public int 직원수_게터() {
		return 직원수;
	}
	public String 영화관위치_게터() {
		return 영화관위치;
	}
	public String 영화관이름_게터() {
		return 영화관이름;
	}
	public String[] 개봉영화종류_게터() {
		return 개봉영화종류;
	}
	// setter 메소드에서 파라미터로 받아온 값이 대입된 필드 변수를 리턴하는 메소드: getter 메소드
	
}
