/*p. 173~174
#2.3 do-while문
	: do-while문은 while문의 변형 (기본적인 구조는 같음)
	: 조건식과 블럭{}의 순서를 바꿔놓은 것
	: 그래서 {}을 먼저 실행 후에 조건식을 평가.
	: while문은 조건식의 결과에 따라 {}이 한번도 수행되지 않을 수있지만,
	  do-while문은 최소한 한번은 수행될 것을 보장.
		
		<기본 구조>
		do{
					//조건식의 연산결과가 참일 때 수행될 문장들을 적는다.
		} while(조건식); 		//<--- 끝에  ;을 잊지 않도록 주의
		
	: 그리 많이 쓰이지는 않음.
	[예제 4-28]처럼 반복적으로 사용자의 입력을 받아서 처리할 때 유용






 */




package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

	public class Ch4_IfSwitch9_DoWhile1_100사이숫자맞추기 {
	
		public static void main(String[] args) {
//[예제 4-28]		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random () * 100)+1;	//1~100사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}//end else if
		}//end do		
		while (input != answer);
		
		System.out.println("정답입니다.");


	}//end main

}//end public
