/*
<<<<<<<<<<<<<<실습과제>>>>>>>>>>>>>>>>>>>>>

	
[2] : 두수를 입력받고 두수를 비교하여 더하기/빼기 예제
	  첫번째 인수가 크면 빼고 / 적으면 더하기
	  FileName : test2.java
	  
	  실행예 > java Test2 2 1
	  ==> 실행결과(출력결과...)
	  첫번째인수 : 2, 두번째인수:1, 2-1 = 1 입니다.
	  
	  실행예 > java Test2 1 2
	  ==> 실행결과 (출력결과...)
	  첫번째 인수:1, 두번째인수:2, 2+1=3 입니다.
 */


package BitCamp_Code_20220207;

public class BitCampComputer00_실습과제01_2숙제 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		
		System.out.println("a="+a+","+"b="+b);
		System.out.println(a - b);
		
		int c = 1;
		int d = 2;
		
		System.out.println("c="+c+","+"d="+d);
		System.out.println(c + d);
		
		
		

	}

}
