package com.jse.grade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GradeView extends JFrame implements ActionListener{ 
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton;
	JLabel[] labels;
	JTextField[] textFields;
	JLabel areaLabel;
	JTextArea textArea;
	JPanel panel;
	GradeService  gradeService;
	public GradeView() {
		gradeService =  new GradeServiceImpl();
	}
	public void open() {
		JFrame frame = new JFrame("Grade Input");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[6];
		textFields = new JTextField[6];
		textArea = new JTextArea();
		String[] names = {"이름","국어","영어","수학","자바"};
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
		
		panel.add(saveButton); 
		panel.add(listButton);
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
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
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==saveButton) {
			textFields[0].setText("홍길동,김유신,이순신,신사임당,이도");
			textFields[1].setText("70,80,90,80,80");
			textFields[2].setText("60,70,80,90,60");
			textFields[3].setText("70,40,89,59,89");
			textFields[4].setText("50,60,70,80,60");
			String data = String.format("%s/%s/%s/%s/%s",
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText(),
					textFields[4].getText());		
			String[] arr = data.split("/");//corpus(말뭉치)
			String[] names = arr[0].split(",");
			String[] korean = arr[1].split(",");
			String[] english= arr[2].split(",");
			String[] math = arr[3].split(",");
			String[] java = arr[4].split(",");
			Grade[] grades = new Grade[5];
			
			for(int i=0;i<grades.length;i++) {
				grades[i]= new Grade();
				grades[i].setName(names[i]);
				grades[i].setKorean(Integer.parseInt(korean[i]));
				grades[i].setEnglish(Integer.parseInt(english[i]));
				grades[i].setMath(Integer.parseInt(math[i]));
				grades[i].setJava(Integer.parseInt(java[i]));
				gradeService.add(grades[i]);
				}
			
		} else if (e.getSource() == listButton) {
			Grade[] grades = gradeService.getGrades();
			String result = "";
			for (int i = 0; i < grades.length; i++) {
				result += grades[i].toString() + "\n";
			}
			textFields[0].setText("");
			textFields[1].setText("");
			textFields[2].setText("");
			textFields[3].setText("");
			textFields[4].setText("");
			textArea.setText(result);
		}
			
//			
//			}else if(e.getSource() == listButton) {
//				JOptionPane.showMessageDialog(this, "클릭!");
//				Grade[] grades = gradeService.getGrades();
//				for(int i=0; i<grades.length;i++) {
//					System.out.println("목록결과");
//					System.out.println(grades[i]);
//				}
//			}
		
		
		
	}
	
	
}
