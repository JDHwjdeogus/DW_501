package 자바0913;

public class 메소드공부7_0923 {
	
	public static int getNum(int x, String y) {
		// 매개변수와 메소드 타입은 반드시 같지 않아도 된다.
		return 0;
	}
	public static int getNum2(int x, String y, String z) {
		return 10;
	}
	
	public static boolean isTrue(boolean a, String b) {
		return true;
	}
	public static String getStr() {
		return "레몬마들렌";
	}
	public static int 피자빵줘(int 빵) {
		return 빵;
	}
	
	
	public static int 현금인출(int 돈) {
		return 돈;
	}
	public static int 현금인출(int 돈, String 은행) {
		if(은행.equals("카카오뱅크")) return 돈;
		if(은행.equals("농협")) return 돈;
		return 0;
	}
	public static int 해외송금(int 금액, String 해외) {
		if(해외.equals("수리남")) return 500;
		return 금액;
	}
	// 메소드 오버로딩: 메소드 이름이 같고 매개변수의 타입이나 개수가 다를 경우 메소드 이름이 중복될 수 있는 것.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = getNum(10, "붕어빵");
		//메소드에 리턴값이 존재하면 다른 함수의 변수에 대입이 가능하다. (접근 지정자가 같고 같은 클래스 내에 있다는 가정 내에서)
		int x = getNum2(6, "레몬", "레몬에이드");
		System.out.println(x + "," + y);
		
		boolean tb = isTrue(false, "레몬");
		System.out.println(tb);
		
		String gesr = getStr();
		System.out.println(gesr);
		
		int 빵 = 피자빵줘(2);
		System.out.println(빵);
		
		int money = 현금인출(3000, "신한");
		System.out.println(money);
		
		//false
	}

}
