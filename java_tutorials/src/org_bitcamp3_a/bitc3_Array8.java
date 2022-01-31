package org_bitcamp3_a;

public class bitc3_Array8 {

    public static void main(String args[]) {
    // 배열이 항상 0번부터라고는 생각하지 말아라!
    //배열 선언 : 정적, 명시적
    int[] ar = new int [10]; 
    System.out.println (ar);
    
    int idx = -1;  //-1로 썼을 때 (저장한 번호, <--마지막 번호, +1 개수)
    //추가하기
    idx += 1;       // idx 값이 1 더했기 때문에 0이 됨
    ar[idx] = 10; 
    idx += 1;       // idx = 1됨
    ar[idx] = 20;

    //현재 저장된 것만 출력하기           
    for(int i=0; i < idx; i+=1){   
    System.out.println (ar [ i ]);  //int 변수명
                                    // idx : 요소 두가지
                                    //1) 요소다 2) 두개를 추가 했다볼수 있다
       }
       // idx + 1 개 저장되어 있다
       // [idx] 번이 마지막/최근 저장한 값
    }
}
