/*
 
# ������ ����ϱ�
1. ������ ��(D1), ������ �� (D2)�� �Է¹޾� �� ������ ���� ��� ����ϼ���.
2. ���� :
	1) 2��~9�� ���̸� ��� ����
	2) 3�� 3�� ������ ���  -> 1��(��)�� 3�� �ܾ� ���
	3) ���� ���� ���ϴ� ���� ������� ����
		2x2, 3x3, 4x4.. �� --�Ʒ� ������ �κ�
		
	���� > ���� ����.



 */









package org_bitcamp5;

public class bitc5_��ü������_CRUD7_finaltest {

    public static void main(String args[]) {
    // int [] d1 = new int [9];
    // int array [] [] = new int [3] [3];
        for(int d1 = 2; d1<=9; d1++){
            System.out.println(d1);
            //i�� 2���� ���� 9����
            //j�� 1���� ���� 9����
        
                for(int d2=1; d2 <=9; d2++){
                    System.out.println(d1 + "x" + d2 + "=" + d1*d2);
                }
                
                // if (d1 = d2){
                //     System.out.println("======="");
                // }else{
                //     System.out.println();
                // }
            
            
        }//end for ù��°
    }//end main
}//end public
