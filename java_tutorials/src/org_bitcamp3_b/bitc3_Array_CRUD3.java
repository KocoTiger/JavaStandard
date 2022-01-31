package org_bitcamp3_b;

public class bitc3_Array_CRUD3 {

	public class MyClass {
	    public static void main(String args[]) {
	        //배열 선언 : 정적, 명시적
	        int[] ar = new int [10]; 
	        System.out.println (ar);
	        // 배열의 기능적인 부분들을 나열해볼것임
	        // Create Read Update Delete (SW에서 가장 기본적인 것/CRUD)
	        int idx = 0;  //지역성 생각 지금은 중괄호 밖
	        {
	            //추가하기 (배열기준) : 번호?, 저장할 값 -> 중복 여부?
	            int value = 100;
	            ar[ idx ] = value; //ar[ ? ] 몇번 요소에 저장할꺼냐
	            idx += 1;          // 이렇게 쓰면 0번 요소도 쓰겠다. 란 뜻. 이것이 위로 올라가면 0번 요소는 안쓰겠다란 뜻
	        }   
	        {
	            //삭제하기 : 번호?, 빈 요소 처리?
	            int delete = 0;  //삭제할 요소의 번호, 삭제할요소를 찾는다
	            ar[delete] = 0;  //delete번 요소를 초기화, 지운다로 놓고
	            idx -= 1;        //배열을 줄인다
	        }	    
	        {
	            //삽입하기 : 번호?, 밀기와 당기기 해야함 (아니면 덮어씌기가 된다)
	            int insert = 0;         //삽입될 요소
	            int value = 100;
	            ar[ insert ] = value;   // 위에서 비운것을 다시 비워진 공간에 삽입한다
	            idx -= 1;               //   
	        }	    
	        {
	            //수정하기 : 번호?, 저장할 값(덮어쓸 값) -> 현재 데이터가 있어야 한다
	            int edit = 1;
	            int value = 200;        // 값만 바뀜
	            ar [edit] = value;
	            idx += 1;               //변함 없다
	        }	    
	        {
	            //검색하기 -1 : 값을 주고 요소번호를 찾는다.
	            //순차 탐색,검색  & ?
	        int key = 100;  //찾을 값
	        for (int i = 0; i < idx; i+=1){   //실제 테이터 개수만 반복해서 찾으면 됨
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
	        int no = 2; //찾을 요소 번호
	        int result = ar[no];
	                 System.out.print(result+"\n");	               
	        }	    
	        {
	            //목록 보기 : 저장된 값만 출력
	            for (int i=0; i < ar.length; i+=1){
	                System.out.print(ar[i]+",");
	            }
	            System.out.print("\n"); //개행 문자, 한칸 내려라\n  /  /t 한 5칸 띄우는 명령
	        }                  
	    }
  }
}