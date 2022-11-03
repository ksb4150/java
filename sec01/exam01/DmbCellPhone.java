package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		//DmbCellPhone 생성자가 먼저 실행된 후 부모의 생성자가 실행된다.
		//부모 생성자를 통해 부모 클래스의 멤버를 가진 객체가 생성됨.
		//부모 객체의 주소를 가져와서 저장됨. -> 부모 객체를 자식 개체가 자신 것처럼 사용함
		this.model = model; //부모 객체에 저장됨.
		this.color = color; //부모 객체에 저장됨.
		this.channel = channel; //자식이 가지고 있는 객체에 저장
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
