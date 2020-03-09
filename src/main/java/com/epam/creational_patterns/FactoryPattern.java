package com.epam.creational_patterns;


interface movement
{
	String move();
}

class ChessPieces implements movement
{
	String name;
	ChessPieces(String name)
	{
		this.name=name;
	}
	public String move()
	{
		return "This tells the movement";
	}
}

class Bishop extends ChessPieces
{
	Bishop(String name)
	{
		super(name);
	}
	
	public String move()
	{
		return this.name+" moves diagonally";
	}
}

class King extends ChessPieces
{
	King(String name)
	{
		super(name);
	}
	
	public String move()
	{
		return this.name+" can move in any direction";
	}
}
public class FactoryPattern 
{
	public static void main(String args[])
	{
		Bishop bishop = new Bishop("bishop");
		System.out.println(bishop.move());
		King king = new King("king");
		System.out.println(king.move());
	}
}

