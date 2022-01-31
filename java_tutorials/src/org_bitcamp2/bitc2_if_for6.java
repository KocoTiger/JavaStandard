package org_bitcamp2;

public class bitc2_if_for6 {

	public static void main(String[] args) {
        //숫자를 정해놓고 행을 내림
        int count = 0; //각행에서 출력한 개수
       for(int n=12; n<63; n+=1){ 
           System.out.print(n + " ");
           
           count += 1;
           if(count == 5) { //5개면...
                System.out.println();
                count = 0; //배열의 개수가 25개로 맞추기 위해?  count변수의 목적이 있어야함!!!퀴즈!
           }
       }
           System.out.println();
       
       // 5 행 5여로 출력할것이다라고 미리 정해놓은 것임.
       // 공간을 만들어 놓고 거기에 넣음
       int num = 1;
       for(int i=0; i<5; i+=1){ //행
           for(int k=0; k<5; k+=1){ //열
               //25번 반복
               // System.out.print((i*5 + k) + " "); //최대 값 24 : i 최대 4까지 나옴 20+ k최대값 4까지 = 24
               System.out.print(num + " ");
               num +=1;
           }    
           System.out.println();
       }
       
}
}
