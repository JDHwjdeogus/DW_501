package cafe.control;

public class exit implements menu_able {

	@Override
	public boolean menu_active() {
		System.out.println("로그아웃 되었습니다.");
		return false;
	}

}
