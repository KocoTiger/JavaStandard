 public class MyClass {
     
    public static void main(String args[]) { 
    
        for (int i=0; i < 5; i+=1) { // for문은 반복 회수가 5번인데
            System.out.print( (i+0) + ", "); //print가 2번 되니까 총 10번이 된다
            System.out.print( (i+1) + ", "); // 여기서의 결과값은 한번에 2개씩 된거다
        }
    }
}

//에러 뜨면 : 0점, 결과가 안나오면 감점



 
 public class MyClass {
   
    public static void main(String args[]) { 
    //화면 출력 0 ~ 5까지 연속값이 출력 <----1차
        for (int i=0; i < 5; i+=2) { // for문은 반복 회수가 5번인데 / i + 2일때 (0 2 4) 3번 반복되게 나옴
            System.out.print( (i+0) + ", "); //print가 2번 되니까 총 5 * 2 = 10번이 된다
            System.out.print( (i+1) + ", "); 
        }
    }
}

//에러 뜨면 : 0점, 결과가 안나오면 감점

//결과값 : 0, 1, 2, 3, 4, 5, 
