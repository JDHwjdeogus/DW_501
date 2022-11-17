package 자바0913;

public class While문_0914 {

	public static void main(String[] args) {
		// while문은 for문과 같은 반복문들 중 하나로, for에 비해 사용 빈도는 낮으나 가끔씩 사용되기도 함
		// for문과 달리 조건을 따로 작성해주지 않은 true 상태라면, 조건이 없으므로 계속 실행. (무한루프)
		int sum = 0;
		int i = 0;
		while(true) {
			++i;
			sum += i;
			System.out.println(i);
			if(i == 10){
				System.out.println("1부터 10까지의 합: " + sum);
				break;
			}
		}
	}

}
