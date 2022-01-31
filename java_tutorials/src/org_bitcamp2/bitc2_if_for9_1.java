package org_bitcamp2;

public class bitc2_if_for9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 3자리 정수 (임의로 정함) : 각 자리의 합이 짝수인 것들을 출력하세요
	    //2. 100이상 999이하
	    //3. 100의 자리 10의 자리 1의 자리를 따로 따로 띄어 봤을 때, 짝수면 출력 홀수면 안해
	    //4. if 짝수냐 아니냐 조건, 정수의 각 자리 
	    for(int i=0; i<10; i+=1){
	    int num = 345; // 3 + 4 + 5
	    //찢어서 확인 하기
	        int temp = num;
	        int sum = 0;
	    for (;temp > 0; temp/=10){
	        // 한 자리씩 내려온다... 일의 자리값을 뽑는다.
	       int d3 = num % 10; //1 의 자리 뽑기
	    }
	         if(sum % 2 == 0){
	            System.out.println(num + "->" + sum); //반복은 똑같은 말, 상황을 뽑아야하는 것이 반복
	                                                  //
	                                                
	                }
	            }
	        }
	    }
