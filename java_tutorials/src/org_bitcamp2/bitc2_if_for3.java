package org_bitcamp2;

public class bitc2_if_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서부터 25까지 연속하는 정수들을 출력하세요.
	    //변하는구나 변수, 출력하는구나 출력하는 식, 연속하는 구나
	    // \n : 공백
	    
	        for(int n=1; n<26; n+=1){
	            System.out.print(n + " ");
	        }
	        System.out.println();
	        //1 ~ 25 연속 정수 출력 - 1행당 5개씩 출력하기
	        //5의 배수 X, 5개 일때 행을 내려라
	        int count = 0; //각행에서 출력한 개수
	        for(int n=12; n<63; n+=1){ 
	            System.out.print(n + " ");
	            count += 1;
	            if(count == 5) { //5개면...
	                 System.out.println();
	                 count = 0; //배열의 개수가 25개로 맞추기 위해?  count변수의 목적이 있어야함!!!퀴즈!
	            }
	        }
	            System.out.println();
	}
	}

