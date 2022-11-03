package sec03.exam01;

public class SmartPhone extends Phone {
	// abstract를 extends 할 수 있는 이유는 생성자가 있기 때문. 생성자 없으면 에러 발생
	
	//생성자
	public SmartPhone(String owner) {
		// 받아야할 값이 있을 때는 자동 생성자 x
		// 프론트엔드 또는 외부에서 값을 받아오는 것
		super(owner);
	}

	//메소드
	public void internetSearch() {	
		System.out.println("인터넷 검색을 합니다.");
	}

}
