package org_bitcamp3_b;

public class bitc3_Quiz {

    public static void main(String args[]) {
   //     // 배열 [] - 요소번호로 제어한다... 길이를 확인하자
   //     // 기능 : 수정, 삭제 <-- 검색 선행 (입문자가 많이 하는 실수)
   //     // 검색 : 결과 -> 1)있다->검색 결과가 1개여야 하는 것, 여러개인 경우
   //     //        회원 정보가 Unique해야한다. 여러개인경우는 그렇게 크게 생각치 않음.
   //     //              or 2)없다.
   //     // 추가, 삭제, 삽입 : 서로 유기적으로 연결될 수있게 만들어야 한다. -> 관계가 있다.
       
   //     int[] ar; //배열은 없는 것 -> 이름만 있는 것/배열을 쓸거다! 이렇게만 만든거
   //     int[] ar = new int[10]; //생성해야만 배열을 쓸수 있다. / 10개짜리 배열을 만들거다
   //     int limit = 10; // int[] ar = new int[10]; 이런식으로도 쓸수 있음
       
   //     int[] ar1 = new int[]{1,2,3,4,5,6,7};  //배열을 쓸때
       
   //     System.out.println( ar.length );  //이런식으로 배열을 알 수있다.
   //     System.out.println( ar1.length ); //이런식으로 배열을 알 수있다.
       
   //     //자바의 배열은 정적이다.(내가 코드를 쓰지 않는 이상 늘어나지 않음)
   // ------------------------------ 

           // 직역을 하면 안돼. 의역이 필요해!!! 그림을 그리며 봐
           //주차장 : 주차면 10대있다면 (최대)
           int[] parking = new int [10];   //주차장에 자리가 10대가 있다면
           
           //int count; //현재 주차된 차량 개수를 세겠다는 거구나
           
           int result = -1;   // int result = 0; 이면 안된다. 0번 요소도 포함 이기 때문 /보통 음수 로 써놓고 초기화 시킴/빈자리가 없다는 표현
           for( int i=0; i<parking.length; i+=1){
               System.out.println( parking[i] );
               // 0 : 빈자리, 1 : 주차됨 (자기가 정해야함 이런 규칙)
           
               // 내 양쪽자리가 비어있는것을 원하면 3자리가 연속해서 비어있는 것을 찾게됨
               if( parking[i] == 0 ){ //파킹 자리가 비어있으면
                   parking[i] = 1; // 파킹을 한다 (자리 1차지)
                   result = i;     // 요소번호 저장하고있다.
                   break;          // 주차했으니까 탐색 끝
               }                   // break가 실행 됐다는 것은 i번 요소가 0_빈자리를 찾았다 
           }
           
           if( result != -1 ){
           // if( i < parking.length ){ // i가 파킹 길이보다 적다면 안멈춤
               System.out.println("주차했음");
           }else{
               System.out.println("주차못했음");
           
           }
   }
}
