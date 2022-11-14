package 자바1114;

import java.util.ArrayList;
import java.util.List;

public class 제네릭과컬렉션즈 {

	public static void main(String[] args) {
		// 컬렉션즈: 자료구조 (스택, 힙, 맵, 셋, ...)
		// 배열: array2처럼 길이가 정해진 배열은 추후 길이 조정 불가 
		int[] array1 = {5, 7, 9, 10};
		int[] array2 = new int[4];
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
		// List
		// <> 제네릭, List 컬렉션즈
		List<Integer> list = new ArrayList<Integer>(); // 정수형을 담는 리스트
		list.add(10); // 리스트 내 데이터 삽입
		list.add(20);
		System.out.println("0번째 값: " + list.get(0)); // 리스트 호출
		System.out.println("1번째 값: " + list.get(1));
		System.out.println(list.size()); // 리스트 길이
		
		list.remove(1); // 첫번째 요소 삭제
		System.out.println(list.size());
		
		
		System.out.print("\n");
		// 문제
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(7);
		numberList.add(13);
		numberList.add(15);
		
		// 1번째
		for(int i = 0; i < numberList.size(); i++) {
			if(numberList.get(i) % 5 == 0) System.out.println(numberList.get(i));
		}
		
		// 2번째: for each 문 사용 
		// for문에서 길이만큼 알아서 i에 리스트 인덱스를 대입
		for(int i : numberList) {
			if(i % 5 == 0) System.out.println("for each: " + i);
		}
		

		// 문제
		numberList = new ArrayList<Integer>();
		numberList.add(50);
		numberList.add(100);
		numberList.add(300);
		numberList.add(99);
		
		int sum = 0;
		int count = 0;
		for(int i : numberList) {
			sum += i;
			if(i >= 100) count++;
		}
		System.out.println("리스트 원소 총합: " + sum);
		System.out.println("리스트 원소들 중 100 이상인 원소의 개수: " + count);
		
		
		System.out.print("\n");
		List<String> wordList = new ArrayList<String>();
		wordList.add("아아메");
		wordList.add("카페모카");
		wordList.add("디카페인");
		wordList.add("아아메");
		wordList.add("아아메");
		wordList.add("아아메");
		int countBerverage = 0;
		for(String item : wordList) {
			if(item.equals("아아메")) countBerverage++;
			// 문자열 비교 시 반드시 equals를 사용
		}
		System.out.println("아아메의 개수는 총 " + countBerverage + "개 입니다.");
		
		System.out.print("\n");
		// 제네릭 <> 안에는 클래스만 올 수 있음(int 에러 이유)
		버거킹 골드와퍼 = new 버거킹();
		골드와퍼.버거가격 = 9000;
		골드와퍼.버거종류 = "치즈버거류";
		
		버거킹 플랜트와퍼 = new 버거킹();
		플랜트와퍼.버거가격 = 5900;
		플랜트와퍼.버거종류 = "비건메뉴";
		
		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>();
		버거킹선화점.add(골드와퍼);
		버거킹선화점.add(플랜트와퍼);
		
		for(버거킹 메뉴 : 버거킹선화점) {
			System.out.println(메뉴.버거종류);
		}
	}

}
