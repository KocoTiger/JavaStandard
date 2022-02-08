/*
<<<<<<<<<<<<<<실습과제>>>>>>>>>>>>>>>>>>>>>
		
[4] : 숫자를 입력 받아(1~100)90이상 수, 80점이상 우, 70점이상 미, 60점 이상 양
	  그 이하는 가를 출력하기
	  (입력한 값이 0~100상이 이어야한다. 그이상 그이하일 경우 어떻게 처리할 것인가)
	  
	  FileName : Example1.java
	  
	  실행예> java Example 1 95
	  ==> 실행결과 (출력결과...)
	  입력하신 값 95점은 수입니다.
 */


package BitCamp_Code_20220207;

import java.util.*;

public class BitCampComputer00_실습과제01_4숙제 {

	public static void main(String[] args) {

		int score = 0;
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();    //화면에서 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);
		
		if(90<=score && score>=100) {
			System.out.println("입력하신 값"+score+"점은 수 입니다.");
		}else if(80<=score && score<90) {
			System.out.println("입력하신 값"+score+"점은 우 입니다.");
		}else if(70<=score && score<80) {
			System.out.println("입력하신 값"+score+"점은 미 입니다.");
		}else if(60<=score && score<70) {
			System.out.println("입력하신 값"+score+"점은 양 입니다.");
		}else if(score<60) {
			System.out.println("입력하신 값"+score+"점은 가 입니다.");
		}
		

	}

}
