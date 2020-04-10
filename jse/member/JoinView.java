package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.jse.util.Constants;

public class JoinView extends JFrame implements ActionListener{//1.implements ActionListener

	private static final long serialVersionUID = 1L;//long type 주소같은 개념
	JButton select,cancel ;
	JLabel[] labels;
	JTextField[] textFields;
	JPanel panel;	
	MemberService memberService;
	public JoinView() {
		 memberService = new MemberServiceImpl();
	}
	public void open() {//******맨아래와 관계
//		JFrame frame = new JFrame("회원관리");
		this.setSize(500,500); //2 위에 지우고 frame에서 this로 바꿔주기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[5];
		textFields = new JTextField[5];
		String[] names = {"이름","아이디","패스워드","SSN","추가사항"};
			for(int i=0;i < names.length;i++) {
				labels[i] = new JLabel(names[i]);
				panel.add(labels[i]);
				textFields[i] = new JTextField();
				panel.add(textFields[i]);
			}	
		
		
		
////		JLabel[] labels = new JLabel[5];//매우중요!
//		String[] names = {"아이디 :","패스워드 : ","이름","생년월일 : ","회원정보 입력."};
//		for(int i=0; i<labels.length; i++) {
//			labels[i] = new JLabel(name[i]);
//			panel.add(labels[i]);
//			
			
				
			
			
	//	textFields = new JTextField("id.");
	//	textFields= new JTextField("pw.");
	//	textFields = new JTextField("name.");
	//	textFields = new JTextField("ssn");
			
			
			
			select = new JButton("확인");
			cancel = new JButton("취소");
			select.addActionListener(this);//4 정말중요한 addActionListener!!
			cancel.addActionListener(this);//4 정말중요한 addActionListener!!
			panel.add(select);
			panel.add(cancel);
			labels[0].setBounds(40,10,40,40);
			labels[1].setBounds(40,50,40,40);
			labels[2].setBounds(40,90,60,40);
			labels[3].setBounds(40,130,40,40);
			labels[4].setBounds(40,170,60,40);
			textFields[0].setBounds(120,10,200,30);
			textFields[1].setBounds(120,50,200,30);
			textFields[2].setBounds(120,90,200,30);
			textFields[3].setBounds(120,130,280,30);
			textFields[4].setBounds(120,180,280,120);
			select.setBounds(125,330,80,30);
			cancel.setBounds(240,330,80,30);
	
			this.setLocationRelativeTo(null);

	}
	@Override//3
	public void actionPerformed(ActionEvent e) { //******위에 와 어떤relation인가? 

		if(e.getSource() == select){
			textFields[0].setText("홍길동,김유신,이순신,신사임당,이도");
			textFields[1].setText("hong,you,lee,shin,leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,980101-2,930101-3,100101-4,020606-5");
			JOptionPane.showMessageDialog(this, 
					String.format("%s / %s / %s / %s / %s",
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText()));
			String[] data = String.format("%s / %s / %s / %s / %s",
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText()).split("/");
			
			String[] names = data[0].split(",");
			Member[] members = memberService.getMembers();
			for(int i=0; i<members.length;i++){
				System.out.println(members[i].toString());
			}
			
			//(this, "안녕하세요!<리터럴>"); =" " 이렇게 주는것을 notation - 기호와 
		}else if(e.getSource() == cancel) {
		}
	}
	
}
