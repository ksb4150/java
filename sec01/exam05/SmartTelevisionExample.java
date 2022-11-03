package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		//RemoteControl과 Searchable 둘 다 사용 가능
		tv.turnOn();
		tv.search("tv");
		
		RemoteControl rc = tv;
		
		rc.turnOn();
		//rc.search("tv"); RemoteControl 것만 사용 가능
		
		Searchable searchable = tv;
		
		//searchable.turnOn(); Searchable 것만 사용 가능
		searchable.search("tv");
		
	}

}