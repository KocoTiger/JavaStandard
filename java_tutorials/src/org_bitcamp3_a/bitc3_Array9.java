package org_bitcamp3_a;

public class bitc3_Array9 {

	    public static void main(String args[]) {
	    //�迭 ���� : ����, �����
	    int[] ar = new int [10]; 
	    System.out.println (ar); 
	    
	    // ���������� ���� ������� �������� ��
	    ar[9] = 0; // �� : ���� ���� ����
	    ar[7] = 20;  
	    // ���� : �ִ� ���� -> �ʱⰪ 0, 0�� �ƴϸ� / ����Ǵ� ���� 0�� �ƴҶ�  
	    // ����� ������ �ߴ��� ������ �����ߴ� ���ߴٸ� �Ǵ��� ���ִٸ�                                
	    for(int i=0; i < ar.length; i+=1){

	        if( ar[i] != 0){
	            System.out.println (ar [i]); //��: 20���� ����
        }
	        
    }
	    
	                                    
    }
}
