package com.jse.member;
import java.util.Random;
import java.util.Scanner;
public class Engine {
	public static String test;
	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		while(true) { //while(true)에서 멈추지 않는다면 무한루프로 계속돈다.	
			System.out.println(
					  " 1. 회원가입  "
					+ " 2. 로그인 "
					+ " 3. 주사위게임  "
					+ " 4. 1부터 100까지의 합  "
					+ " 5. 가위바위보게임  "
					+ " 6. 홀짝게임"
					+ " 0. 종료");
			int flag = scanner.nextInt();
			switch(flag) {
				case 0: System.out.println("종료"); return; // return은 그냥 Statement를 빠져나간다.
				case 1: System.out.println("회원가입");
				case 2: switchDice(); break;//위 System.out.println("0.종료  1.계산기 2.달력");
				case 3: Sum1To100(); break;
				case 4: game();break;//break를 하면 스위치를 빠져나가고 다시 
			}
		}
	}
		static void game() {
			System.out.println("가위 바위 보게임을 시작합니다.");
			System.out.println("1.가위  2.바위  3.보 ");
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
		}
		static void switchDice() {
			System.out.println("주사위게임을 시작합니다");
			System.out.println("기대하는 값 홀/짝을 입력합니다");
			
			Scanner scanner = new Scanner(System.in);
			String expect =  scanner.next();
			System.out.println("사용자 홀짝 예상 : "+ expect +"입니다");
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("컴퓨터가 생성한 값 : "+dice+" 입니다!");
			String result = "";
			switch(dice) {
			case 1: case 3: case 5: 
				System.out.println("홀입니다");
				break;
			case 2:	case 4:case 6:
				System.out.println("짝입니다");
				break;
				}
			}
		static void Sum1To100() {
			int sum = 0;
			for(int i=0; i<=100; i++) {
				sum += i;
				System.out.println(i);
			}
			System.out.printf("합계 %d", sum);
			System.out.println();
			}	
	}
