package sec01.exam06;

public class MessageListener implements Button.OnClickListener { 
							//interface OnClickListener은 static이므로 클래스 이름으로 접근 가능
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
