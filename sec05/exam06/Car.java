package sec05.exam06;

public class Car {
	//필드
	private int speed;
	private boolean stop; // 기본값 false
	
	//생성자
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0 ) { // 속도는 -가 될 수 없음
			this.speed = 0;
			return ;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop; //stop = true
		this.speed = 0;
	}
	
}
