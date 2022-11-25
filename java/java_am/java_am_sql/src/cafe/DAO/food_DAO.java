package cafe.DAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cafe.VO.food;

public class food_DAO extends base_DAO {
	
	public void food_list(){
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
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
