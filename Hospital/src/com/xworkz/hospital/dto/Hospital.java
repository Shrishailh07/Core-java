package com.xworkz.hospital.dto;

public class Hospital
{
private String patientname;
private byte rooms;
private String place;

public Hospital()
{
}

public String getPatientname() {
	return patientname;
}

public void setPatientname(String patientname) {
	this.patientname = patientname;
}

public byte getRooms() {
	return rooms;
}

public void setRooms(byte rooms) {
	this.rooms = rooms;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}
public String toString()
{
	return "Hospital Details - [Patient Name = "+patientname+" ,"+"No of Rooms="+rooms+" ,"+"Place="+place+"]";
  			
}

}
