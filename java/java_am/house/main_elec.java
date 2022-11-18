package house;

import java.util.List;

public class main_elec {
	public static List<house_item> init(){ 
		// 인스턴스 함수와 클래스 함수의 호출 시점이 달라서 같은 클래스 함수로 만들어주지 않으면 사용 못함.
		// 인스턴스 함수 특: 인스턴스 객체가 존재해야 생성 가능.
		// 그렇게 호출되도록 코드로 구별을 해주었고 그렇게 동작하게끔 jvm(Java Virtual Machine)에서 인식함
		// 뭐야 우린 static 안에선 static 붙은 것만 쓰기로 약속했어요 가 맞구나 내가 이상하게 기억하는 줄

		return null;
	}
	
	public static void main(String[] args) { // static 함수(믈래스 함수)는 프로그램 로드와 동시에 실행
		init();
		
		file f = new file("c:/Users/dw-003/Desktop");
		
		
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
			아파트를 분양하기 위해 모델하우스를
 */