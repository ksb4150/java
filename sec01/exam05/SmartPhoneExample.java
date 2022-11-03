package sec01.exam05;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		Object obj = new Object();
		
		String strObj = myPhone.toString();
		
		System.out.println(obj);
		System.out.println(strObj);
		System.out.println(myPhone);
		//참조 변수안에 재정의 된 toString이 있다면, 참조 변수를 출력하게 되면 toString을 이용해 내용이 출력됨.
		//override가 안되어 있으면 Object의 toString이 출력됨(주소)
	}
}
