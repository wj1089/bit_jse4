package com.jse.game;
import java.util.Random;
import java.util.Scanner;

public class Dice2 {
	public static void main(String[] args) {
		ifdice();
	}
	static void switchDice() {
		System.out.println("주사위게임을 시작합니다");
		System.out.println("기대하는 값 홀/짝을 입력합니다");
		Scanner scanner = new Scanner(System.in);
		String expect =  scanner.next();
		System.out.println("사용자 홀짝 예상 : "+ expect);
		Random ran = new Random();
		int dice = ran.nextInt(6)+1;
		System.out.println("컴퓨터가 생성한 값 : "+dice);
		String result = "";
		switch(dice) {
		case 1: case 3: case 5: 
			System.out.println("홀");
			break;
		case 2:	case 4:case 6:
			System.out.println("짝");
			break;
		}
		
		
		
		
		
	}
	static void ifdice() {
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
