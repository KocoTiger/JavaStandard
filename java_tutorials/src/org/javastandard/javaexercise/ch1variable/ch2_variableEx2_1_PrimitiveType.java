/* p. 28 ~30
2.1 기본형 (primitive type)
 기본형은 8개의 타입(자료형)이 있다.
 
<크게 4가지 타입, 8개의 타입(자료형)>
논리형 : boolean 
	 : ture와 false중 하나를 값으로 가짐, 조건식과 논리적 계산에 사용
	 : 다른 기본형과 연산 불가능
문자형 : char
	 : 문자를 저장하는데 사용, 변수당 하나의 문자만 저장 가능.
	 : 문자를 내부적으로 정수(유니코드)로 저장, 정수형과 별반 다르지 않다.
	 : 정수형 and 실수형과 연산 가능
정수형 : byte, short, int, long
	 : 정수값을 저장하는데 사용. (주로 사용, int, long), 주로 int 사용
	 (int를 주로 사용 하는 이유 : CPU가 가장 효율적으로 처리할수 있는 타입)
	 : byte는 이진 데이터를 다루는데 주로 사용
	 : short는 C언어와의 호환을 위해 추가함.
실수형 : float, double
     : 실수를 저장하는데 사용 (주로 double사용)
- boolean을 제외한 나머지는 서로 연산과 변환이 가능
- 정수형에서 효율적인 실행 보다, 메모리를 절약하려면, byte나 short를 선택
//4개의 정수형(byte, short, int, long)중, int형이 기본자료형 (default data type)이다.
//실수형 (float, double)중에서는 double이 기본 자료형이다.

[기본형의 종류와 크기]
1byte : boolean, byte
2byte : char, short
4byte : int, float
8byte : long, double
 
	#boolean : true, false만 표현 하므로 1byte
	#char : 자바에서 유니코드(2byte 문자체계)를 사용하므로 2byte
	#byte : 크기가 1byte라서 1byte
	#int(4 byte) : 기준으로 짧아서 short (2byte), 길어서 long(8byte). (shoort <-> long)
	#double은 float보다 두배의 크기 (8byte)그래서 double
	- 1byte = 8 bit
	- 정수형(byte, short, int, long)범위 : -2의 n-1승  ~ 2의 n-1승 -1 (n: bit수)
	- 2의 10승 = 1024
	
 
 */


package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_1_PrimitiveType {

	public static void main(String[] args) {
		

	}

}
