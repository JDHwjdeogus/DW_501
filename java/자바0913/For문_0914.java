package 자바0913;

import java.util.Scanner;

public class For문_0914 {

	public static void main(String[] args) {
//		int i = 0;
//		for(i = 0; i < 10; i++) {
//			
//		}
//		System.out.println(i);
		
		Scanner scan =  new Scanner(System.in);
		int num = 0;
		System.out.print("값을 입력해주세요: ");
		num = scan.nextInt();
		System.out.println("입력된 값은 " + num + ". ");
		int x = 0;
		
		if(num < 3 || num > 1000) {
			System.out.println("3이상 1000이하의 수를 입력하세요.");
		}
		for(x = 1; x <= num; x++) {
			if(num < 3 || num > 1000) {
				break;
			}
			if(num % x == 1) {
				System.out.println(num + "을 나눴을 때 나머지가 1이 나오도록 하는 가장 작은 자연수 x는 " + x + "입니다.");
				break;
			}
		}

//		int sum = 0;
//		for(int i = 3; i <= 6; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
	}

}
