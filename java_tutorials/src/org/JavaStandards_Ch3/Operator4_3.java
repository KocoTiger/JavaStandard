/*p.118~
#효율적인 연산 (short circuit evaluation)
   	 1) OR연산: 논리연산자는 OR연산의 경우 \\ 두피연산자 중 한쪽만 참이어도 전체가 참이므로
   	 			우측 연산자의 값은 평가 하지않는다.
   	 x가 true면 x\\y는 항상 true이다.

	 2) AND연산 : &&경우도 마찬가지로 어느 한쪽만 거짓(0)이어도 전체 연산결과가 거짓(0)
	 		   : x가 거짓이면 x && y는 항상 거짓
	 ##그래서 같은 조건식이라도 피연산자의 위치에 따라서 연산 속도가 다를수 있다.
	 ## \\경우 연산결과가 참일 확률이 높은 피연산자를 왼쪽에 넣는게 더빠른 연산결과가 나올 수 있다.
	 
예제 3-26 p.118 참고

# 논리 부정 연산자  !
	이 연산자는 피 연산자가 true이면 false를
	false이면 true를 결과로 반환
	true와 false를 바꿈
	
	이러한 성질을 이용, TV의 전원버튼과 같은 토글 버튼을 논리적으로 구현 가능
	: 			   !			 !					!				!
	false(거짓.off) -> true(참,on) -> false(거짓, off) -> true(참, on) ->....
	
	: 주로 쓰이는 곳 -> 조건문, 반복문의 조건식 (잘쓰면 조건식이 보다 이해하기 쉬워짐)
  	ex> 문자ch는 소문자가 아니다!
  	
  		ch <'a' \\ ch >'z'		<->		!('a' <= ch && && ch <= 'z')
  	
  	[예제 3-27 참고 p. 120]
  	
  
 */








package org.JavaStandards_Ch3;

public class Operator4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
