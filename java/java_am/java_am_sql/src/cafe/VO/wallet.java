package cafe.VO;

public class wallet {
	
	private int num;
	private int now_money;		// 현재 금액
	private int  used;			// 사용 금액
	private int point;			// 포인트
	private String use_detail;	// 이용 내역
	
	
	public wallet() {}
	public wallet(int num, int now_movey, int used, int point, String use_detail) {
		this.num = num;
		this.now_money = now_movey;
		this.used = used;
		this.point = point;
		this.use_detail = use_detail;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNow_money() {
		return now_money;
	}
	public void setNow_money(int now_money) {
		this.now_money = now_money;
	}
	public int getUsed() {
		return used;
	}
	public void setUsed(int used) {
		this.used = used;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getUse_detail() {
		return use_detail;
	}
	public void setUse_detail(String use_detail) {
		this.use_detail = use_detail;
	}
	
	
}
