package com.jse.card;

public class CardServiceImpl implements CardService{
	private Card[] cards;
	private int count;
	
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0;
	}
	@Override
	public void add(Card card) {
		cards[count] = card;
		count++; 
		
	}
	
	
	@Override
	public Card[] list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public Card detail(Card card) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int count() {
		return count;
	}

}
	
	
	
	
	
	
	
//	@Override
//	public int getNumber() {
//		return 0;
//	}
//	@Override
//	public void setNumber(int number) {
//		this.number = number;

	
//	@Override
//	public void setCards(CardService[] cards) {
//		
//	}
//	@Override
//	public CardService[] getCards() {
//		return null;
//	}
//	@Override
//	public void setCount(int count) {
//		this.count = count;
//
//	}
//	@Override
//	public int getCount() {
//		return count;
//	}
//	@Override
//	public void add(Card card) {
//		cards[count] = card;
//				count++;
//	}
//	@Override
//	public String expect() {
//		String result ="";
//		for(int i=0;i<3;i++) {
//			result = (String.format("카드모양은 %s, 카드넘버는 %d", 
//					cards[i].getKind(), cards[i].getNumber()));
//		}
//		return result;
//	}
//	@Override
//	public String trump() {
//		for(int i=0;i<3;i++) {
//			System.out.println(String.format("카드모양은 %s, 카드넘버는 %d", 
//					cards[i].getKind(), cards[i].getNumber()));
//			
//	}
	

	

	
//
//	public String getKind() {
//		return kind;
//	}
//	public void setKind(String kind) {
//		this.kind = kind;
//	}
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	public CardServiceImpl() {
//		cards = new CardService[3];
//		count = 0;//여기 i는 Main에 for문 i를 초기화시켜주는작업.
//	}
//	public void setCards(CardService[]cards) {
//		this.cards=cards;
//	}
//	public CardService[] getCards() {
//		return cards;
//	}
//	
//	public void setCount(int count) {
//		this.count = count;
//	}
//	public int getCount() {
//		return count;
//	}
//	
//	public void add(CardService card) {//3	
//		cards[count] = card;//0을 적을 경우는 마지막수만 나오는데 i를 적어줄경우는 전체가 나온다.
//		count++;//추가를 적어준다.
//	}
	
//	@Override
//	public 
//	for(int i=0;i<3;i++) {
//		System.out.println(String.format("카드모양은 %s, 카드넘버는 %d", 
//				cards[i].getKind(), cards[i].getNumber()));
		
		
		

