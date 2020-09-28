package example;

public class exam09 {
	public static void main(String args[]) {
		Automobile auto=new Automobile("빨강", 0);
		
		auto.upSpeed(250);
		System.out.println("승용차의 속도는 "+auto.getSpeed()+"km/h 입니다");
	}
}
