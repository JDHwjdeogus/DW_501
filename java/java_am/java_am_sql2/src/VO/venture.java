package VO;

public class venture implements Comparable {
	private int num;
	private String c_name;
	private String addr;
	private String b_kind;
	private String b_name;
	private String product;
	
	public venture() {}
	public venture(int num, String c_name, String addr, String b_kind, String b_name, String product) {
		this.num = num;
		this.c_name = c_name;
		this.addr = addr;
		this.b_kind = b_kind;
		this.b_name = b_name;
		this.product = product;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 사용자 정의 클래스에서 equals를 구현할 때 어떤 대상을 비교할 것인지 정해야 한다.
		// 그냥 equals 메소드가 동작하지 않는 이유는 비교대상이 없기 때문이다. 따라서 클래스에 equals를 구현해 비교 대상을 정해줘야 한다.
		// 여기서는 주소값을 비교한다. 주석처리된 구문은 num값만을 비교하는 코드.
		venture tmp = (venture)obj;
		System.out.println(this.c_name);
		//if(this.num == tmp.num)
		if(this.c_name.equals(tmp.c_name))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.c_name.hashCode();
		// Set에서의 비교는 Set의 값(데이터)과 hashCode를 같이 비교해줘야 하므로 addr에 대한 해쉬코드를 리턴하는 함수가 필요: hashCode()
		// String은 이미 해쉬코드가 주어져있으므로 String이 가진 해쉬코드를 리턴시킨다.
		// int는 자체가 이미 정수이므로 코드를 따로 만들어줄 필요가 없음
	}
	
	@Override
	public int compareTo(Object o) {
		return this.c_name.compareTo( ((venture)o).c_name );
	}
	
	@Override
	public String toString() {
		return num + " " + c_name + " " + addr + " " + b_kind + " "  + b_name + " "  + product;  
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	public String getB_kind() {
		return b_kind;
	}
	public void setB_kind(String b_kind) {
		this.b_kind = b_kind;
	}
	
	
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
}
