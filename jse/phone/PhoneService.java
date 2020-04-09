package com.jse.phone;

public interface PhoneService {
	
	public void setPhoneNumber(String phoneNumber); 
	public void setName(String name); 
	public void setCompany(String company); 
	public void add(Phone phone);
	public void add(CelPhone phone);
	public void add(Iphone Iphone) ;
	public void add(GalaxyNote galaxyNote) ;

}
