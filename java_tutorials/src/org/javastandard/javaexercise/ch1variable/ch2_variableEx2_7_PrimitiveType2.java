/* p. 56~57
# 특수 문자 다루기
	영문자 외에 tab이나 backspace등의 특수 문자를 저장하려면
		char tab = '\t';		//변수tab에 탭 문자를 저장
	- '\t' : 탭,tab을 의미
		   : 두 문자로 이루어져 있지만 한 문자
		   특수문자						문자 리터럴
		 tab						\t
		 backspace					\b
		 form feed					\f
		 new line					\n
		 carriage return			\r
		 역슬래쉬(\)					\\
		 작은 따옴표					\'
		 큰따옴표						\"
		 유니코드(16진수)문자  			\u 유니코드 (예: char a='\u0041')
			[표2-12]	특수문자를 표현하는 방법


 */





//예제 2-8, SpecialCharEx.java
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_7_PrimitiveType2 {

	public static void main(String[] args) {
		System.out.println('\'');				//'''처럼 할수 없다.
		System.out.println("abc\t123\b456");	// \b에 의해 3이 지워진다.
		System.out.println('\n');				//개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");		//큰따옴표를 출력하려면 이렇게 한다
		System.out.println("c:\\");

	}

}

//결과값 :
//	'
//	abc	123456
//
//
//	"Hello"
//	c:\

	