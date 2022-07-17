package com;
import com.xworkz.yoga.dto.Yoga;
public class TestYoga
{
public static void main(String[] args) {
	
	Yoga y = new Yoga();
	y.setName("Hatha Yoga");
	y.setBenefits("improves posture");
	y.setTiming("5:00am");
	System.out.println(y);
	
	Yoga x = new Yoga();
	x.setName("Raja Yoga");
	x.setBenefits("Boosts Metabolism");
	x.setTiming("6:00am");
	System.out.println(x);
	
	Yoga z = new Yoga();
	z.setName("Karma Yoga");
	z.setBenefits("Increases Bloodflow");
	z.setTiming("7:00am");
	System.out.println(z);
}
}
