/*p. 117
예제 3-25



 
 
 */










package org.JavaStandards_Ch3;

import java.util.*; //scanner클래스를 사용하기 위해 추가

public class Operator4_2 {

	public static void main(String[] args) {
//예제 3-25
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
				System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		
		if (('a'<= ch && ch <= 'z') \\ ('A' <= ch && ch <= 'Z')) {
				System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		
	
		
		
		
		

	}

}
