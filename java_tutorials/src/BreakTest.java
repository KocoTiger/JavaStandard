/*
package jb02.part03;

	FileName: Break Test.java

	//==>keyword:break ==> 자신이 속한 반복문은 종료
	 
	//==>break문을 이용하여 입력받은 수까지의 합 구하자
	//==>java BreakTest10 ==> 이면 1~10더해서 55출력

 */




package java_tutorials_bitCamp1;

public class BreakTest {
//main method
	public static void main(String[] args) {
		
		//입력받은 data를 int변환
		int inputData=Integer.parseInt(args[0]);
		
		//while문의 초기화 변수 선언
		int i=0;
		
		//더한값을 저장하기 위한 변수 선언
		int sum=0;
		
		while(true) {
			i++;
			sum=sum+i;
			
			if(i==inputData) {
				break;
			}
		}//end of while
		
		System.out.println("0~"+inputData+"까지의 합은:"+sum+"입니다.");
		

	}//end of main

}//end of class
