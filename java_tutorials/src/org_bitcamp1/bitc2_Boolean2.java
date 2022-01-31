package org_bitcamp1;

public class bitc2_Boolean2 {

	public static void main(String[] args) {
        //자바에서는 변수를 먼저 생성, 만들기 -> 저장하기
        //변수를 만들때, 1. 저장할값? 자료형을 쓴다.
        //2. 변수명 결정 (보라색 = 자료형)
        //왼쪽 항 반드시 변수명이어야 한다 = 대입연산자
        boolean result = (10 < 20); // ~이면                                    
         System.out.println(result);         // ~이면 10이 20보다 작으면 (왼쪽을 기준으로 얘기)
         System.out.println(10<=20);        // ~이면
         System.out.println(10==20);        // ~이면
         System.out.println(10!=20);        // ~이면
         //논리 연산의 결과 -> 논리값 : true, false
         //ln은 라인 (print는 옆으로 계속 / println은 한줄씩 끊어서)
        }                               
}


//num = (10 < 20) #자바는 자료형을 먼저 만들어 줘야함, 파이썬은 알아서 잡음 (동적 typing)
//# print 함수에게 num변수의 값을 전달한다....
//# 화면에 num변수의 값을 출력하려면, print함수를 호출한다...
//print(num)
