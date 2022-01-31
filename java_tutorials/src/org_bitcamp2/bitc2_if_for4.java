package org_bitcamp2;

public class bitc2_if_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0; i<5; i+=1){
            
            for(int k=0; k<5; k+=1){
                //25번 반복
                System.out.print((i*5 + k) + " "); //최대 값 24 : i 최대 4까지 나옴 20+ k최대값 4까지 = 24
            }    
            System.out.println(); //5번 반복 => i 반복만큼
        } 
	}
}
