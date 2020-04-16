package com.jse.phone;

import com.jse.grade.Grade;

public interface PhoneService {
	public void add(Phone phone) ;
	public void add(CelPhone calPhone) ;
	public void add(Iphone iPhone) ;
	public void add(GalaxyNote galaxyNote) ;
	public Phone[] phoneList();
	public CelPhone[] celList();
	public Iphone[] iList() ;
	public GalaxyNote[] galaxyList() ;
	public GalaxyNote detail(GalaxyNote phone);
	public Iphone detail(Iphone phone);
	public int count() ;
	public void update(Phone phone);
	public void delete(Phone phone);
	
}
