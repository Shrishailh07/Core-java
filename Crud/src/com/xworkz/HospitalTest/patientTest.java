package com.xworkz.HospitalTest;
import com.xworkz.constant.Gender;
import java.util.Scanner;
import com.xworkz.HospitalDTO.Hospital;
import com.xworkz.PatientDTO.patientDTO;
public class patientTest 
{
public static void main(String[] args) 
{
	final Gender male = null;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
    int size = sc.nextInt();
	Hospital hp = new Hospital(size);
	
	for (int i = 0; i < size; i++) 
	{
			
	patientDTO dto = new patientDTO();
    System.out.println("Enter the address");
	dto.setAddress(sc.next());
	
	System.out.println("Enter the gender");
	String gender = sc.next();
	dto.setGender(Gender.valueOf(gender));
	
	System.out.println("Enter the age");
	dto.setAge(sc.nextInt());
	System.out.println("Enter the disease");
	dto.setDisease(sc.next());
	System.out.println("Enter the id");
	dto.setPatientID(sc.nextInt());
	System.out.println("Enter the phone number");
	dto.setPhno(sc.nextLong());
	System.out.println("Enter the patient name");
	dto.setPatientName(sc.next());
	
	System.out.println(hp.createPatientdetails(dto));
	}
	hp.getPatientdetails();
	
	System.out.println("search id by name");
	hp.getPatientIdByName(sc.next());
	
	System.out.println("search id by gender");
	String gender1 = sc.next();
	hp.getpatientIdbyGender(Gender.valueOf(gender1));
	
	
	System.out.println("search id by contact no");
	hp.getpatientIdbycontactno(sc.nextLong());
	
	System.out.println("search id by age");
	hp.getpatientIdbyAge(sc.nextInt());
	
    System.out.println("search name by id");
    hp.getpatientNamebyId(sc.nextInt());
	
    System.out.println("search for address by name");
    hp.getpatientAddressbyName(sc.next());
    
	System.out.println("search for gender by name");
	hp.getpatientGenderbyName(sc.next());
	
	
}


}


