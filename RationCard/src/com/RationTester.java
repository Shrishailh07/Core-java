package com;
import com.xworkz.rationcard.dto.Ration;
public class RationTester 
{
public static void main(String[] mj)
{
	Ration rt = new Ration();
	
	rt.setFamilymembers("4");
	rt.setCardno("63676");
	rt.setAge(45);
	System.out.println(rt);
	
Ration mac = new Ration();
	
	mac.setFamilymembers("7");
	mac.setCardno("8478974");
	mac.setAge(64);
	System.out.println(mac);
	
Ration xyz = new Ration();
	
	xyz.setFamilymembers("3");
	xyz.setCardno("737813");
	xyz.setAge(55);
	System.out.println(xyz);
	
	
}
}
