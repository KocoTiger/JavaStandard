/*
-------------------------국취지 상담 받고 옴 2022.01.28
진욱이 한테 코드 받기로 함. 
list, edit, input이 추가 되어있네..@.@
//학생별 점수 총합, 평균 값 출력
학생들 x, 0번의 총합 평균 나오면 됨

 
 진욱이가 보내준 코드 1시 35분
<이게 매우 중요해 보임>

 
 */




package org_bitcamp5;
//Scanner 라이브러리 가져오기
import java.util.Scanner; 

public class bitc5_전체적정리_CRUD6에러잡음7_ListEditInput1 {

    // 이 클래스 안에 구현된 함수드이 모두 같은 키보드를 공유한다.
    private static Scanner kb; //static이붙어있으면 다붙여야한다.
    private static int[][] SCORE; //변수만 생성했음 //전역적 (지역적과 대조)
    public static void main(String args[]) {
        // 진입점. 가장 처음 실행되는 함수
        kb = new Scanner(System.in);// 키보드와 연결하기
        //new 주소를 통해서 접근한다.
        SCORE = new int [5][3];// 1차배열 5개를 모은 2차배열
        //1차배열의 요소는 변수 2차배열의 요소는 1차배열 3차배열의 요소는 2차배열이다.
        ////////// 기능들을 실행시킨다.
        String cmd; // do {}밖에 있기떄문에 밖에빼주지 않는다면 while에서 cmd를 찾지못한다.
        do{
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            if("list".equals(cmd)){ // 점수표 출력하기
                viewScoreTable();
            }
            //over가들어오면 비교할 점수도 한번더입력해줘야함
            if("over".equals(cmd)){
                System.out.print("over > ");
                int num = kb.nextInt(); // 정수로 입력받는다.
                kb.nextLine();// 숫자가 아닌 엔터값을 버린다.
                viewOverScore(num);
            }
            
        }while( !("exit".equals( cmd ) ) );//cmd가 exit랑 같냐인데 !not연산때문에 cmd가 exit랑 다르면이다 
        // 사용자가 "exit" 입력하면 멈춘다.
        System.out.println("terminated ");
        
    }// end main
    
    ///// 함수들의 구현부
    public static boolean hasOverScore(int row,int key){
        boolean has = false;//or연산 "어느하나라도"
        for(int i =0; i<3; i+=1){
            if( SCORE[row][i] >= key){ //or개념
                has = true;
                break;
            }
        }
        return has;
    }    
    public static void viewOverScore(int key){
        for(int row =0; row<SCORE.length;row+=1){
            //if(학생의 점수 중 하나라도 key 이상의 점수가 있으면)if안에 썻으니까 반환할게있음
            //hasOverScore는 학생번호와 비교할값을 전달받아서 계산 해서 참,거짓을 나눈다.
            if( hasOverScore(row,key) ){
                viewStudent(row);// row번 학생의 점수들을 출력
            }    
        }
    }
    public static void viewStudent(int row){
        for(int col=0; col<SCORE[0].length; col+=1){
                System.out.print( SCORE[row][col] + "\t" );
            }
            System.out.println();
    }
        
    public static void viewScoreTable(){
        for(int row =0; row<SCORE.length/*5*/;row+=1){ //2차배열
            viewStudent(row);
            // for(int col=0; col<SCORE[0].length /*3*/; col+=1){ // [0]을썻기때문에 1차배열,요소의 1차배열은 길이가 같다.
            //     System.out.print( SCORE[row][col] + "\t" ); // 대괄호가 두개니까 반복이 두개된다.
            // }
            // System.out.println(); // 학생한명당이기때문에 한명이끝나면 한번줄을 내려서 다음작업진행
            // //print랑 println은다르다 print는 옆으로 println은 아래로 글을쓰고 다음줄로 내린다.
        }    
    }
     
    /////////////
    
}// end class
