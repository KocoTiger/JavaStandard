/*p. 136~139
# 제어문(control statement)
	: 프로그램의 흐름을 바꾸는 역할을 하는 문장들
	: 제어문은 조건문 + 반복문을 포함

1. 조건문 - if, switch
	: 주로 if문을 많이 사용 (처리해야할 경우의 수가 많을 떄는 switch문이 효율적)
	 - switch문은 if문보다 제약이 많다.
	
	1.1 if문
	: 조건식 + {}
	: 만일 (if)조건식이 참이면 {}괄호 안의 문장들을 수행하라.
	
		if(조건식){
			//조건식이 참(true)일 때 수행될 문장들을 적는다.
		}
		
	ex> 참이면 if문 {}안의 문장이 수행, 거짓이면 if문 다음의 문장으로 넘어감.
		if (score > 60) {
				System.out.println("합격입니다.");
		}
		변수 score의 값을 80으로 정했을 경우,
		score > 60
	->	80 > 60
	->	true		//조건식이 참이므로 괄호안의 문장이 실행
	
	##조건식
	: 일반적으로 비교연산자, 논리연산자로 구성
	[p.137표 참고] 표4-1 자주 사용되는 조건식
	: 조건식을 작성할 때 실수하기 쉬운것이,
	  등가 비교연산자 == 대신, 대입연산자 = 를 사용하는 것
	  ex>
	  		if (x=0) {....}		x에 0이 저장되고, 결과는 0이 된다.
	  	->	if (0)	 {....}		결과가 true또는 false가 아니므로 에러!
	: 중요! 자바에서 조건식의 결과는 반드시 true or false이어야 한다!
	<아래예제 4-1 참고>
	
	##블럭{}
	: 여러문장을 하나의 단위로 묶을 수 있는 것 블럭 (block)
	: {시작 }끝, 마지막에 ;붙이지 않음!
	: 블럭내의 문장들은 tab으로 들여쓰기(indentation) 해라 (보기 좋게)
	###블럭을 치는 스타일 (2가지)
	1) if (조건식){
	
	   }
		장점 : 라인의 수가 짧아짐
	2) if (조건식)
	   {
	   
	   }
	  	장점 : 블럭의 시작과 끝을 찾기 쉬움
	: 블럭 안에는 보통 여러 문장을 넣지만, 한문장만 or 아무런 문장도 넣지 않을 수 있다.
	  블럭 내의 문장이 하나뿐일 때, {}생략 가능
	  ex> if (score > 60)
	  		System.out.println("합격입니다.");
	  아니면, 한줄로 쓰기도 가능	
	  	  if (score > 60) System.out.println("합격입니다.");
	하지만, 괄호를 해주는 것으로 습관을 들이자. (문장이 복잡해지면 추가하는 것을 잊기 쉽다)
	  ex> 괄호를 치지 않고 쓸경우
	  	if (score > 60)
	  		System.out.println("합격입니다.");		//문장1. if문에 속한 문장
	 		System.out.println("축하드립니다.");	//문장2.	if문에 속한 문장 아님
	  	  괄호를 칠 경우
	  	if (score > 60){
	  		System.out.println("합격입니다.");		//문장1. if문에 속한 문장
	 		System.out.println("축하드립니다.");	//문장2.	if문에 속한 문장 아님
	  	}
	  
	  
	  
	  
	  

 */



package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch1If {

	public static void main(String[] args) {
//예제 4-1
//		int x = 0;
//		
//		System.out.printf("x=%d일때, 참인것은%n", x);
//		
//		if(x==0) System.out.println("x==0");		//true
//		if(x!=0) System.out.println("x!=0");		//false
//		if(!(x==0)) System.out.println("!(x==0)");	//false
//		if(!(x!=0)) System.out.println("!(x!=0)");	//true
//		System.out.println();
//		
//		x = 1;  //int x = 1;이라고 초기화 선언 하면 안됨, 왜!?
//		
//		System.out.printf("x=%d일때, 참인것은%n", x);
//
//		if(x==0) System.out.println("x==0");		//false
//		if(x!=0) System.out.println("x!=0");		//true
//		if(!(x==0)) System.out.println("!(x==0)");	//true
//		if(!(x!=0)) System.out.println("!(x!=0)");	//false
//		
		
		

	}

}
