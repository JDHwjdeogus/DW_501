package house;

public class aircon extends house_item {
	public int area;
	
	public aircon() {
		super();
	}
	public aircon(String brand, int price, int area) {
		super(brand, price);
		this.area = area;
	}
	
	public void buy() {
		System.out.println("aircon 구매 완료.");
	}
}
