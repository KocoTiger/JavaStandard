/*

0번 
* 위에 코드들 에러가 뜨는데
private static void Scanner kb;  이코드에서 void가 들어가 있어 실행이 안된거임



 */



 
package org_bitcamp5;

//scanner 라이브러리 가져오기
import java.util.Scanner;  //대부분의 클래스들은 import를 붙여야함 (첫글자 대문자인것들)


public class bitc5_전체적정리_CRUD3 {
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

      
    }//end main
    
    /////////////함수들 구현부
    
    
    ///////////////////////
}//end Class
