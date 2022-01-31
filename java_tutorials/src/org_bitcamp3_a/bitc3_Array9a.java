package org_bitcamp3_a;

public class bitc3_Array9a {

    public static void main(String args[]) {
    // 배열을 다루는 방법
    //배열 선언 : 정적, 명시적
    int[] ar = new int [10]; 
    System.out.println (ar);
        // -1로 배열을 초기화  
        for(int i=0; i < ar.length; i+=1){
        ar [i] = -1;
        }
    
    // 순차적이지 않은 방법으로 저장했을 때
    ar[9] = 0; // 값 : 없음 으로 나옴
    ar[7] = 20;  
    // 상태 : 있다 없다 -> 초기값 0, 0이 아니면 / 저장되는 값이 0이 아닐때  
                              
    for(int i=0; i < ar.length; i+=1){
        if( ar[i] != -1){
            System.out.println (ar [i]); 
            }
        }
    
    }
}

