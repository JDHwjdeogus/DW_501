package VO;

public class venture {
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
