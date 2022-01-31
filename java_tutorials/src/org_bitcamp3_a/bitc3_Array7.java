package org_bitcamp3_a;

public class bitc3_Array7 {

    public static void main(String args[]) {
    //배열 선언 : 정적, 명시적
    int[] ar = new int [10]; //왼쪽과 오른쪽의 데이터 형태가 같아야함
    System.out.println (ar); //값 :[I@1c655221 : Arry배열의 식별값, 배열명
                             // ar = 100; //상수이지 배열에다가 이렇게 하면 안됨
    
    int idx = 0;  //저장할 번호, 저장한 개수
    
    //추가하기
    ar[idx] = 10; 
    idx += 1;
    ar[idx] = 20;
    idx += 1;           
    //현재 저장된 것만 출력하기           
    for(int i=0; i < idx; i+=1){   
    System.out.println (ar [i]);        //int 변수명
                                    // idx : 요소 두가지
                                    //1) 요소다 2) 두개를 추가 했다볼수 있다
       }
    }
}
