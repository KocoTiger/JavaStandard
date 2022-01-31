package org_bitcamp4_a;
public class MyClass {
    public static void main(String args[]) { 
        Integer num = 10;   //java에서 소문자 기본형, 대문자 class형
        int n = 20;
  
        System.out.println (num.hashCode() ); //식별값
        String str = "James";                 //문자열 명령어
        System.out.println (str.hashCode() ); //Hashcode는 기본적으로 정수가 나옴, 식별값
        str = "Dean";
        System.out.println (str.hashCode() ); //식별값 (문자열 값이 바뀌니 Hasecode도 바뀜)
        // 불변성 -> "Dean"  -> new "DEan" -> 그래서 해쉬코드가 다르게 나온다
  
    }

}


//에러 뜨면 : 0점, 결과가 안나오면 감점
