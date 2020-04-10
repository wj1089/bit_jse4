package com.jse.phone;

public interface PhoneService {

	public GalaxyNote[] getGalaxyNotes() ;
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) ;
	public Iphone[] getIphones() ;
	public void setIphones(Iphone[] iphones) ;
	public CelPhone[] getCelPhones() ;
	public void setCelPhones(CelPhone[] celPhones) ;
	public Phone[] getPhones() ;
	public void setPhones(Phone[] phones) ;
	public void setCount(int count) ;
	public int getCount() ;
	public void add(Phone phone) ;
	public void add(CelPhone phone) ;
	public void add(Iphone Iphone) ;
	public void add(GalaxyNote galaxyNote) ;

	
}
