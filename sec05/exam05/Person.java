package sec05.exam05;

public class Person {
	final String nation = "Korea";
	// final은 값을 바꿔줄 수 없음
	final String ssn;
	// null로 채워져 있는게 아니라 그 다음에 들어온 값으로 초기화 됌(생성자로)
	
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
