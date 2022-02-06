package org_bitcamp5;


//Scanner 라이브러리 가져오기
import java.util.Scanner;


public class bitc5_전체적정리_CRUD6에러잡음7_ListEditInput1강사님 {

    // 이 클래스 안에 구현된 함수들이 모두 같은 키보드를 공유한다.
    private static Scanner kb;
    private static int[][] SCORE;
    
    public static void main(String args[]) {
        // 진입점. 가장 처음 실행되는 함수
        kb = new Scanner(System.in);// 키보드와 연결하기
        SCORE = new int[5][3];// 1차배열 5개를 모은 2차배열
        ////////// 기능들을 실행시킨다.
        String cmd;
        do{
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            // 점수표 출력하기 
            if("list".equals(cmd)){
                viewScoreTable();
            }
            // ~ 이상 점수들 출력하기
            if("over".equals(cmd)){
                System.out.print("over > ");
                int num = kb.nextInt();// 정수로 입력받는다.
                kb.nextLine();// 숫자가 아닌 엔터값을 버린다..
                viewOverScore(num);
            }
            // 점수 수정 : 선택 - 학생, 과목 값 입력
            if("edit".equals(cmd)){
                System.out.println("학생번호 과목번호 점수값 > ");
                String s = kb.nextLine();
                // 공백을 기준으로 3개로 나눈다. -> 정수변환
                editScore(s);
            }
            // 점수 입력 : 선택 - 학생, 과목 값 입력
            if("input".equals(cmd)){
                System.out.println("학생번호 점수값(3) > ");
                String s = kb.nextLine();
                // 공백을 기준으로 3개로 나눈다. -> 정수변환
                inputScore(s.split(" "));
            }
            // 학생별 점수 총합, 평균 값 출력
            if("total".equals(cmd)){
                totalScore();
            }
            
            
        } while( !( "exit".equals( cmd ) ) );
        // 사용자가 "exit" 입력하면 멈춘다.
        System.out.println("terminated ");

    }// end main
    
    ///// 함수들의 구현부
    public static void totalScore(){
        
    }
    public static void inputScore(String[] sa){
        if( sa.length == 4 ){
            int row = Integer.parseInt(sa[0]);
            for(int i=0; i<3; i+=1){
                // sa[1]:국어, sa[2]:영어, sa[3]:수학
                SCORE[row][i] = Integer.parseInt(sa[i+1]);
            }
        }else{
            System.out.println("4개를 입력해야 합니다.");
        }
    }
    public static void editScore(String s){
        // 특정 문자를 기준으로 문자열 쪼개기
        String[] splited = s.split(" ");
        // "1 2 30" -> ["1"]["2"]["30"]
        if( splited.length == 3 ){
            int row = Integer.parseInt(splited[0]);// 학생번호
            int col = Integer.parseInt(splited[1]);// 과목번호
            int jumsu = Integer.parseInt(splited[2]);// 점수
            // 수정을 하는거니까 ......
            SCORE[row][col] = jumsu;
        }else{
            System.out.println("3개를 입력해야 합니다.");
        }
    }
    public static boolean hasOverScore(int row, int key){
        boolean has = false;
        for(int i=0; i<3; i+=1){
            if( SCORE[row][i] >= key ){
                has = true;
                break;// OR
            }
        }
        return has;
        // SCORE[row][0] >= key || 
        // SCORE[row][1] >= key || 
        // SCORE[row][2] >= key;
    }
    public static void viewOverScore(int key){
        for(int row=0; row<SCORE.length; row+=1){
            if( hasOverScore(row, key) ){
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
        for(int row=0; row<SCORE.length /*5*/; row+=1){
            viewStudent(row);
        }
    }
    ////////////////////
 
    
}// end class

