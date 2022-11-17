package 자바1115;
// java.util 패키지 내의 ArrayList라는 클래스를 사용하려면 import가 필요
import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int height;
	
	// 생성자란? 리턴 타입이 없는 메소드. 메소드 이름이 정해져있다.(메소드를 포함한 클래스 이름과 같다.)
	Student(String name, int height){
		this.name = name;
		this.height = height;
	}
}
public class fifth {

	public static void main(String[] args) {
		Student s1 =  new Student("홍길동", 179);
		Student s2 =  new Student("김길동", 185);
		Student s3 =  new Student("이길동", 172);
		
		List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
		// 방법 1
		for(int i = 0; i < StudentList.size(); i++) {
			System.out.println("이름: " + StudentList.get(i).name + ", 키:" + StudentList.get(i).height);
		}
		
		System.out.print("\n");
		// 방법 2
		for(Student s : StudentList) {			
			System.out.println("이름: " + s.name + ", 키:" + s.height);
		}

	}

}
