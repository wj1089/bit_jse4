package com.jse.game;
import java.util.Random;
import java.util.Scanner;
import com.jse.member.Member;
import com.jse.member.Kaup;
import com.jse.util.calculateculate;

public class GameController { // 실제로 보이는것 //메모리
	public static String test;

	public static void main(String[] args) {// 파라미터

		Scanner scanner = new Scanner(System.in);
		Member member = new Member();// 다르게 하나씩 준다면, 각자 다른주소가 생성되면서 실패된다.
		Random random = new Random();
		calculateculate calculateculate = null;
		Dice01 dicenum = null;
		RPSgame7 rpsgame = null;
		Kaup kaup = new Kaup();
//		GenderChecker gendernumber = null;
		// 질문! 이걸 그냥 case에 넣어버리면 안되나요?? >> 이걸 넣어버리면 한가지 주소로 많은이용자들이 충돌하게된다.
		// 그래서 그냥 위에 빼버려서 이런현상을 없게한다.
		// null은 주소가 미설정상태.

		while (true) { // while(true)에서 멈추지 않는다면 무한루프로 계속돈다.
			System.out.println(" 1. 회원가입  " 
					+ " 2. 로그인 " 
					+ " 3. 계산기 " 
					+ " 4. 1부터 100까지의 합  " 
					+ " 5. 가위바위보게임  "
					+ " 6. 홀짝게임 " 
					+ " 7. Gender game" 
					+ " 8. 카우푸지수"
					+ " 0. 종료");
//			int flag = scanner.nextInt();// 프리미트드 타입 변수
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return; // return은 그냥 Statement를 빠져나간다.
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디 입력");
				String userid = scanner.next();
				member.setId(userid); // 내용은 상관없이 타입이 같으면 된다.
				break;

			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
//				String returnId = member.getId();
				System.out.println("로그인용 아이디 : " + member.getId());
				if (id2.equals(member.getId())) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;

			case 3:
				calculate = new Calculate();
				System.out.println("계산기를 실행합니다");
				int a, b, c;
				System.out.println("첫번째 수 입력");
				a = scanner.nextInt();
				calculate.setNum1(a);
				System.out.println("두번째 수 입력");
				b = scanner.nextInt();
				calculate.setNum2(b);
				System.out.println("세번째 수 입력");
				c = scanner.nextInt();
				calculate.setNum3(c);
//				int sum = calculate.calculateculate();
				System.out.println("모든수의 합은?: " + calculate.calculateculate());
				break;

			case 5:
				rpsgame = new RPSgame7();
				System.out.println("가위바위보 게임");
				System.out.println("(1)가위   (2)바위   (3)보  ");
				int user = scanner.nextInt();
				System.out.println("플레이어의 선택" + user);
				rpsgame.setUserVal(user);

				int com = ran.nextInt(3) + 1;
				System.out.println("컴퓨터의 선택" + com);
				rpsgame.setcomVal(com);
//				String gameResult = rpsgame.game();
				System.out.println(rpsgame.game());
				break;

			case 6:
				dicenum = new Dice01();
				System.out.println("주사위게임을 시작합니다");
				System.out.println("기대하는 값 홀/짝을 입력합니다");
//				String expect = scanner.next();
				System.out.println(String.format("사용자 홀짝 예상 : %s%n", scanner.next()));
//				int diceNum = ran.nextInt(6) + 1;
				System.out.printf(String.format("컴퓨터가 생성한 값 : %s%n", ran.nextInt(6) + 1));
				String result1 = "";
//				if (diceNum == 1) {
//					result1 = "홀";
//				} else if (diceNum == 2) {
//					result1 = "짝";
//				} else if (diceNum == 3) {
//					result1 = "홀";
//				} else if (diceNum == 4) {
//					result1 = "짝";
//				} else if (diceNum == 5) {
//					result1 = "홀";
//				} else {
//					result1 = "짝";
//				}
//				System.out.println("컴퓨터 홀짝 결과 : " + result1);
//				;
//				if (expect.equals(result1)) {
//					System.out.println("매칭 결과 : 맞음 ");
//				} else {
//					System.out.println("매칭 결과 : 틀림 ");
//				}
//				break;

			case 7:
				gendernumber = new GenderChecker();
				System.out.print("주민번호를 입력해주세요.(011231-1111222)");
				String number = scanner.next();
				gendernumber.setIdNumber(number); 
				char gennum = number.charAt(7);
				gendernumber.setGenderNumber(gennum);
				String gennum1 = gendernumber.idcard();
				System.out.println("귀하의 성별및 신분은 : "+ gennum1 +"입니다.");
				break;
				
				
			case 8:// multi란 만약 랜덤이란 스케나 카오푸 같은걸 2번이상 쓸경우는 케이스 밖에다 적어준다. 
				System.out.println("신체정보검사를 시작합니다.");
				System.out.println("우선 체중을 입력해주세요.");
//				double weight = scanner.nextDouble();
//				System.out.println("귀하의 체중은 "+weight+"입니다");
				kaup.setWeightValue(scanner.nextDouble());				
				
				System.out.println("신장을 입력해주세요.");
//				double height = scanner.nextDouble();
//				System.out.println("귀하의 신장은 "+height+"입니다");
				kaup.setHeightValue(scanner.nextDouble());				
//				String result = kaup.calculateculate();
				System.out.println("사용자님의 BMI타입은 "+(kaup.calculateculate())+" 입니다");
				
				break;
				
			}
		}
	}
}