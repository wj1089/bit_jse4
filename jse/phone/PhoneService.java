package com.jse.phone;

import com.jse.grade.Grade;

public interface PhoneService {

	public void add(Phone phone) ;
	public void add(CelPhone phone) ;
	public void add(Iphone Iphone) ;
	public void add(GalaxyNote galaxyNote) ;
	public Phone[] list() ;
	public Phone detail(Phone phone);
	public int count() ;
	
	public GalaxyNote[] galaxyList() ;
	public Iphone[] iList() ;
	public CelPhone[] celList() ;
	
	public void update(Phone phone);
	public void delete(Phone phone);
	
}
