package com.xworkz.socialmedia.dto;

public class socialmediaDTO
{
private String socialmediaid;
private String appName;
private String founder;
private String size;
private String version;

public socialmediaDTO()
{
	
}

public String getSocialmediaid() {
	return socialmediaid;
}

public void setSocialmediaid(String socialmediaid) {
	this.socialmediaid = socialmediaid;
}

public String getAppName() {
	return appName;
}

public void setAppName(String appName) {
	this.appName = appName;
}

public String getFounder() {
	return founder;
}

public void setFounder(String founder) {
	this.founder = founder;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}
@Override
public String toString()
{
	return "socialmediaDTO - [Id = "+socialmediaid+" ,"
+"Social Media Name="+appName+" ,"
+"Founder ="+founder+" ,"
   +"Size ="+size+" ,"
   +"Version ="+version+"]";
  			
		
}
}
