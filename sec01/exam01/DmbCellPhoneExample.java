package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성, 참조 변수에 자식 객체 주소가 저장됨.
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델: "+dmbCellPhone.model); 
		// 자식 객체로 이동했다가 부모 객체로 이동해서 값을 가져옴. 그리고 다시 자식 객체로 이동
		System.out.println("색상: "+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		// 자식 객체로 이동했다가 부모 객체로 이동해서 값을 출력. 그리고 다시 자식 객체로 이동
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
