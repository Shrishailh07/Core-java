package com.xworkz.yoga.dto;

public class Yoga
{
private String name;
private String benefits;
private String timing;

public Yoga()
{
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBenefits() {
	return benefits;
}

public void setBenefits(String benefits) {
	this.benefits = benefits;
}

public String getTiming() {
	return timing;
}

public void setTiming(String timing) {
	this.timing = timing;
}
public String toString()
{
	return "Yoga - [Name of Yoga = "+name+" ,"+"Benifits of Yoga="+benefits+" ,"+"Timing="+timing+"]";
  			
}
}

