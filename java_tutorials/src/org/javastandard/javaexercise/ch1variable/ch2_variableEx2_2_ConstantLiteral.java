/*p.30~35
2.2 상수와 리터럴 (constant & literal)
# 상수 (항상상 자를 쓴다!/변하지 않은 수)
: 	  변수와 마찬가지로 값응 저장할 수 있는 공간이지만
중요!  변수와는 다르게! 한번 값을 저장하면 다른 값으로 변경 불가능.
  	  상수 선언 하는 방법은 변수와 동일 하지만,
중요!  변수의 타입 앞에 키워드 final을 붙여 주면 됨.

		final int MAX_SPEED = 10; //상수 MAX_SPEED를 선언 및 초기화

중요! 상수는 반드시 선언과 동시에 초기화해야함 (이후부턴 상수 값을 변경하는 것이 허용되지 않음
[참고] JDK1.6이후 부터는 상수를 선언과 동시에 초기화 하지 않아도 됨. 사용하기 전에만 하면 되게 바꿈
	  하지만 상수는 선언과 동시에 초기화하는 습관을 가져라
	  
		final int MAX_SPEED;		//에러. 상수는 선언과 동시에 초기화 해야함
		final int MAX_VALUE = 100;	//ok. 선언과 동시에 초기화 했음
		MAX_VALUE = 200;			//에러. 상수의 값은 변경될 수 없음
중요!		상수의 이름은 모두 대문자!로 하는 것이 관례.여러 단어로 이루지면 _로 구분		

#리터럴 (literal) <- 상수

		변수 (variable) : 하나의 값을 저장하기 위한 공간
		상수 (constant) : 값을 한번만 저장할 수 있는 공산
		리터럴 (literal) : 그 자체로 값을 의미하는 것

# 상수가 필요한 이유?
	int triangleArea = (20 * 10) / 2   //삼각형의 면적을 구하는 공식
	int triangleArea = 20 * 10		   //사각형의 면적을 구하는 공식

보다 복잡한 공식이라면,

	final int WIDTH = 20;		//길이
	final int HEIGHT = 10;		//높이

	int triangleArea = (WIDTH * HEIGHT) / 2;		//삼각형의 면적을 구하는 공식
	int triangleArea = WIDTH * HEIGHT;				//사각형의 면적을 구하는 공식

이전 코드에 비해, 면적을 구하는 공식의 의마가 명확해짐.
다른 값으로 계산시, 여러곳 수정 필요 없이 상수의 초기화만 다른 값으로 해주면 된다.
이처럼 리터럴에 '의미있는 이름'을 붙여 코드의 이해와 수정을 쉽게 만듬.

#리터럴의 타입과 접미사
: 변수에 타입이 있는 것처럼, 리터럴에도 타입이 있다.

- 변수의 타입 : 저장될 '값의 타입'(리터럴 타입)에 의해 결정됨
		   : 만일 리터럴에 타입이 없다면 변수의 타입도 필요 없을 것.

	 종류				       리터럴					   접미사
	논리형		  false,true 		    			없음
	정수형		123,0b0101, 077, 0xFF, 100L			L
	실수형		3.14, 3.0e8, 1.4f, 0x1.0p-1			f,d
	문자형		'A', '1', '\n'						없음
	문자열		"ABC", "123"						없음
				[표2-6] 리터럴과 접미사 참고

- long타입의 리터럴에 접미사 1 or L을 붙임 (접미사 없으면 int타입의 리터럴)
- byte와 short타입의 리터럴 : 별도로 존재하지 않다. (int타입의 리터럴 사용)
- 10진수 외에도 2, 8, 16진수로 표현된 리터럴을 변수에 저장할 수 있다.
- 16진수라는 것을 표시하기 위해 리터럴 앞에 0x or 0X
- 8진수의 경우에는 0을 붙임.
[참고] 2진 리터럴은 JDK 1.7부터 추가
	  접두사 0x, 0X, 0b, 0B의 0은 숫자
	  
	  int pctNum = 010;		//8진수 10, 10진수로는 8
	  int hexNum = 0x10;	//16진수 10, 10진수로는 16
	  int binNum = 0b10;	//2진수 10, 10진수로는 2

- JDK1.7부터 정수형 리터럴의 중간에 구분자 _ 넣을 수있게 됨 (큰숫자를 편하게 읽을 수 있게 됨)
	
	long big = 100_000_000_000L;		//long big = 100000000000L;
	long hex = 0xFFFF_FFFF_FFFF_FFFFL;	//long hex = FFFFFFFFFFFFFFFFL;
	
- 실수형에서는 f또는 F 접미사
- 실수형 double에서는 d 또는 D 접미사

			float pi = 3.14f;		//접미사 f or F사용 가능
 			double rate = 1.1618d;	//저미사 d or D사용 가능
 - 정수형에서는 int가 기본형인것 처럼
   실수형에서는 double이 기본이기때문에 접미사 d 생략 가능.(실수형 리터럴인데 접미사 가 없다면 double타입이라는 것)

			float pi = 3.14; 		//에러. float타입변수에 double타입 리터럴 저장 불가 (3.14f같이 접미사 f를 붙이면 ok)
			double rate = 1.1618;	//OK. 접미사 d는 생략 가능
- 접미사는 대 소문자 구분하지않는다.
  하지만! 소문자 ㅣ 의 경우, 숫자 1과 헷깔리기 쉬움
  		대문자 L로 사용하는 것이 좋다.
[참고] 리터럴에 접미사가 붙는 타입 3가지 (long, float, double)
	  double은 생략 가능. 2가지 타입(long, float)만 신경 쓰면 된다.

- 리터럴에 소수점이나 10의 제곱을 나타내는 기호 E또 e, 그리고 접미사 f,F,d,D를 포함하고 있으면 실수형 리터럴도 간주
		자료형			리터럴			다른형태의 동등한 표현
		double			10.				10.0
		double			.10				0.10
		float			10f				10.0f
		float			3.14e3f			3140.0f
		double			1e1				10.0
		double			1e-3			0.001
		
- 참고로 잘 쓰이지는 않지만 기호 p를 이용, 실수 리터럴을 16진 지수형태로 표현 가능
  p는 2의 제곱의 의미.
  					왼쪽 (16진수)	 p 	오른쪽(10진 정수)
  p는 대 소문자 가능, p가 가 포함된 리터럴은 실수형

     0x1p1		=	(1x16의 0승) x 2의 1승		=		1.0 x 2		=	20
     0x0.2p-1	=	(2x16의 -1승) x 2의 -1승	= 		0.125 x 0.5	=	0.0625
     0x12p3		=	(1x16의 1승 + 2x16의 0승	=		(16+2) x 8 	=	144.0
     
# 타입의 불일치
- 리터럴의 타입이 저장될 변수의 타입과 일치하는 것이 보통
  타입이 달라도 저장범위가 넓은 타입에 조은 타입의 값을 저장하는 것 가능
		int i = 'A'			//ok. 문자'A'의 유니코드인 65가 변수 i에 저장된다.
		long 1 = 123;		//ok. int보다 long타입이 더 범위가 넓다.
		double d = 3.14f	//ok. float보다 double타입이 더 범위가 넓다.
		
그러나! 리터럴의 값이 변수의 타입의 범위를 넘어서거나, 리터럴의 타입이 변수의 타입보다 저장범위가 넓으면 컴파일 에러가 발생.
		int i = 0x1234567;		//에러. int타입의 범위를 넘는 값을 저장
		float f = 3.14;			//에러. float타입보다 double타입의 범위가 넓다.
[참고]float는 접미사나 정밀도 등 신경쓸것이 많다. 이런 것들이 귀찮다면 그냥 double을 사용하자.

- byte, short 타입의 리터럴은 따로 존재하지 않는다. int타입의 리터럴을 사용.
  단, short타입의 변수가 저장할 수 있는 범위에 속해야함.
		byte b = 65;			//ok. byte타입에 저장 가능한 범위의 int타입 리터럴
		short s = 0x12334;		//ok. short타입에 저장 가능한 범위의 int 타입의 리터럴
- 각 타입의 저장범위만 알면 충분히 판단 가능 내용.
  값의 크기에 상관없이 double타입의 리터럴을 float타입의 변수에 저장할 수 없다는 것만 주의 해서 보자.
  
# 문자 리터럴과 문자열 리터럴
		'A' = 문자 리터럴		두문자 이상 "AB" = 문자열 리터럴
[참고] 문자열 = 문자의 연속된 나열 -> 영어로 string

		char ch = 'J';				//char ch = 'Java'; 이렇게 할수 없다.
		String name = "Java" 		//변수 name에 문자열 리터럴 "Java"를 저장
- char은 단 하나의 문자만 저장
  여러 문자열을 저장하기 위해선 String타입을 사용 해야함
  문자열 리터럴은 ""안에 문자 넣지않는 것을 허용 => (빈문자열, empty string)
  but! 문자 리터럴은 반드시 '' 안에 문자가 있어야함
  			String str = "";		//ok. 내용이 없는 빈 문자열
  			char ch = '';			//에러. ''안에 반드시 하나의  문자 필요
  			char ch = ' ';			//ok. 공백문자 (blank)로 변수 ch 를 초기화
 
 - 원래 String은 클래스
   아래와 같이 객체를 생성하는 연산자 new를 사용해야하지만
   특별히 위와 같은 표현도 허용.
   			String name = new String("Java");	//String객체를 생성
   			
- 덧셈연산자를 이용, 문자열을 결합 가능

			String name = "Ja" + "va";		//name은 "Java"
			String str = name + 8.0;		//str은 "Java8.0"
			
- 기본형과 참조형의 구별없이 어떤 타입의 변수도
  문자열과 덧셈연산을 수행하면 그 결과 문자열이 됨.
  
  			문자열 + any type -> 문자열 + 문자열 => 문자열
  			any type + 문자열 -> 문자열 + 문자열 => 문자열
  			
- 예를 들어 7+"7"을 계산 할때, 7이 String이 아니므로, 먼저 7을 String으로 변환한 다음
	"7" + "7"을 수행하여 "77"을 결과로 얻는다.

	ex>
			"" + 7 -> "" + "7" -> "7" 		//빈 문자열을 더해서 숫자를 문자열로 변환.
			7 + "" -> "7" + "" -> "7"		
			
			7+ " " -> "7" + " " -> "7 "
			" " + 7 -> " " + "7" -> " 7"

			7 + "7" -> "7" + "7" -> "77"
			
			7 + 7 +"" -> 14 + "" -> "14" + "" -> "14"
			"" + 7 + 7 -> "7" + 7 -> "7" + "7" -> "77"
			
			true + "" -> "true" + "" -> "true"
			null + "" -> "null" + "" -> "null"
		- 덧셈 연산자는 왼->오 방향으로 연산 수행 (결합순서에 따라 경과가 달라짐)
		  7과 같은 기본형 타입의 값을 문자열로 변환할 때는 아무런 내용도 없는
		  빈문자열 ""을 더해주면 된다.

 */


//[예제 2-3] ch2/StringEx.java

package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_2_ConstantLiteral {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str + "\t");
		
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}//end main

}//end class
