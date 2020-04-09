package com.jse.member;


public class GenderChecker {

	
	private String idNumber; 
	private char genderNumber;
	
	public void setIdNumber(String idNumber) {
		this.idNumber=idNumber;
	}
	public String getIdNumber() {
		return idNumber;
	}
	
	public void setGenderNumber(char genderNumber) {
		this.genderNumber=genderNumber;
	}
	public char getGenderNumber() {
		return genderNumber;
	}
	
	public String idcard() {
		String result ="";
		switch(genderNumber) {
			case '1': case '3': result = "Man"; break;
			case '2': case '4': result = "Woman";break;
			case '5': case '6':result = "Foreigner";break;
			default: result = "Wrong"; break;
		}
		return result;
	}
}
