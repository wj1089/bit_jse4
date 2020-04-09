package com.jse.card;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
	public class CardController {
		public static void main(String[] args) {
		CardServiceImpl cardService= new CardServiceImpl();
		Card card = null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0":  return;
			case "1": 
				for(int i=0;i<3;i++) {
				card = new Card();
				String[] values = JOptionPane.showInputDialog(Constants.CARD_INPUT).split(",");
						card.setKind(values[0]);
						card.setNumber(Integer.parseInt(values[1]));
						cardService.add(card);
					}
						break;
				
			case "2": 
				JOptionPane.showMessageDialog(null, cardService.getCards());
					break;
				
				
			}
		}
	}
	}
	

