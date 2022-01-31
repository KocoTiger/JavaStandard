//변수와 비교연산자 그리고 조건문

/*
지금까지 배운 부품들을 결합해서 작은 프로그램을 만들어보자.
예제에서 사용할 부품은 변수, 비교연산자, 조건문이다. 
사용자가 입력한 아이디 값을 체크하는 프로그램을 만들어 볼 것이다.
ID의 값으로 egoing을 입력해보고, 다른 값도 입력해보자. 

 */

package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		
		String id = args[0];
        if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
		
        
        /*
위의 프로그램을 실행하기 위해서는 조금 새로운 방법을 사용해야 한다.
파일을 컴파일한 후에 실행할 때 아래와 같이 입력한다.
             	
java LoginDemo egoing


egoing은 Java 앱인 LoginDemo의 입력 값이다.
이 값은 프로그램 내부로 전달된다.
그럼 프로그램에서 이 값을 알아내는 구문은 아래와 같다.
         	

String id = args[0];

우린 아직 배열을 배우지 않았다.
따라서 위의 코드가 무엇인지 정확하게 설명하는 것은 지금 단계에서는 불필요하다.
args[0]가 첫 번째 입력 값(egoing)을 의미한다고만 이해하자.
위의 코드는 입력 값을 문자열 타입의 변수 id에 담고 있다.

사용자가 입력한 데이터가 egoing과 같은지 비교할 때는 아래와 같이
id.equals("egoing")이라는 구문을 사용한다. 
equal은 같다는 의미다. 
즉 사용자가 입력한 값(id)가 "egoing"인지를 확인하는 것이다.
그 결과가 true라면 right가 출력되고, false라면 wrong가 출력될 것이다.


if(id.equals("egoing")){

          
         */
        
        
		
	}

}
