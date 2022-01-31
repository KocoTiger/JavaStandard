/*이스케이프의 개념
		 만약 문자열 안에 큰 따옴표를 넣고 싶다면?
		Egoing said "Welcome Programming World"를 말하고 싶다면
		System.out.println("egoing said "Welcome programming world"");
		로 친다면 에러가 뜸.
		역슬래쉬 \의 개념, 달러 표시로도 나옴
		("문자열 시작egoing said \"문자열 끝이아닌 단순한 문자열 따옴표로 인식 Welcome programming world\"단순한 문자열로 해석"문자열의 끝으로 인식)
		
		Egoing said (줄 바꿔서) 
		"Welcome Programming World"를 말하고 싶다면 줄바꾸고 싶은 구간에\n을 추가
		System.out.println("egoing said\n \"Welcome programming world\"");
		*/

package org.opentutorials.numberstring;

public class ChrString {

	public static void main(String[] args) {
		System.out.println("egoing said\n \"Welcome \n programming world\"");
		
		/*문자 : character
		문자열 : String
		문자 : ' '
		문자열은 : " "
	    cf> " "는 문자, 문자열 둘다 포함 하는 개념 <A문자 + B문자>= AB 문자열
		 A는 문자열 이라는 개념도 가능
		+ - * / : 연산자 
		*/
		
        /* 문자와 문자를 연산자(+)를 이용하여 말을 만들기도 가능
		 System.out.println(1+1);은 2로 값이 나온다.
		하지만 System.out.println("1"+"1");는 11이 나온다.
		문자와 문자를 쭉 나열하는 개념이기때문이다.
		*/
		



		 
		
	}

}
