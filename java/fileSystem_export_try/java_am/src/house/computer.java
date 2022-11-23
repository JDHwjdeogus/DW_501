package house;

public class computer extends house_item {
	public String vga;
	
	public computer() {
		
	}
	public computer(String brand, int price, String vga) {
		super(brand, price);
		this.vga = vga;
	}
	
	public void buy() {
		System.out.println("computer 구매 완료.");
	}
}
