/*p. 205~207
	#2 String배열
	##2.2 String배열의 선언과 생성
	: 배열의 타입이 String인 경우에도 int배열의 선언과 생성방법은 다르지 않음
	: 예를 들어 3개의 문자열(String)을 담울 수 있는 배열을 생성하는 문장은 다음과 같다.
	
		String[] name = new String[3];  // 3개의 문자열을 담을 수 있는 배열을 생성한다.
	
	위의 문장을 수행한 결과를 그림으로 표현하면,
	3개의 String타입의 참조변수를 저장하기 위한 공간이 마련되고 참조형 변수의 기본값은null
	각 요소의 값은 null로 초기화
	
	name			name[0]		name[1]		name[2]
	[0x100]		->	[null]		[null]		[null]
					0x100
 	
 	: 참고로 변수의 타입에 따른 기본값은 이렇다
 			자료형					기본값
 			boolean					false
 			char					'\u0000'
 			byte, short, int		0
 			long					0L
 			float					0.0f
 			double					0.0d 또는 0.0
 			참조형변수					null
 			
 	##2.2 String배열의 초기화
 		: 초기화 역시 int배열과 동일한 방법
 		: 아래와 같이 배열의 각 요소에 각 요소에 문자열을 지정하면 된다.
 		
 		String[] name = new String[3];	//길이가 3인 string배열을 생성
 		name[0] = "Kim";
 		name[1] = "Park";
 		name[2] = "Yi";
 		
 		:또는 괄호{}를 사용하여 다음과 같이 간단히 초기화 가능
 		String[] name = new String[]{"Kim","Park","Yi"};
 		String[] name = {"Kim","Park","Yi"};	//new String을 생략 가능
 		
 	name			name[0]		name[1]		name[2]
	[0x100]		->	[Kim]		[Park]		[Yi]
					0x100
 		: 특별히 String클래스만 "Kim"과 같이 큰 따옴표로만으로 간략히 표현하는 것이 허용
 		: 원래 String은 클래스 이므로 아래의 왼쪽과 같이 new연산자를 통해 객체를 생성해야함
 		String[] name = new String[3];				String[] name = new String[3];
 		name[0] = new String("Kim");				name[0] = "Kim";	
 		name[1] = new String("Park");		->		name[1] = "Park";
 		name[2] = new String("Yi");					name[2] = "Yi";

	(정확한 그림)
 	name			name[0]		name[1]		name[2]
	[0x100]		->	[0x200]		[0x300]		[0x400]
			0x100
 					
 					["Kim"]		["Park"]	["Yi"]
 					0x200		0x300		0x400	
 		: 배열에 실제 객체가 아닌 객체의 주소가 저장되어 있는 것을 볼수 있다.
 		: 기본형 배열이 아닌경우, 즉, 참조형 배열의 경우 배열에 저장되는 것은 객체의 주소.
 		: 참조형 배열을 객체배열이라고도 함
 
 	[참고] 참조형 변수를 간단히 참조변수라고도 한다.
 		  모든 참조형 변수에는 객체가 메모리에 저장된 주소인 4byte의 정수값 (0x0~0xfffffff)또는 null이 저장
 	[예제 5-12]	
 		
 
 */



package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String1 {

	public static void main(String[] args) {
// 	[예제 5-12]
//		String[] names = {"Kim","Park","Yi"};
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println("names["+i+"]" + names[i]);
//		}
//		
//		String tmp = names[2]; 	//배열 names의 세번째요소를 tmp에 저장
//		System.out.println("tmp:"+ tmp);
//		
//		names[0] = "Yu";		//배열names의 첫 번째 요소를 "Yu"로 변경
//		
//		for(String str : names) {	//향상된 for문
//			System.out.println(str);
//		}
//		결과값 : 
//			names[0]Kim
//			names[1]Park
//			names[2]Yi
//			tmp:Yi
//			Yu
//			Park
//			Yi
//	 	[예제 5-13]
		char[] hex = {'C','A','F','E'};
		
		String[] binary = {"0000","0001","0010","0011"
						  ,"0100","0101","0110","0111"
						  ,"1000","1001","1010","1011"
						  ,"1100","1101","1110","1111"};
		
		String result="";
		
		for(int i =0; i<hex.length; i++) {
			if(hex[i] >='0' && hex[i]<='9' ) {
				result += binary[hex[i]-'0'];	//'8'-'0'의 결과는 8이다.
			}else { // A~F이면
				result += binary[hex[i]-'A'+10]; //'C'-'A'의 결과는 2
			}
		}
		System.out.println("hex:"+ new String(hex));		//String(char[] value)
		System.out.println("binary:" + result);
/*
		결과값 :
			hex:CAFE
			binary:1100101011111110
		
		: 16진수를 2진수로 변환하는 예제.
		: 먼저 변환하고자 하는 16진수를 배열hex에 나열한다.
		: 16진수레는 A~F까지 6개의 문자가 포함 되므로 char배열로 처리하였다.
		: 그리고 문자열 배열 binary에는 이진수 '0000'부터 '1111'(16진수로 0~F)까지 모두 16개의 값을 
		  문자열로 저장
		: for문을 이용해서 배열 hex에 저장된 문자를 하나씩 읽어서
		  그에 해당하는 이진수 표현을 배열 binary에서 얻어 result에 덧붙이고 결과를 화면에 출력	
*/		
		
		

	}//end main
}//end public
