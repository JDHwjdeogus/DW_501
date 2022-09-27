package 자바0913;
import java.util.Scanner;

public class 자바기초2 {
	
	public static void main(String[] args) {
//		int x = 10; // 전역변수 x.
//		if(x == 100) {
//			x = 30;
//			int y = 20;
//			System.out.println(y);
//			// y는 이 조건문 안에서만 유효한 변수. 지역변수 y.
//		}
		
		Scanner scan = new Scanner(System.in); // java util 자동입력: ctrl + shift + o
		System.out.print("값을 입력해주세요: ");
		int num = scan.nextInt();
		System.out.print("입력된 값은 " + num);
		if(num % 2 == 0) {
			System.out.println(". 짝수입니다.");
		}else {
			System.out.println(". 홀수입니다.");
		}
	}
	
}
