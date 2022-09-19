package 자바0913;

import java.util.Scanner;

public class 메소드공부3_0919 {
	public static void 캐릭터생성() {
		Scanner scan = new Scanner(System.in);
		System.out.println("캐릭터 이름을 입력해주세요.");
		System.out.print("캐릭터 이름: ");
		String 캐릭터이름 = scan.next();
		System.out.println("캐릭터 이름: " + 캐릭터이름);
	}
	
	public static void 직업선택() {
		Scanner scan = new Scanner(System.in);
		System.out.println("[1] 전사 || [2] 마법사 || [3] 궁수");
		System.out.print("직업 선택: ");
		int 직업 = scan.nextInt();
		String 직업종류배열[] = {"전사", "마법사", "궁수"};
		System.out.println("선택 직업: " + 직업종류배열[--직업]);
	}
	public static void main(String[] args) {
		System.out.println("### 게임 프로그램 시작 ###");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1] 캐릭터 생성 || [2] 직업 선택 || [3] 프로그램 종료");
			System.out.print("이용하실 서비스를 선택해주세요. --->> ");
			String menu = scan.next();
			
			switch (menu) {
				case "1": 
					System.out.println("캐릭터 생성 메뉴를 고르셨습니다.");
					캐릭터생성();
					break;	
				case "2": 
					System.out.println("직업 선택 메뉴를 고르셨습니다.");
					직업선택();
					break;
				case "3": 
					System.out.println("시스템 종료");
					System.exit(0);
					break;
							
				default:
					System.out.println("다시 선택해주세요. 선택지는 1번에서 4번까지 있습니다.");
					break;
			}
			
		}
	}

}
