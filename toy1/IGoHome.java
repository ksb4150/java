package toy1;

public class IGoHome {

	public static void main(String[] args) {
		
		String Lname = "이정규";
		int Lage = 28;
		String LLname = "서재석";
		int LLage = 29;
		
		System.out.println("내 옆자리 분 성함 : "+Lname+"님, 나이 : "+Lage+"살");
		System.out.printf("내 옆옆자리 분 성함 : %s님, 나이 : %d살", LLname, LLage);

	}
	// <- 이정규님, 28살
	//<<- 서재석님, 29살

}
