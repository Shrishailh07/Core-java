package com.xworkz.HospitalDTO;
import com.xworkz.PatientDTO.patientDTO;
import com.xworkz.constant.Gender;
public class Hospital
{
private static final Gender Gender = null;
public patientDTO patientDTO[];
int index ;

public Hospital(int size)
{
	patientDTO = new patientDTO[size];
}
public boolean createPatientdetails(patientDTO dto)
{
	System.out.println("invoked PatientDetails()");
	boolean patientAdded = false;
	
	if(dto!=null)
	{
		patientDTO[index++] = dto;
		patientAdded = true;
	}
	else
	{
		System.out.println("No Patient found");
	}
   System.out.println("end of createPatientdetails");
   return patientAdded;
}

public void getPatientdetails()
{
	System.out.println("inside getPatientdetails ()...fetching the data");
	for (int i = 0; i<patientDTO.length;i++)
	{
		System.out.println(patientDTO[i]);
	}
	System.out.println("end of getPatientdetails()");
	}
public void getPatientByid(int patientId)
{
System.out.println("Inside getPatientByid ()");
System.out.println("arg 1 Patient Id : "+patientId);
for (int i = 0; i < patientDTO.length; i++) 
{
	if(patientDTO[i].getPatientID()==patientId) {
		System.out.println(patientDTO[i]);
	}
}
}
public String getPatientIdByName(String patientName)
{
	System.out.println("inside getPatientIdByName");
	for (int i = 0; i < patientDTO.length; i++) 
	{
		if(patientDTO[i].getPatientName().equals(patientName))
		{
			System.out.println(patientDTO[i].getPatientName()+" patient id "+ patientDTO[i].getPatientID()+" is available");
		}
		else {
			System.out.println(patientDTO[i].getPatientName()+" is not available in "+" patient id "+patientDTO[i].getPatientID());
		 }
	}
	return patientName;
}
public Gender getpatientIdbyGender(Gender gender1)
{
	System.out.println("Inside getpatientIdbyGender");
	for (int i = 0; i < patientDTO.length; i++) 
	{
		if(patientDTO[i].getGender().equals(gender1))
		{
			System.out.println(patientDTO[i].getGender()+" patient id "+patientDTO[i].getPatientID());
		}
		else
		{
			System.out.println(patientDTO[i].getGender()+" patient id "+patientDTO[i].getPatientID()+" is not available");
		}
	}
return gender1;
}
public long getpatientIdbycontactno(long phno)
{
	System.out.println("inside getpatientIdbycontactno");
	for (int i = 0; i < patientDTO.length; i++) 
	{
	if(patientDTO[i].getPhno()==phno)
	{
		System.out.println(patientDTO[i].getPhno()+" patient id "+patientDTO[i].getPatientID());
	}
	else
	{
		System.out.println(patientDTO[i].getPhno()+" patient id "+patientDTO[i].getPatientID()+" is not available");

	}
	}
	return phno;
}

public int getpatientIdbyAge(int age)
{
	System.out.println("inside getpatientIdbyAge");
for(int i=0; i<patientDTO.length; i++)
{
	if(patientDTO[i].getAge()==age)
	{
		System.out.println(patientDTO[i].getAge()+" patient id "+patientDTO[i].getPatientID());
	}
	else
	{
		System.out.println(patientDTO[i].getAge()+" patient id "+patientDTO[i].getPatientID()+" is not available");

	}
}
return age;
}
public int getpatientNamebyId(int id)
{
	System.out.println("inside getpatientNamebyId");
	for(int i=0; i<patientDTO.length;i++)
	{
		if(patientDTO[i].getPatientID()==id)
		{
			System.out.println(patientDTO[i].getPatientID()+" patient name "+patientDTO[i].getPatientName());
		}
		else
		{
			System.out.println(patientDTO[i].getPatientID()+" patient name "+patientDTO[i].getPatientName()+" is not available");

		}
	}
return id;
}
public  String getpatientAddressbyName(String name)
{
	System.out.println("inside getpatientAddressbyName");
for (int i = 0; i < patientDTO.length; i++) 
{
if(patientDTO[i].getPatientName().equals(name))
{
	System.out.println(patientDTO[i].getPatientName()+" patient address "+patientDTO[i].getAddress());
}
else {
	System.out.println(patientDTO[i].getPatientName()+" patient address "+patientDTO[i].getAddress()+" is not available");
}
}
return name;
}
public String getpatientGenderbyName(String name)
{
	System.out.println("inside getpatientGenderbyName");
	for (int i = 0; i < patientDTO.length; i++) 
	{
	if(patientDTO[i].getPatientName().equals(name))
	{
		System.out.println(patientDTO[i].getPatientName()+" patient gender "+patientDTO[i].getGender());
	}
	else
	{
		System.out.println(patientDTO[i].getPatientName()+" patient gender "+patientDTO[i].getGender()+" is not available");

	}
	}
	return name;
}












}

/*PatientDTO getpatientByname
 *PatientDTO getpatientbygender
 * PatientDTO getpatientbycontact
 * PatientDTO getpatientbyage
 * PatientDTO getpatientnyaddress
 */

/* nameofpatient getpatientnamebyid
 * patientid getpatientnameidbyname
 * patientaddress getpatientaddressbyname
 */

