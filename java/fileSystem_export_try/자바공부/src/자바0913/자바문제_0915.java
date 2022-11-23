package 자바0913;

import java.util.Scanner;

public class 자바문제_0915 {

	public static void main(String[] args) {
		// 특정 배열 원소 위치 찾기
		String name[] = {"Brian", "Kim"};
		for(int i = 0; i < name.length; i++) {
//			if(name[i].equals("Kim")) {
//				System.out.println("Kim은 name 배열의 " + i + "번째에 있습니다.");
//				break;
//			}
			
			boolean isCheck = name[i].equals("Kim");
			if(isCheck) {
				System.out.println("Kim은 name 배열의 " + i + "번째에 있습니다.");
				break;
			}
		}
				
		// 010 뒷자리를 *로 대체하기
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력: ");
		String nickname = scan.next();
		System.out.print("전화번호를 입력(-로 구분해주세요): ");
		String tel = scan.next();
		String telArray[] = tel.split("-");
		for(int i = 0; i < telArray.length; ++i) {
			if(i > 0) telArray[i] = "-****";
			System.out.print(telArray[i]);
		}
		System.out.println("\n" + nickname + "님의 전화번호는 무사히 가려드렸습니다 ^^!");
		
		

	}

}
