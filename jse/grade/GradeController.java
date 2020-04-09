package com.jse.grade;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
		public class GradeController {
		public static void main(String[] args) {
			GradeServiceImpl gradeService = new GradeServiceImpl();
			Grade grade =null;
			while(true) {
			switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
				case "0": return;
				case "1": 
						for(int i=0;i<3;i++) {
						grade = new Grade();
						String[] values =JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
									grade.setName(values[0]);
									grade.setKorean(Integer.parseInt(values[1]));
									grade.setEnglish(Integer.parseInt(values[2]));
									grade.setMath(Integer.parseInt(values[3]));
									grade.setScience(Integer.parseInt(values[4]));
									gradeService.add(grade);
									}
				break;
				case "2": System.out.println("성적표 출력");
				JOptionPane.showMessageDialog(null, gradeService.getGrades());
				
				break;
				
				case "3":
				System.out.println("총점별로 1,2,3등 이름 나열하기");
				String result = "";
				for(int i=0;i<3;i++) {
//					if(grade.rank>average) {
//						result = "1위";
//					}else if() {
//						result = "2위";
//					}else if() {
//						result = "3위";
//					}
				}
				break;
			}
		}
		}
	}
			
//			case 4:
//				System.out.println("회원가입을 실시합니다.");
//				
//				for(int i=0;i<2;i++) {
//					members[i] = join(scanner);
//				
//				System.out.println("회원님께서 입력하신 정보는");
//				System.out.print(String.format("[이름 : %s ,나이 :  %d   ,아이디: %s ,패스원드: %s 입니다.]",
//						members[i].getName(),
//						members[i].getAge(),
//						members[i].getUserid(),
//						members[i].getPasswd()));
//				}
//				break;
//				
//			case 5:
//				System.out.println("회원목록");
//				for(int i=0;i<2;i++) {
//					users[i]=list(scanner);
//				}
//				break;
//				
//			case 6:
//				System.out.println("회원목록 출력");
//				for(int i=0; i<2; i++) {
//					User user = users[i];
//					System.out.println(String.format("입력하신 회원님들의 성함은 : %s이며,  키는  %d입니다.",
//							users[i].getName(),
//							users[i].getHeight()));
//				}
//				break; 
//				}
//			}
//		}	
		
//		
//		public static Grade input(Scanner scanner) {
//			System.out.println("성적표 출력을 위해 귀하의 이름,국어점수,영여점수,수학점수,과학점수를 입력해주세요.");
//			return new Grade(scanner.next(),
//					scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//		}
			
//			Grade grade = new Grade();
//			System.out.println("이름을 입력해주세여.");
//			grade.setName(scanner.next());
//			System.out.println("국어점수를 입력해주세여.");
//			grade.setKorean(scanner.nextInt());
//			System.out.println("영어점수를 입력해주세여.");
//			grade.setEnglish(scanner.nextInt());
//			System.out.println("수학점수를 입력해주세여.");
//			grade.setMath(scanner.nextInt());
//			System.out.println("과학점수를 입력해주세여.");
//			grade.setScience(scanner.nextInt());
//			return grade;
		
		
		
		
//		public static Member join(Scanner scanner) {
//			System.out.println("회원목록을 출력하기 위해 귀하의 이름, 나이, 아이디, 패스워드를 입력해주세요.");
//			return new Member(
//					scanner.next(),scanner.nextInt(),scanner.next(),scanner.next());
//			
			
//			Member member = new Member();
//			System.out.println("이름을 입력해주세요.");
//			member.setName(scanner.next());
//			System.out.println("나이를 입력해주세요.");
//			member.setAge(scanner.nextInt());
//			System.out.println("아이디를 입력해주세요.");
//			member.setUserid(scanner.next());
//			System.out.println("패스워드를 입력해주세요.");
//			member.setPasswd(scanner.next());
//			return member;
//		}
		
		
//		public static User list(Scanner scanner) {
//			System.out.println("회원목록을 출력하기위해서 귀하의 이름, 신장을 입력해주세요.");
//			return new User(scanner.next(),scanner.nextInt());
//			
			
//			User user = new User();
//			System.out.println("회원님 성함을 입력해주세요!");
//			user.setName(scanner.next());
//			System.out.println("회원님 신장을 입력해주세요!");
//			user.setHeight(scanner.nextInt());
//			return user;
//		}
//		
//	}