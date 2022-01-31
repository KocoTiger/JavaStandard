//<중간에 상담사 전화로 30분 못들은 코드>

public class MyClass {
    // 작게 여러 개 만들어서 조립한다. --> 프로그래밍.
    public static void main(String args[]) {
        
        for(int i=0; i<3; i++) {
            printMatrics(5, 8); // (행개수, 열개수) <- 열개수 == 행의 길이
            System.out.println("------");
        }//end for
        
    }//main
    
    // ~행~열 2차구조 출력
    public static void printMatrics(int row, int col) {
        for(int i=0; i < row; i++) {
            printLine(col);
        }//end for
        
    }//printMatrics()
    
    // 1행을 출력하는 함수
    public static void printLine(int length) {
        for (int i=0; i < length; i++) {
            System.out.print('O'); // char '', String ""
        }//end for
        System.out.println();
    }//printLine()
    
}//class
