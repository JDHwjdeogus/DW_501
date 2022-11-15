package test2;

import java.util.ArrayList;
import java.util.List;

import test1.member;

public class main1 {

	public static void main(String[] args) {
		// int[] a = new int[10];
		// member[] arr = new member[5]; 
		// 메인함수 내 지역변수, member 클래스 내부의 변수는 인스턴스 변수임
		
		// 클래스 타입의 배열을 생성하면 배열의 각 공간은 클래스 타입의 참조변수 공간이다.
		// 접근자(arr[0].생일 의 .생일)는 같은 패키지 내에서만 사용 가능. 굳이 접근자를 사용하려면 변수 앞에 제어자(public 등) 지정
		/*
		  	arr[0] = new member();
			arr[0].ID = "osman";
			arr[0].생일 = 010505;
			arr[0].성별 = "여성";
			arr[0].연락처 = "010-3461-5449";
			arr[0].이름 = "한오영";
			arr[0].주소 = "대전광역시 동구 가양동";
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		// for(int i = 0; i < arr.length; i++)
		for(member temp : arr) {
			temp = new member();
			System.out.print("아이디: ");
			temp.ID = sc.nextLine();
			System.out.print("이름: ");
			temp.이름 = sc.nextLine();
			System.out.print("생일: ");
			temp.생일 = sc.nextInt();
			System.out.print("성별: ");
			temp.성별 = sc.nextLine();
			System.out.print("주소: ");
			temp.주소 = sc.nextLine();
			System.out.print("연락처: ");
			temp.연락처 = sc.nextLine();
		}
		for(member temp : arr) temp.output();
		*/
		
		// ArrayList: 배열을 쉽게 사용하게끔 만든 클래스
		List<member> list = new ArrayList<>();
		list.add(new member());
		list.get(0).성별 = "남성";
		list.get(0).ID = "idden";
		
		final int a = 10;
		// a = 20;
		
		/*
		 	제어자 
			final: 변경 불가
			static: 클래스 내 공통
				
				static 변수
				- 모든 인스턴스에 공통적으로 사용되는 클래스 변수
				- 클래스 변수는 인스턴스를 생성하지 않아도 사용 가능
				- 클래스가 메모리에 로드될 때 생성
			 	
			 	static 메소드
			 	- 인스턴스를 생성하지 않고도 호출 가능한 static 메서드
			 	- static 메서드에선 인스턴스 변수와 인스턴스 메서드 사용 불가
			public
			abstract: 추상적인
			
			접근제어자
			public: 제한 없이 사용 가능. (클래스, 변수, 메서드)
			default: 같은 패키지 내에서만 사용.
			protected: 상속인 경우 다른 패키지에서도 사용할 수 있는 경우가 있으나 보통 같은 패키지에서만 사용 가능.
			private: 같은 패키지라도 사용 불가. 오직 해당 클래스 내부에서만 사용 가능.
			
			자바
			지역변수: 중괄호 내부에서 생성된 변수. (함수, for문, if문, 지역함수, main함수 등등...)
				 : 생성 - 선언 { || 종료 - } 
			인스턴스 변수: 클래스 멤버 변수. 객체의 수와 동일하게 존재.
					>> arr[0] = new member(); 를
					>> 보통 member 클래스의 객체를 생성한다고 하는데
					>> 정확히는 member 클래스의 인스턴스를 생성한다고 한다.
					 : 생성 - 클래스 객체 생성 시 || 종료 - 클래스 객체 종료 시 
			클래스 변수: class 내 static이 제어자로 붙은 변수.
					>> 
					class member { 
						public static int count; 
					}
					: 생성 - 프로그램 로드 || 종료 - 프로그램 종료
					
		*/
	}

}
