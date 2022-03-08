package com;
import com.xworkz.courtcase.dto.CourtCase;
public class TestCourtCase
{
public static void main(String[] args) {
	
	CourtCase ca = new CourtCase();
	ca.setCaseno(3);
	ca.setLawyers((byte) 25);
	ca.setType("High Court");
	System.out.println(ca);
	
	CourtCase ab = new CourtCase();
	ab.setCaseno(23);
	ab.setLawyers((byte) 30);
	ab.setType("Supreme Court");
	System.out.println(ab);
	
	CourtCase bc = new CourtCase();
	bc.setCaseno(13);
	bc.setLawyers((byte) 45);
	bc.setType("Court");
	System.out.println(bc);
}
}
