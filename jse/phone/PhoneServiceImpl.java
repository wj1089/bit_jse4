package com.jse.phone;

public class PhoneServiceImpl implements PhoneService{
	
	private Phone[] phones;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private int count;
	private GalaxyNote[] galaxyNotes;
	
	public PhoneServiceImpl() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		count = 0; 
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
	}
	@Override
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}
	@Override
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	@Override
	public Iphone[] getIphones() {
		return iphones;
	}
	@Override
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	@Override
	public CelPhone[] getCelPhones() {
		return celPhones;
	}
	@Override
	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}
	@Override
	public Phone[] getPhones() {
		return phones;
	}
	@Override
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int getCount() {
		return count;
	}
	
	@Override
	public void add(Phone phone) {//add를 전부 하나로 통일할수있다!
		phones[count] = phone;
	}
	@Override
	public void add(CelPhone phone) {//celPhoneAdd
		celPhones[count] = phone;
		count++;
	}
	@Override
	public void add(Iphone Iphone) {//iphoneAdd
		iphones[count] = Iphone;
		count++;
	}
	@Override
	public void add(GalaxyNote galaxyNote) {//galaxyNoteAdd
		galaxyNotes[count] = galaxyNote;
		count++;
	}
		
	
}
