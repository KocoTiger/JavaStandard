package org_bitcamp3_a;

public class bitc3_Array4 {

    public static void main(String args[]) {
    //배열 선언 : 정적, 명시적
    int[] ar = new int [10]; //왼쪽과 오른쪽의 데이터 형태가 같아야함
    System.out.println (ar); //값 :[I@1c655221 : Arry배열의 식별값, 배열명
                             // ar = 100; //상수이지 배열에다가 이렇게 하면 안됨
    
    for(int i=0; i < ar.length; i+=1){   //ar.length를 쓰면 위에 new int [숫자] 바껴도 알아서 바뀜 
    System.out.println (ar [i]); //int 변수명 , 값 : 0
       }
    }
}
