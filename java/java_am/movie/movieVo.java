package movie;

public class movieVo {
	private String title;
	private int year;
	private String MovieRating;
	
	public movieVo() {} // 값을 가진 생성자를 초기화. 굳이 코드로 명시하지 않아도 기본적으로 존재하는 생성자.
	public movieVo(String title, int year, String MovieRating) {
		this.title = title;
		this.year = year;
		this.MovieRating = MovieRating;
	} // 값을 가진 생성자
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMovieRating() {
		return MovieRating;
	}
	public void setMovieRating(String movieRating) {
		MovieRating = movieRating;
	}
	
	/*
		public void movieInfoPrinting() {
			System.out.println("|| 제목: " + title + "\n|| 개봉년도: " + year + "\n|| 관람등급: " + MovieRating );
		}
	*/
	@Override
	public String toString() { // 자바에선 일반적인 출력용 메서드
		return "|| 제목: " + title + "\n|| 개봉년도: " + year + "\n|| 관람등급: " + MovieRating;
	}
}
