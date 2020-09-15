package Oops_Inheritance;

public class Oops_Calc {
	public static void powerInt(int num1,int num2)
	{
		System.out.println((int)Math.pow(num1, num2));
	}
	public static void PowerDouble(double num1,double num2)
	{
	  System.out.println(Math.pow(num1, num2));	
	}
	public static void main(String args[])
	{
		Oops_Calc.powerInt(2, 5);
		Oops_Calc.PowerDouble(2.2, 2);
	}
}