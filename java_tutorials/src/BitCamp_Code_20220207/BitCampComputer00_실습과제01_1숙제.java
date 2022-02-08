/*
<<<<<<<<<<<<<<실습과제>>>>>>>>>>>>>>>>>>>>>
[1] : 이름과 전화번호를 입력받고 출력하는 예제
	FileName : Test1.java
	
	실행예> java Test1홍길동 011-111-1111
	==> 실행결과(출력결과...)
	나의 이름은 "홍길동"입니다.
	"홍길동"씨의 [hp]는 "011-111-1111"입니다.
	
 */


package BitCamp_Code_20220207;

import java.util.Scanner;

public class BitCampComputer00_실습과제01_1숙제 {

	//main metood
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		String hp = args[1];
		
		System.out.println("java Test1");		
//		Scanner sc1 = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);	
//		
//		name = sc1.nextLine();
//		hp = sc2.nextLine();
		
		System.out.println("나의 이름은\""+name+ "\"입니다.");
		System.out.println("\""+name+"씨의 [hp]는"+"\""+hp+"\"입니다.");
		
	}//end main

}//end class
