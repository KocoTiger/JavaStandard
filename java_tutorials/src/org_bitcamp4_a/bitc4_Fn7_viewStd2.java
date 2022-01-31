package org_bitcamp4_a;

public class MyClass {
        //[0~3][4~7][8~11][12~15][16~19] 4개 씩이란것 알자 시작번호 0,4,8,12,16
     public static void main(String args[]) { 
         //함수 scope, 지역성
        int[] score = new int[  ]{
            10, 20, 40, 50,
            100, 30, 40, 60,
            30, 20, 80, 50,
            11, 12, 40, 50,
            70, 20, 40, 80
        };
        //배열을 전달해서 출력하게 했음 ? 배열을 왜 전달 해야 하지?
        //지역성이 있어서 함수와 함수간에 벽이 있어서 알려줘야하기 때문에 알려주는 동작이 필요하다.
        for (int i=0; i < 5; i+=1){
            //모든 학생들의 점수를 전달하고 있네?
            //1명만 준다
            int[] std = new int[4];
            System.arraycopy(score, i*4, std, 0, 4);             //System.out.print(원본, 사본);
            viewStudent(/*학생번호*/ i, score);
        }

    } //end main
    
    public static void viewStudent ( int stdNo, int[] score ){
        System.out.print ("["+stdNo +"]\t");
        for (int i=0; i < 4; i+=1){
            //1차배열을 2차 배열로 이해한다....[stdNo][i]
             System.out.print(score[ i ] + "\t"); //여기서 i는 과목의 번호가 된다. main에서의 i는 학생이다.
        }        
        System.out.println(); 
    }
}
