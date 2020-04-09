package com.jse.member;
import java.util.Random;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class MemberController { 
	public static void main(String[] args) {

		Member member = new Member();
		Kaup kaup = new Kaup();
		GenderChecker gendernumber = null;

		while (true) {
			System.out.println( " 0. 종료"
					+ " 1. Gender game" 
					+ " 2. 카우푸지수");
			
			switch (JOptionPane.showInputDialog(Constants.)) {
			case "0":return; 
			case "1":
				gendernumber = new GenderChecker();
				System.out.print("주민번호를 입력해주세요.(011231-1111222)");
				String number = scanner.next();
				gendernumber.setIdNumber(number); 
				char gennum = number.charAt(7);
				gendernumber.setGenderNumber(gennum);
				String gennum1 = gendernumber.idcard();
				System.out.println("귀하의 성별및 신분은 : "+ gennum1 +"입니다.");
				break;
				
				
			case "2":// multi란 만약 랜덤이란 스케나 카오푸 같은걸 2번이상 쓸경우는 케이스 밖에다 적어준다. 
				System.out.println("신체정보검사를 시작합니다.");
				System.out.println("우선 체중을 입력해주세요.");
//				double weight = scanner.nextDouble();
//				System.out.println("귀하의 체중은 "+weight+"입니다");
				kaup.setWeightValue(scanner.nextDouble());				
				
				System.out.println("신장을 입력해주세요.");
//				double height = scanner.nextDouble();
//				System.out.println("귀하의 신장은 "+height+"입니다");
				kaup.setHeightValue(scanner.nextDouble());				
//				String result = kaup.Calculate();
				System.out.println("사용자님의 BMI타입은 "+(kaup.Calculate())+" 입니다");
				
				break;
				
			}
		}
	}
}