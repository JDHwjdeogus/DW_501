package house;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import movie.movieVo;

public class main_elec {
	
	static List<house_item> list = null;
	
//	public static List<house_item> init()
	public static void init(){ 
		// 인스턴스 함수와 클래스 함수의 호출 시점이 달라서 같은 클래스 함수로 만들어주지 않으면 사용 못함.
		// 인스턴스 함수 특: 인스턴스 객체가 존재해야(인스턴스가 생성되어야) 생성 가능.
		// 그렇게 호출되도록 코드로 구별을 해주었고 그렇게 동작하게끔 jvm(Java Virtual Machine)에서 인식함
		// 뭐야 우린 static 안에선 static 붙은 것만 쓰기로 약속했어요 가 맞구나 내가 이상하게 기억하는 줄
		
		file f = new file("c:/test/electronic.txt");
		list = f.load();
		
//		if( list != null ) return list; 	// 파일 불러오기 성공
//		else return null; 					// 파일 불러오기 실패
	}
	
	public static void main(String[] args) { // static 함수(믈래스 함수)는 프로그램 로드와 동시에 실행
		Scanner sc = new Scanner(System.in);
		int userInput;
		buyer b = new buyer();
		
		init();		
		/*
			for( house_item item : list) {
				if(item == null) break;
				System.out.println( item.toString() );
			}	
		*/
		while(true) {
			System.out.println("조회할 제품군을 선택하세요. (1. tv || 2. 에어컨 || 3. 컴퓨터): ");
			userInput = sc.nextInt();
			
			int i = 1;
			for( house_item item : list) {
				switch(userInput) {
				case 1: 
					if( item instanceof tv) System.out.println( i + ". " + item.toString() );
					break;
				case 2:
					if( item instanceof aircon) System.out.println( i + ". " + item.toString() );
					break;
				case 3:
					if( item instanceof computer) System.out.println( i + ". " + item.toString() );
					break;
				}
				i++;
			}
			// 조회한 제품군과 구매 시 선택한 번호의 제품군이 안맞을 경우 다시 선택
			boolean flag = false;
			do {			
				
				System.out.println("구매할 제품을 선택하세요. (구매 X: 0): ");
				int buyerInput = sc.nextInt();
				
				if(buyerInput == 0) continue; // 반복문의 처음으로 돌아감: 다음 순서의 반복을 진행
				else {
					switch(buyerInput) {
					case 1:
						if( !(list.get(buyerInput - 1) instanceof tv) )
							flag = true;
						break;
					case 2:
						if( !(list.get(buyerInput - 1) instanceof aircon) )
							flag = true;
						break;
					case 3:
						if( !(list.get(buyerInput - 1) instanceof computer) )
							flag = true;
						break;
					}
					b.buy( list.get(buyerInput - 1) );
				}
			
			}while(flag);
			
			System.out.println("추가로 구매하시겠습니까?: ");
			int end = sc.nextInt();
			if(end == 0) break;
			
		} // 구매 사이클 알고리즘 끝
		
		b.buylist();
		
		
	}
	
	
}

/*
	ram - 프로그램 공간(코드, 스택, 데이터), 사용자 공간(힙), 기타 공간
	코드: 함수 및 메서드 | 스택: 변수, 상수, 정적 배열 | 데이터(정적): 변수, 상수, 배열
	힙 - 주로 이미지 편집 및 출력의 영역으로 쓰임: new......  - 대충 사용자가 응용 프로그램 등지에서 새 파일 생성할 때 
*/

// 정리: 
/*
	static 메서드에서 사용 가능한 것 - static 메서드 및 static 변수 
	instance 메서드에서 사용 가능한 것 - instance 메서드 및 instance 변수, static 메서드 및 static 변수
			
	instance: 추상적으로 정의된 개념에 대해 실체화를 시키는 것
 */

// 예시
/*
	실체화하여 실행할 것인지, 실체화하지 않고 호출할 것인지?
	아파트를 건설하기 위해 설계도를 작성 > 클래스 구현
	아파트를 분양하기 위해 모델하우스를 지음 > static은 클래스 객체생성을 하지 않아도 가능
			
 */