/* p~36~38 중간
  2.3 형식화된 출력 = printf()
- 그동안 println() <- 사용하긴 편하지만 
  변수의 값을 그대로 출력 (값을 변환하지 않고는 다른 형식으로 출력 불가)
  
  같은 값이라도 다른 형식으로 출력하고 싶을때,
  	ex> 소수점 둘째 자리까지만 출력, 정수를 16진수 or 8진수로 출력
  	-> printf 사용

  printf()는 지시자(spectifier)를 통해 변수의 값을 여러가지 형식으로 변환 출력 기능 가짐.
  	ex> 정수형 변수에 저장된 값을 10진 정수로 출력할때
  		지시자 %d를 사용
  		변수의 값을 지정된 형식으로 변환, 지시자대신 넣는다
  	ex> int타입 변수, age의 값이 14, print()는 지시자 %d 대신 14를 넣어서 출력
  	
  		System.out.printf("age:%d", age);
  		System.out.printf("age:%d", 14);
  		System.out.printf("age:14");		//"age:14"가 화면에 출력
  -	만일 출력하려는 값이 2개라면, 지시자도 2개 사용
  -	출력될 값과 지시자의 순서는 일치해야 함.
  - 3개이상의 값도 지시자를 지정해서 출력 할 수 있다. (개수의 제한은 없다)
  		System.out.printf("age:%d", "year:%d", 14, 2014);
  		결과 값 : age:14year:2014
  		
- println()과는 달리 printf()는 출력후 줄바꿈 하지 않음
[참고] 줄바꿈 지시자 : %n, \n  (os마다 줄바꿈 문자가 다를 수 있기 때문 %n을 사용하는 것이 안전)

		System.out.printf("age:%d", age); //출력 후 줄바꿈을 하지 않는다.
		System.out.printf("age:%d%n", age); //출력 후 줄바꿈을 한다.

- printf()의 지시자 중, 자주 사용 되는 것들

		지시자					설명
		%b					불리언 (boolean)
		%d					10진수 (decimal integer)
		%o					8진수 (octal integer)
		%x, %X				16진수 (hexadecimal integer)
		%f					10진수 (decimal float)
		%e, %E				지수형태표현 (exponent)				
		%c					문자 (character)
		%s					문자열 (string)

 */


//예제 2-4/ch2/printfEx1.java
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_3_printf1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;  //long hex : 0xFFFFFFFFFFFFFFFFL;
		
		int octNum = 010;			//8진수 10, 10진수로는 8
		int hexNum = 0x10;			//16진수 10, 10진수로는 16
		int binNum = 0b10;			//2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		//System.out.printf("c=%d%n", c); //이렇게 넣으면 에러 떠서 나머지 다 안나옴
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);	//'#'은 접두사 (16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum );
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

	}//end main

}//end public


//실행 결과 : 
//	b=1
//	s=2
//	c=A, 65 
//	finger=[   10]
//	finger=[10   ]
//	finger=[00010]
//	big=100000000000
//	hex=0xffffffffffffffff
//	octNum=10, 8
//	hexNum=10, 16
//	binNum=10, 2

/*
정수형 값을 printf()로 출력하는 예제
	정수값 출력할때 지시자 %d사용
	출력되는 값이 차지할 공간을 숫자로 지정할 수 있다.
	<여러값을 여러 줄로 간격 맞춰 출력할 떄 꼭 필요한 기능>
	
	아래의 결과를 보면 0과 - 가 어떤 역할 하는지 알수 있음.
		System.out.printf("finger=[%5d]%n", finger); finger=[   10]
		System.out.printf("finger=[%-5d]%n", finger); finger=[10   ]
		System.out.printf("finger=[%05d]%n", finger); finger=[00010]

	지시자 %x 와 %o에 
	#을 사용사면 접두사 0x와 0이 각각 붙는다.
	%X는 16진수에 사용되는 접두사와 영문자를 대문자로 출력한다. (X를 대문자로 쓰면)
		
		System.out.printf("hex=%x%n", hex);		//hex=ffffffffffffffff
		System.out.printf("hex=%#x%n", hex);	//hex=0xffffffffffffffff
		System.out.printf("hex=%#X%n", hex);	//hex=0XFFFFFFFFFFFFFFFF

	10진수를 2진수로 출력해주는 지시자는 없다.
	정수를 2진 문자열로 변환해주는
	Integer.toBinaryString(int i)를 사용
	이 메서드는 정수를 2진수로 변환해서 문자열로 반환-> 지시자 %s를 사용
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

	<C언어와의 차이점>
	C언어에서는 char타입의 값을 지시자 %d로 출력할 수있지만,
	자바에서는 허용이 되지 않는다!
	아래와 같이 int타입으로 형변환 해야만 %d로 출력 가능.
		System.out.printf("c=%c, %d %n", c, (int)c);	//형변환이 꼭필요. (%d로 출력위해)

 */

















