/*

*파이썬

score = [[],[],[],[],[]]
print ( len(score) )
score[0] = [10,20,30]
print ( len(score[0]) )
print ( score[0][1] )

결과값:
5
3
20

 
 컴터 사서 한번 구성 (1, 2번) / 순서를 지켜서 1번 깔고 2번 진행하세요.

1. SDK 설치 (JDK = 자바 디벨롭 키츠 라고 함 요즘)
	Software Developement Kits
	도구, 표준 라이브러리
	version 주의 (주의! 버전에 민감) / 프로젝트시 일괄적인 버전으로 해야함
	choco install openjdk : 무료
	cmd에서 이런거 설치하는 것에 package manager라는 것이 있다.

2. IDE 설치
	integrated development environment
	에디터, 유틸리티
	자바 : 이클립스, 인텔리 j (유료/회사에서 주로 이걸로)
	        요즘외국인들이 vscode : 범용 프로그램 (설정이 복잡)
3. Code 작성
	~.java	자바
	~.py	파이썬
	~.js	자바 스크립트
4. Build : 실행가능하게 만드는 것
5.Run : 실행

깃헙

 
 
 */









package org_bitcamp5;

public class bitc5_전체적정리_CRUD6에러잡음7_ListEditInput1강사님2 {

    public static void main(String args[]) {
//1백업
//    	// int [] d1 = new int [9];
//    
//    for(int d1 = 2; d1<=9; d1++){
//        System.out.println(d1);
//        //i는 2부터 시작 9까지
//        //j는 1부터 시작 9까지
//        
//        for(int d2=1; d2 <=9; d2++){
//            System.out.println(d1 + "x" + d2 + "=" + d1*d2);
//        }
//    }

//2백업
    	// int [] d1 = new int [9];
        
        for(int d1 = 2; d1<=9; d1++){
            System.out.println(d1);
            //i는 2부터 시작 9까지
            //j는 1부터 시작 9까지
       
            for(int d2=1; d2 <=9; d2++){
                System.out.println(d1 + "x" + d2 + "=" + d1*d2);
            }
            
            // if (d1 != d2){
            //     System.out.println(d1);
            // }else{
            //     System.out.println("-----");
            // }
            
            
        }//end for 첫번째
   	
     	
    	
    }//end main
}//end public

