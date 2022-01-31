package org_bitcamp2;

public class bitc2_if_for9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 퀴즈: 3자리 정수 받아서 : 각 자리 값이 크기 순으로 연속하는지 판단(판별)하세요
	    // 연속하는지 (if를 써서 한다)
	    int num = 345;
	    int d1 = num / 100; //(100의 자리 하나 뽑음)
	    int d2 = num / 10 % 10; // 45나누기 10은 4.5
	    int d3 = num % 10;
	    if((d1+1==d2) && (d2+1 == d3)) {
	            System.out.println(num);
	    }else {
	            System.out.println(num + "-> 비연속");
	    }
	    
	   }
	  } 

