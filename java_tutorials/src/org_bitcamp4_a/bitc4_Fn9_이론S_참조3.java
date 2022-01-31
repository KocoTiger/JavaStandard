package org_bitcamp4_a;
//* 문자열(식별 값)이 같은지 문자열이 같은지를 비교하는 것.

public class MyClass {
    
    public static void main(String args[]){
        String s1 = new String("James"); //new 는 heap영역에 생성, 식별 값을 반환
        String s2 = new String("James");
        System.out.println( s1 + ", " + s2 );
        
        if (s1.equals (s2) ){ //문자열을 비교하려면
            //문자열 안에 각각 글자들이 모두 같아야 같다라고 할 수 있다
            //.equals는 s1과 s2의 각각의 값(데이터)이 같은지를 비교하는 것.
            System.out.println("equals");
            
        }
        
        //문자열은 같다, 식별값-위치 은 다르다.
        //변수가 여러개라면 식별값은 달라야 한다.
        // 몇번과 몇개의 구분은 다르다!
        if( s1 == s2 ){// 식별값이 같은지 확인 하는 것
            System.out.println("equal");
        }else{
            System.out.println("not equal");  //이게 뜬다면, 식별값이 같지 않다라는 것/변수는 두개 라는 것을 알수 이다
        }
    }
    
    public static void main1(String args[]) { 
        //참조형 주소로 표현한다....
        Integer num = 10;   //java에서 소문자 기본형, 대문자 class형
        int n = 20;
        //OOP--> 기본, 어려움
        System.out.println (num.hashCode() ); //식별값
        String str = "James";                 //문자열 명령어
        System.out.println (str.hashCode() ); //Hashcode는 기본적으로 정수가 나옴, 식별값
        str = "Dean";
        System.out.println (str.hashCode() ); //식별값 (문자열 값이 바뀌니 Hasecode도 바뀜)
        // 불변성 -> "Dean"  -> new "DEan" -> 그래서 해쉬코드가 다르게 나온다
    }

}
//에러 뜨면 : 0점, 결과가 안나오면 감점
