package sec01.exam06;

public interface RemoteControl {
	//상수
	//public static final 생략되어 있음
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
