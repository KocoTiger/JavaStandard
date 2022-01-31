//변수 - 변수의 선언과 할당

package org.opentutorials.variables;

public class IntegerDemo {

	public static void main(String[] args) {
		int a; //int : 데이터의 형식 (지금은 숫자라고 생각하자/interger)  a : 변수의 이름 
		a = 1; //a는 1이라고 명해줌. 강제로 지정. 다른 숫자 넣어도 compile되지 않음.
		System.out.println(a+1); //2 출력

		//변수
		// (주석 다는 법 : //후 아무말이나 써도 됨. Compiler는 이것을 무시)
		
		a = 2;
		System.out.println(a+1); //3 출력
		
		//세미콜론(;)은 하나의 구문이 끝났음을 명시적으로 나타내는 기호다. 다음처럼 한줄에 여러구문을 사용하고 싶을 때 세미콜론이 유용하다.
        //int a; a = 1; System.out.println(a+1); //2
        //a = 2; System.out.println(a+1); //3
        //자바에서는 세미콜론을 생략할 수 없다.
	}

}
