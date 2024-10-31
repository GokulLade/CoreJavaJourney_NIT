package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.A_abstractprograms;

abstract class Shape{
	
	public abstract void draw();
}

class Square extends Shape{
	
	@Override
	public void draw()
	{
		System.out.println("Drawing Square");
	}
}
class Rectangle extends Shape{
	
	@Override
	public void draw()
	{
		System.out.println("DrawingRectangle");
	}
}

public class ShapeProgarm01 {

	public static void main(String[] args) 
	{
		Shape s ;
		s = new Square();
		s.draw();
		
		s = new Rectangle();
		s.draw();

	}

}
