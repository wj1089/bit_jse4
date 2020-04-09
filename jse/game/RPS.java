package com.jse.game;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		game();
		
	}
	static void game() {
		
		System.out.println("가위 바위 보게임을 시작합니다.");
		System.out.println("1.가위, 2.바위, 3.보 ");
		Scanner scanner = new Scanner(System.in);
		int use = scanner.nextInt();
		System.out.println("사용자의 값은 "+use+"입니다.");
		Random ran = new Random();
		int com = ran.nextInt(3)+1;
		System.out.println("컴퓨터의 값은 "+com+"입니다.");
		String result = "";
		
		if(use == com) {
			result="무승부";
			System.out.println(result);	
			}
		
		if(use == 1){
			if(com == 2) {
				result = "컴퓨터 승리";
				System.out.println(result);
				if(com==3) {
				result="사용자 승리";
				System.out.println(result);
				}
			}
		}
		
				
		if(use == 2){
			if(com == 1) {
				result = "사용자 승리";
				System.out.println(result);
				if(com==3) {
				result="컴퓨터 승리";
				System.out.println(result);
				}
			}
		}
					
		if(use == 3){
			if(com == 1) {
				result = "컴퓨터 승리";
				System.out.println(result);
				if(com==3) {
				result="사용자 승리";
				System.out.println(result);
				}
			}
		}
	}
}
	
