/* p. 75 ~79
#5.3 정수형간의 형변환
	: 큰타입에서 작은 타입으로 변환 시,  int(4byte) -> byte타입(1byte)로 변환시 값손실 일어남.
  	: 작은 타입 -> 큰 타입, 반대인 경우는 값손실이 일어나지 않음
  	  (나머지 빈공간은 0 또는 1로 채워짐)
  	: 변환하려는 값이 음수인 경우, 빈공간을 1로 채움 (형변화 후에도 부호를 유지하기 위해)
 [예제 2-13] 자바의 정석 책 참고 (p.76) 
 
#5.4 실수형 같의 형변환
	: 큰타입에서 작은 타입으로 변환 시, 빈공간 0으로 채움 (정수형과 같다)
	: 
 자바의 정석 책 참고 (p.77~79) 
 
 #5.5 정수형과 실수형 간의 형변환
  	: 두 타입은 저장형식이 완전 다름 (복잡)
 	#정수형을 실수형으로 변환
 	: float최대 7자리
 	: int 최대 10자리	-> int를 float로 바꿀 시, 값이 달라질수있음. (float가 8자리에서 반올림해서 7자리로 만듬)
 	: double 최대 15자리
 	
 	#실수형을 정수형으로 변환
 	: int형으로 형변환시, float의 소수점 다 버림 (반올림 없음)
 	
 				실수의 소수점을 버리고 남은 정수가 정수형의 저장범위를 넘는 경우
 				정수의 오버플로우가 발생한 결과를 얻음.
 #5.6 자동 형변환
 	: 경우에 따라 형변환 생략 가능 (형변환이 이루어지지않는건 아님)
 	: 컴파일러가 생략된 형변환을 자동적으로 추가
 	
 		float f = 1234;		//형변환의 생략. float f = (float)1234;와 같음
 	
 	: 변수가 저장할 수있는 값의 범위보다 더 큰값을 저장하려는 경우 형변환 시 에러발생!
 		
 		byte b = 1000;		//에러. byte의 범위 (-128~127)을 넘는 값을 저장
 	
 	에러 메시지 : incompatible types: possible lossy conversation from int to byte
 	
 	: 명시적으로 형변환 해줬을 경우, 프로그래머의 의도적인 것으로 간주하고 에러 발생시키지 않음
 	
 		char ch = (char)1000;		//명시적 형변환. 에러가 발생하지 않는다.
 		
 	: 계산식에 자주 형변환 생략
	  (서로다른 두 타입의 연산, 먼저 타입을 일치시킨 후 연산을 수행, 연산과정에서 형변환이 자동)
	  
	  	int i = 3;
	  	double d = 1.0 + i;			//double d = 1.0 + (double)i;에서 형변환 생략
	  	
	: 서로 다른 두타입간의 덧셈에서 두타입중 표현범위가 더 넓은 타입으로 형변환
	
		double d = 1.0 + i;
 	->	double d = 1.0 + (double)i;		
 	->	double d = 1.0 + (double)3;			//3을 double타입으로 형변환 하면 3.0
 	->	double d = 1.0 + 3.0;				//double과 double의 덧셈결과 타입은 double
 	->	double d = 4.0;						//double + double = double
 	- 자동적으로 발생하는 형변환 -> 산술 변환
 	
 	-자동 형변환의 규칙
 	:			기존의 값을 최대한 보존한 수 있는 타입으로 자동 형변환 된다.
 	
 	1byte		2byte		4byte		8byte		4byte		8byte
 	byte	->	short	->	int		->	long	->	float	->	double
 				char
 	##왼쪽에서 오른쪽으로 형변환시 형변환 연산자를 사용치 않아도 자동으로 형변환
 	##반대로 갈때는 형변환 연산자 사용 해야함 (반드시)
 	## char과 short는 둘다 2byte크기지만 범위가 다르므로, 자동 형변환이 수행될수 없다!
 	   (어느쪽으로도 값 손실이 발생 할 수있음)
 	[참고] 정수형을 실수형으로 형변환하는 경우, 정밀도의 한계로 인한 오차가 발생할수 있다.
 	
 	[요약]
 			1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능
 			2. 기본형과 참조형은 서로 형변환 할 수 없다.
 			3. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만, 값의
 			   범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.
 	[참고] 연습문제는 코드초보스터디에서 pdf로 제공
 
 */










package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_9_Casting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
