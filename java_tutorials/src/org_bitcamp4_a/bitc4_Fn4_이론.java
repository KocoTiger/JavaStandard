//함수의 전달과 반환의 개념
public class MyClass {
    // public static void main(String args[]) {// ex> <--매개 변수 args /void + 함수 : 함수가 반환하는것이 없다란 뜻. 
     public static void main(String args[]) { //호출자(측)  
        // fn 함수를 호출한다.
        //// 전달한다. 호출측 -> 피 호출측 준다.
        //(외워) 호출하려는 함수에 매개변수가 있다면, 호출 시 반드시 전달해야함.
        fn( 3 ); //피호출자 (측), //전달되는 값 fn(인자)라고 함.
        //호출측, 피호출자가 반환하는 값을 선택적으로 받는다.
        //받을거면 타입에 맞게 받는다
        String rs = fn (8);
        System.out.println (rs);

    } // end main
    
    public static String fn( int param){ 
        //// 매개변수에 전달되는 값을 받는다. 전달 받는다.
        System.out.println("invoke fn ---");
        
        return "Hi"; //함수 종료, 오른쪽 반환할 값
        //(외워) 전달은 필수, 반환은 선택적이다!!!!!
        
    }

}
