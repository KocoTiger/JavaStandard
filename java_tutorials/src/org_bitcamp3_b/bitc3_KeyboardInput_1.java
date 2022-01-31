package org_bitcamp3_b;

import java.util.Scanner;

//★ 키보드로 입력 받는 방법 (자바)
//
//※Stdin Inputs에 글을 쓴다 12


public class bitc3_KeyboardInput_1 {

    public static void main(String args[]) {

    //키보드 입력 처리
    Scanner kb = new Scanner( System.in ); //스캐너안에 이런저런 함수가 있는데 준비물이 필요     
                            //System.in : 키보드와 연결한다, 키보드로 받겠다
                            //System.out : 모니터로 띄운다
    String s = kb.nextLine();
    System.out.println(s);
    
            
    }//main 함수 중괄호
} //class 중괄호
