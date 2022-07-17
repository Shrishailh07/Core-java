package com;
import com.xworkz.hospital.dto.Hospital;
public class TestHospital 
{
public static void main(String[] args) 
{
	Hospital hop = new Hospital();
	hop.setPatientname("Ganesh");
	hop.setPlace("Banglore");
	hop.setRooms((byte) 50);
	System.out.println(hop);
	
	Hospital we = new Hospital();
	we.setPatientname("Pradeep");
	we.setPlace("Mysore");
	we.setRooms((byte) 70);
	System.out.println(we);
	
	Hospital op = new Hospital();
	op.setPatientname("Chetan");
	op.setPlace("Bagalkot");
	op.setRooms((byte) 60);
	System.out.println(op);
	
}
}
