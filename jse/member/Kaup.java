package com.jse.member;

import java.util.Scanner;
// 카우푸란? BMI지수를 구하기
//	개발자님 키와 몸무게를 이용하여 
//	카우푸지수를 구하고 
//	그 결과 정상, 저체중, 비만 등으로 몸의 상태만
//	알려주는 프로그램을 만들어주세요.
//10~20
//10< a && a< 20
	public class Kaup {
			
	
		private double weightValue;
		private double heightValue; 
		
		public void setWeightValue (double weight) {
			this.weightValue = weight;
		}
		public double getWightValue () {
			return weightValue;
		}
		public void setHeightValue (double height) {
			this.heightValue = height/100;
		}
		public double getHeightValue () {
			return heightValue;
		}
		
	public String BMITest() {
		double koup = 0;
		   koup = weightValue/heightValue;
		  String result= "비만";
		  if(koup<20) {
			  result = "low weight";
		  }else if(koup <=30) {
			  result = "normal";
		  }else if(koup <= 40){
			  result = "over weight";
		  }
		   
		return result;
		
	}
	public String Calculate() {
		String result = "";
		double kaupIndex = weightValue/(heightValue*heightValue);
		System.out.println("카우푸지수는 : "+ kaupIndex);
		if(kaupIndex <18.5) {
		}else if (kaupIndex <18.5){
			return result = "저체중";
		}else if (kaupIndex <23.0){
			return result = "정상체중";
		}else if (kaupIndex <25.0){
			return result = "과체중";
		}else if (kaupIndex <30.0){
			return result = "위험체중";
		}else if (kaupIndex <40.0){
			return result = "비만 1단계";
		}else {
			return result = "비만 2단계";
		}
		
			return result;
			
	}
	
	
	
	
	
}
