//조건문

/*
 '비교 수업'에서 비교 연산의 결과로 참(true)이나 거짓(false)을 얻을 수 있다고 배웠다. 
 불린은 조건문에서 핵심적인 역할을 담당하는데 이 불린 값을 기준으로 실행 흐름을 제어하기 때문이다.
 
 조건문이란 주어진 조건에 따라서 애플리케이션을 다르게 동작하도록 하는 것으로 프로그래밍의 핵심 중의 하나라고 할 수 있다.
  */




package org.opentutorials.javatutorials.condition;

public class Condition1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//조건문의 문법		
		
		/*
		 프로그래밍에서 문(文, Statements)은 문법적인 완결성을 가진 하나의 완제품이라고 할 수 있다.
		 if문, for문, while문등이 여기에 해당한다. 
		 절(節마디절, clause)은 문(statements)를 구성하고 있는 부품이라고 할 수 있다. 
		 곧 배우게 된다. 물론 이러한 문법적인 개념은 이해를 돕기 위한 것일 뿐 암기해야 할 것은 전혀 아니다.
		 
		 */

//if -> if(true or false만 들어올 수 있다.)
/*
 조건문은 if로 시작한다. 
 아래 그림을 보자. 
 if 뒤의 괄호를 if절이라고 부르고, 중괄호가 감싸고 있는 구간을 then 절이라고 부르겠다. 
 조건문에서는 if 절의 값이 true일 때 then 절이 실행된다. 
 if 절이 false이면 then 절은 실행되지 않는다.
 
 if(true or false){ if 절
                    then절 
 }
 
 */

		
		/*아래 예제의 실행결과는 'result : true'다. if 뒤에 True가 왔기 때문이다. 
		  아래의 실행 결과는 화면에 result : true를 출력한다.
		 */
		//if(true){
        //    System.out.println("result : true");
        //}
		
		//다음 예제는 아무것도 출력하지 않을 것이다. if절이 false이기 때문이다.
		/*
		 if(false){
    System.out.println("result : true");
}
		 
		 */
			
		
	}

}
