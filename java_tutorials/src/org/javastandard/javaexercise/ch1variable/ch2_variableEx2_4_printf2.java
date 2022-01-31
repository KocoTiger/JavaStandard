/*p 38~39

 */




//예제 2-5
// 실수형 값과 문자열을 출력하는 방법
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_4_printf2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = 010f;		// 0.10, 1.0e-1
		float f2 = 1e1f;		//10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);	//전체 14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);	//왼쪽 정렬
		System.out.printf("[%.8s]%n", url);		//왼쪽에서 8글자만 출력
		

	}//end main

}//end public class

//결과값 :
//f1=10.000000, 1.000000e+01, 10.0000
//f2=10.000000, 1.000000e+01, 10.0000
//f3=3140.000000, 3.140000e+03, 3140.00
//d=1.234568
//d=  1.2345678900
//[12345678901234567890]
//[www.codechobo.com]
//[   www.codechobo.com]
//[www.codechobo.com   ]
//[www.code]

/*
# 실수형 값의 출력에 사용되는 지시자
		%f 						%e							%g
	(주로 %f 쓰임)				(지수형태 출력)					(값을 간략하게 표현)

-%f :기본적으로 소수점 이하 6자리까지만 7자리에서 반올림

			System.out.printf("d=%14.10f%n", d); //전체 14자리 중 소수점 10자리
		1 2 3 4 1 2 3 5 6 7 8 9 1 0 (자리수)
		    1 . 2 3 4 5 6 7 8 9 0 0

- 소수점도 한자리를 차지
  소수점 이하의 빈자리는 0으로 채우고
  정수의 빈자리는 공백으로 채워 전체 자리수를 맞춘다.

- 지시자 %s에도 숫자를 추가시 원하는 만큼의 출력 공간을 확보 및
  문자열의 일부만 출력 가능
 		System.out.printf("[%s]%n", url);		//문자열의 길이만큼 출력 공간을 확보
		System.out.printf("[%20s]%n", url);		//최소 20글자 출력공간 확보. (우측정렬)
		System.out.printf("[%-20s]%n", url);	//최소 20글자 출력공간 확보. (좌측정렬)
		System.out.printf("[%.8s]%n", url);		//왼쪽에서 8글자만 출력

	지정된 숫자보다 문자열의 길이가 작으면 빈자리는 공백으로 출력
	공백이 있는 경우, 기본적으로 우측 끝에 문자열을 붙임.
	- 를 붙이면 좌측 끝에 붙임
	. 을 붙이면 문자열의 일부만 출력 가능	




*/
