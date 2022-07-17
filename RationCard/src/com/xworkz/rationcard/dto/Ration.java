package com.xworkz.rationcard.dto;

public class Ration {


	private int age;
	private String familymembers;
	private String cardno;

	public Ration()
	{
	}

public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFamilymembers() {
		return familymembers;
	}

	public void setFamilymembers(String familymember) {
		this.familymembers = familymember;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

public String toString()
{
	return "Ration Card no - [no = "+cardno+" ,"+"Family members="+familymembers+" ,"+"Age ="+age+"]";
  			

}
}


