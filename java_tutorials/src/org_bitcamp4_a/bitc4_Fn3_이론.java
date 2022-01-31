//함수의 전달과 반환의 개념
public class MyClass {
    // public static void main(String args[]) {// ex> <--매개 변수 args /void + 함수 : 함수가 반환하는것이 없다란 뜻. 
     public static void main(String args[]) { //호출자(측)  
        // fn 함수를 호출한다.
        //// 전달한다. 호출측 -> 피 호출측 준다.
        //(외워) 호출하려는 함수에 매개변수가 있다면, 호출 시 반드시 전달해야함.
        fn( 3 ); //피호출자 (측), //전달되는 값 fn(인자)라고 함.
        // main함수가 fn코드를 실행 시킨다
    } // end main
    
    public static void fn( int param, int args, float f ){ //이런식으로 배열 가능
        //// 매개변수에 전달되는 값을 받는다. 전달 받는다.
        //외부로 부터 받은 데이터 -> 매개변수 전달 이란 뜻.
        //외부라는 말은 쉽게 하면 안된다.
        System.out.println("invoke fn ---");
        
    }

}

	
