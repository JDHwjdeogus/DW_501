package 자바1115;

// 3번
public class third {

	public static void main(String[] args) {
	    String message = "happy birthday!"; //편지 내용
	    int result = 0; //가로 길이
	    final int LETTERNUM_CM = 2;
	    
	    result = (message.length()) * LETTERNUM_CM;
	    System.out.println("편지지 가로 길이는 최소 " + result + "cm");
	}

}
