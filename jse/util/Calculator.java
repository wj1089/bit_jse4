package com.jse.util;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	//First Example.
		//첫번째 수 입력
		//두번째 수 입력
		//두 수의 합은 ?
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		a= scanner.nextInt();
		System.out.println("두번째 수 입력");
		b= scanner.nextInt();
		System.out.println("세번째 수 입력");
		c= scanner.nextInt();
		int sum;
		sum = a+b+c;
		System.out.println("모든수의 합은?: " + sum);
		System.out.println();
		main(null);
		
	//Second Example.
//		int a;
//		int b;
//		int sum;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 입력숫자 : ");
//		a = sc.nextInt();
//		System.out.println("두번째 입력숫자 : ");
//		b = sc.nextInt();
//		sum = a+b;
//		System.out.println("두 숫자의 합은 : "+ sum);
		
	}

}
