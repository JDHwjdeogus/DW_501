package 자바0913;

public class 메소드공부4_0920 {
	/*
		메소드 사용 이유
		1. 업무분담   2. 유지보수 편리성
		
		public static: 접근 제어자
		int: 리턴 타입
		getSum: 메소드명
		(int x): 매개변수(파라미터) 타입 int & 매개변수 이름 x >> 파라미터 정의
	*/
	public static int getSum(int x) {
		return x;
	}
	/*
  		public static: 접근 제어자
  		boolean: 리턴 타입
  		isTrue: 메소드명
  		매개변수 없음.
	*/
	public static boolean isTrue() {
		return true;
	}

	public static int getMax(int startNum, int endNum) {
		if(startNum > endNum) return startNum;
		if(startNum < endNum) return endNum;
		return 0;
	}
	
	public static int getSum() {
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	public static int getEvenIndex() {
		int evenIndex = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) ++evenIndex;
		}
		return evenIndex;
	}
	
	// solution 함수 만들기
	public static int solution(int n) {
		int answer = 0; // int는 4byte (32bit)
		long x = n;		// long은 8byte
		if(n == 1) {
			answer = 0;
		}
		while(n != 1) {			
			if((n % 2) == 0) {
				n = n / 2;
				++answer;
			}else {
				n = (n * 3) + 1;
				++answer;
			}
			if(answer > 500) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(getMax(1, 10)); // getCount(1, 10): 메소드 호출	
		System.out.println(getSum());
		System.out.println(getEvenIndex());
		System.out.println(solution(6));
		
	}

}
