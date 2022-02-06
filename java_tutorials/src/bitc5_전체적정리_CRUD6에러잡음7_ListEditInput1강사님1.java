/*
변수를 보실때
기본형 변수 : 얼마이다. 값이다....
int n; n은 정수를 저장한 변수다...
참조형 변수명 : 어디에~ 어디다~
String name; name은 변수다... -> String의 주소를 저장한다
String[] args; args 변수다... -> String을 요소로 하는 배열의 시작 주소를 저장한다.
-> String을 요소로 하는 배열의 시작 주소를 저장한다.
args = dfsdfsfs;





 */



package org_bitcamp5;

//Scanner 라이브러리 가져오기
import java.util.Scanner;


public class bitc5_전체적정리_CRUD6에러잡음7_ListEditInput1강사님1 {

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
            //학생별 점수 총합, 평균 값 출력
            if("total".equals(cmd)){
                System.out.println("학생별 총합");
                totalScore();
            }
            //학생 자리 바꾸기 - 1 3 - 1<--->3
            if("total".equals(cmd)){
                System.out.println("교환할 학생 번호 2개 > ");
                int a = kb.nextInt(); //숫자만 입력 '0'~ '9'
                int b = kb.nextInt();
                kb.nextLine();
                System.out.println(SCORE[a]);
                System.out.println(SCORE[b]);
                //두 변수의 값을 교환한다....: 정렬
                int[] c = SCORE[a]; //1차배열
                //SCORE[][], SCORE[] []
                SCORE[a] = SCORE[b]; 
                SCORE[b] = c;
                System.out.println(SCORE[a]);
                System.out.println(SCORE[b]);                
            }
            
            
        }while( !("exit".equals( cmd ) ) );//cmd가 exit랑 같냐인데 !not연산때문에 cmd가 exit랑 다르면이다 
        // 사용자가 "exit" 입력하면 멈춘다.
        System.out.println("terminated ");
        
    }// end main
    
    //////////////////////////////// 함수들의 구현부
    public static void totalScore(){  //점수 총합
        for(int row=0; row<SCORE.length; row+=1){
            int sum = SCORE[row][0] + SCORE[row][1] + SCORE[row][2];
            int avg = sum /3; //SCORE[row].length 평균값, 과목이 3개이기때문에 3으로 나눔
            System.out.println(row + "\t" + sum + "\t" + avg);
        }
    }
    
    public static void inputScore(String[] sa){ //점수 삽입
        if( sa.length == 4){
            int row = Integer.parseInt(sa[0]);
            for(int i=0; i<3/*4개인데 하나를 위로 뻇으니 3개*/; i+=1){
                // sa[1]:국어, sa[2]:영어, sa[3];수학
                SCORE[row][i] = Integer.parseInt(sa[i+1]);// i+1 하는이유 0번이 학생의 번호니까
                // 1번2번3번을 하기위해서 +1로 보정을 해줬다.
            }
        }else{
            System.out.println("4개를 입력해야 합니다.");
        }
    }
    public static void editScore(String s){
        // 특정 문자를 기준으로 문자열 쪼개기
        String[] splited = s.split(" ");// splited 함수는 문자를 쪼개기 나누기할때 사용
        // "1 2 30" -> ["1"]["2"]["30"]
        if( splited.length == 3){
            int row = Integer.parseInt(splited[0]);// 학생번호
            int col = Integer.parseInt(splited[1]);// 과목번호
            int jumsu = Integer.parseInt(splited[2]);// 점수
            // 수정을 하는거니까 ...... (퀴즈)
            SCORE[row][col] = jumsu;
        }else{
            System.out.println("3개를 입력해야 합니다.");
        }
    }
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
