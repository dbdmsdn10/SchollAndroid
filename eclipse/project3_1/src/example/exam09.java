package example;

public class exam09 {
	public static void main(String args[]) {
		Automobile auto=new Automobile("����", 0);
		
		auto.upSpeed(250);
		System.out.println("�¿����� �ӵ��� "+auto.getSpeed()+"km/h �Դϴ�");
	}
}
