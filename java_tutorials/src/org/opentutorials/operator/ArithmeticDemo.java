//연산자
/*
 * 연산자(演펴다연 算계산산 子, operator)란 특정한 작업을 하기 위해서 사용하는 기호를 의미한다.
 *  작업의 종류에 따라서 대입 연산자, 산술 연산자, 비교 연산자, 논리 연산자 등이 있다. 
 *  이번 수업에서는 가장 기초적인 연산자에 대해서 알아보고, 
 *  여기서 다루지 않는 연산자들은 각 연산자가 실제로 사용되는 맥락에서 차차 알아보겠다.
 * 
 * 대입연산자 : =
 * 산술 연산자 : + - * / %(나머지)
 * 비교 연산자 : 추후
 * 논이 연산자 : 조건문에서 추후
 * 
(산술 연산자)
+	더하기
-	빼기
*	곱하기
/	나누기
%	나머지
노란색으로 표시된 부분이 프로그래밍과 수학의 기호가 다른 연산자들이다.  연산자들의 사용법을 예제를 통해서 알아보자
 */

package org.opentutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// result 의 값은 3
        int result = 1 + 2;
        System.out.println(result);
  
        // result 의 값은 2
        result = result - 1;
        System.out.println(result);
  
        // result 의 값은 4
        result = result * 2;
        System.out.println(result);
  
        // result 의 값은 2
        result = result / 2;
        System.out.println(result);
  
        // result 의 값은 10
        result = result + 8;
        // result 의 값은 3
        result = result % 7;
        System.out.println(result);
		
		/*
		 결과는 아래와 같다.
		 3
		 2
		 4
		 2
		 3
		연산자 중에 다소 난이도가 있는 나머지에 대해서 알아보자.
		  		 
		 */
		// 연산자 중에 다소 난이도가 있는 나머지에 대해서 알아보자. (나머지 부분을 알아보려함)
        // RemainerDemo쪽으로 이동
        
		
		

		
		
		
		
	}

}
