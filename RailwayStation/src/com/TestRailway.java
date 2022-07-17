package com;
import com.xworkz.railwaystation.dto.Railway;
public class TestRailway 
{
public static void main(String[] args)
{
	Railway R = new Railway();
	
	R.setPlatformno(10);
	R.setSpeed(130.3f);
	R.setType("Passenger");
	System.out.println(R);
	
Railway ab = new Railway();
	
	ab.setPlatformno(5);
	ab.setSpeed(110.9f);
	ab.setType("Xpress");
	System.out.println(ab);
	
Railway s = new Railway();
	
	s.setPlatformno(1);
	s.setSpeed(120.1f);
	s.setType("Passenger");
	System.out.println(s);
}
}
