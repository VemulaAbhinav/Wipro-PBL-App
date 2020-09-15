package Oops_Inheritance;

public class Oops_Box {
	private int lenght,height,widith;
	Oops_Box(int length,int height,int witdth)
	{
		this.lenght=length;
		this.height=height;
		this.widith=witdth;
	}
	void getVolume()
	{
		System.out.println("The volume is: "+lenght*height*widith);
	}
	public static void main(String args[])
	{
		Oops_Box bx=new Oops_Box(1,2,4);
		bx.getVolume();
	}
}