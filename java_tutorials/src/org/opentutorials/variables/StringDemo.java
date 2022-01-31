//변수 - 문자열


package org.opentutorials.variables;

public class StringDemo {

	public static void main(String[] args) {
		//String first; //first라는 변수를 문자를 담을 수 있는 변수로 만들기 위해 string first;라고 씀
		//first = "coding"; //문제 없음
		//Double first; 
		//String first = "coding"; //이렇게 한줄로 만들 수 있다.
		String a, b;
		a = "coding";
		b = "everybody";
		System.out.println(a+b);
		//결과값 : codingeverybody
		//이렇게 문자열 변수를 만드는 방법을 살펴 봤다.
		//어떤게 더 좋다라고는 말 할 수 없다. 상황에따라 적합한 선언과 할당 방식이 달라짐.

//변수 - 변수의 효용
		//System.out.println(100 + 10);
		//System.out.println((100 + 10) / 10);
		//System.out.println(((100 + 10) / 10) - 10);
		//System.out.println((((100 + 10) / 10) - 10) * 10);

		//int a = 100;
		//System.out.println(a + 10);
		//System.out.println((a+ 10) / 10);
		//System.out.println(((a + 10) / 10) - 10);
		//System.out.println((((a + 10) / 10) - 10) * 10);
		//변수를 지정해 줌으로써 
		//1. 중복의 제거
		//2. 가독성의 향상
		//3. 유지보수의 용이성
		//고정적인 것과 가변성이 있는 것들을 신경 써 줘야한다.
	}

}
