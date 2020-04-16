package com.jse.grade;

import lombok.Data;

/*
 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
 * 단) 평균은 소수점이하는 절삭합니다 평균점수가
 * 
 * 90점 이상 A
 * 80점 이상이면 B 
 * 70점 이상이면 C 
 * 60점 이상이면 D 
 * 50점 이상이면 E 
 * 50점 미만이면 F 학점입니다라고 출력되게 해주세요* 
 */
@Data
public class Grade {
	
	private String name;
	private int korean,english, math, java;

	
//	public Grade(String name,int korean,int english, int math,int science) {
//			this.name = name;
//			this.korean = korean;
//			this.english = english;
//			this.math = math;
//			this.science = science;
//	}
	
//	public int total() {
//		return korean+english+math;
//	}
//	public int average() {
//		return total()/4;
//	}
//	
//	
//	public void setKorean(int korean) {
//		this.korean = korean;
//	}
//	public int getKorean() {
//		return korean;
//	}
//	public void setEnglish(int english) {
//		this.english = english;
//	}
//	public int getEnglish() {
//		return english;
//	}
//	public void setMath(int math) {
//		this.math = math;
//	}
//	public int getMath() {
//		return math;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setScience(int science) {
//		this.science = science;
//	}
//	public int getScience() {
//		return science;
//	}
//	
//	
//	
//	public String level() {
//		String result= "";
//		if(average() >= 90 ) {
//			result = "A";
//		}else if(average() >= 80) {
//			result = "B";
//		}else if(average() >= 70) {
//			result = "C";
//		}else if(average() >= 60) {
//			result = "D";
//		}else if(average() >= 50) {
//			result = "E";
//		}else if(average() <= 50) {
//			result = "F";
//		}
//		return result;
//	}
//
//		public String record() {
//			String result = "";
//		switch (average()/10) {
//		case 10:  result = "A"; break;
//		case 9:   result = "A"; break;
//		case 8:   result = "B"; break;
//		case 7:   result = "C"; break;
//		case 6:   result = "D"; break;
//		case 5:   result = "C"; break;
//		default:  result = "F"; break;
//	
//		}
//		return result;
	}

	
	
	
	
	
	
	
	
