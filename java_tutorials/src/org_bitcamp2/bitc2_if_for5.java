package org_bitcamp2;

public class bitc2_if_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
        for(int i=0; i<5; i+=1){
            
            for(int k=0; k<5; k+=1){
                //25�� �ݺ�
                // System.out.print((i*5 + k) + " "); //�ִ� �� 24 : i �ִ� 4���� ���� 20+ k�ִ밪 4���� = 24
                System.out.print(num + " ");
                num +=1;
            }    
            System.out.println();
        }   
	}
}
