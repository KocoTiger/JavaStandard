/* p.57 ~61

# char타입의 표현 방식
	char타입의 크기
	:2 byte (=16bit)
	: 16자리의 2진수로 표현할 수 있는 정수의 개수 = 65536개 (=2의 16승)
	: char형 변수는 이 범위 내의 코드 중 하나를 저장 가능.
	ex> 문자 A를 저장하면 2진수 0000_0000_0100_0001(2) = 65(10)

	- char타입은 문자를 저장할 변수를 선언 하기 위한 것
	- 실제로 char타입의 변수에는 문자가 아닌 문자의 유니코드가 저장 (표현형식 = 정수형과 동일)
	- 정수형과 달리 음수를 나타낼 필요가 없다.
	- 표현할 수 있는 값의 범위가 다름
	:2 byte (=16bit)
	: 16자리의 2진수로 표현할 수 있는 정수의 개수 = 65536개 (=2의 16승)
	:이므로 65536개의 값을 표현 가능
	: char 유니코드는 모두 양수 (0포함)
	: 0~65535의 범위를 가짐 (정수형인 short 는 절반을 음수표현에 사용 -32768 ~32767의 범위

		16bit로 표현할 수 있는 정수의 개수 : 2의16승개 (65536개)
				short 타입의 표현범위 	: -2의 15승 ~ 2의15승 -1 (-32768 ~ 32767)
			 	char 타입의 표현범위	: 0~ 2의16승-1		   (0~65535)
	
			char ch = 'A';		//chr ch = 65;
			short s = 65;

	-하지만, 두변수의 값을 출력해 보면 결과가 다름.
	- println()
	 : 변수의 타입이 정수형이면 변수에 저장된 값을 10진수로 해석 및 출력
	 : 문자형이면 저장된 숫자에 해당되는 유니코드 문자를 출력함.
	 
	 		System.out.prinln(ch);	//A가 출력
			System.out.prinln(s);	//65가 출력
			
	: 이처럼 값은 어떻게 해석하느냐 결과가 다름.
	: 값만으로는 값을 해석 불가.
	: 값의 타입까지 알아야 올바르게 해석 가능.
	ex> 1231이라는 값이 있을때, 천이백삼십일 or 12월31일 or 12시 31분? 알수 없다.
	
# 인코딩 과 디코딩 (encoding & decoding)
		
				인코딩
		A		 ->			65
				<-			
				디코딩
		문자 인코딩 : 문자를 코드로 변환 (문자 -> 숫자)
		문자 디코딩 : 코드를 문자로 변환 (숫자 -> 문자)
	[참고]encode ~을 코드화하다, ~을 암호화 하다
	# 문자 저장 시
	: 인코딩 -> 숫자로 변환 및 저장
	# 저장된 문자 읽오 올때
	: 디코딩 -> 숫자를 문자로

# 아스키 (ASCII, American Standard Code for Information Interchange)
	: 정보 교환을 위한 미국 표준 코드
	: 128개 (=2의7승)의 문자 집합
	: 7비트 부호

#확장 아스키 (Extended ASCII)와 한글
	: 아스키가 7비트로 1비트가 남아 그 공간을 활용 문자를 추가 => 확장 아스키
	: ISO 국제표준화기구
	: 문자 표현 255개
#코드 페이지 (code page, cp)
	: IBM이 자사의 PC에 확장아스키를 도입해서 사용 할때, PC를 사용하는 지역, 국가에따라 
	  여러버전의 확장 아스키가 필요했음.
	: 이들을 코드 페이지라 하고 CP xxx와 같은 형식으로 이름 붙임.
#유니코드 (Unicode)
	: 전세계의 모든 문자를 하나의 통일된 문자 집합으로 표현하고자 노력 -> 결과가 유니코드
	: 유니코드 인코딩 = UTF-8, UTF-16,UTF-32 등
	: 자바는 UTF-16 사용 (모든 문자를 2byte의 고정크기로 표현)
	
	: UTF-8은 하나의 문자를 1~4byte의 가변크기로 표현
	: 두 코드 모두 아스키의 모두 처음 128문자가 동일 (아스키를 포함)
	: UTF-16은 문자를 다루기 편리,하지만 1byte로 표현할 수 있는 영어 , 숫자가 2byte로 표현 -> 문서 크기 커짐
	: UTF-8 : 영문 숫자 1byte, 한글 3byte 문서의 크기가 작지만 문자의 크기가 가변적, 다루기 어려움
	: 인터넷에서 전송속도가 중요! 문서 크기가 작을 수록 유리! 그래서 -> UTF-8 선호! 






 */



package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_7_PrimitiveType3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
















