package com.epam.structural_patterns;

import java.util.*;

/*
 
 	COMPOSITE PATTERN:
 	
 		  HOD
 		/  |  \
 	fac1 fac2 fac3
  
 */
class Faculty
{
	String name,dept,designation;
	ArrayList<Faculty>subordinate;
	
	Faculty(String name, String dept, String designation)
	{
		this.name=name;
		this.dept=dept;
		this.designation=designation;
		subordinate= new ArrayList<>();
	}
	
	void add(Faculty e)
	{
		subordinate.add(e);
	}
	
	public String toString()
	{
		return "Employee Name: "+this.name+"\nDesignation: "+this.designation+"\nDepartment: "+this.dept+"\n";
	}
}
public class CompositePattern 
{
	public static void main(String args[])
	{
		Faculty HOD = new Faculty("Seetha","CSE","HOD");
		Faculty fac1 = new Faculty("Rashmitha","CSE","Asst.Prof DAA");
		Faculty fac2 = new Faculty("Apurva","CSE","Asst.Prof FM");
		Faculty fac3 = new Faculty("Spandana","CSE","Asst.Prof WebTechnologies");
		
		HOD.add(fac1);
		HOD.add(fac2);
		HOD.add(fac3);
		
		System.out.println(HOD);
		System.out.println("Subordinates of HOD are:\n");
		for(int i=0;i<HOD.subordinate.size();i++)
			System.out.println(HOD.subordinate.get(i));
	}
}
