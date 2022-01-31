package org_bitcamp4_a;
public class MyClass {

    public static void main(String args[]) { 
        //지역성, 전달, 반환
        //  int fn_v = 10;
        //  int rs = fn(); // <----20값을 복사
        //  fun( main_v );     //밑에 int fn_v 변수가 영향을 주지 않는다.
        //  System.out.println( main_v ); //밑에 int fn_v 변수가 영향을 주지 않는다.
         
         int[] a = new int[]{12, 23, 34};
         System.out.println( a ); //(배열명)
         edit( a ); //배열을 전달한다. / call by value : a[0] 이라고 했다면 값을 전달한다는 의미
         System.out.println( a );
         System.out.println( a[0] );
         System.out.println( a[1] );
         System.out.println( a[2] );
    }
    
    //호출측에 영향이 있냐
    public static void edit(int[] b){  //b라는 매개변수를 말함
        //배열을 전달받아서 그 요소들을 변경한다.
         b[0] = 10;
         b[1] = 20;
         b[2] = 30;
        
    }
    
    //Call by Value 값을 전달 한다 : 호출측(main)에 변화가 없다
    
    public static void fun(int param){ // = main_v
        // main_v == param 이순간에는 둘이 값이 같다
        param +=90;
        System.out.println(param);
    }
    
    public static int fn(){
        //변수와 값
        int fn_v = 20;
        
        return fn_v; 
        // main에 변수가 총 몇개: 4개 /args, , , /
        //
 
    }

}


//에러 뜨면 : 0점, 결과가 안나오면 감점

