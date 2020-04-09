package com.jse.game;

import java.util.Random;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("주민등록번호를 입력해주세요(641221-1237789)>>");
		Scanner sc = new Scanner(System.in);
		String gennum = sc.next();
		char num = gennum.charAt(7);
		switch(num) {
		case '1': case'3':
			System.out.println("남자");
			break;

		case '2': case'4':
			System.out.println("여자");
			break;

		case '5': case'6':
			System.out.println("외국인");
			break;
			default:
				System.out.println("wrong");
		}
	}
//	public static void main(String[] args) {
//		switchDice();
//	}
		static void switchDice() {
		System.out.println("주사위게임을 시작합니다");
		System.out.println("기대하는 값 홀/짝을 입력합니다");
		Scanner sc = new Scanner(System.in);
		String expect = sc.next();
		System.out.println(String.format("사용자가 입력한 값 : %s", expect));
		Random ran = new Random();
		int dice = ran.nextInt(6);
		System.out.println(String.format("컴퓨터가 생성한 값 : %d", dice));
		String result = "";

		switch(dice) {
			case 1: result = "홀"; break;
			case 2: result = "짝"; break;
			case 3: result = "홀"; break;
			case 4: result = "짝"; break;
			case 5: result = "홀"; break;
			case 6: result = "짝"; break;
		
		}

		System.out.println("컴퓨터의 결과 : 짝");
		String result2 = "";
		if(expect.equals(result)) {
			result2 = "맞음";
		}else {
			result2 = "틀림";
		}		
		System.out.println(String.format("결과 : %d", result));
		}

	static void ifDice() {
		System.out.println("주사위게임을 시작합니다");
		System.out.println("기대하는 값 홀/짝을 입력합니다");
		Scanner sc = new Scanner(System.in);
		String expect = sc.next();
			System.out.println("사용자 홀짝 예상 : "+ expect);
		Random ran = new Random();
		int dice =  ran.nextInt(6)+1;
			System.out.println("컴퓨터가 생성한 값 : "+ dice);
		String result = "";
		if(dice == 1) {
			System.out.println("홀");
		}else if(dice == 2){
			System.out.println("짝");
		}else if(dice == 3){
			System.out.println("홀");
		}else if(dice == 4){
			System.out.println("짝");
		}else if(dice == 5){
			System.out.println("홀");
		}else{
			System.out.println("짝");
		}
		System.out.println("컴퓨터 홀짝 결과 : " + result);
		if(expect.equals(result)) { //object type operation method로 처리한다.
			System.out.println("매칭결과 : 맞음");
		}else {
			System.out.println("매칭결과 : 틀림");
	
		}
	}
	
	
	
}