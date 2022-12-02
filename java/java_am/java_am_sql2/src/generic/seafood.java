package generic;

public class seafood<T> {
	// 최상위 클래스인 Object 변수를 인스턴스 변수 및 인스턴스 함수의 파라미터로 사용함으로써 seafood 클래스를 어디서든 쓸 수 있는 클래스로 만들어줌.
	// 단점: 받아들인 클래스가 가진 기능(함수)들을 사용할 수 없다. 받아들인 데이터에 대한 안정성을 보장할 수 없음.
	
	/*
	T item;

	public void store(T item) {
		this.item = item;
	}
	
	public T 판매() {
		return item;
	}
	*/
	
	
	public String storename;
	public String origin;
}
