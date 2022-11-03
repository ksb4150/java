package sec02.exam03;

public class Window {
	Button but1 = new Button();
	Button but2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		but1.setOnClickListener(listener);
		but2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
				
			}
		});
	}
}
