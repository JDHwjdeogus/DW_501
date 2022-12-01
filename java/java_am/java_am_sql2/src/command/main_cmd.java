package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import DAO.ventureDAO;
import VO.venture;

public class main_cmd{
	
	public static void main(String[] args) {
		
		ventureDAO vdao = new ventureDAO();
		List<venture> list = vdao.Select_all();
		
		TreeSet<venture> sw = new TreeSet<>();
		TreeSet<venture> build = new TreeSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			venture temp = it.next(); // ArrayList에 저장된 기업객체를 temp에 하나씩 저장
			if(temp.getB_kind().contains("정보처리"))
				sw.add(temp);
			if(temp.getB_name().contains("건설"))
				build.add(temp);
		}
//		System.out.println(sw);
//		System.out.println(build);
		
		List<venture> sw_list = new ArrayList<>(sw);
		System.out.println( sw.floor(sw_list.get(5)) );
		System.out.println( sw.headSet(sw_list.get(3)) );
		System.out.println( sw.lower(sw_list.get(10)) );
		System.out.println( sw.higher(sw_list.get(10)) );
		System.out.println( sw.subSet(sw_list.get(2), sw_list.get(4)) );
		
		venture srh = new venture();
		srh.setC_name("(주)골나");
		sw.add(srh);
		System.out.println("\n" + sw.headSet(srh));
		// TreeSet 검색 방법 - 이진트리 안에 저장되어있는 값 기준으로 검색.
		// 이진트리 안에 저장되어있는 값은 객체 주소 값이 저장되어있다.
		// 검색 시 저장되어있는 순서에 의해 결과값이 나온다.
		// 따라서 위와 같이 검색하고자 하는 회사이름을 따로 입력해, 객체를 생성한 후, 검색에 사용하는 방식은... TreeSet 안에 없는 값이기 때문에 검색이 이루어지지 않는다.
		
		/*
			String a = "hot";
			String b = "apple";
			System.out.println(a.compareTo(b));
			System.out.println(b.compareTo(a));
			
			* tree구조: 알파벳 상 a에 가까울수록 작고 z에 가까울 수록 크다.
			* 		   이진트리 구조 상 상위 노드는 배열의 첫번째 값이고, 다음 인덱스의 데이터와 비교해서 값이 작으면 하위의 왼쪽에, 크면 오른쪽에 놓인다.
			tree 메소드(검색)
			floor(객체) - 지정된 객체와 같은 객체를 찾아서 반환. 같은 객체가 없다면 작은 값 중 가까운 객체 반환
			headSet(객체) - 지정된 객체보다 작은 객체들을 모두 반환.
			tailSet(객체) - 지정된 객체보다 큰 객체들을 모두 반환.
			higher(객체) - 지정된 객체보다 큰 값을 가진 객체 중에서 가장 가까운 객체를 반환. 없다면 null 반환.
			lower(객체) - 지정된 객체보다 작은 값을 가진 객체 중에서 가장 가까운 객체를 반환. 없다면 null 반환.
			subSet(객체1, 객체2) - 범위 검색. 객체 1부터 객체 2 전까지의 객체들을 반환. 
			
		*/

				
		
//		for(venture tmp : list) {
//			System.out.println(tmp.getNum() + ". " + tmp.getC_name() + " / " + tmp.getAddr() + " / " + tmp.getB_kind() + " / " + tmp.getB_name() + " / " + tmp.getProduct());
//		}
		
		
//		Set<String> category = new HashSet<>();	//set - 중복허용X
//		Iterator<venture> it = list.iterator();
//		while(it.hasNext()) {
//			category.add(it.next().getB_kind());
//		}
//		// System.out.println(category);
//		
//		Set<venture> retail = new HashSet<>();	// 도소매업
//		Set<venture> sw = new HashSet<>();		// 정보처리, SW
//		Set<venture> build = new HashSet<>();	// 건설, 운수
//		it = list.iterator();
//		while(it.hasNext()) {
//			venture data = it.next();
//			if(data.getB_kind().contains("도소매업")) retail.add(data);
//			if(data.getB_kind().contains("정보처리")) sw.add(data);
//			if(data.getB_kind().contains("건설")) build.add(data);
//		}
		
		
//		venture a = new venture(list.get(0).getNum(), list.get(0).getC_name(), list.get(0).getAddr(), list.get(0).getB_kind(),list.get(0).getB_name(), list.get(0).getProduct());
//		venture b = new venture(list.get(0).getNum(), list.get(0).getC_name(),  list.get(0).getAddr(), list.get(0).getB_kind(),list.get(0).getB_name(), list.get(0).getProduct());
//		
//		if( a.equals(b) )	// num 값만 비교하도록 만들어진 equals
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
//		
//		if(list.contains(b))	// b 포함여부
//			System.out.println("있다.");
//		else
//			System.out.println("없다.");
//		if(list.contains(a))	// a 포함여부
//			System.out.println("있다.");
//		else
//			System.out.println("없다.");
		
		// 교집합
//		Set<venture> gyo = new HashSet<>();
//		Iterator<venture> gj = sw.iterator();
//		while(gj.hasNext()) {
//			venture gyojibhob = gj.next();
//			if(retail.contains(gyojibhob)) 
//				gyo.add(gyojibhob);
//		}
//		System.out.println(gyo.size());
//		System.out.println(gyo);
		
		// 차집합
//		Set<venture> cha = new HashSet<>();
//		Iterator<venture> cj = sw.iterator();
//		while(cj.hasNext()) {
//			venture chajibhob = cj.next();
//			if(retail.contains(chajibhob)) 
//				continue; 
//			cha.add(chajibhob);
//		}
//		List<venture> cha_list = new ArrayList<>(cha);
//		System.out.println(cha.size());
//		System.out.println(cha);	
		
		// 도소매, 정보처리, 건설 업체 출력
//		System.out.println(retail);
//		System.out.println(sw);
//		System.out.println(build);
//		System.out.println(retail.size());
//		System.out.println(sw.size());
//		System.out.println(build.size());
		


		
		// 차집합, 교집합, 합집합 (주소 기준)
		/*
		  
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
			while(test.hasNext()) {			//  name2 과 name1의 차집합: name2에만 있는 이름 찾기
				String name = test.next();
				if(name1.contains(name))
					continue;
				cha.add(name);
			}
			System.out.println(cha);
			
		*/
		
		
	}
	

}
