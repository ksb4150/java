package sec03.exam02;

public class Korean {

	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자를 통해 필드 초기화
	public Korean(String name, String ssn) {
		this.name = name;
	 // this.name -> 현재 생성되고 있는 객체의 필드, 현재 만들고 있는 객체의 필드	
	 // name -> 매개변수 이름은 개발자가 무슨 값인지 알아볼 수 있도록 관련된 이름으로 지어줄 것
		this.ssn = ssn;
	}
}