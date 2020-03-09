package com.epam.structural_patterns;

interface Cake
{
   public String bakeCake();
}

class VanillaCake implements Cake
{
    @Override
    public String bakeCake(){
       return "Vanilla Cake: ";
    }
}

abstract class CakeDecorator implements Cake
{
    Cake cake;
    public CakeDecorator( Cake cake )
    {
            this.cake=cake;
    }
    public String bakeCake()
    {
        return cake.bakeCake();
    }
}

class StrawberryDecorator extends CakeDecorator
{

    public StrawberryDecorator( Cake cake )
    {
            super(cake);
    }
    public String bakeCake()
    {
          return cake.bakeCake() + " Strawberry toppings added";
    }

}

class CherryDecorator extends CakeDecorator{

    public CherryDecorator( Cake cake )
    {
            super(cake);
    }

    public String bakeCake(){
          return cake.bakeCake() + " Cherry toppings added";
    }

}

public class DecoratorPattern
{
	public static void main(String args[])
	{
		VanillaCake vanilla = new VanillaCake();
		String vc = vanilla.bakeCake();
		
		String cherry = new CherryDecorator(vanilla).bakeCake();
		System.out.println(cherry+" using CherryDecorator");
		String strawberry = new StrawberryDecorator(vanilla).bakeCake();
		System.out.println(strawberry+" using StrawberryDecorator");
	}
}












