package com;
import com.xworkz.vote.dto.VoterID;
public class TestVoter
{
public static void main(String[] args)
{
	VoterID vote = new VoterID();
	
	vote.setVoterid("23254");
	vote.setGender("Male");
	vote.setAge(23);
	System.out.println(vote);
	
VoterID vot = new VoterID();
	
	vot.setVoterid("64732");
	vot.setGender("Female");
	vot.setAge(21);
	System.out.println(vot);
	
VoterID vo = new VoterID();
	
	vo.setVoterid("43672");
	vo.setGender("Male");
	vo.setAge(28);
	System.out.println(vo);
	
	
}
	
}

