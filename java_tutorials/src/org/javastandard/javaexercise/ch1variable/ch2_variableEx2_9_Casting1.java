/* p. 74 ~75
#5. 형변환
	#5.1 형변환 (캐스팅, casting)이란?
	: 서로다른 타입간 연산을 수행해야하는 경우가 있다. 이럴때 타입을 일치 시켜야함.
 	: 변수나 리터럴의 타입을 다른 타입으로 변환하는 것
 	
 		형변환, 변수 또는 상수의 타입을 다른 타입으로 변환 하는 것.
 	ex>
 	int 타입의 값과 float타입의 값을 더하는 경우
 	두 값을 같은 타입으로 즉, 둘다 float타입으로 변환한 다음에 해야함.
 		int < long < float < double

 	#5.2형변환 방법
 					(타입) 피연산자
 	여기서()는 캐스트 연산자 or 형변환 연산자 => 형변환을 캐스팅이라함
 	ex> 
 				double d = 85.4;
 				int score = (int)d; 	//double타입의 변수 d를 int타입으로 형변환
 	두번째 줄의 연산과정을 단계별로 보면
 	int score = (int)d;
 	int score = (int)85.4;		//변수 d의 값을 읽어 와서 형변환
 	int score = 85;				//형변화의 결과인 85를 변수 score에 저장
 	- 형변환 연산자 : 그저 피연산자의 값을 읽어서 지정된 타입으로 형변환 하고 그 결과를 반환할 뿐임
 	- 피연산자인 변수 d의 값은 형변환 후에도 아무런 변화가 없다.
 	
 */










//예제 2-12/Castingex1.java p. 75
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_9_Casting1 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score="+score);
		System.out.println("d="+d);
	}

}
//결과값 : 
//	score=85
//	d=85.4	 <--- 형변환 후에도 피연산자에는 아무런 변화가 없다.
/*
#기본형에서 boolean을 제외한 나머지 타입들은 서로 형변환 가능
중요! 기본형과 참조형간의 형변환 불가


			변환				수식				결과
			int->char		(char)65		'A'
			char->int		(int)'A'		65
			float->int		(int)1.6f		1
			int->float		(float)10		10.0f





 */

