package Polymorphism;

class Shape_Class {
	public void draw()
	{
	System.out.println("Drawing Shape");
	}
	public void earse()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape_Class
{
	public void draw()
	{
	System.out.println("Drawing Circle Shape");
	}
	public void earse()
	{
		System.out.println("Erasing Circle Shape");
	}
}
class Trinangle extends Shape_Class
{
	public void draw()
	{
	System.out.println("Drawing Tringangle Shape");
	}
	public void earse()
	{
		System.out.println("Erasing Trinangle Shape");
	}
}
class Square extends Shape_Class
{
	public void draw()
	{
	System.out.println("Drawing Square Shape");
	}
	public void earse()
	{
		System.out.println("Erasing Square Shape");
	}
}
