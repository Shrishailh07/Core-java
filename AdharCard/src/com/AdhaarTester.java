package com;
import com.xworkz.adhaar.dto.AdhaarCard;
public class AdhaarTester
{
public static void main(String[] mj)
{
	AdhaarCard ad = new AdhaarCard();
	
	ad.setAdhaarcardno(324554649809l);
	ad.setAge((byte) 23);
	ad.setGender("Male");
	System.out.println(ad);
	
	
AdhaarCard ab = new AdhaarCard();
	
	ab.setAdhaarcardno(43564649809l);
	ab.setAge((byte) 24);
	ab.setGender("Female");
	System.out.println(ab);
	System.out.println(ab.hashCode());
	System.out.println(ab.equals(ad));
	
AdhaarCard ac = new AdhaarCard();
	
	ac.setAdhaarcardno(75844649809l);
	ac.setAge((byte) 26);
	ac.setGender("Male");
	System.out.println(ac);
	
	
}
}
