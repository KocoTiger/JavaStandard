/*
 
# 구구단 출력하기
1. 시작할 단(D1), 끝나는 단 (D2)를 입력받아 그 사이의 단을 모두 출력하세요.
2. 조건 :
	1) 2단~9단 사이만 출력 가능
	2) 3행 3열 구조로 출력  -> 1핼(줄)에 3개 단씩 출력
	3) 같은 값을 곱하는 경우는 출력하지 않음
		2x2, 3x3, 4x4.. 등 --아래 빨간선 부분
		
	예시 > 사진 참고.



 */









package org_bitcamp5;

public class bitc5_전체적정리_CRUD7_finaltest {

    public static void main(String args[]) {
    // int [] d1 = new int [9];
    // int array [] [] = new int [3] [3];
        for(int d1 = 2; d1<=9; d1++){
            System.out.println(d1);
            //i는 2부터 시작 9까지
            //j는 1부터 시작 9까지
        
                for(int d2=1; d2 <=9; d2++){
                    System.out.println(d1 + "x" + d2 + "=" + d1*d2);
                }
                
                // if (d1 = d2){
                //     System.out.println("======="");
                // }else{
                //     System.out.println();
                // }
            
            
        }//end for 첫번째
    }//end main
}//end public
