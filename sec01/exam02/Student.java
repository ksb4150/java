package sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		// 명시적으로 부모 생성자를 호출해야하는 경우
		// 부모 클래스에 명시적으로 생성자가 선언되어 있을 때
		// super 안해주면 오류 걸림
		super(name, ssn); 
		this.studentNo = studentNo;
	}
}
