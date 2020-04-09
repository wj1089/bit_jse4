package com.jse.game;
import java.util.Scanner;
public class HelloJava {
	public static void main(String[] args) { //진입할수있는 방식을 정해준다
		
	Scanner scanner = new Scanner(System.in);
		System.out.println("어디사시나요?");
	String name = scanner.next();
		System.out.println("아 " + name + "좋은곳이죠");
		System.out.println("연세가...?");
	int age = scanner.nextInt();//Integer
		System.out.println(age + "세 이시군요.");
		System.out.println("키는 몇이고,체중은 몇 kg인가요?");
	float height = scanner.nextFloat();//Float
	double weight = scanner.nextDouble();//Double, 기본형이다
		System.out.println("혈액형이 무엇입니까??");
	char bloodType = scanner.next().charAt(0);
	
	
	int a = 0;
	System.out.println(a);
	}
}
