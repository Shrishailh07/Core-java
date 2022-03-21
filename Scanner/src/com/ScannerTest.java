package com;
import java.util.Scanner;
import com.xworkz.scanner.Scannerr;
public class ScannerTest
{

public static void main(String[] mj)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the name");
	String name = sc.next();
	
	System.out.println("Enter no of umpires");
	int umpires = sc.nextInt();
		
	System.out.println("Enter the no of Players in cricket");
	short players = sc.nextShort();
	
	System.out.println("Enter the no of teams in cricket");
	byte teams = sc.nextByte();
	
	System.out.println("Enter the length of ground");
	int length = sc.nextInt();
	
	System.out.println("Enter the no of Overs");
	int over = sc.nextInt();
	
	System.out.println("Enter the no of runs");
	long runs = sc.nextLong();
	
	System.out.println("Enter the strike rate");
	float strike = sc.nextFloat();
	
	System.out.println("Enter the speed of bowl");
	double speed = sc.nextDouble();
	
	System.out.println("Will RCB win the cup");
	boolean cup = sc.nextBoolean();
	
	System.out.println("Grade ");
	char grade= sc.next().charAt(0);
	
  sc.close();
 
   }
  }
