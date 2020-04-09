package com.jse.phone;

import java.util.Scanner;
import javax.swing.JOptionPane;
import com.jse.util.*;  //*aster = all
import com.jse.util.Constants;
public class PhoneController {

	public static void main(String[] args) {
		PhoneServiceImpl service = new PhoneServiceImpl();

		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":  JOptionPane.showInputDialog(" 종료 "); return; 
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
						service.add(new CelPhone(values[0],values[1],values[2],true));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
					}
			break;
			case "4":
					CelPhone[] celPhones = service.getCelPhones();//Cel만 바꿔서 넣어주면 됨.
					message ="";//위에와 공유할수있는 장점이있음
					for(int i=0; i<3; i++) {
					message += celPhones[i].toString();
							
//							String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무): %s, %s, %s, %s 입니다.",
//							celPhones[i].getPhoneNumber(),
//							celPhones[i].getName(), 
//							celPhones[i].getCompany(),
//							celPhones[i].getMove());
					}
					JOptionPane.showMessageDialog(null, message);
			break;
			case "5":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
						service.add(new Iphone(values[0],values[1],values[2],true,values[4]));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
				}
			break;
			case "6":
					Iphone[] iphones = service.getIphones();
					message ="";
					for(int i=0;i<3;i++) {
						message += iphones[i].toString()+"\n";
//								String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무, 검색가능 유무): %s, %s, %s, %s, %s 입니다.\n",
//							iphones[i].getPhoneNumber(),
//							iphones[i].getName(), 
//							iphones[i].getCompany(),
//							iphones[i].getMove(),
//							iphones[i].getSearch());
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
//							String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무, 검색가능 유무, 사이즈): %s\n, %s\n, %s\n, %s, %s, %s 입니다.",
//							galaxyNotes[i].getPhoneNumber(),
//							galaxyNotes[i].getName(), 
//							galaxyNotes[i].getCompany(),
//							galaxyNotes[i].getMove(),
//							galaxyNotes[i].getSearch(),
//							galaxyNotes[i].getBigSize());	
				}
					JOptionPane.showMessageDialog(null, message);
			break;	
			}
		}
	}
}
