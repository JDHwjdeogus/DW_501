package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.ApiService;
import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.Login;
import com.example.demo.vo.Login2;
import com.example.demo.vo.Movie;
import com.example.demo.vo.UsersVO;

/*
	클래스 이름: 맨 앞이 대문자
	변수 이름: 상수 제외하고 전부 소문자 (상수는 전부 대문자)
	함수 이름: 명사 말고 동사
	
	
	RestController: 데이터(json) 전송
	Controller: 페이지(html) 이동
	
	Controller는 사용자 요청(URL 요청)을 처리하는 class
	Controller에서 로직을 구현하면 안됨 >> 로직 짜기 위한 클래스를 새로 만들어줘야 하ㅁ: ApiService
*/

// Rest: 자원(데이터)
@RestController
public class ApiController {
	
	// ApiService apiservice = new ApiService(); // 클래스를 전역 변수로
	// 스프링 객체생성(@Autowired): 개발자 대신에 Spring에서 객체를 관리해주겠다. >> 바로 윗줄과 같은 생성자 호출 필요 없음, 어노테이션@ 으로 관리권한 위임
	// IoC(Inversion of Control, 제어 역전)
	
	final String ROOT_URL = "api/v1";	// 탐색기 내에서 검색이 힘들어진다는 단점이 있음
	
	@Autowired
	ApiService apiservice;	// 클래스를 전역변수로
	
	@Autowired
	EmpMapper empMapper;	// 원래 인터페이스는 객체화가 안되는데 이게 객체화가 되는 건 mybatis에서 상속받고 있으므로 객체생성이 가능
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping(ROOT_URL+"/sample")
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
		/*
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
		*/
		
		// ApiService service = new ApiService();	// 클래스 호출
		return apiservice.makeMovies();
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
	
	// Post: 데이터를 받아서 무언가를 생성/전송할 때
	@PostMapping("/api/v1/join")
	public boolean callJoin(@RequestBody Login login) {
		System.out.println("html에서 서버로 받아온 데이터입니다.");
		System.out.println("아이디: " + login.getId());
		System.out.println("비밀번호: " + login.getPw());
		System.out.println("이메일: " + login.getEmail());
		return true;
	}
	
	/*
		Get: 데이터 조회		== select
		Post: 데이터 생성(전송)	== insert
		Patch: 데이터 업데이트	== update
		Delete: 데이터 삭제	== delete
		
		>> CRUD(Create Read Update Delete)
	*/
	
	@PostMapping("/api/v1/join2")
	public boolean callJoin2(@RequestBody Login2 login2, HttpServletRequest request) {
		System.out.println();
		
		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP: " + ip);
		
		System.out.println("html에서 서버로 받아온 데이터입니다.");
		System.out.println("회사이름: " + login2.getCompanyName());
		System.out.println("가입자명: " + login2.getUserName());
		System.out.println("연락처: " + login2.getPhone());
		
		return true;
	}
	
	// select
	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp(){
		return empMapper.selectEmp();
	}
	
	@GetMapping("/api/v1/dept")
	public List<DeptVO> callDept(){
		return empMapper.selectDept();
	}
	
	
	// insert
	@PostMapping("/api/v1/emp/join")
	public int callEmpjoin(@RequestBody EmpVO emp) {
		return empMapper.insertEmp(emp);
	}
	
	@PostMapping("/api/v1/dept/resist")
	public int callDeptResist(@RequestBody DeptVO dept) {
		return empMapper.insertDept(dept);
	}
	
	
	// delete: 매핑이 다른 경우 url이 중복되어도 괜찮다.
	@DeleteMapping("/api/v1/emp/{empno}")
	public int callEmpDelete(@PathVariable int empno) {
		return empMapper.deleteEmp(empno);
	}
	
	@DeleteMapping("/api/v1/dept/{deptno}")
	public int callDeptDelete(@PathVariable int deptno) {
		return empMapper.deleteDept(deptno);
	}
	
	
	// update
	/* @RequestBody: html 문서의 body에 데이터를 보냄 || @PathVariable: html 문서의 헤더로 데이터를 보냄 */
	@PatchMapping("/api/v1/emp")
	public int callEmpUpdate(@RequestBody EmpVO emp) {
		return empMapper.updateEmp(emp);
	}
	
	
	// 회원가입
	@PostMapping("/api/v1/dwjoin")
	public int callDWJoin(@RequestBody UsersVO user) {
		String password = user.getPw();				// html에서 입력받은 비밀번호를 가져옴
		password = passwordEncoder.encode(password);// 비밀번호 암호화(SHA-1)
		
		user.setPw(password);	// 암호화된 비밀번호 set
		
		return empMapper.insertUsers(user);
	}
	
	
	// 로그인: login은 데이터 노출 방지를 위해 POST방식 사용
	// 세션: 서버(자바 서블릿 컨테이너)에 임시로 데이터를 저장하는 것.
	@PostMapping("/api/v1/dwLogin")
	public UsersVO callDWLogin(@RequestBody UsersVO user, HttpServletRequest req) {
		
		String password = user.getPw(); 	// HTML에서 가져온 비밀번호
		
		user = empMapper.selectUsersPassword(user);
		if(user == null) {
			user = new UsersVO();
			user.setUser(false);
		}
		
		String DBpassword = user.getPw();	// DB에 저장된 비밀번호 불러오기
		boolean isUser = passwordEncoder.matches(password, DBpassword);
		
		if(!isUser) {
			user.setUser(false);
			return user;
		}
		// 고객정보 세션에 넣기
		HttpSession session = req.getSession();	 		// session 불러오기
		session.setAttribute("name", user.getName());	// session에 사용자 이름 저장
		// 세션은 key와 value로 구성: HashMap과 동일 
		// 세션은 서버가 종료될 때 까지 데이터가 유지됨: 기본(default) 시간은 30분.
		
		System.out.println("비밀번호 체크 >> " + isUser);
		
		user.setUser(true);
		return user;
		
	}
	
	@GetMapping("/api/v1/userLogin")
	public List<UsersVO> calluserLogin(){
		return empMapper.selectUser();
	}
	
	// /api/v1/ >> 전역변수처럼 쓰일 수 있음.
	// 단점: 검색 시 안나옴
	@GetMapping("/api/v1/users/{id}")
	public boolean callUser(@PathVariable String id) {
		return apiservice.checkUser(id);
	}
	
}
