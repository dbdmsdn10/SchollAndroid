package example;

public class exam07 {
	public static void main(String args[]) {
		car car1=new car("����",0);
		//car1.color="����";
		//car1.speed=0;
		
		car car2=new car("�Ķ�",0);
		//car2.color="�Ķ�";
		//car2.speed=0;
		
		car car3=new car("�ʷ�",0);
		//car3.color="�ʷ�";
		//car3.speed=0;
		
		car1.upSpeed(50);
		System.out.println("1�� ������"+car1.getColor()+"�ӵ���"+car1.getSpeed()+"�Դϴ�");
		
		car2.upSpeed(20);
		System.out.println("2�� ������"+car2.getColor()+"�ӵ���"+car2.getSpeed()+"�Դϴ�");
		
		car3.upSpeed(250);
		System.out.println("3�� ������"+car3.getColor()+"�ӵ���"+car3.getSpeed()+"�Դϴ�");
		
		
	}
}
