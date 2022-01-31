/* p 40~41
2.4 화면에서 입력 받기 - Scanner

	지금까지는 화면에 출력만 해왔음.
	이제 화면으로 부터 입력받는 방법에 대해서 배워보자.
	자바에서 화면으로 부터 입력받는 방법은 여러개
	(JDK1.6부터 추가된 Console 클래스를 이용하는 것)
	이 클래스는 이클립스와 같은 IDE에서 잘 동작하지 않음.
	
	[참고] 화면으로 부터 입력받는 방법들은 근본적으로 모두 같음.
	  차이를 비교할 필요 없음.
	  상황에 맞는 편리한 것을 사용하면 됨.
	1. Scanner를 사용하기 위해 아래 한문장 추가
	
	import java.util.*; //Scanner클래스를 사용하기 위해 추가
	
	2. Scanner클래스의 객체를 생성
	
	Scanner scanner = new Scanner (System.in); // Scanner 클래스의 객체를 생성

	3. nextLine()이라는 메서드를 호출
	   입력대기 상태에 있다가 입력을 마치고
	   엔터키를 누르면 입력한 내용이 문자열로 반환.
	 
	 String input = scanner.nextLine();			// 입력받은 내용을 input에 저장
	 int num = Integer.parseInt(input);			// 입력받은 내용을 int타입의 값으로 변환
	 
	   만일 입력받은 문자열을 숫자로 변환시,
	   Integer.parseInt()라는 메서드를 이용해야만 함.
	   (이 메서드는 문자열을 -> int 타입의 정수로 변환)
	[참고]만일 문자열을 float타입의 값으로 변환하길 원하면, Float.parseFloat()를 사용
		 다른 타입으로의 변환 p.493 참고.

	- 사실, Scanner클래스에는 
	  nextInt()  			 nextFloat() 
	  와 같이 변환없이 숫자로 바로 입력받을 수 있는메서드 들이 있음.
	  이 메서드들을 사용하면, 
	  문자열 -> 숫자로 변환하는 수고는 필요하지 않음.
	  
	 	int num = scanner.nextLine();		//정수를 입력받아서 변수 num에 저장

	  그러나, 메서드들은 화면에서 연속적으로 값을 입력받아서 사용하기에 까다롭다.
	  차라리 모든 값을 nextLine()으로 입력받아서 적절히 변환하는 것이 더 낫다.
 */



//예제 2-6
package org.javastandard.javaexercise.ch1variable;

import java.util.*; //Scanner클래스를 사용하기 위해 추가

	public class ch2_variableEx2_5_Scanner {
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);  //// Scanner 클래스의 객체를 생성

			System.out.print("두자리 정수를 하나 입력해주세요.>");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);		//입력받은 문자열을 숫자로 변환
			
			System.out.println("입력내용 :" + input);
			System.out.printf("num=%d%n", num);	
		
	}//end main

}//end public
	
	
//	결과값:
//		22
//		입력내용 :22
//		num=22
/*
	만일 숫자가 아닌 문자 or 기호를 입력하면, 입력받은 문자열을 숫자로 변환하는 과정인
	Integer.parseInt()에서 에러가 발생
	특히, 공백을 입력하지 않도록 해야한다.
  
 */
	
	
	
	
	
	
	
	
	
	
	
