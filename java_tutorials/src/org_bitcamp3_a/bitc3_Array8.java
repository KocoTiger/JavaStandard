package org_bitcamp3_a;

public class bitc3_Array8 {

    public static void main(String args[]) {
    // �迭�� �׻� 0�����Ͷ��� �������� ���ƶ�!
    //�迭 ���� : ����, �����
    int[] ar = new int [10]; 
    System.out.println (ar);
    
    int idx = -1;  //-1�� ���� �� (������ ��ȣ, <--������ ��ȣ, +1 ����)
    //�߰��ϱ�
    idx += 1;       // idx ���� 1 ���߱� ������ 0�� ��
    ar[idx] = 10; 
    idx += 1;       // idx = 1��
    ar[idx] = 20;

    //���� ����� �͸� ����ϱ�           
    for(int i=0; i < idx; i+=1){   
    System.out.println (ar [ i ]);  //int ������
                                    // idx : ��� �ΰ���
                                    //1) ��Ҵ� 2) �ΰ��� �߰� �ߴٺ��� �ִ�
       }
       // idx + 1 �� ����Ǿ� �ִ�
       // [idx] ���� ������/�ֱ� ������ ��
    }
}
