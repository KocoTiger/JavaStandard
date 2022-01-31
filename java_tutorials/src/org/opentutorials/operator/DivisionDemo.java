//이항 연산자
//데이터의 형변환과 연산자가 결합된예제

/*그럼 조금 복잡한 사례를 접해보자. 
자바는 데이터 타입이 있기 때문에 같은 숫자임에도 정수와 실수라는 형식이 존재한다. 
그럼 타입별로 나누기한 결과는 어떻게 될까?
*/
package org.opentutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a = 10;
	        int b = 3;
	          
	        float c = 10.0F;
	        float d = 3.0F;
	          
	        System.out.println(a/b);
	        System.out.println(c/d);
	        System.out.println(a/d);
		
	        /*
	        결과는 다음과 같다.

3
3.3333333
3.3333333
첫 번째 결과는 정수와 정수를 나눈 것이다. 3은 나머지의 몫이고, 나머지는 버려졌다. 정수는 소수점을 표현할 수 없으므로 정수만 표시된 것이다.

세 번째 결과는 정수에서 실수를 나눈 것이다. 이 경우 암시적으로 형 변환이 일어나기 때문에 정수가 실수가 된다.
	        
	        
	        
	         */
		
		
		
	}

}
