package org_bitcamp4_a;
//<중간에 상담사 전화로 30분 후 와서 본 2번째 코드>

//그 후 코드 보고 쓴거

public class MyClass {
 
     public static void main(String args[]) { 
        int[] score = new int[ 5 * 4 ];
        //배열을 전달해서 출력하게 했음 ? 배열을 왜 전달 해야 하지?
        //지역성이 있어서 함수와 함수간에 벽이 있어서 알려줘야하기 때문에 알려주는 동작이 필요하다.
        for (int i=0; i < 5; i+=1){
            //모든 학생들의 점수를 전달하고 있네?
            //1명만 준다
            viewStudent(/*학생번호*/ i, score);
        }

    } //end main
    
    public static void viewStudent ( int stdNo, int[] score ){
        System.out.print ("["+stdNo +"]\t");
        for (int i=0; i < 4; i+=1){
            //1차배열을 2차 배열로 이해한다....[stdNo][i]
             System.out.print(score[i] + "\t"); //열거, 행렬 구조, 2차 구조 
        }        
        System.out.println(); 
    }

}
