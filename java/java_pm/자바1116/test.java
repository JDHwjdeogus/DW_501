package 자바1116;

public class test {

	public static void main(String[] args) {
		int n = 2;
		int t = 10;
		System.out.println(proliferation(n, t));
		
		
	}
	
	public static int proliferation(int num, int time) {
		// int total = 0;
		for(int i = 0; i < time; i++) {
			// total = num * (2 ^ (total-1));
			num *= 2;
		}
		return num;
	}

}
