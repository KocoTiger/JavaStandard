/*p. 167 ~170
#2.2 while문
	:for문에 비해 while문은 구조가 간단
	:if문처럼 조건식 + {} 로만 구성
	:if문과는 달리 while은 조건식이 참인 동안, 거짓이 될때까지 {}내의 문장을 반복
	
		while(조건식){
			//조건식의 연산결과가 참인동안, 반복될 문장들을 적는다.
		}

	:while문은 조건식 평가 후, 거짓이면 문장 전체를 벗어남. 참이면 반복

	##for문과 while문의 비교
	: 1부터 10까지 정수를 순서대로 출력하는 for문을 while문으로 변경하면
			
			for(int i=1; i<=10; i++){
					System.out.println(i);
			}
			
		->
		
			int i=1; //초기화
			
			while(i<=10){	//조건식
				System.out.println(i);
			i++;	//증감식
			}
			
		: 위의 두 코드는 완전히 동일.for문이 더 간결하고 알아보기 쉬움
		: 만일 초기화나 증감식이 필요하지 않은 경우라면, while문이 더 적합할 것이다.
		: 앞으로의 예제들은 for문보다 while문이 더 적합하다고 판단된 것들.
	
	##while문의 조건식은 생략불가
		:한가지 주의할점은 for문과 달리while문의 조건식은 생략할 수 없다.
			while(){	//에러. 조건식이 없음						
			}
  		:그래서 while을 항상 참이 되게 하려면 반드시 true를 넣어야한다.
  		[참고]무한 반복문은 반드시 {}안에 조건문을 넣어서 특정 조건을 만족하면 무한반복문을
  			 벗어나도록 해야한다
 [예제 4-23] 		
  
  
 */





package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch8_while1_GAMEOVER {

	public static void main(String[] args) {
// [예제 4-23] 
//		int i = 5;
//		
//		while(i--!=0) {	//5부터 시작~1까지 5개
//			System.out.println(i + " - I can do it.");
//		}
//		i--가 후위형이기 때문에 5를 넣어서 시작했지만, 값으로 나올때는 4
//감소 연산자를 분리
//		int i = 5;
//		
//		while(i--!=0) {	//5부터 시작~1까지 5개
//		System.out.println(i); 
//		}
//
//		->
//		
//		while(i!=0) {	//5부터 시작~1까지 5개
//		i--;
//		System.out.println(i); 
//		}
//while문을 벗어나면 안됨 (증감식)
//		
//		while(i--!=0) {	//5부터 시작~1까지 5개
//		System.out.println(i); 
//		}
		
//		--i;	//while문을 벗어남.
//		while(i!=0) {
//		System.out.println(i); 
//		}
// [예제 4-24]		
		int i=11;
		
		System.out.println("자, 이제 카운트다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000; j++) { //매출력마다 약간의 시간이 지연되도록 했다.
				;		//아무런 내용도 없는 빈 문장
			}
		}
		
		System.out.println("GAME OVER");
		
//		for(int j=0; j<2_000_000_000; j++) { //매출력마다 약간의 시간이 지연되도록 했다.
//			;		//아무런 내용도 없는 빈 문장
//		}		
//	###for문은 블럭내에 문장이 하나뿐일 떄 괄호{}를 생략할 수 있으므로 위의 for문을 다음과 같이 바꿀수 있다.		
//1) 	for(int j=0; j<2_000_000_000; j++);
//2) 	for(int j=0; j<2_000_000_000; j++){}		
//실수로 빈문장;만 for문에 속한 것으로 간주되어 단 한번만 수행될때
//		for(int i=1; i<=10; i++);		//빈문장 ;을 10번 반복한다
//		{
//				System.out.println("i=" + i);	// i=11이 출력된다.11일때 거짓이 되어 반복을 멈추므로.
//		}
		
		
		
		
		
	}//end main

}
