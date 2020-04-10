package com.jse.phone;

import javax.swing.JOptionPane;
import com.jse.util.*;  
import com.jse.util.Constants;
public class PhoneController {

	public static void main(String[] args) {
		
		PhoneServiceImpl service = new PhoneServiceImpl();

		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":JOptionPane.showInputDialog(" 종료 "); return; 
			case "1":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
						service.add(new Phone(values[0],values[1],values[2]));
				}
			break;
			case "2": 
					Phone[] phones = service.getPhones();
					String message = "";
					for(int i=0;i<3;i++) {
						message += phones[i].toString();
					}
					JOptionPane.showMessageDialog(null, message);
			break;
			case "3":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
						service.add(new CelPhone(values[0],values[1],values[2],true));
					}
			break;
			case "4":
					CelPhone[] celPhones = service.getCelPhones();
					message ="";
					for(int i=0; i<3; i++) {
						message += celPhones[i].toString();
							
					}
					JOptionPane.showMessageDialog(null, message);
			break;
			case "5":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
						service.add(new Iphone(values[0],values[1],values[2],true,values[4]));
				}
			break;
			case "6":
					Iphone[] iphones = service.getIphones();
					message ="";
					for(int i=0;i<3;i++) {
						message += iphones[i].toString()+"\n";
//								
				}
				JOptionPane.showMessageDialog(null, message);
			break;	
			case "7":
					for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog( Constants.GALAXT_NOTE_PHONE_MENU).split(",");
					service.add(new GalaxyNote(values[0],values[1],values[2],true,values[4],values[5]));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
				}
			break;	
			case "8":
					GalaxyNote[] galaxyNotes = service.getGalaxyNotes();
					message ="";
					for(int i=0;i<3;i++) {
					message += galaxyNotes[i].toString()+"\n";
//							
				}
					JOptionPane.showMessageDialog(null, message);
			break;	
			}
		}
	}
}
