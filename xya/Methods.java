package corebasics;

public class Methods {

	public static void bellam() {
		System.out.println("Bellam Naveen welcomes you to join his fans club");
	}
	public static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public static int sub(int a, int b)
	{
		int sub = a-b;
		return sub;
	}
	public static int mul(int a, int b)
	{
		int mul = a*b;
		return mul;
	}
   public static void main(String[] args) {
	   bellam();
	   int sum = add(4,5);
	   System.out.println(sum);
	   int sub = sub(9,5);
	   System.out.println(sub);
	   int mul = mul(9,5);
	   System.out.println(mul);
	   }
}
