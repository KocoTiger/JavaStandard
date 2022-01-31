package org_bitcamp2;

public class bitc2_Math_random3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ran = Math.random(); 
		System.out.println( ran ); 

		int min = 10;
		int max = 45;

		int num = (int) ((ran*100000) % (max-min+1) + min); //순서 : 가감승제, 계산부터 하고 형변환은 나중에 해라!
						//num %= 36; // : 최대값 한정
						//num += 10; // 10~45 : 최소값 한정

		System.out.println ( num );

	}

}
//최소0에서 부터 1미만의 실수값,  실수 값(floating number)
//기본 세팅 6자리 (0.000000)
////컴퓨터에서 임의의 실수를 반환받으면 임의의 값이 튀어나온다
////
//내가 원하는 범위는 10이상~45이하 가 되도록   받도록 만든다. 