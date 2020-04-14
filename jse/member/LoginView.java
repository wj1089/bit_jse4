package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
									//implements ActionListener(interface)의 역할을 강제로 지정한 기능을 실행시킨다.
public class LoginView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton, loginButton;
	JLabel[] labels;
	JTextField[] textFields;
	JLabel areaLabel;
	JTextArea textArea;
	JPanel panel;
	MemberService memberService;
	public LoginView() {
		memberService = new MemberServiceImpl();
	}
	public void open() {
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[5];
		textFields = new JTextField[5];
		textArea = new JTextArea();
		String[] names = {"이름","아이디","패스워드","SSN","주소"};
		for(int i=0;i < names.length;i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}	
		areaLabel = new JLabel("검색결과");
		panel.add(areaLabel);
		panel.add(textArea);
		saveButton = new JButton("저장");
		listButton = new JButton("목록");
		loginButton = new JButton("로그인");
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
		panel.add(saveButton); 
		panel.add(listButton);
		panel.add(loginButton);
		labels[0].setBounds(40,10,40,40);
		labels[1].setBounds(40,50,40,40);
		labels[2].setBounds(40,90,60,40);
		labels[3].setBounds(40,130,40,40);
		labels[4].setBounds(40,170,60,40);
		areaLabel.setBounds(40,210,60,40);
		textFields[0].setBounds(120,10,200,30);
		textFields[1].setBounds(120,50,200,30);
		textFields[2].setBounds(120,90,200,30);
		textFields[3].setBounds(120,130,280,30);
		textFields[4].setBounds(120,180,280,30);
		textArea.setBounds(120,220,280,150);
		saveButton.setBounds(125,400,80,30);
		listButton.setBounds(240,400,80,30);
		loginButton.setBounds(340,400,80,30);
		
		this.setLocationRelativeTo(null);
	}
	@Override//3
	public void actionPerformed(ActionEvent e) { //
		if(e.getSource() == saveButton){
			//ml
			textFields[0].setText("홍길동,김유신,이순신,신사임당,이도");
			textFields[1].setText("hong,you,lee,shin,leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("980455-1,965714-2,965714-3,910419-4,995945-5");
			textFields[4].setText("서울,서울,서울,부산,부산");
			//nlp
			String data = String.format("%s / %s / %s / %s / %s ",
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText(),
					textFields[4].getText());		
			String[] arr = data.split("/");//corpus(말뭉치)
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwords= arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			Member[] members = new Member[5];//matrix구조로 변환(2차원구조)
			
		for(int i=0;i<5;i++) {
				members[i]= new Member();//<member[i]> = Member <m> =  new Membe();
				members[i]. setName(names[i]);
				members[i]. setUserid(userids[i]);
				members[i]. setPasswd(passwords[i]);
				members[i]. setSsn(ssns[i]);
				members[i]. setAddr(addrs[i]);
				memberService.add(members[i]);//write(쓴다, 보낸다) (void타입) - ㄴㄷㄱ
			}
		}else if(e.getSource() == listButton) {
			JOptionPane.showMessageDialog(this, "클릭!");
			Member[] members = memberService.getMembers();
			//read(읽다, 받다) ,parameter가 없고,return타입은 앞에 <Member[] members >이다.
			for(int i=0;i<members.length;i++) {
				System.out.println("화면 목록 결과");
				System.out.println(members[i]);//만약 그냥member가 들어있다면 주소값만 나온다.
			}							  	   //member[i]인경우는 element이다
		}								     	//[i]에 의미는 한 차원 낮춰주는것이다.
		//(this, "안녕하세요!<리터럴>"); =" " 이렇게 주는것을 notation - 기호와 
	}
}
			
			
//		String[][] mtx = new String[4][5];
//		System.out.println("matrix start");
//		String[] arr = data.split("/");
//		Member member = null;
//			for(int i=0;i<arr.length;i++) {
//				String[] t = arr[i].split(",");
//				for(int j=0;j<t.length;j++) {
//					mtx[i][j] = t[j];
//				}
//				System.out.println();
//				memberService.add(member);
//		}
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<mtx[i].length;j++) {
//					System.out.println(mtx[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println("matrix end");
			
