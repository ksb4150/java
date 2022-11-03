package sec01.exam05;

public class SmartPhone {
	private String company;
	private String os;
	
	//생성자에 의한 초기화
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//최상위 객체인 object를 자동으로 상속하고 있음
	//그래서 object안에 있는 toString을 어디에서든지 재정의할 수 있음
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
