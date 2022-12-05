package class501;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class main_method {
	
	public static Map<String, ban_active> map = new HashMap<>();
	
	public static void init() {
		// ResourceBundle rb = ResourceBundle.getBundle("ban");

		// 패키지가 다를 경우 "패키지명.파일명"
		// ResourceBundle은 prop 파일을 읽어들일 때 주로 사용한다.
		// web에서 bundle의 사용처는 접속한 local(국가)에 따라 언어 별 페이지를 보여줄 때 사용되기도 한다.
		// collection을 순차적으로 접근하며 사용하기 위한 인터페이스 iterator.
		// prop은 컬렉션 이전에 나와서 iterator을 사용할 수 없다. >> iterator는 컬렉션 전용이라고 봐도 무방.
		// 대신 prop은 enumeration을 사용한다.
		// Enumeration key=rb.getKeys();	// prop 파일에서 키만 가져온다: 여기서 key는 확장자가 class명.html인 쪽
		
		Properties prop = new Properties();
		try(FileReader fr = new FileReader("C:\\java\\java_am_sql3\\src\\class501\\ban.properties")){
			prop.load(fr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Iterator key = prop.keySet().iterator();
		
		while(key.hasNext()) {
			String cmd = (String)key.next();	// prop 파일의 key를 하나씩 cmd에 저장.
			String val = prop.getProperty(cmd);			// key를 입력해 value를 구하고 val에 저장.
			System.out.println(val);
			
			// 문자열 클래스화 시키기: Class.forName("cafe.control.order");
			try {
				Class<?> hclass = Class.forName(val);
				ban_active ban = (ban_active)hclass.newInstance();	// computer 객체 생성
				map.put(cmd, ban);		// prop의 키를 map의 키로 저장, prop의 value는 객체생성하여 map의 value로 저장
			} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		init();
		
		System.out.println("이동할 페이지 선택: ");
		System.out.println("people, chair, computer, moniter, desk");
		String page = new Scanner(System.in).nextLine();
		page += ".html";
		
		ban_active pg = map.get(page);		// 키를 입력하여 해당value 구하기  
		pg.action(page);
		
	}

}
// 서로 다른 클래스의 객체를 실행하기 위해 interface로 배열을 만들어 사용했었다. (cafe 시스템 구현했었을 때)
// 이번 시간에는 spring의 기본 구조를 활용(구현?)해본다.