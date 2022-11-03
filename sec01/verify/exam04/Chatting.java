package sec01.verify.exam04;

public class Chatting {
	void startChat(String chatID) {
		String nickName = null;
		//nickName = chatID; 로컬 변수를 로컬 클래스에서 사용할 때의 제한이 있다.
		
		class Chat {
			public void start() {
				boolean boo = false;
				while (!boo) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
					boo = true;
				}
			}
			
			void sendMessage(String message) {
				System.out.println(message);
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
	
	public static void main(String[] args) {
		Chatting chat = new Chatting();
		
		chat.startChat(null);
	}
}
