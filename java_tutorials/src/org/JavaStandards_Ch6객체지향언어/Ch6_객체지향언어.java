/*p.230 ~

#1. 객체지향언어
##1.1 객체지향언어의 역사
##1.2 객체 지향언어
	: 1. 코드의 재사용성이 높다.
		- 새로운 코드를 작성할 때 기존의 코드를 이용하여 쉽게 작성할 수 있다.
	  2. 코드의 관리가 용이하다
	  	- 코드간의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할 수 있다.
	  3. 신뢰성이 높은 프로그래밍을 가능하게 한다.
	    - 제어자와 메서드를 이용해서 데이터를 보호하고 올바른 값을 유지하도록 하며,
	      코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지 할 수 있다.
#2. 클래스와 객체
##2.1 클래스와 객체의 정의와 용도
	: 클래스의 정의 - 클래스란 객체를 정의해 놓은 것
	: 클래스의 용도 - 클래스는 객체를 생성하는데 사용.

	: 객체의 정의 - 실제로 존재하는 것. 사물 또는 개념
	: 객체의 용도 - 객체가 가지고 있는 기능과 속성에 따라 다름
	: 유형의 객체 - 책상, 의자, 자동차, TV와 같은 사물
	: 무형의 객체 - 수학공식, 프로그램 에러와 같은 논리나 개념
##2.2 객체와 인스턴스
				인스턴스화(객체를 만드는 과정)
	: 클래스 -----------------------------> 인스턴스(객체)
##2.3 객체의 구성요소 - 속성과 기능
	: 속성(property) - 멤버변수(member variable), 특성(attribute), 필드(field), 상태(state)
	: 기능(function) - 메서드(method), 함수(function), 행위(behavior)

	: 속성(property) -> 멤버변수(variable)
	: 기능(fuction) 	-> 메서드	(method)
	: 채널			-> int channel
	: 채널 높이기		-> channelUp(){...}

#2.4 인스턴스의 생성과 사용
	: 클래스명 변수명; 			//클래스의 객체를 참조하기 위한 참조변수를 선언
	: 변수명 - new 클래스명();	//클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장

	: Tv t;					// Tv클래스 타입의 참조변수 t를 선언
	: t = new Tv();			// Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
[예제 6-1]








 */


package org.JavaStandards_Ch6객체지향언어;

public class Ch6_객체지향언어 {

	class Tv{
		//Tv의 속성 (멤버변수)
		String color;			//색상
		boolean power;			//전원상태 (on/off)
		int channel;			//채널
		
		//Tv의 기능(메서드)
		void power() {power = !power;}	//TV를 켜거나 끄는 기능을 하는 메서드
		void channelUp() {++channel;}	//TV의 채널을 높이는 기능을 하는 메서드
		void channelDown() {--channel;}	//TV의 채널을 낮추는 기능을 하는 메서드
	}
	
	class TvTest{	
		public static void main(String args []) {
//[예제 6-1]
			Tv t;				//Tv인스턴스를 참조하기 위한 변수 t를 선언.
			t = new Tv();		//TV인스턴스를 생성
			t.channel = 7;		//Tv인스턴스의 멤버변수 channel의 값을 7로 한다
			t.channelDown();	//Tv인스턴스의 메서드 channelDown()을 호출한다.
			System.out.println("현재 채널은 "+ t.channel + " 입니다.");

			class Tv{
				//Tv의 속성 (멤버변수)
				String color;			//색상
				boolean power;			//전원상태 (on/off)
				int channel;			//채널
				
				//Tv의 기능(메서드)
				void power() {power = !power;}	//TV를 켜거나 끄는 기능을 하는 메서드
				void channelUp() {++channel;}	//TV의 채널을 높이는 기능을 하는 메서드
				void channelDown() {--channel;}	//TV의 채널을 낮추는 기능을 하는 메서드
			}
			
			
		}
	}
}

/*
		인스턴스는 참조변수를 통해서만 다룰 수 있으며, 
		참조변수의 타입은 인스턴스의 타입과 일치해야 한다.



 */


