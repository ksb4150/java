package sec06.exam06;

public class Car {
	//필드
	private int speed;
	private boolean stop; // 기본값으로 false 들어있음
	
	//생성자
	
	//메소드
	public int getSpeed() { 
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return; //잘못된 값이기 때문에 종료함
		} else {
			this.speed = speed;
			//필드가 직접적으로 변경되면 안되기 때문에 메소드를 이용해서 변경
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
