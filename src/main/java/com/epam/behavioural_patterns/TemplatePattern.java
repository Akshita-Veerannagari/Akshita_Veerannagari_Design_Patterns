package com.epam.behavioural_patterns;

abstract class Shape
{
	int side1, side2;
	double area;
	abstract void area();
}

class Rectangle extends Shape
{
	Rectangle(int length, int breadth)
	{
		super.side1=length;
		super.side2=breadth;
	}
	
	void area()
	{
		area = side1*side2;
	}
}

class Triangle extends Shape
{
	Triangle(int base, int height)
	{
		side1=base;
		side2=height;
	}
	void area()
	{
		area = (side1*side2)/2;
	}
}

public class TemplatePattern 
{
	public static void main(String args[])
	{
		Rectangle rectangle = new Rectangle(2, 4);
		rectangle.area();
		System.out.println("Area of rectangle with side lengths as: "+rectangle.side1+" and "+rectangle.side2+" is : "+rectangle.area);
		
		Triangle triangle = new Triangle(2,4);
		triangle.area();
		System.out.println("Area of Triangle with side lengths as : "+triangle.side1+" and "+triangle.side2+" is: "+triangle.area);
	}

}
