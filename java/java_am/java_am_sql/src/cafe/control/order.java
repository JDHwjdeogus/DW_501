package cafe.control;

public class order implements menu_able {

	@Override
	public boolean menu_active() { // 인터페이스(menu_able)가 가진 추상메소드
		// TODO Auto-generated method stub
		return true;
	}
	
}


// 오버로딩: 클래스 내부에서 이름만 같고 매개변수가 다른 형태로 여러 개의 서로 다 다른 함수를 정의하는 것
// 오버라이딩:  다른 클래스( 상속 관계에서 자식 또는 implements 되어있는 클래스)에 리턴타입 메소드의 이름, 매개변수 등을 모두 똑같이 정의하고 내용만 다르게 만드는 메소드. 
// 			 덮어쓰기와 같다. 기존의 함수를 내용만 변경한다는 뜻이다.
// 오버플로우: 네트워크 보안 이슈
