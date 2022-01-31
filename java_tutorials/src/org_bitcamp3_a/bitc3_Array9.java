package org_bitcamp3_a;

public class bitc3_Array9 {

	    public static void main(String args[]) {
	    //배열 선언 : 정적, 명시적
	    int[] ar = new int [10]; 
	    System.out.println (ar); 
	    
	    // 순차적이지 않은 방법으로 저장했을 때
	    ar[9] = 0; // 값 : 없음 으로 나옴
	    ar[7] = 20;  
	    // 상태 : 있다 없다 -> 초기값 0, 0이 아니면 / 저장되는 값이 0이 아닐때  
	    // 몇번에 저장을 했는지 모르지만 저장했다 안했다를 판단할 수있다면                                
	    for(int i=0; i < ar.length; i+=1){

	        if( ar[i] != 0){
	            System.out.println (ar [i]); //값: 20으로 나옴
        }
	        
    }
	    
	                                    
    }
}
