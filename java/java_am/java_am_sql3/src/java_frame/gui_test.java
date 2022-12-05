package java_frame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gui_test extends JFrame {
	public gui_test() {
		setTitle("swing test");
		setSize(300, 400);
		// 작업관리자 상에서도 완전히 종료: JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		// 컨택트팬은 컴포넌트를 넣어주기 위해 어디에 넣어줄 것인가를 지정하기 위한 용도
		c.setLayout(new FlowLayout());
		// setLayout을 통해 어떤 위치에 열릴 것인지 지정. FlowLayout은 기본 배치 방식.
		
		JButton jb = new JButton("취소");
		JButton jb2 = new JButton("확인");
		c.add(jb);
		c.add(jb2);
		setVisible(true);
	}
}
