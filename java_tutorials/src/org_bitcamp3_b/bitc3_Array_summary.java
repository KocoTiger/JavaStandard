package org_bitcamp3_b;

public class bitc3_Array_summary {

    public static void main(String args[]) {
        // 배열 [] - 요소번호로 제어한다... 길이를 확인하자
        // 기능 : 수정, 삭제 <-- 검색 선행 (입문자가 많이 하는 실수)
        // 검색 : 결과 -> 1)있다->검색 결과가 1개여야 하는 것, 여러개인 경우
        //        회원 정보가 Unique해야한다. 여러개인경우는 그렇게 크게 생각치 않음.
        //              or 2)없다.
        // 추가, 삭제, 삽입 : 서로 유기적으로 연결될 수있게 만들어야 한다. -> 관계가 있다.
        
    //  int[] ar; //배열은 없는 것 -> 이름만 있는 것/배열을 쓸거다! 이렇게만 만든거
        int[] ar = new int[10]; //생성해야만 배열을 쓸수 있다. / 10개짜리 배열을 만들거다
        int limit = 10; // int[] ar = new int[10]; 이런식으로도 쓸수 있음
        
        int[] ar1 = new int[]{1,2,3,4,5,6,7};  //배열을 쓸때
        
        System.out.println( ar.length );  //이런식으로 배열을 알 수있다.
        System.out.println( ar1.length ); //이런식으로 배열을 알 수있다.
        
        //자바의 배열은 정적이다.(내가 코드를 쓰지 않는 이상 늘어나지 않음)

    }
}
