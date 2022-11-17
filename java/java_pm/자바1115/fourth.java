package 자바1115;

public class fourth {

	public static void main(String[] args) {
		int[] array = {149, 180, 191, 170};
		int height = 167;
		int answer = 0;
		
		int countLong = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(height < array[i]) countLong++; 
		}
		
		System.out.println("머쓱이보다 큰 사람의 수는 " + countLong + "명");
	}

}
