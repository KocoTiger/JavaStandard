/* p.97 ~109
#3. 산술 연산자
	# 		+ - *  / 와 나머지 연산자 %
 		##우선 순위
 		- 먼저 실행 *  /  %			나중에 실행 + -
 		- 피연산자가 정수형인 경우, 나누는 수로 0을 사용할 수 없다.
 		  0으로 나누면 에러가 발생
 
 	#		NaN = not a number를 줄인것임. 숫자가 아니란뜻.
 	[표3-6참고]	피 연산자가 유한수가 아닌 경우의 연산결과

 3.2 나머지 연산자 %
 	# 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 결과로 반환하는 연산자
 	1) 나눗셈과 다른점 : 나누는 수(오른쪽 피연산자)로 0을 사용할 수 없다
 	2) 피연산자로 정수만 허용한다.
  	3) 나머지 연산자는 짝수, 홀수, 배수 검사등에 주로 사용!

밑에 예제 참고 3-19~3-20
  
  
 
 */












//예제 3-5~
package org.JavaStandards_Ch3;

public class Operator3_1 {

	public static void main(String[] args) {
////예제 3-5
//		int a = 10;
//		int b = 4;
//		
//		System.out.printf("%d + %d = %d%n", a, b, a+b);
//		System.out.printf("%d - %d = %d%n", a, b, a-b);
//		System.out.printf("%d * %d = %d%n", a, b, a*b);
//		System.out.printf("%d / %d = %d%n", a, b, a/b);
//		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
//		
//		10 + 4 = 14
//				10 - 4 = 6
//				10 * 4 = 40
//				10 / 4 = 2
//				10 / 4.000000 = 2.500000
//0으로 나눠보기 (정수, 실수)		
//		System.out.println(3/0);	// 오류
//		System.out.println(3/0.0); 	//Infinity
//3-6
//		byte a = 10;
//		byte b = 20;
//		//byte c = a + b;		//a+b의 값은 byte형이 아닌 int형 (4byte)값임
//		byte c = (byte)(a + b);  // 30
//		System.out.println(c);
//3-7
//		10 * 30은 300이지만 큰 자료형에서 작은 자료형으로 변환하면 데이터의 손실이 발생 값이 변함.
//		byte형의 범위인 -128~127의 범위를 넘는 int형 값을 byte로 형으로 변환하면,
//		원래값이 보존 되지 않고 byte형의 범위중 한값을 가지게 됨.
//		본래byte형(1byte)에서 int형 (4byte)으로변환은 2진수 8자리에서 32자리로 변환 no자료손실 
//		원래 8자리 보존 후 32자리로 변환, 나머지는 모두 0으로 채움(음수인 경우 부호를 유지하기 위해 1로 채움)
//		int에서 byte로는 앞의 24자리를 없애고 하위 8자리만을 보존(1byte)만
//		byte a = 10;
//		byte b = 30;
//		byte c = (byte)(a * b);		
//		System.out.println(a);		//10
//		System.out.println(b);		//30
//		System.out.println(c);		//44
//3-8	
//		int a = 1000000;		//1,000,000 1백만
//		int b = 2000000;		//2,000,000 2백만
//
//		long c = a * b;			// a * b = 2,000,000,000,000 ?
//
//		System.out.println(c);	//-1454759936
//		//c의 자료형이 long타입 (8byte)이기때문에 2ㅌ10의 12승을 저장하기에 충분하므로
//		//2000000000이 출력될것 같지만, 결과는 전혀 다른값
//		//int타입과 int타입의 연산결과는 int타입이기때문. a * b의 결과가 이미 int타입이므로
//		//long형으로 자동 형변환 되어도 값은 변하지 않는다.
//올바른 값을 얻기 위해서는 아래와 같이 변수 a또는 b의 타입을 long으로 변환 해야함
//		long c = (long) a * b
//		long c = (long)100000 * 2000000;
//		long c = 1000000L * 2000000;
//		long c = 1000000 * 2000000L;
//		long c = 2000000000000L
//3-9
//		long a = 1000000 * 1000000;
//		long b = 1000000 * 1000000L;
//		
//		System.out.println("a="+a); //a=-727379968
//		System.out.println("b="+b); //b=1000000000000
//		//a는 int타입의 최대값 약 2x2의9승 을 넘음 (int는 9자리가 끝인가봄)
//3-10
//		int a = 1000000;
//		int result1 = a * a / a;
//		int result2 = a / a * a;
//		
//		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
//		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
//		1000000 * 1000000 / 1000000 = -727 (오버플로우 발생)
//		1000000 / 1000000 * 1000000 = 1000000
//3-11
//		char a = 'a';
//		char d = 'd';
//		char zero = '0';
//		char two = '2';
//		
//		System.out.printf("'%c' - '%c' = %d%n", d, a, d-a); //'d'-'a' = 3
//		System.out.printf("'%c' - '%c' = %d%n", two, zero, two-zero);
//		System.out.printf("'%c'=%d%n", a,(int)a);
//		System.out.printf("'%c'=%d%n", d,(int)d);
//		System.out.printf("'%c'=%d%n", zero,(int)zero);
//		System.out.printf("'%c'=%d%n", two,(int)two);
//
//		'd' - 'a' = 3
//				'2' - '0' = 2
//				'a'=97
//				'd'=100
//				'0'=48
//				'2'=50
//		문자로 정수값을 뽑아내면 유니코드(부호없는 정수)로 저장되어 문자간의 사칙연산은
//		정수간의 연산과 동일하게 나온다. (주로 덧셈 뺼셈하는 경우가 대부분)
//		A~Z, a~z역시 연속적으로 배치되어있기때문에 100 - 97은 3 =  (d-a)= 3
//3-12
//		char c1 = 'a';		//c1에서 문자 a의 코드값인 97이 저장
//		char c2 = c1;		//c1에 저장되어 있는 값이 c2에 저장
//		char c3 = ' ';		//c3을 공백으로 초기화한다.
//		
//		int i = c1 + 1;		//'a'+1 -> 97+1 -> 98
//		
//		c3 = (char)(c1+1);
//		c2++;
//		c2++;
//		
//		System.out.println("i=" + i);
//		System.out.println("c2=" + c2);
//		System.out.println("c3=" + c3);
//		
//		i=98
//		c2=c
//		c3=b
//		# c2++대신에 c2=c2+1;을 사용하면 에러가 발생. c2+1의 연산값은 int형
//		결과를 다시 c2에 담으려면 형변환 연산자를 사용하여 char형으로 변환해야 하기때문.

//3-13
//		char c1 = 'a';			//c1 : 'a'
////		char c2 = c1+1;			//컴파일 에러 발생 c2 : 97 + 1 = 98
//		char c2 = 'a' + 1 ; 	//컴파일 에러 없음 c2 : 97 + 1 = 98 = b
//
//		System.out.println(c2);	//b
//		char c2 = c1+1;	//에러 발생이유 : c1에 담긴 'a'값이 리터럴 값 (상수)
//		'a'+1이 리터럴 간의 연산이기 때문. 상수 또는 리터럴 간의 연산은 실행과정동안 변하는 값이 
//		아니기 때문에, 컴파일 시에 컴파일러가 계산해서 그 결과로 대체함으로써 코드를 보다 효율적으로 만든다.

//표 3-9에서 알수 있듯, 커파일러가 미리 덧셈 연산을 수행하기때문에 실행 시에는 덧셈연산이
//수행되지 않는다. 그저 덧셈연산 결과인 문자 b를 변수 c2에 저장할 뿐		
//			컴파일 전의 코드				컴파일 후의 코드
//		char c2 = 'a' +1;			char c2 = 'b';
//		int sec = 60 * 60 * 24;		int sec = 86400;
//그러나 위와 같이 수식에 변수가 들어가 있는 경우, 컴파일러가 미리 계산을 할 수없다.		
//형변환을 해줘야 한다.
//		char c2 = c1 + 1; 		-> 	char c2 = (char)(c1 + 1);
//		
//3-14		
//		char c = 'a';
//			for(int i=0; i<26; i++) { 	//블럭 {}안의 문장을 26번 반복
//				System.out.print(c++);	//a부터 26개의 문자를 출력
//			}
//		System.out.println();
//		
//		c = 'A';
//			for(int i=0; i<26; i++) {	//블럭{}안의 문장을 26번 반복
//				System.out.print(c++);	//'A'부터 26개의 문자를 출력
//			}
//		System.out.println();
//
//		c = '0';
//			for(int i=0; i<10; i++) {	//블럭{}안의 문장을 10번반복
//				System.out.print(c++);	//'0'부터 10개의 문자를 출력
//			}
//			System.out.println();
//		
//			abcdefghijklmnopqrstuvwxyz
//			ABCDEFGHIJKLMNOPQRSTUVWXYZ
//			0123456789		
//		#차이
//		#System.out.print();   	//줄바꿈 없이 출력
//		#System.out.println();	//줄바꾸고 출력
//3-15
//		char lowerCase = 'a';
//		char upperCase = (char)(lowerCase - 32);
//		System.out.println(upperCase);		//A
//		
//		소문자를 대문자로 변경하려면 : 소문자 -32 / 대문자를 소문자로 : 대문자 +32
//3-16
//		float pi = 3.141592f;
//		float shortPi = (int)(pi * 1000) / 1000f;
//		
//		System.out.println(shortPi);
//		
//		값 : 3.141
//주의!	1>int형간의 나눗셈을 수행하면 결과가 float나 double이 아님 int로 나옴
//		2>나눗셈의 결과를 반올림 하지 않음, 버림!!!
//이 공식의 포인트!!		
//		# 나눗셈 연산자의 이러한 성질을 이용, 
//		실수형 변수 pi의 값을 소수점 셋째 자리까지만 빼내는 방법을 보여줌
//
//3-17	버림이 아닌 반올림이 되게 하려면!?
//		double pi = 3.141592;
//		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
//		
//		System.out.println(shortPi);
//		
//		값 : 3.142
//3-18 Math.round()사용하면 좀 더 간단히 반올림 할 수있다. 중요!!!
//		double pi = 3.141592;
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		
//		System.out.println(shortPi);
//		
//		값 : 3.142
//		Math.round 값은 ()안의 연산이 끝나면 소수점 첫째자리에서 반올림 하고 그결과를 정수로 돌려줌 
//		Math.round((pi * 1000)/1000.0
//	->	Math.round((3.141592 * 1000)/1000.0
//	->	Math.round(3.141592) / 1000.0
//	->	3.142 / 1000.0
//	->  3.142
//3-19
//		int x = 10;
//		int y = 8;
//		
//		System.out.printf("%d을 %d로 나누면, %n", x, y);
//		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x/y, x%y);
//		
//		값 : 10을 8로 나누면, 
//		몫은 1이고, 나머지는 2입니다. 
//3-20	
//		System.out.println(10%8);	//10을 8로 나눈 나머지 2가 출력
//		System.out.println(10%-8);	//위와 같은 값 출력 2
//		System.out.println(-10%8);	//-2
//		System.out.println(-10%-8);	//-2
//		// 피연산자의 부호를 무시!
//		//나머지 연산을 한 결과에 왼쪽 피연산자(나눠지는 수)의 부호를 붙이면 된다!
		
		
		
		
		
		
		
	}

}
