package example;

public class exam07 {
	public static void main(String args[]) {
		car car1=new car("빨강",0);
		//car1.color="빨강";
		//car1.speed=0;
		
		car car2=new car("파랑",0);
		//car2.color="파랑";
		//car2.speed=0;
		
		car car3=new car("초록",0);
		//car3.color="초록";
		//car3.speed=0;
		
		car1.upSpeed(50);
		System.out.println("1의 색상은"+car1.getColor()+"속도는"+car1.getSpeed()+"입니다");
		
		car2.upSpeed(20);
		System.out.println("2의 색상은"+car2.getColor()+"속도는"+car2.getSpeed()+"입니다");
		
		car3.upSpeed(250);
		System.out.println("3의 색상은"+car3.getColor()+"속도는"+car3.getSpeed()+"입니다");
		
		
	}
}
