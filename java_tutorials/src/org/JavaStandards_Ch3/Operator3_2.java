/*p.109 ~113
4. 비교 연산자
	:비교연산자는 두 피연산자를 비교하는데 사용되는 연산자다.
	:주로, 조건문, 반복문, 조건식에 이용.
	: 연산결과는 true나 false만 나옴.
	: 비교연산자 = 이항 연산자
	: 비교하는 타입이 서로 다를 경우, 자료형의 범위가 큰쪽으로 자동 형변환 후 비교된다 (주의)

	4.1 대소비교 연산자 <  >  <=  >=
	:두 피연산자의 값의 크기를 비교하는 연산자이다. (참 true, 거짓 false)
	:기본형 중에서는 boolean형을 제외한 나머지 자료형에 다 사용가능
	: 참조형에는 사용 불가
	
	비교연산자					연산결과
	>						좌변값이 크면 true, 아니면 false
	<						좌변 값이 작으면 true 아니면 false
	>=						좌변 값이 크거나 같으면 true, 아니면 false
	<=						좌변 값이 작거나 같으면 true, 아니면 false

	4.2 등가 비교 연산자 == , !=
	:두 피연산자의 값이 같은지 또는 다른지를 비교하는 연산자 ! 값!!!!
	: 대소비교 연산자와는 달리, 기본형과 참조형, 즉 모든 자료형에 사용 가능
	: 기본형일때, 변수에 저장되어 있는 값이 같은지를 알수 있음
	: 참조형일때, 객체의 주소값을 저장하기때문에 두 개의 피연산자 (참조변수)가 같은 객체를
	  가리키고 있는지를 알 수 있다.
	: 기본형과 참조형은 서로 형변환이 가능하지 않다.
	  그래서 등가비교 연산자 ==, !=로 기본형과 참조형을 비교할 수 없다.
	  
	비교연산자					연산결과
	==						두값이 같으면, true 아니면 false
	!=						두값이 다르면, true 아니면 false
	
	= : 변수에 값을 저장할 때 사용 (대입연산자)
	== : 두 값이 같은지를 비교
 
 	[주의] >=같이 두개의 기호로 이루어진 연산자는
 	1) => 같이 기호의 순서를 바꾸면 안됨.
 	2) > = 같이 중간에 공백이 있으면 안됨.
 	
 	
 
 
 
 
 
 
 
 */












package org.JavaStandards_Ch3;

public class Operator3_2 {

	public static void main(String[] args) {
//3-21
//		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
//		System.out.printf("'0' == 0 \t %b%n", '0'==0);
//		System.out.printf("'A' == 65 \t %b%n", 'A'==65);
//		System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');
//		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 !='B');
//		
//		값 : 
//			10 == 10.0f 	 true 	//형변환 float로 해줌
//			'0' == 0 	 	 false	//형변환 48==0 
//			'A' == 65 	 	 true	//형변환 
//			'A' > 'B' 	 	 false	//형변환	65 > 66
//			'A'+1 != 'B' 	 false	//형변환	66!=66
//3-22
//		float f = 0.1f;
//		double d = 0.1;
//		double d2 = (double)f; //d2 = 0.01d
//		
//		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
//		System.out.printf("0.1==0.1f   %b%n", 0.1==0.1f);
//		System.out.printf("f=%19.17f%n", f);
//		System.out.printf("d=%19.17f%n", d);
//		System.out.printf("d2=%19.17f%n", d2);
//		System.out.printf("d==f  %b%n", d==f);
//		System.out.printf("d==d2 %b%n", d==d2);
//		System.out.printf("d2==f %b%n", d2==f);
//		System.out.printf("(float)d==f %b%n", (float)d==f);
//		
//				10.0==10.0f true
//				0.1==0.1f   false
//				f=0.10000000149011612
//				d=0.10000000000000000
//				d2=0.10000000149011612
//				d==f  false
//				d==d2 false
//				d2==f true
//				(float)d==f true
//		#float f = 0.1f;	//f에 0.10000000149011612
//		#double d = 0.1;	//d에 0.100000000000001
//p.112 참고

//문자열의 비교 .equals();

//		String str = new String("abc");
//		//equals()는 두 문자열의 내용이 같으면 true, 다르면 false
//		boolean result = str.equals("abc");
//		
//		System.out.println(result);
//		두 문자열을 비교하기 위해서는 equals()라는 메서드를 사용해야한다.
//		비교연산자 : 두 문자열이 완전히 같은지 비교할 뿐, 문자열의 내용이 같다를 비교는 안함
//		String은 클래스 아래와 같이 new를 사용해서 객체를 생성해야함
//		String str = new String("abc");		//String 클래스의 객체를 생성
//		String str = "abc;"					//위의 문장을 간단히 표현
//3-23	
//		String str1 = "abc";
//		String str2 = new String ("abc");
//		
//		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
//		System.out.printf("str1==\"abc\" ? %b%n",     str1=="abc");
//		System.out.printf("str2==\"abc\" ? %b%n",     str2=="abc");
//		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
//		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
//		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
//		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
//
//		"abc"=="abc" ? true
//		str1=="abc" ? true
//		str2=="abc" ? false
//		str1.equals("abc") ? true
//		str2.equals("abc") ? true
//		str2.equals("ABC") ? false
//		str2.equalsIgnoreCase("ABC") ? true
//
//		str2와 abc의 내용이 같은데도 ==로 비교하면 false
//		내용은 같지만 서로 다른 객체
//		그러나 equals는 다른 객체여도 내용이 같으면 false
//		그래서 문자열을 비교시 .equals()를 사용
//		대소문자 구별없이 비교 하고 싶다면, equalsIgnoreCase()
		
		
		
		
		
		
		
		
		

	}

}
