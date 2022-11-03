package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch(); //CallListener에 override 된 touch가 사용됨
		
		btn.setOnClickListener(new MessageListener());
		btn.touch(); //MessageListener에 override 된 touch가 사용됨
	}

}
