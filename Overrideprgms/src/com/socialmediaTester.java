package com;
import com.xworkz.socialmedia.dto.socialmediaDTO;
public class socialmediaTester
{
	public static void main(String[] args) {
		
	
	socialmediaDTO rmd = new socialmediaDTO();
	
	rmd.setSocialmediaid("1");
	rmd.setAppName("Instagram");
	rmd.setSize("33 mb");
	rmd.setFounder("Mark Zukerberg");
	rmd.setVersion("5.26");
	
	System.out.println(rmd);
	
	
}
}