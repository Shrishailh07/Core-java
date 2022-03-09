package com.xworkz.adhaar.dto;

public class AdhaarCard 
{
private long Adhaarcardno;
private String gender;
private byte age;

public AdhaarCard()
{
}
public long getAdhaarcardno() {
	return Adhaarcardno;
}

public void setAdhaarcardno(long adhaarcardno) {
	Adhaarcardno = adhaarcardno;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public byte getAge() {
	return age;
}

public void setAge(byte age) {
	this.age = age;
}



@Override
public String toString()
{
	return "AdhaarCard - [no = "+Adhaarcardno+" ,"+"Gender="+gender+" ,"+"Age ="+age+"]";
  			

}
@Override
	public int hashCode() {
	
		return this.age;
	}
@Override
public boolean equals(Object obj) {
	AdhaarCard ad = (AdhaarCard)obj;
	if(this.Adhaarcardno==ad.Adhaarcardno)
		
		return true;
	return false;
	}

}
