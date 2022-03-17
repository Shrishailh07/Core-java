package com.xworkz.StringMethods;

public class StringMethods 
{
 public static void main(String[] args) 
 {
	String name = "King Virat";
	String name1= " Kohli";
	String name2= "RCB";


	System.out.println(name.concat(name1));
	System.out.println(name2.equals(name1));
	System.out.println(name.charAt(5));
	System.out.println(name1.replace('i','e'));
	System.out.println(name2.isEmpty());
	System.out.println(name.toLowerCase());
	System.out.println(name1.toUpperCase());
	System.out.println(name.indexOf("V"));
	System.out.println(name.length());
	
	char ch[] = name.toCharArray();
	for(int i=0; i<=ch.length-1; i++)
	{
		System.out.println(ch[i]);
	}
	System.out.println();
	System.out.println(name.valueOf(ch[8]));
}
}
