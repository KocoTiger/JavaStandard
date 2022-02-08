/*
<<<<<<<<<<<<<<실습과제>>>>>>>>>>>>>>>>>>>>>

	  
[3] : 두수를 입력받고 입력받은 수가 짝수, 홀수,3의 배수를 판단하기
		FileName : Test3.java
		
		실행예> java Test3 10 15
		==> 실행결과(출력결과...)(알아서 출력할것)
		입력하신 1번째 인자값 10은 짝수 이며 3의 배수가 아닙니다.
		입력하신 2번째 인자값 15는 홀수 이며 3의 배수입니다.
		

 */


package BitCamp_Code_20220207;

public class BitCampComputer00_실습과제01_3숙제 {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		if(a%3 != 0)
			System.out.println("입력하신 1번째 인자값"+a+"은"+"짝수이며 3의 배수가 아닙니다.");
		
		if(b%3 == 0)
			System.out.println("입력하신 2번째 인자값"+b+"는"+"홀수이며 3의 배수입니다.");
		


	}

}
