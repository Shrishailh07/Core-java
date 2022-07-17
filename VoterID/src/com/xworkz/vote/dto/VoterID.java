package com.xworkz.vote.dto;

public class VoterID
{
	private int age;
	private String gender;
	private String voterid;

	public VoterID()
	{
	}

public String getVoterid() {
	return voterid;
}

public void setVoterid(String voterid) {
	this.voterid = voterid;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String toString()
{
	return "VoterID - [no = "+voterid+" ,"+"Gender="+gender+" ,"+"Age ="+age+"]";
  			

}
}


