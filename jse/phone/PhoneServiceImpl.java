package com.jse.phone;

public class PhoneServiceImpl implements PhoneService{
	
	private int count;
	private Phone[] phones;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	
	public PhoneServiceImpl() {
		count = 0; 
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
	}
	@Override
	public int count() {
		return count;
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

	@Override
	public GalaxyNote[] galaxyList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iphone[] iList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Phone phone) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Phone phone) {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(Phone phone) {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(CelPhone calPhone) {
		// TODO Auto-generated method stub
	}

	@Override
	public Phone[] phoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CelPhone[] celList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote detail(GalaxyNote phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iphone detail(Iphone phone) {
		// TODO Auto-generated method stub
		return null;
	}
}
