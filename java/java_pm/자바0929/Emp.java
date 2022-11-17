package 자바0929;

public class Emp {
	private int 사원번호;
	private String 사원이름;
	private int 급여;
	private int 보너스;
	Emp(){
		
	}
	Emp(int 사원번호, String 사원이름, int 급여, int 보너스){
		this.사원번호 = 사원번호;
		this.사원이름= 사원이름;
		this.급여 = 급여;
		this.보너스 = 보너스;
	}

	
	public int 사원번호getter() {
		return 사원번호;
	}
	
	public String 사원이름getter() {
		return 사원이름;
	}
	
	public int getter() {
		return 급여;
	}
	
	public int 보너스getter() {
		return 보너스;
	}
	
}
