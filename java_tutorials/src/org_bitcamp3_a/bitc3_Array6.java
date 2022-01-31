package org_bitcamp3_a;

public class bitc3_Array6 {

    public static void main(String args[]) {
    //배열 선언 : 정적, 명시적
    int[] ar = new int [10]; //왼쪽과 오른쪽의 데이터 형태가 같아야함
    System.out.println (ar); //값 :[I@1c655221 : Arry배열의 식별값, 배열명
                             // ar = 100; //상수이지 배열에다가 이렇게 하면 안됨
    //추가하기
    ar[0] = 10;  // 추가한것, 밑에 또ar[0] = 20 이라고 쓰면 안됨. -> 다른것 또 추가려면 요소 변호를 바꿔서 서야한다
    ar[1] = 20;            // ar[1] = 20 이런식으로 요소변호 변화    
    
    for(int i=0; i < ar.length; i+=1){   //ar.length를 쓰면 위에 new int [숫자] 바껴도 알아서 바뀜 
    System.out.println (ar [i]); //int 변수명 , 값 : 0
       }
    }
}
