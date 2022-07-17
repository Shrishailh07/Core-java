package com.xworkz.railwaystation.dto;

public class Railway 
{
private String type;
private float speed;
private int platformno;

public Railway()
{
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public float getSpeed() {
	return speed;
}

public void setSpeed(float speed) {
	this.speed = speed;
}

public int getPlatformno() {
	return platformno;
}

public void setPlatformno(int platformno) {
	this.platformno = platformno;
}
public String toString()
{
	return "Railway Details - [Type = "+type+" ,"+"Speed="+speed+" ,"+"Platform number ="+platformno+"]";
  			
}
}
