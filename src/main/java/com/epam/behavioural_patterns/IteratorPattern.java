package com.epam.behavioural_patterns;

import java.util.*;
class ShoppingCart
{
	ArrayList<String> items;
	ShoppingCart()
	{
		items= new ArrayList<>();
	}
	void display()
	{
		System.out.println("Items in your shopping cart are: ");
		for(int i=0;i<items.size();i++)
		{
			System.out.println((i+1)+". "+items.get(i));
		}
	}
}
public class IteratorPattern 
{
	public static void main(String args[])
	{
		ShoppingCart cart = new ShoppingCart();
		cart.items.add("Soap");
		cart.items.add("Shampoo");
		cart.items.add("Bucket");
		cart.items.add("Chocolates");
		cart.items.add("Pencil box");;
		
		cart.display();
	}
}

