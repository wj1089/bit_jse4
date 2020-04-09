package com.jse.game;

import java.util.Random;
import java.util.Scanner;

public class RPS2 {

	public static void main(String[] args) {
		game();
	}
	static void game() {
		
		System.out.println("가위 바위 보게임을 시작합니다.");
		System.out.println("1.가위, 2.바위, 3.보 ");
		Scanner scanner = new Scanner(System.in);
		int use = scanner.nextInt();
		Random ran = new Random();
		int com = ran.nextInt(3)+1;
		System.out.println("사용자의 값은 "+use+"입니다.");
		System.out.println("컴퓨터의 값은 "+com+"입니다.");
		String result = "";
		switch(use-com) {
		case 2: case -1:
			System.out.println("패배했습니다.");
			break;
		case 1: case -2:
			System.out.println("승리했습니다");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
		System.out.println();
	}
}
	
