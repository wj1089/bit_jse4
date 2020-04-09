package com.jse.game;

public class RPSgame7 { //한마디로 가상. 디스크

		private int userVal;
		private int comVal;
		
		public void setUserVal(int userVal) {
			this.userVal = userVal;
		}
		public int getuserVal () {
			return userVal;
		}
		public void setcomVal(int comVal) {
			this.comVal = comVal;
		}
		public int getcomVal () {
			return comVal;
		}
		
		public String game() {
			String result = "";
			if(userVal == 1) {
				if(comVal == 1) {
					result = "비김";
				}
				else if(comVal == 2) {
					result = "컴퓨터 승리";
				}
				else if(comVal == 3) {
					result = "사용자 승리"; 
				}
			}else if(userVal == 2) {
				if(comVal == 2) {
					result = "비김";
				}
				else if(comVal == 1) {
					result = "사용자 승리";
				}
				else if(comVal == 3) {
					result = "컴퓨터 승리";
				}
			}else if (userVal == 3) {
					if(comVal == 3) {
						result = "비김";
					}else if(comVal == 1) {
						result = "컴퓨터 승리";
					}else if(comVal == 2) {
						result = "사용자 승리";
					}
			}
				
			return result;		
		}
}	
		
//		System.out.println("가위바위보 게임");
//		System.out.println("(1)가위   (2)바위   (3)보  ");
//
//		int use = scanner.nextInt();
//		System.out.println("플레이어의 선택"+ use);
//		Random ran =new Random();
//		int com = ran.nextInt(3)+1;
////	int com = scanner.nextInt();
//		System.out.println("컴퓨터의 선택"+ com);
//		String end = "";
//		if(use==com) {
//			end = "무승부";
//		}else if(use == 1) {
//			if(com == 2) {
//			end = "패배";
//			}else {
//			end = "승리";
//			}
//		}else if(use == 2) {
//			if(com == 1) {
//			end = "승리";
//			}else {
//			end = "패배";
//			}
//		}else if(use == 3) {
//			if(com == 1) {
//			end = "패배";
//			}else {
//			end = "승리";
//		}
//	}
//	System.out.println(end);	

		
	
	

