package com;
import com.xworkz.danceclass.dto.DanceClass;
public class TestDance 
{
public static void main(String[] args)
{
 DanceClass dc = new DanceClass();
 dc.setDancename("Belly dance");
 dc.setMembers((byte) 1);
 dc.setType("solo");
 System.out.println(dc);
 
 DanceClass ap = new DanceClass();
 ap.setDancename("classic dance");
 ap.setMembers((byte) 2);
 ap.setType("duo");
 System.out.println(ap);
 
 DanceClass lk = new DanceClass();
 lk.setDancename("pop dance");
 lk.setMembers((byte) 4);
 lk.setType("squad");
 System.out.println(lk);
 
}
}
