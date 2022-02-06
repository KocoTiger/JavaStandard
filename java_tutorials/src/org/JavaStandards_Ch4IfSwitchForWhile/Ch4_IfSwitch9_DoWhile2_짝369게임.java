/*p. 173~175
[예제 4-29] 3,6,9 게임 (1부터 100까지)
 	숫자 중, 3의 배수 (3,6,9)가 포함되어 있으면, 포함된 개수만큼 박수를 치는 게임
 	: 각자리를 확인 해야하기 때문, 예제 4-25처럼, 10으로 나누고, 10으로 나머지 연산
 	: 이작업은 변수 i에 직접하면 안됨, 다른 변수에 저장 처리 해야됨.
 	: 변수 i는 for문의 제어에 사용되는 변수이기 때문.
 	
 	int tmp = i;	//i의 값을 다른 변수에 저장한다.
 	
 		tmp		tmp%10		tmp%10%3		tmp=tmp/10
 		97		7			1				9 = 97/10
 		9		9			0				0 = 9/10
 
 	: 두번 쨰 반복에서만 if문의 조건식 tmp%10%3==0 && tmp%10!=0을 만족, 짝 출력
 	: tmp%10!=0	끝자리 식
 	: tmp%10%3==0 끝자리가 3의 배수인지 확인 하기 위한것, 이식은 tmp%10의 값이 0일때도 참이므로
 	  tmp%10 != 0 식을 &&로 연결해서 tmp%10의 값이 0인 경우를 제외 해야한다.
  
 */







//[예제 4-29]
package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch9_DoWhile2_짝369게임 {

	public static void main(String[] args) {
		for(int i =1; i<=100; i++) {
			System.out.printf("i=%d", i);
			int tmp = i;

		
		do {
			if(tmp%10%3==0 && tmp%10!=0)	//tmp%10 이 3의 배수인지 확인 (0제외)
				System.out.print(" 짝");
		}//end do
			while ((tmp/=10)!=0);		//tmp /=10은 tmp = tmp /10과 동일
				System.out.println();
		
		}//end for			
		

	}//end main

}//end class
