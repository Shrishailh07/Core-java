package com.xworkz.courtcase.dto;

public class CourtCase 
{
private int caseno;
private String type;
private byte lawyers;

public CourtCase()
{
	
}

public int getCaseno() {
	return caseno;
}

public void setCaseno(int caseno) {
	this.caseno = caseno;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public byte getLawyers() {
	return lawyers;
}

public void setLawyers(byte lawyer) {
	this.lawyers = lawyer;
}
public String toString()
{
	return "Court Case - [Case no = "+caseno+" ,"+"Type="+type+" ,"+"Number of Lawyers="+lawyers+"]";
  			
}
}