package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television(); //rc -> Television 객체 가리킴
		rc = new Audio(); //rc -> Audio 객체 가리킴(덮어씌우기)
		
		TestRemoteControl rc2 = null;
		rc2 = new TestTelevision();
		//rc2 = new Audio(); 다른 타입이기 때문에 에러
		
	}

}
