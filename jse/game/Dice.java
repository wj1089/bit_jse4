package com.jse.game;
import java.util.Scanner;
//시나리오 
import java.util.Random;//외부의 값을 끌어다오는 것이기때문에 클래스가 필요가없다.
public class Dice {
	public static void main(String[] args) {
		
		
		System.out.println("주사위 홀짝 맞춰보기 게임");
		//System.out<클래스 변수>   .   println("주사위 홀짝 맞춰보기 게임")<클래스 매소드>;
		System.out.println("기대하는 값 홀/짝을 입력해주세요");
		
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println("예상 값은 : " + expect);

		Random random = new Random();
		int dice = random.nextInt(6);
		System.out.println("결과 값은 : " + dice);
		
		String result = "";// ""디폴트값
		if(dice == 1) {
			result = "홀";
		}else if(dice == 2) {
			result = "짝";
		}else if(dice == 3) {
			result = "홀";
		}else if(dice == 4) {
			result = "짝";
		}else if(dice == 5) {
			result = "홀";
		}else {
			result = "짝";
		}
		System.out.println("홀짝 결과 : " + result);
		System.out.println("맞음 ");
		System.out.println("틀림 ");
		
		
		
		
		
		
//		System.out.println("true");
//		System.out.println("false");
		
		
//		String result = scanner.next();
//		int dice = random.next();
//		System.out.println("예상 값은 : " + dice);
		System.out.println();
		main(null);
		
		
		//세번째 예시
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값(홀/짝)을 입력해주세요");
//		
//		Scanner sc = new Scanner(System.in);
//		String expect = sc.next();
//		System.out.println("기대하는 값은 : " + expect);
//		
//		Random ran = new Random();
//		int dice = ran.nextInt(6)+1;
//		System.out.println("결과 값은 : " + dice);
//	
//		String result = "";
//		if(dice == 1,3,5) {
//			result = "홀수";
//		}else {
//			result = "짝";
//		}
		
		
		
		
		
		
	}

}
