package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	// Get: 조회 || Mapping: URL 연결 || 연결은 런타임에서 실행된다.
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {
		Movie movie = new Movie();
		movie.setGenre("Animation, Comedy, Horror");
		movie.setYear("2000–2016");
		movie.setRuntime("21 min");
		movie.setTitle("Happy Tree Friends");
		
		return movie;
		
	}
}
