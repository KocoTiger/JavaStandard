/*p.27~28
2. 변수의 타입
# 우리가 주로 사용하는 값(data)의 종류(type)
  크게 	문자	 ,	숫자 (정수, 실수)

-정수 : 123, 0, -100
-실수 : 3.14, -3.0 x 10의 3승
-문자 : 'A', '1', "ABC"

# 자료형 (Data Type)
- 문자형 (chr)
- 정수형 (byte, short, int, long) 등
- 실수형 (float, double) 등

크게 두가지로 나눔, 기본형 and 참조형
- 기본형 변수 : 실제 값(data)을 저장
- 참조형 변수 : 어떤 값이 저장되어 있는 주소!(memory address)를 값으로 가짐.
		   : 자바는 C언어와 달리, 참조형 변수 간의 연산을 할 수없다.
		   : 실제 연산에 사용되는 것은 모두 기본형 변수다.
 [참고] 메모리에는 1byte단위로 일련번호가 붙어있다. 이 번호를 '메모리 주소'or 간단히 '주소'라고한다.
 	   객체의 주소는 객체가 저장된 메모리 주소.

중요!
# 기본형 (primitive type)
 - 논리형 (boolean), 문자형(chr), 정수형(byte, short, int, long), 실수형 (float, double)
   계산을 위한 실제 값을 저장 (모두 8개)

 - 참조형 (reference type)
   객체의 주소를 저장. 8개의 기본형을 제외한 나머지 타입.
   <참조형 변수(참조변수)를 선언 할때, 변수의 타입으로 class의 이름을 사용한다> -> 클래스의 이름이 참조변수 타입이 된다.
   <새로운 클래스를 작성 -> 새로운 참조형 추가>

# 참조변수 선언 방법

	클래스 이름  변수이름;   //변수의 타입이 클래스 이름인 것들은 모두 참조 변수

# Date클래스 타입의 참조 변수 today를 선언
  참조변수는 null 또는 객체의 주소를 값으로 가짐
  참조변수의 초기화는 다음과 같이 선언

  		Date today = new Date(); //Date객체를 생성해서, 그 주소를 today에 저장
  		
[참고] 참조형 변수 null 또는 객체의 주소 (4 byte, 0x0~0xfffff)값으로 갖는다.
	  null은 어떤 객체의 주소도 저장되어 있지 않음을 뜻함.
	  
Q 질문사항: 자료형 (Data Type)과 타입 (Type)의 차이!?
- 기본형 : 저장할 값(data)의 종류에 따라 구분
		 기본형의 종류를 얘기할 때는 -> 자료형 (data type)용어를 쓴다.

- 참조형 : 항상 '객체의 주소'(4byte 정수)를 저장
		 값(data)아닌 객체의 종류에 의해 구분
		 참조형 변수의 종류를 구분할 때는 타입 (Type)용어 사용
 
  
*/





package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_0_VariableType {

	public static void main(String[] args) {


	}

}
