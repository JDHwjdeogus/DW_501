package command;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import DAO.ventureDAO;
import VO.venture;

public class main_cmd{
	
	public static void main(String[] args) {
		
		ventureDAO vdao = new ventureDAO();
		List<venture> list = vdao.Select_all();
		
//		for(venture tmp : list) {
//			System.out.println(tmp.getNum() + ". " + tmp.getC_name() + " / " + tmp.getAddr() + " / " + tmp.getB_kind() + " / " + tmp.getB_name() + " / " + tmp.getProduct());
//		}
		
		Set<String> category = new HashSet<>();
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getB_kind());
		}
		// System.out.println(category);
		
		Set<venture> retail = new HashSet<>();	// 도소매업
		Set<venture> sw = new HashSet<>();		// 정보처리, SW
		Set<venture> build = new HashSet<>();	// 건설, 운수
		it = list.iterator();
		while(it.hasNext()) {
			venture data = it.next();
			if(data.getB_kind().contains("도소매업")) retail.add(data);
			if(data.getB_kind().contains("정보처리")) sw.add(data);
			if(data.getB_kind().contains("건설")) build.add(data);
		}
		
//		System.out.println(retail);
//		System.out.println(sw);
//		System.out.println(build);
//		System.out.println(retail.size());
//		System.out.println(sw.size());
//		System.out.println(build.size());
		
		// 차집합, 교집합, 합집합 (주소 기준)
		
		HashSet<String> name1 = new HashSet<>();
		HashSet<String> name2 = new HashSet<>();
		
		
		
		name1.add("태조"); name1.add("정종"); name1.add("태종"); name1.add("세종");
		name1.add("문종"); name1.add("단종"); name1.add("세조"); name1.add("예종");
		name1.add("성종"); 
		
		name2.add("연산군"); name2.add("중종"); name2.add("인종");
		name2.add("명종"); name2.add("선조"); name2.add("태종"); name2.add("태조");
		name2.add("세종"); name2.add("세조");
		
		HashSet<String> hab = new HashSet<>();
		HashSet<String> cha = new HashSet<>();
		HashSet<String> gyo = new HashSet<>();
		// Iterator 필요 이유: HashSet은 값을 빼오거나 출력하는 메소드가 따로 없어서 (그러나 값을 넣는 건 있음)
		Iterator<String> test = name1.iterator();
		while(test.hasNext()) {			// name1의 데이터를 hab에 저장
			hab.add(test.next());	
		}
		test = name2.iterator();
		while(test.hasNext()) {			// name2의 데이터가 hab에 있는지 비교하고 없으면 hab에 해당 데이터(name2에만 있는 것) 저장 
			String name = test.next();
			if(hab.contains(name))		// hab 내부에 name값이 있는지 판별
				continue;
			hab.add(name);
		}
		System.out.println(hab);
		
		test = name2.iterator();
		while(test.hasNext()) {
			String name = test.next();
			if(name1.contains(name))
				gyo.add(name);
		}
		System.out.println(gyo);
		
		test = name2.iterator();
		while(test.hasNext()) {
			String name = test.next();
			if(name1.contains(name))
				continue;
			cha.add(name);
		}
		System.out.println(cha);
		
		
		
	}
	

}
