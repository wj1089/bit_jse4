package com.jse.game;

public class Dice01 {

		private String expect;
		private int diceNum;
		
		public void setExpect(String expect) {
			this.expect = expect;
		}public String getExpect() {
			return expect;
			
		}public void setDiceNum(int diceNum) {
			this.diceNum = diceNum;
		}public int getDiceNum() {
			return diceNum;
		}
			
	public String switchDice() {
		   String result = "";
		switch(diceNum) {
		case 1: case 3: case 5: result = "홀"; break;
		case 2:	case 4: case 6: result = "짝"; break;
		}
		String result2 = "틀림";
		if(expect.equals(result)) {
			result2 = "맞음";
		}
		System.out.printf("결과: %s, result2");
		return result2;
	}
		
}
