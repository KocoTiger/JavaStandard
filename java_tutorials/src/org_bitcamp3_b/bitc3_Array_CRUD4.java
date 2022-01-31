package org_bitcamp3_b;

public class bitc3_Array_CRUD4 {

	public class MyClass {
	    public static void main(String args[]) {
	        //배열 선언 : 정적, 명시적
	        int[] ar = new int [10]; //최대 10짜리 배열을 만들거다
	        System.out.println (ar);
	        // Create Read Update Delete (SW에서 가장 기본적인 것/CRUD)
	        int loop = 15;
	        int idx = 0;        // 매번 새로 생성할 변수?
	        //지역성 : 변수의 값이 유지? 매번 새로 생성?
	        while( loop > 0 ){ //start while, true쓰면 무한 루프
	            loop -= 1;
	        {
	            //추가하기 (배열기준) : 번호?, 저장할 값 -> 중복 여부?
	            if (idx < ar.length ) {
	            int value = 100;
	            ar[ idx ] = value; 
	            idx += 1;
	            }else{
	                System.out.println ("array full");
	            }
	        }	    
	        {
	            //삭제하기 : 번호?, V빈 요소 처리? 연속 상태 (당기는 상태를 할꺼다)
	            int delete = 0;  //삭제할 번호
	            //인접요소로 당겨 채운다...
	            for (int i = delete; i < ar.length-1; i += 1) { //i 변수가 8까지 가게 만들어야함
	                ar[i] = ar[i+1]; // i + 1이 10이상이 되면 안됨. 최대값은 8 최대 9를 초과하면 안됨
	            }
	            //개수가 줄었다 - 마지막 한칸이 빈다.
	            idx -= 1;        
	        }	    
	        {
	            //삽입하기 : 번호?, 밀기와 당기기 해야함 (아니면 덮어씌기가 된다)
	            int insert = 0;      //삽입될 요소   
	            int value = 100;
	            ar[ insert ] = value;   
	            idx -= 1;                
	        }    
	        {
	            //수정하기 : 번호?, 저장할 값(덮어쓸 값) -> 현재 데이터가 있어야 한다
	            int edit = 1;
	            int value = 200;        
	            ar [edit] = value;
	            idx += 1;               
	        }	    
	        {
	            //검색하기 -1 : 값을 주고 요소번호를 찾는다.
	            //순차 탐색,검색  & ?
	        int key = 100;  //찾을 값
	        for (int i = 0; i < idx; i+=1){  
	            if( key == ar[i] )
	                System.out.print(i+"번 요소,");
	                // 중복여부에 따라 처리가 다르다. (중복없음 : 1개만 찾으면 된다 -> 검색을 멈춤)
	                // 배열안에 중복없이 하나씩만 저장이 된다 했을때, 검색 필요 없음	            
	                break ;	            
	            }    
	            System.out.print("\n");
	        }	        
	        {
	            //검색하기 -2 : 요소 번호 주고 값을 꺼낸다.
	        int no = 2; 
	        int result = ar[no];
	                 System.out.print(result+"\n");	               
	        }	        
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
}