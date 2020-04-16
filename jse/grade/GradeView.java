package com.jse.grade;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jse.member.MemberServiceImpl;

public class GradeView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,koreanLabel,englishLabel,
    				mathLabel,javaLabel; 
    private JTextField nameText, koreanText, englishText, mathText, javaText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton, loginButton; 
    public GradeService gradeService;
    public void open(){ 
    	gradeService = new GradeServiceImpl();
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        koreanLabel = new JLabel("Korean"); 
        koreanLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        koreanLabel.setSize(100, 20); 
        koreanLabel.setLocation(100, 150); 
        container.add(koreanLabel); 
  
        koreanText = new JTextField(); 
        koreanText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        koreanText.setSize(150, 20); 
        koreanText.setLocation(200, 150); 
        container.add(koreanText); 
  
        englishLabel = new JLabel("English"); 
        englishLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        englishLabel.setSize(100, 20); 
        englishLabel.setLocation(100, 200); 
        container.add(englishLabel); 
        
        englishText = new JTextField(); 
        englishText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        englishText.setSize(150, 20); 
        englishText.setLocation(200, 200); 
        container.add(englishText);
  
        mathLabel = new JLabel("Math"); 
        mathLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mathLabel.setSize(100, 20); 
        mathLabel.setLocation(100, 250); 
        container.add(mathLabel); 
        
        mathText = new JTextField(); 
        mathText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        mathText.setSize(150, 20); 
        mathText.setLocation(200, 250); 
        container.add(mathText);
  
        javaLabel = new JLabel("Java"); 
        javaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        javaLabel.setSize(100, 20); 
        javaLabel.setLocation(100, 300); 
        container.add(javaLabel); 
        
        javaText = new JTextField(); 
        javaText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        javaText.setSize(150, 20); 
        javaText.setLocation(200, 300); 
        container.add(javaText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 450); 
        container.add(submitButton); 
        submitButton.addActionListener(this);
        
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(270, 450); 
        container.add(listButton); 
        listButton.addActionListener(this);

        loginButton = new JButton("Login"); 
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        loginButton.setSize(100, 20); 
        loginButton.setLocation(390, 450); 
        container.add(loginButton);
        loginButton.addActionListener(this);

        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    } 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submitButton) {
			JOptionPane.showMessageDialog(this, "저장 클릭");
			nameText.setText("홍길동,유관순,이순신,신사임당,이도");
			koreanText.setText("100,50,70,90,80");
			englishText.setText("50,80,70,90,100");
			mathText.setText("80,70,90,50,70");
			javaText.setText("100,100,100,80,90");
			String data = String.format("%s/%s/%s/%s/%s",
					nameText.getText(),
					koreanText.getText(),
					englishText.getText(),
					mathText.getText(),
					javaText.getText());
			String[] arr = data.split("/");//corpus(말뭉치)
			String[] names = arr[0].split(",");
			String[] korean = arr[1].split(",");
			String[] english= arr[2].split(",");
			String[] math = arr[3].split(",");
			String[] java = arr[4].split(",");
			Grade[] grades = new Grade[5];
															//add =  vs set = 
			for(int i=0;i<grades.length;i++) {
				grades[i] = new Grade();   //grades[i]<element)> = new Grade();
				grades[i].setName(names[i]);
				grades[i].setKorean(Integer.parseInt(korean[i]));
				grades[i].setEnglish(Integer.parseInt(english[i]));
				grades[i].setMath(Integer.parseInt(math[i]));
				grades[i].setJava(Integer.parseInt(java[i]));
				gradeService.add(grades[i]);
				}
			
		} else if (e.getSource() == listButton) {
			JOptionPane.showMessageDialog(this, "목록 클릭");
			Grade[] grades = gradeService.list();
			String result = "";
			for (int i = 0; i < grades.length; i++) {
				result += grades[i].toString() + "\n";
			}
			nameText.setText("");
			koreanText.setText("");
			englishText.setText("");
			mathText.setText("");
			javaText.setText("");
			resultText.setText(result);
		} else if(e.getSource() == loginButton) {
			JOptionPane.showMessageDialog(this,"로그인클릭!");
			
			
		}
	}
}
