package generic;

// public class seafood_box<T extends seafood & 인터페이스>
// 제너릭에 사용되는 타입 종류: T(타입), V(밸류, 데이터), K(키값(Map)), N(숫자)
// seafood_box<T, V>
public class seafood_box<T extends seafood> {
	T box_item;
	
	public void setBox(T box) {
		this.box_item = box;
	}
	
	public void sellBox() {
		System.out.println("해산물 박스를 판매했읍니다.");
	}
}
