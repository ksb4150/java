package sec01.exam06;

public class Button {
	OnClickListener listener; // 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
				//OnClickListener listener = new CallListener()
		this.listener = listener;
		// this.listener은 listener에 들어있는 번지의 객체가 OnclickListener을 구현한 객체이기 때문에 가능
		// OnclickListener에서 가져간 메소드만 사용 가능
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
