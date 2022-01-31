//이항 연산자
//연산자 더하기

// + 연산자는 숫자와 숫자를 더할 때 사용되지만, 문자열과 문자열을 결합할 때도 사용된다. 아래의 예제를 보자.


package org.opentutorials.operator;

public class ConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String firstString = "This is";
	        String secondString = " a concatenated string.";
	        String thirdString = firstString+secondString;
	        System.out.println(thirdString);
		
		// 결과는 다음과 같다.
	    // This is a concatenated string.
		
		
		
	}

}
