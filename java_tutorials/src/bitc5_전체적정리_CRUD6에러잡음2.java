package org_bitcamp5;

//scanner 라이브러리 가져오기
import java.util.Scanner;  //대부분의 클래스들은 import를 붙여야함 (첫글자 대문자인것들)


public class bitc5_전체적정리_CRUD6에러잡음2 {

    //이클래스 안에 구현된 함수들이 모두 같은 키보드를 공유한다.
    private static Scanner kb; 
    private static int[][] SCORE; //전역적 (지역적과 대조) 
    // 지금은 아무것도 아님. 밑에서 써서 이걸 실행 시킬 코드가 필요
    
    public static void main(String args[]) {
        //진입점 (가장먼저 실행되는 함수)
        kb = new Scanner(System.in); //키보드와 연결하기
        SCORE = new int [5][3];  //1차 배열 5개를 모은 2차 배열
                                 //길이가 3개인 2차배열 5개를 모은다
        ///////기능들 실행시킨다
        String cmd;  //이거 쓴 이유,지역성때문에 While에서 못씀 {}이거 밖
        do {  //do while 반복문: 일단 실행 시키고 while에서 그만 할건지 판단
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            if ("list".equals(cmd)){ //점수표 출력하기
                                    // String cmd = kb.nextLine();  //while에서 못씀
                viewScoreTable();
            }
            if ("over".equals(cmd)){
                System.out.print ("over > ");
       
                int num = kb.nextLine();
                kb.nextLine(); //숫자가 아닌 엔터값을 버린다...
            }
            
        }while( !( "exit" .equals(cmd) ) ); //while조건이 거짓이면 멈춤
                                            //다르면 계속 내려와
        //사용자가 "exit" 입력하면 멈춘다.
        System.out.println("terminated");  //프로그램 종료
      
    }//end main
     
    /////////////함수들 구현부
    public static void viewScoreTable(){
        for(int row=0; row<SCORE.length/*5*/; row+=1){
            for(int col=0; col<SCORE[0].length/*3*/; col+=1){
                System.out.print( SCORE[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    ///////////////////////
}//end Class
