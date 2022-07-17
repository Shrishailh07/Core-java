package com.xworkz.metro.dto;

public class Metro 
{
private String name;
private int price;
private String area;

public Metro()
{
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}
public String toString()
{
	return "Metro name - [name = "+name+" ,"+"Ticket price="+price+" ,"+"Travels in ="+area+"]";
  			

}
}
