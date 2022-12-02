package generic;

public class 구매 {
	// <?>: 와일드카드. 매개변수에 붙는 제네릭. 해당 제네릭은 모든 타입(any type)을 의미한다. 제한은 상속으로 걸어준다. <? extends seafood>
	// 단 상위클래스에 대해서는 쓸 수 없다.
	// <? super seafood>: seafood 클래스 포함 상위 전부. 자식클래스를 쓸 수 없다.
	public void buy(seafood_box<? extends seafood> item) {
		System.out.println("해산물 구매.");
	}
	
	/*
	 * 제네릭 타입이 다른거지 클래스 타입(매개변수 타입)이 같아서 오버로딩 성립 불가
		public void buy(seafood_box<새우> item) {
			System.out.println("해산물 구매.");
		}
	*/
}
