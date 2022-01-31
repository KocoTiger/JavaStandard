package org_bitcamp2;

public class bitc2_for_ifelse2 {

	public static void main(String[] args) {

		//화면에 총 10개의 ""문자열을 출력한다. 최대 20번
	    //반복문 1, 조건 if else
	    //변하는 부분을 변수로 선언해서 다룬다.
	    String letter="";
	    int d = 1;
	    
	    for (int i=0; i<=10; i+=1){
	        i = i + d; //i의 변수의 값을 결정하려면 d에따라서 변한다. !! 의존성! 이걸 알아야함.
	                   // 변수와 변수와의 관계, 영향 
	    if (i % 3 == 0){ //3의 배수면 참이란 뜻
	        letter = "O";
	       
	    }else{
	        letter = "X";
	        }
	        //문자열 +문자열, 문자, 정수, 실수 => 문자열
	        System.out.print( letter); //바뀌는것은 변수로
	        
	   }
	       
	}
}    
