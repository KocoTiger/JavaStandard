package org_bitcamp4_a;
public class MyClass {
        //[0~3][4~7][8~11][12~15][16~19] 4개 씩이란것 알자 시작번호 0,4,8,12,16
     public static void main(String args[]) { 
         //함수 scope, 지역성
        int[] score = new int[  ]{  //학생 점수가 일로 다 저장될거임 (메인으로)
            10, 20, 40, 0,
            100, 30, 40, 0,
            30, 20, 80, 0,
            11, 12, 40, 0,
            70, 20, 40, 0
        };  
        //배열을 전달해서 출력하게 했음 ? 배열을 왜 전달 해야 하지?
        //지역성이 있어서 함수와 함수간에 벽이 있어서 알려줘야하기 때문에 알려주는 동작이 필요하다.
        for (int i=0; i < 5; i+=1){
            //모든 학생들의 점수를 전달하고 있네?
            //1명만 준다
            int[] std = new int[4];
            // 원본배열명, 원본 시작번호, 복사받을 사본배열명, 사본 시작번호, 복사할 개수
            System.arraycopy(score, i*4, std, 0, 4);
            //업데이트
            score[ i * 4 + 3 ] = sumStudent(std); //i: 학생 번호, 4개의 변수들을 가지기 째문에, 마지막 3번 배열에
            viewStudent(/*학생번호*/ i, std);
        }
        //score배열을 모두 출력한다.
        for(int sid=0; sid<5; sid+=1){
            //학생 1명당 점수 4개씩 출력한다.
            int kor=0, eng=0, math=0; // 총합을 구할려면 0으로 초기화 해야겠다         
            for(int jid=0; jid<4; jid+=1){
                System.out.print( score[ sid * 4 + jid ] + ", " ); //출력할 요소의 번호 기입
                kor += score[ sid * 4 + 0 ];  //sid학생의 [0]번
                eng += score[ sid * 4 + 1 ];
                math += score[ sid * 4 + 2 ];

            // sid 학생 한명(당) 4씩 가지고 있어서 jid 번에 있는 것을 처리
            }
            System.out.println("\n" + kor +", " + eng + ", " + math );
        }

    } //end main
    
    //지역성, sum함수가 3개를 더해서 합을 저장할 결과가 메인에 있는 score에도 반영이 되어야함
    public static int sumStudent(int[ ] score){  //3개 점수를 더해서
        // 0국어 점수 + 1영어 + 2수학 -> 3번에 저장하겠다는 것 (Score점수)
        score[3] = score[0] + score [1] + score[2];
        return score[3]; // 총합을 반환 한다.
        
    }
    public static void viewStudent ( int stdNo, int[] score ){
        System.out.print ("["+stdNo +"]\t");
        for (int i=0; i < 4; i+=1){
            //1차배열을 2차 배열로 이해한다....[stdNo][i]
             System.out.print(score[ i ] + "\t"); //여기서 i는 과목의 번호가 된다. main에서의 i는 학생이다.
        }        
        System.out.println(); 
    }
}

//에러 뜨면 : 0점, 결과가 안나오면 감점
결과값 : 
[0]	10	20	40	70	
[1]	100	30	40	170	
[2]	30	20	80	130	
[3]	11	12	40	63	
[4]	70	20	40	130	
10, 20, 40, 70, 
40, 80, 160
100, 30, 40, 170, 
400, 120, 160
30, 20, 80, 130, 
120, 80, 320
11, 12, 40, 63, 
44, 48, 160
70, 20, 40, 130, 
280, 80, 160 (마지막에 나온 숫자는 각학생들의 각 과목들의 총합)
전체 학생의 총합을 구하는 것이기 떄문에
