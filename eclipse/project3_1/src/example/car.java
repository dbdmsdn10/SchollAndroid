package example;

public class car {
	String color;
	int speed;// 위 2개 필드
	static int catcount=0;
	final static int maxspeed=200;
	final static int minspeed=0;
	
	car(String color,int speed){
		this.color=color;
		this.speed=speed;
		catcount++;
	}
	
	static int currentcarcount() {
		return catcount;
	}
	
	car(int speed){
		this.speed=speed;
	}

	int getSpeed() {
		return speed;
	}

	void upSpeed(int value) {
		if (speed + value >= 200) {
			speed = 200;
		} else {
			speed += value;
		}

	}

	void downSpeed(int value) {
		if(speed-value<=0) {
			speed=0;
		}
		else {
			speed-=value;
		}
	}
	String getColor(){
		return color;
	}

}
