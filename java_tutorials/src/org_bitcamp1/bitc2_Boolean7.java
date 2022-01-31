package org_bitcamp1;

public class bitc2_Boolean7 {

	public static void main(String[] args) {
		//논리 연산자 -> 관계식 여러 개 (관계연산자 여러개 있을때)
        int min = 1;
        int max = 10;
        int R = 2 ;  //10.29 는 실수라 쓰면 안됨 / 파이썬이랑 큰 차이점 자바는 실수 가능
        boolean con1 = R <= max; //조건식 하나
        boolean con2 = R >= min; // 20이랑 30이 같냐란 질문
         System.out.println(con1 && con2);        // 둘다 and, and로 합칠지 or로 합칠지를 잘 봐야한다.
         //합집합 : or
         //교집합 : and
         System.out.println(!(con1 && con2)); //교집합에 not을 붙이면 -> 반대가 된다
         System.out.println(con1 || con2);
        }                               
}

