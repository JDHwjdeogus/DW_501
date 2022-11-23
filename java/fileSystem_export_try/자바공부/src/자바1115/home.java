package 자바1115;

import java.util.ArrayList;
import java.util.List;

public class home {

	public static void main(String[] args) {
		Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");
		
		// 문제 1.
		List<Emp> sawonList = new ArrayList<Emp>();
		sawonList.add(sawon1);
		sawonList.add(sawon2);
		sawonList.add(sawon3);
		sawonList.add(sawon4);
		sawonList.add(sawon5);
		sawonList.add(sawon6);
		sawonList.add(sawon7);
		sawonList.add(sawon8);
		sawonList.add(sawon9);
		sawonList.add(sawon10);
		
		// 문제 2, 문제 3, 문제 4, 문제 5
		int salSum = 0;
		int salAvg = 0;
		int maxSal = 0;
		int Manager2500 = 0;		
		
		for(Emp e : sawonList) {
			// 문제 2
			salSum += e.sal;
			
			// 문제 4
			if( (e.job).equals("MANAGER") && e.sal >= 2500) Manager2500++;
		}
		
		// 문제 3
		salAvg = salSum / sawonList.size();
				
		System.out.println("직원 총 급여: " + salSum);
		System.out.println("직원 평균 급여: " + salAvg);
		System.out.println("급여가 2500 이상인 MANAGER의 수: " + Manager2500);
		
		//문제 5 미해결
		for(int i = 0; i < sawonList.size(); i++) {
			if( maxSal <= (sawonList.get(i).sal) ) {
				maxSal = (sawonList.get(i).sal);
			}
		}
		System.out.println("직원들 중 가장 높은 연봉: " + maxSal);
			
	
	}

}

/*
 	class 란? 
 	유사한 특징을 묶어놓은 집합체
 	필드변수와 메소드 구성
 	객체를 생성하기 위한 틀
 	객체 지향 언어에만 있는 용어
 	
 	메소드 오버로딩: 메소드 이름 동일하나 리턴타입 혹은 파라미터 구성이 다른 것. 파라미터의 차이가 우선순위가 더 높다.
*/
