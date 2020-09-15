package Polymorphism;

public class Shape_Main {
	public static void main(String args[])
	{
		Shape_Class c=new Circle();
			c.draw();
			c.earse();
		Shape_Class t = new Trinangle();
			t.draw();
			c.earse();
		Shape_Class s = new Square();
			s.draw();
			s.earse();
			
	}

}