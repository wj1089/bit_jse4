package com.jse.phone;

public class Phone {
	
	private String phoneNumber,name,company;

	
	public Phone(String phoneNumber, String name, String company) {//이거에 의미는 한번씩하면 번거로우니 한번에 모와서 
		this.phoneNumber=phoneNumber;
		this.name=name;
		this.company=company;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}


	@Override//(an notation)
	public String toString() {
		return "Phone : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company ;
	}
	
	
	
	class CelPhone extends Phone{
		
				private boolean portable;    //portable = 휴대성인지 아닌지?
				private String move;
		
				public CelPhone(String phoneNumber, String name, String company, boolean portable) {
					super(phoneNumber, name, company);
		//			this.portable = portable;//boolean으로 하면 결국this는 필요없다.
					setPortable(portable);
				}
				
				public boolean isPortable() {//boolean 타입만 is를 쓰인다!!
					return portable;
				}
				
				public void setPortable(boolean portable) {//boolean타입에 true & false를 알아야하기 때문에.
					this.move= (portable)? "휴대가능":"휴대불가능";
				}
				
				public String getMove() {
					return move;
				}
				
				public void setMove(String move) {
					this.move = move;
				}
		
				@Override
				public String toString() {
					return super.toString() + ",move = "+ move;
				}
			
		
	class	Iphone extends CelPhone{

	//			private boolean portable2;
				private String search;
				
				public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
					super(phoneNumber, name, company, portable);
					this.search = search;
				}
	
				public String getSearch() {
					return search;
				}
	
				public void setSearch(String search) {
					this.search = search;
				}
				@Override
				public String toString() {
					return super.toString() + ",search = "+search;
				}
			
	class	GalaxyNote extends Iphone{
				
				public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search, String bigSize) {
					super(phoneNumber, name, company, portable, search);
					this.bigSize=bigSize;
				}

				private String bigSize;

				
				
				public String getBigSize() {
					return bigSize;
				}

				public void setBigSize(String bigSize) {
					this.bigSize = bigSize;
				}
				@Override
				public String toString() {
					return super.toString() + ",bigSize = "+ bigSize;
				}	
			}
		}
	}
}
