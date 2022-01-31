package org_bitcamp3_b;

import java.util.Scanner; //스캐너 이용 명령어

public class bitc3_Array_CRUD9a_KeyInput_Final {

//	* 이걸로 연습해!봐 interactive 켜고
//	검은 화면에 써.
//	그리고 그림을 그려봐
//	한칸씩 밀리고 추가되는 것들을 봐봐라

	
    public static void main(String args[]) {  //메인 함수 시작!

    //키보드 입력 처리
    Scanner kb = new Scanner( System.in ); //스캐너 이용 명령어
    //-----------------------------------------
    //배열 선언 : 정적, 명시적
        int[] ar = new int [10]; //최대 10짜리 배열을 만들거다

        // Create Read Update Delete (SW에서 가장 기본적인 것/CRUD)
        int loop = 5;
        int idx = 0;        // 매번 새로 생성할 변수?
        //지역성 : 변수의 값이 유지? 매번 새로 생성?
        
        while( loop > 0 ){ //start while, true쓰면 무한 루프
            loop -= 1;
            System.out.println("1.추가, 2.삭제, 3.삽입, 4.수정, 5.검색");
            String menu = kb.nextLine();
            
        if(menu.equals("1")){ //메뉴 입력값이 1번이면
        {
            //추가하기 (배열기준) : 번호?, 저장할 값 -> 중복 여부?
            if (idx < ar.length ) {
                System.out.println("저장할값?");
                String t = kb.nextLine();
                int value = Integer.parseInt(t); //숫자열 -> 정수
                ar[ idx ] = value;
                idx += 1;
            }else{
                System.out.println ("array full");
            }
        }
        }
        
        if(menu.equals("2")){
        
            //삭제하기 : 번호?, V빈 요소 처리? 연속 상태 (당기는 상태를 할꺼다)
                System.out.println("저장할값?");
                String t = kb.nextLine();
                int delete = Integer.parseInt(t); //숫자열 -> 정수

            for (int i = delete; i < ar.length-1; i += 1) { //i 변수가 8까지 가게 만들어야함
                ar[i] = ar[i+1]; // i + 1이 10이상이 되면 안됨. 최대값은 8 최대 9를 초과하면 안됨
            }
            //개수가 줄었다 - 마지막 한칸이 빈다.
            idx -= 1;        
        }
        
        
        if(menu.equals("3")){
        
            //삽입하기 : 번호?, 빈요소 밀기...
            if( idx < ar.length ){  //최소한 한칸은 늘어나는 공간이 있어야 삽입가능
                System.out.println("삽입할 요소의 번호?");
                String t = kb.nextLine();
                int insert = Integer.parseInt(t); //숫자열 -> 정수

                System.out.println("저장할 값?");
                String t1 = kb.nextLine();
                int value = Integer.parseInt(t1); //숫자열 -> 정수                
                
                for(int i=idx; i > insert; i-=1){ //땡겨서 올린다는 표현
                    ar[i] = ar[i-1];
                    //[9] ----> <insert>
                }
                ar[ insert ] = value;
                idx += 1;
            }
        
        }
        
        if(menu.equals("4")){
        
            //수정하기 : 번호?, 저장할 값(덮어쓸 값) -> 현재 데이터가 있어야 한다
                System.out.println("삽입할 요소의 번호?");
                String t = kb.nextLine();
                int edit = Integer.parseInt(t); //숫자열 -> 정수

                System.out.println("저장할 값?");
                t = kb.nextLine();
                int value = Integer.parseInt(t); //숫자열 -> 정수                
            
                if (edit < idx ){
                    //바꾼다. 덮어쓴다 //확인 하고 수정한다
                    ar [edit] = value;
            }
        }
        
        if (menu.equals("5")){
            //검색하기 -1 : 값을 주고 요소번호를 찾는다.
            //순차 탐색,검색  & ?
                System.out.println("찾을값?");
                String t = kb.nextLine();
                int key = Integer.parseInt(t); //숫자열 -> 정수

            for (int i=0; i < idx; i+=1){  
                if( key == ar[i] ){
                    System.out.print(i + "번 요소");
                // 중복여부에 따라 처리가 다르다. (중복없음 : 1개만 찾으면 된다 -> 검색을 멈춤)
                // 배열안에 중복없이 하나씩만 저장이 된다 했을때, 검색 필요 없음
                    break ;
                }
            }    
            System.out.print("\n");
        }
        
        // {
        //     //검색하기 -2 : 요소 번호 주고 값을 꺼낸다.
        // int no = 2; 
        // int result = ar[no];
        //     System.out.print(result + "\n");
               
        // }
        
        {
            //목록 보기 : 저장된 값만 출력
            for (int i=0; i < ar.length; i+=1){
                System.out.print(ar[i]+" ");
                }
                System.out.print("\n");
        }
        
        
    } //end while   
            
    } //main 함수 중괄호
    
}   //class 중괄호
