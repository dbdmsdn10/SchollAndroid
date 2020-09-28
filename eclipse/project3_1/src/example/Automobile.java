package example;

public class Automobile extends car{
	

	Automobile(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}

	int SeatNum;
	int getSeatNum() {
		return SeatNum;
	}
	
	void upSpeed(int value) {
		if(speed+value>=300) {
			speed=300;
		}
		else {
			speed+=value;
		}
	}
	
}
