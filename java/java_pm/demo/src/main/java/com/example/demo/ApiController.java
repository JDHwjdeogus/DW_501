package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
	클래스 이름: 맨 앞이 대문자
	변수 이름: 상수 제외하고 전부 소문자 (상수는 전부 대문자)
	함수 이름: 명사 말고 동사
	
	
	RestController: 데이터(json) 전송
	Controller: 페이지(html) 이동
*/

// Rest: 자원(데이터)
@RestController
public class ApiController {
	@GetMapping("/api/v1/sample")
	public List<String> callData(){
		List<String> list = new ArrayList<String>();
		list.add("고양이");
		list.add("강아지");
		list.add("토끼");
		
		return list;
	}
	
	// Get: 조회 || Mapping: URL 연결 || v1: 버전을 의미함 || 연결은 런타임에서 실행된다.
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {
		Movie movie = new Movie();
		movie.setGenre("Animation, Comedy, Horror");
		movie.setYear("2000–2016");
		movie.setRuntime("21 min");
		movie.setTitle("Happy Tree Friends");
		// movie 객체 전달
		return movie;
		
	}
	
	// URL은 주소가 같으면 안된다. 중복 불가.	
	@GetMapping("/api/v1/movies")
	public List<Movie> callMovies() {
		List<Movie> list = new ArrayList<Movie>();
		
		Movie movie = new Movie();
		System.out.println(movie);
		movie.setGenre("Animation, Comedy, Horror");
		movie.setYear("2000–2016");
		movie.setRuntime("21 min");
		movie.setTitle("Happy Tree Friends");
		
		Movie movie2 = new Movie();
		System.out.println(movie2);
		movie2.setGenre("Animation, Adventure, Comedy");
		movie2.setYear("2004–2009");
		movie2.setRuntime("30 min");
		movie2.setTitle("Foster's Home for Imaginary Friends");
		
		list.add(movie);
		list.add(movie2);
		
		return list;
	}
	
	// https://n.news.naver.com/sports/qatar2022/article/241/0003241835
	// Path(경로/주소/길)로 데이터 받기 >> 보낼 데이터가 많을 때 사용
	// Path(경로) + variable(값)
	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
	public int callArticle(@PathVariable int articleNumber) {
		return articleNumber;
	}
	
	// https://comic.naver.com/webtoon/detail?titleId=687915&no=304&weekday=mon
	// ?: 쿼리스트링
	// 쿼리스트링으로 데이터 받기 >> 보낼 데이터가 별로 없을 때 사용
	// Request(요청) + Param(파라미터)
	@GetMapping("/api/v1/webtoon/list")
	public Map<String, Object> callWebtoon(@RequestParam int titleId, @RequestParam String weekday){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		
		return map;
	}
	// 결과: http://localhost:8080/api/v1/webtoon/detail?titleId=687915&no=304&weekday=mon
	
	
	// 쿼리스트링 >> path
	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
	public Map<String, Object> WebtoonPath(@PathVariable int titleId, @PathVariable String weekday) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		
		return map;
	}
	// 결과: http://localhost:8080/api/v1/webtoon/list/titleId/687915/weekday/mon
}
