package com.xworkz.PatientDTO;

import com.xworkz.constant.Gender;

public class patientDTO
{
private String patientName;
private String address;
private long phno;
private String disease;
private int age;
private Gender gender;
private int patientID;

public int getPatientID() {
	return patientID;
}
public void setPatientID(int patientID) {
	this.patientID = patientID;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender string) {
	this.gender = string;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getDisease() {
	return disease;
}
public void setDisease(String disease) {
	this.disease = disease;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
//@Override
//public String toString() {
//	return "patientDTO [patientName=" + patientName + ", address=" + address + ", phno=" + phno + ", disease=" + disease
//			+ ", age=" + age + ", patientID=" + patientID + "]";
//}


}
