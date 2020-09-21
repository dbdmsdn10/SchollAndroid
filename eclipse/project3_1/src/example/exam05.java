package example;

public class exam05 {//전역변지 수역변수
	static int var=100;

	public static void main(String[] args) {
		int var=0;
		System.out.println(var);
		int sum=fuction(10,20);
		System.out.println(sum);
	}
	static int fuction(int num1,int num2) {
		int hap;
		hap=num1+num2+var;
		return hap;
	}

}
