package house;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import movie.movieVo;

public class file {
	private String path;
	
	public file() {
		
	}
	
	public file(String path) {
		this.path = path;
	}
	
	
	public void save(List<house_item> list) {
		
	}
	
	public List<house_item> load(){
		
		List<house_item> list = new ArrayList<>();
		try( BufferedReader file = new BufferedReader(new FileReader(path)) )
		{ 
			while(true){			
				String line = file.readLine();
				if(line == null) break;
				String[] temp = line.split(" ");

				switch(temp[0]) {
				case "tv":
					 tv t = new tv( temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]) );
					 list.add(t);
					 break;
				case "에어컨":
					 list.add( new aircon( temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]) ) );
					 break;
				case "컴퓨터":
					 list.add( new computer( temp[1], Integer.parseInt(temp[2]), temp[3] ) );
					 break;
				
				}
			}
			
			return list;
			
		} catch (IOException e) {
			System.out.println("파일이 손상되었거나 경로가 잘못되었습니다.");
			e.printStackTrace();
		}
		
		for(house_item data : list) {
			System.out.println(data.toString());
		}
		
		return null;
		
	}
	
}
