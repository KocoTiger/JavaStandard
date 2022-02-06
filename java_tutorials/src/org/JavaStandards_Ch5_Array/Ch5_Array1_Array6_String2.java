/*p.208 ~211
##2.3 char배열과 String클래스
	: 문자열=문자를 연이러 늘어놓은 것=문자배열인 char배열과 같은 뜻
	: 자바에서char배열이 아닌String클래스를 이용해서 문자열을 처리하는 이유는
	  String클래스가 char배열에 여러가지 기능을 추가하여 확장한 것.
	: 그래서 char배열을 사용하는 것보다 String클래스를 사용하는 것이 문자열을 다루기가 더 편리
	
			String클래스는 char배열에 기능을 추가한 것.
	
	: C언어에서는 문자열을 char배열로 다룸
	: 객체지향 언어인 자바에서는 char배열과 그에 관련되 기능들을 함께 묶어서 클래스에 정의
	: 객체지향 언어 이전의 언어들은 데이터와 기능을 따로 둠
	: 객체지향언어에서는 데이터와 그에 관련된 기능을 하나의 클래스에 묶어서 다룰 수 있게 함.
	: 서로 관련된 것들 끼리 데이터와 기능을 구분하지 않고 함께 묶는 것.
	
	: 여기서 기능은 함수를 의미
	: 메서드는 객체지향 언어에서 함수 대신 사용하는 용어
			함수 = 메서드 = 기능
	
	: char 배열과 String클래스의 한가지 중요한 차이
	  String객체(문자열)은 읽을 수만 있다 (내용을 변경하는 것은 불가능)
	
		String str = "Java";			
		str = str + "8";			//"Java8"이라는 새로운 문자열이 str에 저장		
		System.out.println(str);	//"Java8"
 
 	: 위의 문장에서 문자열 str의 내용이 변경되는 것 같지만, 문자열은 변경할 수 없으므로
 	  새로운 내용의 문자열이 생성
 	[참고]변경 가능한 문자열을 다루려면, StringBuffer클래스를 사용하면 된다.
 		 문자열에 대한 것은 9장에서 자세히 설명한다.
 	
 	###String클래스의 주요 메서드
 		: 상당히 많은 문자열 관련 메서드들을 제공
 		: 가장 기본적인 몇가지만 살펴보자 (나머지는 9장)
 		
 		메서드								설명
 		char charAt(int index)				문자열에서 위치(index)에 있는 문자를 반환한다.
 		int length()						문자열의 길이를 반환한다.
 		String substring(int from, int to)	문자열에서 해당 범위(from~to)에 있는 문자열을 반환한다.
 											(to는 범위에 포함되지 않음)
 		boolean equals(String str)			문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false
 		char[] toCharArray()				문자열을 문자배열(char[])로 변환해서 반환.
 
 		: charAt 메서드는 문자열에서 지정된 index에 있는 한문자를 가져옴
 		: 배열에서 '배열이름[index]'로 index에 위치한 값을 가져오는 것과 같다
 		: 배열과 마찬가지로 charAt메서드의 index값은 0부터 시작
 		
 			String str = "ABCDE";
 			char ch = str.charAt(3);	//문자열 str의 4번째 문자 'D'를 ch에 저장
 			
 		: substring()은 문자열의 일부를 뽑아낼수 있다.
 		: 주의 할 것은 범위의 끝은 포함되지 않는다
 		: 예를 들어, index의 범위가 1~4라면 4는 범위에 포함되지 않는다.
 		
 			String str = "012345";
 			String tmp = str.substring(1,4);	//str에서 index범위 1~4의 문자들을 반환
 			System.out.println(tmp);		//"123"이 출력
 		: equals()는 이미 앞에서 간단히 배움
 		: 문자열의 내용이 같은지 다른지 확인하는데 사용
 		: 기본형 변수의 값을 비교하는 경우 == 연산자 사용
 		: 문자열의 내용을 비교시 equals()를 사용
 		: 이 메서드는 대소문자를 구분함(주의 사항)
 		: 대소문자 구분하지 않고 비교하려면
 		  qeualsIgnoreCase()를 사용
 		
 			String str = "abc";
 			if(str.equals("abc")){  //str와 "abc"가 내용이 같은지 확인
 				...
 		  	}							
 		  								
 		  ##char배열과 String클래스의 변환
 		  :	가끔 char배열을 String클래스로 변환, 또는 그 반대로 변환 해야 하는 경우가 있다.
 		  		
 		  		char[] chArr = {'A','B','C'};
 		  		String str = new String(chArr);	//char배열 -> String
 		  		char[] tmp = str.toCharArray();	//String  -> char배열
 [예제 5-14]		  	  
		: String클래스의 charAt(int idx)을 사용하는 방법을 보여주는 예제
		: charAt(int idx)은 문자열 중에서 idx번째 위치에 있는 문자를 반환
		: idx의 값은 배열처럼 0부터 시작한다는 것을 확인하자
		: println()로 문자배열을 출려하면 문자열 추력하듯이 문자 배열의
		  모든 요소를 이어서 한줄로 출력
 
 
 
 */



package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String2 {

	public static void main(String[] args) {
// [예제 5-14]		  
//		String src = "ABCDE";
//		
//		for (int i=0; i<src.length(); i++) {
//			char ch = src.charAt(i);		//src의 i번째 문자를 ch에 저장
//			System.out.println("src.charAt("+i+")"+ ch);
//		}
//		
//		char[] chArr = src.toCharArray();  //String을 char[]로 변환
//		
//		System.out.println(chArr);		//char배열 (char[])을 출력
//
//		결과값 :
//			src.charAt(0)A
//			src.charAt(1)B
//			src.charAt(2)C
//			src.charAt(3)D
//			src.charAt(4)E
//			ABCDE			
//[예제 5-15]
		String source = "SOSHELP";
		String[] morse = {""
							//책 참고
										};
		
		String result="";
		
		for(int i=0; i<source.length(); i++) {
			result+=morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+source);
		System.out.println("morse:"+result);
/*
		:문자열(String)을 모르스 부호로 변환하는 예제.
		: 이전의 16진수를 2진수로 변환하는 예제와 같다.
		: char배열대신 String을 사용
		: String의 문자의 개수는 length()를 통해서 얻을 수 있고
		: charAt(int i)메서드는 String의 i번째 문자를 반환
		: for문의 조건식에 length()를 사용하고
		: charAt(int i)를 통해서 source에서 한 문자씩 차례대로 읽어올수 있다.
  	
 */
		
		
		
		
	}

}
