package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class movieMain {

	public static void main(String[] args) {
		/*
			movieVo[] movieArr = new movieVo[4];
			movieArr[0] = new movieVo("Evangelion: 3.0+1.0 Thrice Upon a Time", 2021, "PG-15");
			movieArr[1] = new movieVo("Evangelion:3.0 You Can (Not) Redo", 2012, "PG-15");
			movieArr[2] = new movieVo("Evangelion: 2.0 You Can (Not) Advance", 2009, "PG-12");
			movieArr[3] = new movieVo("Evangelion: 1.0: You Are (Not) Alone", 2007, "PG-12");
			
			for(movieVo m : movieArr) {
				m.movieInfoPrinting();
				System.out.println();
			}
		*/
		
		// movieVo m = new movieVo(); 
		// movieVo.java에 명시된 생성자 함수와 파라미터 개수가 다른데도 오류가 안나는 이유: 생성자 함수의 기본적인 형태도 같이 명시해줘서.
		// 기본 형태의 생성자 함수랑 같이 명시해주지 않으면 오류남.
		// 파라미터가 존재하는 쪽이 movieVo()의 오버로딩 형태.
		// 대표적인 기본내장 함수 오버로딩 예시: System.out.println();
		
		// List는 인터페이스, ArrayList는 클래스
		// ArrayList의 메소드를 사용할거면 후자를, 기본 메소드만 사용할거면 전자를. 보통은 후자를 사용.
		List<movieVo> list = new ArrayList<>(); // ArrayList<>()에서 <>는 생략 가능. 
		
		String path = "c:/test/movie.txt";
		
		try( BufferedReader file = new BufferedReader(new FileReader(path)) )
		{ // 자동 자원 반환
//			BufferedReader file = new BufferedReader(new FileReader(path));
			
			while(true){				
				String line = file.readLine();
				if(line == null) break;
				// System.out.println(line);
				String[] temp = line.split(" ");
				movieVo data = new movieVo(temp[0], Integer.parseInt(temp[1]), temp[2]);
				list.add(data);
			}
			// file.close();
			
		} catch (IOException e) {
			System.out.println("파일이 손상되었거나 경로가 잘못되었습니다.");
		}
		
		for(movieVo data : list) {
			System.out.println(data.toString() + "\n");
		} 
				
	}

}
