package org_bitcamp2;

public class bitc2_for_ifelse1 {

	public static void main(String[] args) {
		//화면에 총 10개의 ""문자열을 출력한다. 최대 20번
	    //반복문 1, 조건 if else
	    //변하는 부분을 변수로 선어해서 다룬다.
	    String letter="";
	    for (int i=0; i<=10; i+=1){
	    if (i % 3 == 0){ //이거 무슨 뜻!?3의 배수이면 
	    				 //%나머지를 했을때 0이 나온다는것은 3의배수
	    				 // 0 1 2 0 1 2...
	        letter = "O";
	       
	    }else{
	        letter = "X";
	        }
	        //문자열 +문자열, 문자, 정수, 실수 => 문자열
	        System.out.print( letter); //바뀌는것은 변수로
	        
	    	}
	    }
	}
