package 자바0913;

public class 메소드공부2_0919 {
	//return type: void >> return을 명시하지 않음.
	public static void 캐릭터선택(String 캐릭터이름) {
		System.out.println("당신이 선택한 캐릭터: " + 캐릭터이름);
	}
	public static void 아이템획득(String 아이템) {
		System.out.println(아이템 + "를/을 얻었다!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		캐릭터선택("디지");
		아이템획득("스포츠카");
	}

}
