/* p. 55 ~56
#4.기본형 (primitive type)

	#4.1 논리형 (boolean)
	논리형 boolean
	: true or false중 하나를 저장
	: 기본값 (default)는 false이다.
	: boolean은 yes/no		on/off등의 논리 구현에 주로 사용
	: true와 false, 두 가지 값만 표현하면 되므로 1bit로 충분하지만
	  자바에서는 데이터를 다루는 최소단위가 byte라 1byte다.
	
	ex> 아래는 power라는 boolean형 변수를 선언, true로 초기화함.
		boolean power = true;		//ok
		boolean power = False;		//에러. 대소문자 구분됨. true or false만 가능
	- 자바에서는 대소문자가 구별
	: TRUE와 true는 다른것으로 간주

	#4.2 문자형 - char
	문자형 char
	: 한가지 자료형밖에 없다.
	:문자를 저장하기 위한 변수 선
	: char타입의 변수는 단 하나의 문자만을 저장
	ex> char타입의 변수 ch를 선언, 문자 'A'로 초기화
		char ch = 'A'		//문자 A를 char 타입의 변수 ch에 저장
	: 위의 문장은 변수에 문자가 저장되는 것 같지만, 문자의 유니코드(정수)가 저장되는 것,
	: 컴퓨터는 숫자밖에 모른다. 문자A의 유니코드는 65. 변수 ch에 65가 저장
	
	그래서 문자 리터럴 대신, 문자의 유니코드를 직접 저장할 수도 있다.
	ex> 두 문장은 동일한 결과를 얻는다.
			char ch = 'A';		//문자 A를 char타입의 변수 ch에 저장
			char ch = 65;		//문자의 코드를 직접 변수 ch에 저장
	만일, 어떤 문자의 유니코드를 알고 싶으면,
	ex>
			int code = (int)ch;		//ch에 저장된 값을 int 타입으로 변환하여 저장
	- 어떤 타입 (type,형) -> 다른 타입으로 변환 -> 형변화 (캐스팅, casting)이라 함.
	
	[예제 2-7]CharToCode.java
			char ch = 'A';			//char ch = 65;
			int code = (int)ch;		//ch에 저장된 값을 int타입으로 변환하여 저장
			
			System.out.printf ("%c=%d(%#X)%n", ch, code, code);
			
			char hch = '가';			//char hch = 0xAC00;
			System.out.printf ("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

 
 */


//CharToCode.java
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_7_PrimitiveType1 {

	public static void main(String[] args) {
		char ch = 'A';			//char ch = 65;
		int code = (int)ch;		//ch에 저장된 값을 int타입으로 변환하여 저장
		
		System.out.printf ("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '가';			//char hch = 0xAC00;
		System.out.printf ("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

	}

}

/*
 * 실행 결과:
 * 	A=65(0X41)
	가=44032(0XAC00)

	- 실행 결과를 보면 
	: A의 유니코드 = 65 (16진수로 0x41)
	: 가의 유니코드 = 44032 (16진수로 0xAC00)
	ex> 문자 리터럴 대신 유니코드를 직접 사용 가능
			char hch = 0xAC00;		//char hch = '가'
			char hch = '\uAC00';	//이렇게도 가능
 

 */













