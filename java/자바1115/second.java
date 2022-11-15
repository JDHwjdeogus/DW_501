package 자바1115;

// 2번
public class second {
	
	public static void main(String[] args) {
	    int n = 64; //양꼬치(인분)
	    int k = 6; //음료수(개)
	    int result = 0; //지불 금액
	    
	    final int LAMBSKW = 12000;
	    final int SODA = 2000;
	    final int SERVICE = 10;
	    
	    result = (n * LAMBSKW) + ( (k * SODA) - (SODA * (n / SERVICE)) );
	    System.out.println("총합: " + result + "원");
	}

}
