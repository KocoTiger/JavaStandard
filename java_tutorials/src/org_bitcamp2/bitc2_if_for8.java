package org_bitcamp2;

public class bitc2_if_for8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //1. 3자리 정수 (임의로 정함) : 각 자리의 합이 짝수인 것들을 출력하세요
	    //2. 100이상 999이하
	    //3. 100의 자리 10의 자리 1의 자리를 따로 따로 띄어 봤을 때, 짝수면 출력 홀수면 안해
	    //4. if 짝수냐 아니냐 조건, 정수의 각 자리 
	    for(int i=0; i<10; i+=1){
	    int num = 345; // 3 + 4 + 5
	    //찢어서 확인 하기
	    int d1 = num / 100; //100의 자리
	    int d2 = num / 10 % 10; //10의 자리
	    int d3 = num % 10; //1 의 자리
	    int sum = d1 + d2 + d3;
	    if(sum % 2 == 0){
	        System.out.println(num + "->" + sum);
	            }
	        }
	}
	}

