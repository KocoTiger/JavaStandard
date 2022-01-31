public class MyClass {

    public static void main(String args[]) { 
        //지역성, 전달, 반환
        //지역성 {} 이걸 말함 (자바에서
        
        {// 지역변수
            int a =10;
            
        }
        
        int b = a + 100; //위에 변수가 {} 안에 있기떄문에 지역성을 가지기 때문에 변수가 적용이 안되 에러


    }
}

//에러 뜨면 : 0점, 결과가 안나오면 감점



//---------------------------------

public class MyClass {

    public static void main(String args[]) { 
        //지역성, 전달, 반환
        //지역성 {} 이걸 말함 (자바에서
        //외부 변수 : 중괄호 밖에 있는 것
        //main안에있는 지역 변수는 어디서든 사용 가능
        int b = 10;
        {// 지역변수 {} 안에서만 사용 가능
            int a =10;
            a = b + 20;
        }
        
        b = a + 100; //위에 변수가 {} 안에 있기떄문에 지역성을 가지기 때문에 변수가 적용이 안되 에러
                         //변수를 항상 선언 하고 사용해야함

    }//end main
} //end public

//에러 뜨면 : 0점, 결과가 안나오면 감점


//-------------------------------

public class MyClass {

    public static void main(String args[]) { 
        //지역성, 전달, 반환
         int fn_v = 10;
    }
    
    public static void fn(){  //함수를 한번 이용하면 이 함수는 사라진다. stack의 개념
        int fn_v = 20;
    }
    
    //그림판
    //처음에 메인 함수가 생성이 됨



    }//end public

//에러 뜨면 : 0점, 결과가 안나오면 감점
