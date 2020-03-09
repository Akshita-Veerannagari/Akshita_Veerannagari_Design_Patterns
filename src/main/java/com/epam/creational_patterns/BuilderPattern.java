package com.epam.creational_patterns;

abstract class Cake
{
	String name;
	int amt_of_sugar, amt_of_milk;
	String flavour;
	Cake(String name,int amt_of_sugar, int amt_of_milk, String flavour)
	{
		this.name=name;
		this.amt_of_milk=amt_of_milk;
		this.amt_of_sugar=amt_of_sugar;
		this.flavour=flavour;
	}
}

class VanillaCake extends Cake
{
	int no_of_eggs;
	boolean strawberries;
	VanillaCake(String name,int amt_of_sugar, int amt_of_milk, int no_of_eggs, boolean strawberries)
	{
		super(name,amt_of_sugar,amt_of_milk,"Vanilla");
		this.no_of_eggs=no_of_eggs;
		this.strawberries= strawberries;
	}
	
	@Override
	public String toString() {
		String res=this.name+" is made by: ";
		res+="\n"+this.amt_of_sugar+" kg sugar, "+this.amt_of_milk+" litre of milk, "+this.no_of_eggs+" eggs ";
		if(this.strawberries==false)
			res+="and no strawberries";
		else
			res+=" and strawberries";
		return res;
	}
}

class ChocolateCake extends Cake
{
	boolean eggs; 
	String toppings;
	ChocolateCake(String name,int amt_of_sugar, int amt_of_milk,boolean eggs, String toppings)
	{
		super(name,amt_of_sugar,amt_of_milk,"Chocolate");
		this.eggs=eggs;
		this.toppings=toppings;
	}
	
	@Override
	public String toString() {
		String res= this.name+" is made by: ";
		res+="\n"+this.amt_of_sugar+" kg sugar, "+this.amt_of_milk+" litre of milk, "+this.toppings+" as toppings ";
		if(this.eggs==false)
			res+="and no eggs";
		else
			res+=" and eggs";
		return res;
	}
}
public class BuilderPattern
{
	public static void main(String args[])
	{
		VanillaCake vanilla_cake = new VanillaCake("vanilla_cake ",2, 1, 2, true);
		VanillaCake vanillaCake2 = new VanillaCake("vanillaCake2",5, 2, 1,false);
		
		ChocolateCake choc1 = new ChocolateCake("choc1",1, 2, false, "choco chip");
		ChocolateCake choc2 = new ChocolateCake("choc2",3, 1, true, "choco nuts");
		
		System.out.println(vanilla_cake);
		System.out.println(vanillaCake2);
		System.out.println(choc1);
		System.out.println(choc2);
	}
}
