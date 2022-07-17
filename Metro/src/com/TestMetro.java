package com;
import com.xworkz.metro.dto.Metro;
public class TestMetro 
{
public static void main(String[] args) {
	
	Metro mt = new Metro();
	mt.setArea("In the cities");
	mt.setName("Namma Metro");
    mt.setPrice(200);
    System.out.println(mt);
    
    Metro mj = new Metro();
	mj.setArea("In the cities");
	mj.setName("Nimma Metro");
    mj.setPrice(150);
    System.out.println(mj);
    
    Metro mk = new Metro();
	mk.setArea("In the cities");
	mk.setName("Bullet");
    mk.setPrice(180);
    System.out.println(mk);
    

}   
}
