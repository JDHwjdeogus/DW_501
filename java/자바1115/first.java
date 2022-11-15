package 자바1115;

// 1번
public class first {

	public static void main(String[] args) {
		int money = 15000; //가지고 있는 돈
	    int 잔수 = 0;
	    int 남은돈 = 0;
	    
	    final int AMERICANO = 5500;
	    
	    잔수 =  money / AMERICANO;
	    남은돈 = money % AMERICANO;
	    System.out.println("잔수: " + 잔수);
	    System.out.println("남은돈: " + 남은돈);
	}

}
