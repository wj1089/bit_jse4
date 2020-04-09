package com.jse.util;

public class Calculate {
	//다이나믹(non_static)에서는 스케너와 sout(클래스)도 절때로 <없어야한다>
	
	private int num1;
	private int num2;
	private int num3;
//	private int result;
	
	 public void setNum1(int num1) {
		 this.num1 = num1;
	 }public int getNum1() {
		 return num1;
		 
	 }public void setNum2(int num2) {
		 this.num2 = num2;
	 }public int getNum2() {
		 return num2;
		 
	 }public void setNum3(int num3) {
		 this.num3 = num3;
	 }public int getNum3() {
		 return num3;
	 }
	 
	 
	 public int calculate () {
	
		int sum = this.num1+this.num2+this.num3;
		return sum;
		
		
	 }
}
