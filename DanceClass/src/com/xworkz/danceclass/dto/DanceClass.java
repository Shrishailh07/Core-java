package com.xworkz.danceclass.dto;

public class DanceClass 
{
private String dancename;
private byte members;
private String type;

public DanceClass()
{
	
}

public String getDancename() {
	return dancename;
}

public void setDancename(String dancename) {
	this.dancename = dancename;
}

public byte getMembers() {
	return members;
}

public void setMembers(byte members) {
	this.members = members;
}

public String getType() {
	return type;
}

public void setType(String types) {
	this.type = types;
}
public String toString()
{
	return "Dance Classes - [Dance Name = "+dancename+" ,"+"No of people="+members+" ,"+"Type of Dance="+type+"]";
  			
}

}
