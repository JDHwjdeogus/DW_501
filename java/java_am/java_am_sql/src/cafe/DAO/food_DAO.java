package cafe.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cafe.VO.food;
import cafe.VO.order_list;

public class food_DAO extends base_DAO {
	
	public List<order_list> order_select(String id){

		// 주문내역
		List<order_list> list = new ArrayList<>();	// 주문 내역이 여러 개 존재할 수 있으므로 배열형태로 저장하기 위해 ArrayList 사용
		
		String sql = "select * from order_list where an_order=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			
			while( rs.next() ) {
				order_list data = new order_list( rs.getInt("order_seq"), rs.getString("food_name"), rs.getString("an_order"), rs.getInt("order_price"), rs.getInt("delivery_complete"), rs.getString("memo") );
				// DB에서 가져온 데이터들을 order_list객체로 하났기 생성해주고 ArrayList에 저장하기
				list.add(data);
			}
			
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Map<Integer, food> food_list(){
		String sql = "select * from food";
		Map<Integer, food> food_map = new HashMap<>();
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			
			// rs.next로 다음에 데이터가 있는지 여부를 확인하면서(없을 때까지 반복해야 함) 복수의 데이터를 가져와야 한다.
			// 여러 레코드를 조회했다면 반복문 처리
			while(rs.next()) {
				food data = new food(rs.getInt("food_seq"), rs.getString("food_name"), rs.getInt("cost"), rs.getInt("cook_time"), rs.getInt("cal"), rs.getString("allergy"), rs.getInt("order_quantity"));
				
				// 조회한 food 객체들을 담아두기: Map
				food_map.put(data.getFood_seq(), data);
			}
			return food_map;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void order_insert(order_list data) {
		/*
		 	매개변수를 order_list한 이유는 food_service에서 주문한 내용들을 order_list의 객체에 저장하였기에
		 	DB에 저장하려면 order_list 객체의 값을 가져와서 저장해야 한다.

		 *	DB 저정하기
		 	1. sql문 작성
		 	2. 자바에서 DB로 전달하기 위한 statement 혹은 preparedstatement에 sql문 넣어주기
		 	3. DB에 전달
		 	
		*/
		
		String sql = "insert into order_list(food_name,an_order,order_price,memo) values(?,?,?,?) ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, data.getFood_name());
			pt.setString(2, data.getAn_order());
			pt.setInt(3, data.getPrice());
			pt.setString(4, data.getMemo());
			pt.executeUpdate();
			// query: select. 조회하는 경우 사용 || update: 변경, 추가, 삭제
			System.out.println();
			System.out.println("order_insert 문제 없음 \n");
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println();
			System.out.println("order_insert 문제 있음 \n");
		}
	}
}

/*
	자바 컬렉션
 *	Collection(Interface)
		1. List
	  1) ArrqyList (class)
	  2) LinkedList (class)
	  3) vector
	  4) stack
	  5) queue
	  	
	  	2. Set (Interface)
	  1) HashSet
	  2) TreeSet
	
	
 *	Map(Interface)
		1. HashMap
		2. HashTable
		3. TreeMap
		4. Properties
		
 - map interface는 키와 값의 쌍을 하나의 데이터로 저장한다.
 - 데이터 접근은 키를 찾아 데이터를 리턴한다.
 - 그래서 키는 중복으로 사용하지 않는 데이터로 지정해야 한다. (예: 회원 고유 번호, 도서관 책 일렬번호, 주민등록번호, ...)
 
 Map interface method
  V put(k key, V value);			>>	k, v는  제네릭 타입. <키, 값>으로 저장됨.
  boolean containsKey(Object k);	>>	맵에 키가 있다면 true, 없다면 false.
  boolean containsValue(Object v);	>> 맵에 value가 있다면 ㅅ겯, 없다면 false.
  V get(Object K);					>> 키에 대칭되는 값 리턴.
  
 예)
 Map<String, member> m = new HashMap<String, member>();
 m.put("10가1234", new member("김유신") );
 	V put(k key, V value)
 	k - String, V - mdmber
 
 m.containsKey("20사1234");
 	boolean containsKey(Object k);
 	Object - String
  
*/ 
