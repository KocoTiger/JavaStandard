package org_bitcamp3_a;

public class bitc3_Array9a {

    public static void main(String args[]) {
    // �迭�� �ٷ�� ���
    //�迭 ���� : ����, �����
    int[] ar = new int [10]; 
    System.out.println (ar);
        // -1�� �迭�� �ʱ�ȭ  
        for(int i=0; i < ar.length; i+=1){
        ar [i] = -1;
        }
    
    // ���������� ���� ������� �������� ��
    ar[9] = 0; // �� : ���� ���� ����
    ar[7] = 20;  
    // ���� : �ִ� ���� -> �ʱⰪ 0, 0�� �ƴϸ� / ����Ǵ� ���� 0�� �ƴҶ�  
                              
    for(int i=0; i < ar.length; i+=1){
        if( ar[i] != -1){
            System.out.println (ar [i]); 
            }
        }
    
    }
}

