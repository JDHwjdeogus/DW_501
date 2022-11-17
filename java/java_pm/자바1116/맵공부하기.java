package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {

	public static void main(String[] args) {
		// Map: key와 value의 쌍으로 값을 저장하는 컬렉션즈 중 하나
		Map<String, Integer> x = new HashMap<String, Integer>();
		
		// Map 데이터 추가 (key, value)
		x.put("one", 1);
		x.put("two", 2);
		x.put("three", 3);
		
		// 데이터 가져오기: key 이용
		System.out.println(x.get("three"));
		
		// Object: 모든 타입의 데이터를 받을 수 있음
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empno", 7844);
		map.put("ename", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 500);
		System.out.println("empno: " + map.get("empno") + "\nsal: " + map.get("sal"));
		
		// List 안에 Map을 담을 수 있다: Map도 클래스이기에 가능
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map);
		
	}

}
