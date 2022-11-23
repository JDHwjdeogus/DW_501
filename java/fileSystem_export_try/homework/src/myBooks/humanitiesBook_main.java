package myBooks;

import java.util.ArrayList;
import java.util.List;

// 인문계열 책
public class humanitiesBook_main {
	String bookName;
	int year;
	author a = new author();
	Assistance asi = new Assistance(); // 역자
}



/* 포함 */

// 작가 
class author {
	String name; // 저자 분류: 소설가, 만화가, 사회학자
	String auType;
	List<String> representBook = new ArrayList<>(); // 대표 저서 배열
}

// 삽화가 엮은이 등 모든 창작자 관련 정보
class Assistance {
	String asiGroup; // 보조 창작자 분류: 삽화가, 엮자, 만화 어시스턴트 등등
	String name;
}



/* 상속 */

class novel extends humanitiesBook_main {
	String genre; // sf 호러 로맨스 드라마 고전문학 등등
	String nation; // 러문학 중문학 일문학 영문학 불문학 등등
}

class sociology extends humanitiesBook_main {
	String societyIssue; // 사회문제 별 분류: 페미니즘 퀴어 노동자 환경사회학 심리학 등등
}

class cartoon extends humanitiesBook_main {
	String genre; // sf 호러 로맨스 드라마 교양지식 등등
	String cartoonGenre; // 웹툰, 망가, 그래픽노블
}

